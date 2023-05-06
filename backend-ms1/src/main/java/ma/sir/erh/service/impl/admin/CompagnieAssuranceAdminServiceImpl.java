package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.CompagnieAssurance;
import ma.sir.erh.bean.history.CompagnieAssuranceHistory;
import ma.sir.erh.dao.criteria.core.CompagnieAssuranceCriteria;
import ma.sir.erh.dao.criteria.history.CompagnieAssuranceHistoryCriteria;
import ma.sir.erh.dao.facade.core.CompagnieAssuranceDao;
import ma.sir.erh.dao.facade.history.CompagnieAssuranceHistoryDao;
import ma.sir.erh.dao.specification.core.CompagnieAssuranceSpecification;
import ma.sir.erh.service.facade.admin.CompagnieAssuranceAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CompagnieAssuranceAdminServiceImpl extends AbstractServiceImpl<CompagnieAssurance,CompagnieAssuranceHistory, CompagnieAssuranceCriteria, CompagnieAssuranceHistoryCriteria, CompagnieAssuranceDao,
CompagnieAssuranceHistoryDao> implements CompagnieAssuranceAdminService {


    public CompagnieAssurance findByReferenceEntity(CompagnieAssurance t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(CompagnieAssurance.class,CompagnieAssuranceHistory.class, CompagnieAssuranceHistoryCriteria.class, CompagnieAssuranceSpecification.class);
    }

    public CompagnieAssuranceAdminServiceImpl(CompagnieAssuranceDao dao, CompagnieAssuranceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}