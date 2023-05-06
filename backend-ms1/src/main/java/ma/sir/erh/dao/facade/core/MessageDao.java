package ma.sir.erh.dao.facade.core;

import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.Message;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface MessageDao extends AbstractRepository<Message,Long>  {


}
