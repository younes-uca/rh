package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.News;
import ma.sir.erh.bean.history.NewsHistory;
import ma.sir.erh.dao.criteria.core.NewsCriteria;
import ma.sir.erh.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.erh.dao.facade.core.NewsDao;
import ma.sir.erh.dao.facade.history.NewsHistoryDao;
import ma.sir.erh.dao.specification.core.NewsSpecification;
import ma.sir.erh.service.facade.admin.NewsAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NewsAdminServiceImpl extends AbstractServiceImpl<News,NewsHistory, NewsCriteria, NewsHistoryCriteria, NewsDao,
NewsHistoryDao> implements NewsAdminService {


    public News findByReferenceEntity(News t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(News.class,NewsHistory.class, NewsHistoryCriteria.class, NewsSpecification.class);
    }

    public NewsAdminServiceImpl(NewsDao dao, NewsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}