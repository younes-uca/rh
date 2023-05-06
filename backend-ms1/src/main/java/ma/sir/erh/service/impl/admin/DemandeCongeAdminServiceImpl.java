package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.DemandeConge;
import ma.sir.erh.bean.history.DemandeCongeHistory;
import ma.sir.erh.dao.criteria.core.DemandeCongeCriteria;
import ma.sir.erh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.erh.dao.facade.core.DemandeCongeDao;
import ma.sir.erh.dao.facade.history.DemandeCongeHistoryDao;
import ma.sir.erh.dao.specification.core.DemandeCongeSpecification;
import ma.sir.erh.service.facade.admin.DemandeCongeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.erh.service.facade.admin.DepartementAdminService ;
import ma.sir.erh.service.facade.admin.TypeDemandeCongeAdminService ;
import ma.sir.erh.service.facade.admin.EtatDemandeCongeAdminService ;
import ma.sir.erh.service.facade.admin.EmployeAdminService ;


import java.util.List;
@Service
public class DemandeCongeAdminServiceImpl extends AbstractServiceImpl<DemandeConge,DemandeCongeHistory, DemandeCongeCriteria, DemandeCongeHistoryCriteria, DemandeCongeDao,
DemandeCongeHistoryDao> implements DemandeCongeAdminService {



    public List<DemandeConge> findByChefRHId(Long id){
        return dao.findByChefRHId(id);
    }
    public int deleteByChefRHId(Long id){
        return dao.deleteByChefRHId(id);
    }
    public List<DemandeConge> findByChedDepartementId(Long id){
        return dao.findByChedDepartementId(id);
    }
    public int deleteByChedDepartementId(Long id){
        return dao.deleteByChedDepartementId(id);
    }
    public List<DemandeConge> findByDepartementId(Long id){
        return dao.findByDepartementId(id);
    }
    public int deleteByDepartementId(Long id){
        return dao.deleteByDepartementId(id);
    }
    public List<DemandeConge> findByEtatDemandeCongeId(Long id){
        return dao.findByEtatDemandeCongeId(id);
    }
    public int deleteByEtatDemandeCongeId(Long id){
        return dao.deleteByEtatDemandeCongeId(id);
    }
    public List<DemandeConge> findByTypeDemandeCongeId(Long id){
        return dao.findByTypeDemandeCongeId(id);
    }
    public int deleteByTypeDemandeCongeId(Long id){
        return dao.deleteByTypeDemandeCongeId(id);
    }

    public void configure() {
        super.configure(DemandeConge.class,DemandeCongeHistory.class, DemandeCongeHistoryCriteria.class, DemandeCongeSpecification.class);
    }

    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private TypeDemandeCongeAdminService typeDemandeCongeService ;
    @Autowired
    private EtatDemandeCongeAdminService etatDemandeCongeService ;
    @Autowired
    private EmployeAdminService employeService ;
    public DemandeCongeAdminServiceImpl(DemandeCongeDao dao, DemandeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}