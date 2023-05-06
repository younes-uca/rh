package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.TypeDemandeConge;
import ma.sir.erh.bean.history.TypeDemandeCongeHistory;
import ma.sir.erh.dao.criteria.core.TypeDemandeCongeCriteria;
import ma.sir.erh.dao.criteria.history.TypeDemandeCongeHistoryCriteria;
import ma.sir.erh.dao.facade.core.TypeDemandeCongeDao;
import ma.sir.erh.dao.facade.history.TypeDemandeCongeHistoryDao;
import ma.sir.erh.dao.specification.core.TypeDemandeCongeSpecification;
import ma.sir.erh.service.facade.admin.TypeDemandeCongeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeDemandeCongeAdminServiceImpl extends AbstractServiceImpl<TypeDemandeConge,TypeDemandeCongeHistory, TypeDemandeCongeCriteria, TypeDemandeCongeHistoryCriteria, TypeDemandeCongeDao,
TypeDemandeCongeHistoryDao> implements TypeDemandeCongeAdminService {


    public TypeDemandeConge findByReferenceEntity(TypeDemandeConge t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeDemandeConge.class,TypeDemandeCongeHistory.class, TypeDemandeCongeHistoryCriteria.class, TypeDemandeCongeSpecification.class);
    }

    public TypeDemandeCongeAdminServiceImpl(TypeDemandeCongeDao dao, TypeDemandeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}