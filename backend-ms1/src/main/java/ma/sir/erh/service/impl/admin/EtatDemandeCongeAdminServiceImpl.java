package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.EtatDemandeConge;
import ma.sir.erh.bean.history.EtatDemandeCongeHistory;
import ma.sir.erh.dao.criteria.core.EtatDemandeCongeCriteria;
import ma.sir.erh.dao.criteria.history.EtatDemandeCongeHistoryCriteria;
import ma.sir.erh.dao.facade.core.EtatDemandeCongeDao;
import ma.sir.erh.dao.facade.history.EtatDemandeCongeHistoryDao;
import ma.sir.erh.dao.specification.core.EtatDemandeCongeSpecification;
import ma.sir.erh.service.facade.admin.EtatDemandeCongeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatDemandeCongeAdminServiceImpl extends AbstractServiceImpl<EtatDemandeConge,EtatDemandeCongeHistory, EtatDemandeCongeCriteria, EtatDemandeCongeHistoryCriteria, EtatDemandeCongeDao,
EtatDemandeCongeHistoryDao> implements EtatDemandeCongeAdminService {


    public EtatDemandeConge findByReferenceEntity(EtatDemandeConge t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatDemandeConge.class,EtatDemandeCongeHistory.class, EtatDemandeCongeHistoryCriteria.class, EtatDemandeCongeSpecification.class);
    }

    public EtatDemandeCongeAdminServiceImpl(EtatDemandeCongeDao dao, EtatDemandeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}