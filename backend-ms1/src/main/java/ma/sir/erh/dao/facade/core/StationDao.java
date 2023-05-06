package ma.sir.erh.dao.facade.core;

import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.Station;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StationDao extends AbstractRepository<Station,Long>  {

    List<Station> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Station> findByVilleId(Long id);
    int deleteByVilleId(Long id);

}
