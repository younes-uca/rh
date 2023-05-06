package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.Societe;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.Societe;
import java.util.List;


@Repository
public interface SocieteDao extends AbstractRepository<Societe,Long>  {
    Societe findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Societe(item.id,item.libelle) FROM Societe item")
    List<Societe> findAllOptimized();
}
