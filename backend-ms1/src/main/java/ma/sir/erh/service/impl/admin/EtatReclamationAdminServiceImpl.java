package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.EtatReclamation;
import ma.sir.erh.bean.history.EtatReclamationHistory;
import ma.sir.erh.dao.criteria.core.EtatReclamationCriteria;
import ma.sir.erh.dao.criteria.history.EtatReclamationHistoryCriteria;
import ma.sir.erh.dao.facade.core.EtatReclamationDao;
import ma.sir.erh.dao.facade.history.EtatReclamationHistoryDao;
import ma.sir.erh.dao.specification.core.EtatReclamationSpecification;
import ma.sir.erh.service.facade.admin.EtatReclamationAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatReclamationAdminServiceImpl extends AbstractServiceImpl<EtatReclamation,EtatReclamationHistory, EtatReclamationCriteria, EtatReclamationHistoryCriteria, EtatReclamationDao,
EtatReclamationHistoryDao> implements EtatReclamationAdminService {


    public EtatReclamation findByReferenceEntity(EtatReclamation t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatReclamation.class,EtatReclamationHistory.class, EtatReclamationHistoryCriteria.class, EtatReclamationSpecification.class);
    }

    public EtatReclamationAdminServiceImpl(EtatReclamationDao dao, EtatReclamationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}