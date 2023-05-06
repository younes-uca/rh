package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.Station;
import ma.sir.erh.dao.criteria.core.StationCriteria;
import ma.sir.erh.dao.criteria.history.StationHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface StationAdminService extends  IService<Station,StationCriteria, StationHistoryCriteria>  {

    List<Station> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Station> findByVilleId(Long id);
    int deleteByVilleId(Long id);



}
