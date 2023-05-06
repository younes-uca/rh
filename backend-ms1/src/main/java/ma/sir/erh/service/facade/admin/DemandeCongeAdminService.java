package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.DemandeConge;
import ma.sir.erh.dao.criteria.core.DemandeCongeCriteria;
import ma.sir.erh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface DemandeCongeAdminService extends  IService<DemandeConge,DemandeCongeCriteria, DemandeCongeHistoryCriteria>  {

    List<DemandeConge> findByChefRHId(Long id);
    int deleteByChefRHId(Long id);
    List<DemandeConge> findByChedDepartementId(Long id);
    int deleteByChedDepartementId(Long id);
    List<DemandeConge> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<DemandeConge> findByEtatDemandeCongeId(Long id);
    int deleteByEtatDemandeCongeId(Long id);
    List<DemandeConge> findByTypeDemandeCongeId(Long id);
    int deleteByTypeDemandeCongeId(Long id);



}
