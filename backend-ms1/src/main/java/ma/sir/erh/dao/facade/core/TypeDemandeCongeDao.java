package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.TypeDemandeConge;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.TypeDemandeConge;
import java.util.List;


@Repository
public interface TypeDemandeCongeDao extends AbstractRepository<TypeDemandeConge,Long>  {
    TypeDemandeConge findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeDemandeConge(item.id,item.libelle) FROM TypeDemandeConge item")
    List<TypeDemandeConge> findAllOptimized();
}
