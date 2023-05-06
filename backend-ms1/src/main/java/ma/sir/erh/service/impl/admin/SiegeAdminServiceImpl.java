package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Siege;
import ma.sir.erh.bean.history.SiegeHistory;
import ma.sir.erh.dao.criteria.core.SiegeCriteria;
import ma.sir.erh.dao.criteria.history.SiegeHistoryCriteria;
import ma.sir.erh.dao.facade.core.SiegeDao;
import ma.sir.erh.dao.facade.history.SiegeHistoryDao;
import ma.sir.erh.dao.specification.core.SiegeSpecification;
import ma.sir.erh.service.facade.admin.SiegeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SiegeAdminServiceImpl extends AbstractServiceImpl<Siege,SiegeHistory, SiegeCriteria, SiegeHistoryCriteria, SiegeDao,
SiegeHistoryDao> implements SiegeAdminService {


    public Siege findByReferenceEntity(Siege t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Siege.class,SiegeHistory.class, SiegeHistoryCriteria.class, SiegeSpecification.class);
    }

    public SiegeAdminServiceImpl(SiegeDao dao, SiegeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}