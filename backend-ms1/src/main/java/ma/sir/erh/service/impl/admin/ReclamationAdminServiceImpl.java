package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Reclamation;
import ma.sir.erh.bean.history.ReclamationHistory;
import ma.sir.erh.dao.criteria.core.ReclamationCriteria;
import ma.sir.erh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.erh.dao.facade.core.ReclamationDao;
import ma.sir.erh.dao.facade.history.ReclamationHistoryDao;
import ma.sir.erh.dao.specification.core.ReclamationSpecification;
import ma.sir.erh.service.facade.admin.ReclamationAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.erh.service.facade.admin.TypeReclamationAdminService ;
import ma.sir.erh.service.facade.admin.EmployeAdminService ;
import ma.sir.erh.service.facade.admin.EtatReclamationAdminService ;


import java.util.List;
@Service
public class ReclamationAdminServiceImpl extends AbstractServiceImpl<Reclamation,ReclamationHistory, ReclamationCriteria, ReclamationHistoryCriteria, ReclamationDao,
ReclamationHistoryDao> implements ReclamationAdminService {


    public Reclamation findByReferenceEntity(Reclamation t){
        return  dao.findByReference(t.getReference());
    }

    public List<Reclamation> findByTypeReclamationId(Long id){
        return dao.findByTypeReclamationId(id);
    }
    public int deleteByTypeReclamationId(Long id){
        return dao.deleteByTypeReclamationId(id);
    }
    public List<Reclamation> findByEtatReclamationId(Long id){
        return dao.findByEtatReclamationId(id);
    }
    public int deleteByEtatReclamationId(Long id){
        return dao.deleteByEtatReclamationId(id);
    }
    public List<Reclamation> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Reclamation> findByDestinataireId(Long id){
        return dao.findByDestinataireId(id);
    }
    public int deleteByDestinataireId(Long id){
        return dao.deleteByDestinataireId(id);
    }

    public void configure() {
        super.configure(Reclamation.class,ReclamationHistory.class, ReclamationHistoryCriteria.class, ReclamationSpecification.class);
    }

    @Autowired
    private TypeReclamationAdminService typeReclamationService ;
    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private EtatReclamationAdminService etatReclamationService ;
    public ReclamationAdminServiceImpl(ReclamationDao dao, ReclamationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}