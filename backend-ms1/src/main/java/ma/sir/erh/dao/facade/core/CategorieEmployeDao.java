package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.CategorieEmploye;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.CategorieEmploye;
import java.util.List;


@Repository
public interface CategorieEmployeDao extends AbstractRepository<CategorieEmploye,Long>  {
    CategorieEmploye findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CategorieEmploye(item.id,item.libelle) FROM CategorieEmploye item")
    List<CategorieEmploye> findAllOptimized();
}
