package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.Education;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.Education;
import java.util.List;


@Repository
public interface EducationDao extends AbstractRepository<Education,Long>  {
    Education findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Education(item.id,item.libelle) FROM Education item")
    List<Education> findAllOptimized();
}
