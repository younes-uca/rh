package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Promotion;
import ma.sir.erh.bean.history.PromotionHistory;
import ma.sir.erh.dao.criteria.core.PromotionCriteria;
import ma.sir.erh.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.erh.dao.facade.core.PromotionDao;
import ma.sir.erh.dao.facade.history.PromotionHistoryDao;
import ma.sir.erh.dao.specification.core.PromotionSpecification;
import ma.sir.erh.service.facade.admin.PromotionAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class PromotionAdminServiceImpl extends AbstractServiceImpl<Promotion,PromotionHistory, PromotionCriteria, PromotionHistoryCriteria, PromotionDao,
PromotionHistoryDao> implements PromotionAdminService {


    public Promotion findByReferenceEntity(Promotion t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Promotion.class,PromotionHistory.class, PromotionHistoryCriteria.class, PromotionSpecification.class);
    }

    public PromotionAdminServiceImpl(PromotionDao dao, PromotionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}