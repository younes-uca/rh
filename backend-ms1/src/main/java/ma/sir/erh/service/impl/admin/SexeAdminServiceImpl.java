package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Sexe;
import ma.sir.erh.bean.history.SexeHistory;
import ma.sir.erh.dao.criteria.core.SexeCriteria;
import ma.sir.erh.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.erh.dao.facade.core.SexeDao;
import ma.sir.erh.dao.facade.history.SexeHistoryDao;
import ma.sir.erh.dao.specification.core.SexeSpecification;
import ma.sir.erh.service.facade.admin.SexeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SexeAdminServiceImpl extends AbstractServiceImpl<Sexe,SexeHistory, SexeCriteria, SexeHistoryCriteria, SexeDao,
SexeHistoryDao> implements SexeAdminService {


    public Sexe findByReferenceEntity(Sexe t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Sexe.class,SexeHistory.class, SexeHistoryCriteria.class, SexeSpecification.class);
    }

    public SexeAdminServiceImpl(SexeDao dao, SexeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}