package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.News;
import ma.sir.erh.dao.criteria.core.NewsCriteria;
import ma.sir.erh.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface NewsAdminService extends  IService<News,NewsCriteria, NewsHistoryCriteria>  {




}
