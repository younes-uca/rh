package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Employe;
import ma.sir.erh.bean.history.EmployeHistory;
import ma.sir.erh.dao.criteria.core.EmployeCriteria;
import ma.sir.erh.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.erh.dao.facade.core.EmployeDao;
import ma.sir.erh.dao.facade.history.EmployeHistoryDao;
import ma.sir.erh.dao.specification.core.EmployeSpecification;
import ma.sir.erh.service.facade.admin.EmployeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.erh.service.facade.admin.DepartementAdminService ;
import ma.sir.erh.service.facade.admin.SexeAdminService ;
import ma.sir.erh.service.facade.admin.EducationAdminService ;
import ma.sir.erh.service.facade.admin.PromotionAdminService ;
import ma.sir.erh.service.facade.admin.CategorieEmployeAdminService ;


import java.util.List;
@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe,EmployeHistory, EmployeCriteria, EmployeHistoryCriteria, EmployeDao,
EmployeHistoryDao> implements EmployeAdminService {



    public List<Employe> findBySexeId(Long id){
        return dao.findBySexeId(id);
    }
    public int deleteBySexeId(Long id){
        return dao.deleteBySexeId(id);
    }
    public List<Employe> findByDepartementId(Long id){
        return dao.findByDepartementId(id);
    }
    public int deleteByDepartementId(Long id){
        return dao.deleteByDepartementId(id);
    }
    public List<Employe> findByCategorieEmployeId(Long id){
        return dao.findByCategorieEmployeId(id);
    }
    public int deleteByCategorieEmployeId(Long id){
        return dao.deleteByCategorieEmployeId(id);
    }
    public List<Employe> findByPromotionId(Long id){
        return dao.findByPromotionId(id);
    }
    public int deleteByPromotionId(Long id){
        return dao.deleteByPromotionId(id);
    }
    public List<Employe> findByEducationId(Long id){
        return dao.findByEducationId(id);
    }
    public int deleteByEducationId(Long id){
        return dao.deleteByEducationId(id);
    }

    public void configure() {
        super.configure(Employe.class,EmployeHistory.class, EmployeHistoryCriteria.class, EmployeSpecification.class);
    }

    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private SexeAdminService sexeService ;
    @Autowired
    private EducationAdminService educationService ;
    @Autowired
    private PromotionAdminService promotionService ;
    @Autowired
    private CategorieEmployeAdminService categorieEmployeService ;
    public EmployeAdminServiceImpl(EmployeDao dao, EmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}