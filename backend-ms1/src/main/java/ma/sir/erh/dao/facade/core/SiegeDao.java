package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.Siege;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.Siege;
import java.util.List;


@Repository
public interface SiegeDao extends AbstractRepository<Siege,Long>  {
    Siege findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Siege(item.id,item.libelle) FROM Siege item")
    List<Siege> findAllOptimized();
}
