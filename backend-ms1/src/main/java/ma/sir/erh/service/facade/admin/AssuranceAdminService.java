package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.Assurance;
import ma.sir.erh.dao.criteria.core.AssuranceCriteria;
import ma.sir.erh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface AssuranceAdminService extends  IService<Assurance,AssuranceCriteria, AssuranceHistoryCriteria>  {

    List<Assurance> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<Assurance> findByCompagnieAssuranceId(Long id);
    int deleteByCompagnieAssuranceId(Long id);
    List<Assurance> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Assurance> findByLienParenteId(Long id);
    int deleteByLienParenteId(Long id);



}
