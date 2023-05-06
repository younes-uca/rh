package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.Sexe;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.Sexe;
import java.util.List;


@Repository
public interface SexeDao extends AbstractRepository<Sexe,Long>  {
    Sexe findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Sexe(item.id,item.libelle) FROM Sexe item")
    List<Sexe> findAllOptimized();
}
