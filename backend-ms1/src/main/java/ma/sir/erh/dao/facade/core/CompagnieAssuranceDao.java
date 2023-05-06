package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.CompagnieAssurance;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.CompagnieAssurance;
import java.util.List;


@Repository
public interface CompagnieAssuranceDao extends AbstractRepository<CompagnieAssurance,Long>  {
    CompagnieAssurance findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CompagnieAssurance(item.id,item.libelle) FROM CompagnieAssurance item")
    List<CompagnieAssurance> findAllOptimized();
}
