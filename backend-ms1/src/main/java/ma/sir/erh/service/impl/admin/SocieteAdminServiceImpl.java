package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Societe;
import ma.sir.erh.bean.history.SocieteHistory;
import ma.sir.erh.dao.criteria.core.SocieteCriteria;
import ma.sir.erh.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.erh.dao.facade.core.SocieteDao;
import ma.sir.erh.dao.facade.history.SocieteHistoryDao;
import ma.sir.erh.dao.specification.core.SocieteSpecification;
import ma.sir.erh.service.facade.admin.SocieteAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SocieteAdminServiceImpl extends AbstractServiceImpl<Societe,SocieteHistory, SocieteCriteria, SocieteHistoryCriteria, SocieteDao,
SocieteHistoryDao> implements SocieteAdminService {


    public Societe findByReferenceEntity(Societe t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Societe.class,SocieteHistory.class, SocieteHistoryCriteria.class, SocieteSpecification.class);
    }

    public SocieteAdminServiceImpl(SocieteDao dao, SocieteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}