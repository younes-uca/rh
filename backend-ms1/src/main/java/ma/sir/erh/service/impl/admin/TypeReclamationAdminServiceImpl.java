package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.TypeReclamation;
import ma.sir.erh.bean.history.TypeReclamationHistory;
import ma.sir.erh.dao.criteria.core.TypeReclamationCriteria;
import ma.sir.erh.dao.criteria.history.TypeReclamationHistoryCriteria;
import ma.sir.erh.dao.facade.core.TypeReclamationDao;
import ma.sir.erh.dao.facade.history.TypeReclamationHistoryDao;
import ma.sir.erh.dao.specification.core.TypeReclamationSpecification;
import ma.sir.erh.service.facade.admin.TypeReclamationAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationAdminServiceImpl extends AbstractServiceImpl<TypeReclamation,TypeReclamationHistory, TypeReclamationCriteria, TypeReclamationHistoryCriteria, TypeReclamationDao,
TypeReclamationHistoryDao> implements TypeReclamationAdminService {


    public TypeReclamation findByReferenceEntity(TypeReclamation t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamation.class,TypeReclamationHistory.class, TypeReclamationHistoryCriteria.class, TypeReclamationSpecification.class);
    }

    public TypeReclamationAdminServiceImpl(TypeReclamationDao dao, TypeReclamationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}