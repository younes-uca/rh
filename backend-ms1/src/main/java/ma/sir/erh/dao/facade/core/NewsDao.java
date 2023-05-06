package ma.sir.erh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.News;
import org.springframework.stereotype.Repository;
import ma.sir.erh.bean.core.News;
import java.util.List;


@Repository
public interface NewsDao extends AbstractRepository<News,Long>  {
    News findByRef(String ref);
    int deleteByRef(String ref);


    @Query("SELECT NEW News(item.id,item.ref) FROM News item")
    List<News> findAllOptimized();
}
