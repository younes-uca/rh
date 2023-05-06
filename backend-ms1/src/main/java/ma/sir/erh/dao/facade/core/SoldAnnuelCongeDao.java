package ma.sir.erh.dao.facade.core;

import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.SoldAnnuelConge;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SoldAnnuelCongeDao extends AbstractRepository<SoldAnnuelConge,Long>  {

    List<SoldAnnuelConge> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);

}
