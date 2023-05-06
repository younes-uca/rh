package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.SoldAnnuelConge;
import ma.sir.erh.dao.criteria.core.SoldAnnuelCongeCriteria;
import ma.sir.erh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface SoldAnnuelCongeAdminService extends  IService<SoldAnnuelConge,SoldAnnuelCongeCriteria, SoldAnnuelCongeHistoryCriteria>  {

    List<SoldAnnuelConge> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);



}
