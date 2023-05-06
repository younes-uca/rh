package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.LienParente;
import ma.sir.erh.bean.history.LienParenteHistory;
import ma.sir.erh.dao.criteria.core.LienParenteCriteria;
import ma.sir.erh.dao.criteria.history.LienParenteHistoryCriteria;
import ma.sir.erh.dao.facade.core.LienParenteDao;
import ma.sir.erh.dao.facade.history.LienParenteHistoryDao;
import ma.sir.erh.dao.specification.core.LienParenteSpecification;
import ma.sir.erh.service.facade.admin.LienParenteAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LienParenteAdminServiceImpl extends AbstractServiceImpl<LienParente,LienParenteHistory, LienParenteCriteria, LienParenteHistoryCriteria, LienParenteDao,
LienParenteHistoryDao> implements LienParenteAdminService {


    public LienParente findByReferenceEntity(LienParente t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(LienParente.class,LienParenteHistory.class, LienParenteHistoryCriteria.class, LienParenteSpecification.class);
    }

    public LienParenteAdminServiceImpl(LienParenteDao dao, LienParenteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}