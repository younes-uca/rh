package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.CategorieEmploye;
import ma.sir.erh.bean.history.CategorieEmployeHistory;
import ma.sir.erh.dao.criteria.core.CategorieEmployeCriteria;
import ma.sir.erh.dao.criteria.history.CategorieEmployeHistoryCriteria;
import ma.sir.erh.dao.facade.core.CategorieEmployeDao;
import ma.sir.erh.dao.facade.history.CategorieEmployeHistoryDao;
import ma.sir.erh.dao.specification.core.CategorieEmployeSpecification;
import ma.sir.erh.service.facade.admin.CategorieEmployeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CategorieEmployeAdminServiceImpl extends AbstractServiceImpl<CategorieEmploye,CategorieEmployeHistory, CategorieEmployeCriteria, CategorieEmployeHistoryCriteria, CategorieEmployeDao,
CategorieEmployeHistoryDao> implements CategorieEmployeAdminService {


    public CategorieEmploye findByReferenceEntity(CategorieEmploye t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(CategorieEmploye.class,CategorieEmployeHistory.class, CategorieEmployeHistoryCriteria.class, CategorieEmployeSpecification.class);
    }

    public CategorieEmployeAdminServiceImpl(CategorieEmployeDao dao, CategorieEmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}