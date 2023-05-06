package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.TypeReclamation;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.TypeReclamation;
import java.util.List;


@Repository
public interface TypeReclamationDao extends AbstractRepository<TypeReclamation,Long>  {
    TypeReclamation findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeReclamation(item.id,item.libelle) FROM TypeReclamation item")
    List<TypeReclamation> findAllOptimized();
}
