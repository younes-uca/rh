package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.Reclamation;
import ma.sir.erh.dao.criteria.core.ReclamationCriteria;
import ma.sir.erh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface ReclamationAdminService extends  IService<Reclamation,ReclamationCriteria, ReclamationHistoryCriteria>  {

    List<Reclamation> findByTypeReclamationId(Long id);
    int deleteByTypeReclamationId(Long id);
    List<Reclamation> findByEtatReclamationId(Long id);
    int deleteByEtatReclamationId(Long id);
    List<Reclamation> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Reclamation> findByDestinataireId(Long id);
    int deleteByDestinataireId(Long id);



}
