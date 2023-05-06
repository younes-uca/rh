package ma.sir.erh.service.facade.admin;

import java.util.List;
import ma.sir.erh.bean.core.Message;
import ma.sir.erh.dao.criteria.core.MessageCriteria;
import ma.sir.erh.dao.criteria.history.MessageHistoryCriteria;
import ma.sir.erh.zynerator.service.IService;

public interface MessageAdminService extends  IService<Message,MessageCriteria, MessageHistoryCriteria>  {




}
