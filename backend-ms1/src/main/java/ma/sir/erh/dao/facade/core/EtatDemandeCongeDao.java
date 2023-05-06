package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.EtatDemandeConge;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.EtatDemandeConge;
import java.util.List;


@Repository
public interface EtatDemandeCongeDao extends AbstractRepository<EtatDemandeConge,Long>  {
    EtatDemandeConge findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatDemandeConge(item.id,item.libelle) FROM EtatDemandeConge item")
    List<EtatDemandeConge> findAllOptimized();
}
