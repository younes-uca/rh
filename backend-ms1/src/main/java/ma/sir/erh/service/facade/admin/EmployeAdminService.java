package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.Employe;
import ma.sir.erh.dao.criteria.core.EmployeCriteria;
import ma.sir.erh.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface EmployeAdminService extends  IService<Employe,EmployeCriteria, EmployeHistoryCriteria>  {

    List<Employe> findBySexeId(Long id);
    int deleteBySexeId(Long id);
    List<Employe> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<Employe> findByCategorieEmployeId(Long id);
    int deleteByCategorieEmployeId(Long id);
    List<Employe> findByPromotionId(Long id);
    int deleteByPromotionId(Long id);
    List<Employe> findByEducationId(Long id);
    int deleteByEducationId(Long id);



}
