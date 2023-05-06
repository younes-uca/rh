package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Ville;
import ma.sir.erh.bean.history.VilleHistory;
import ma.sir.erh.dao.criteria.core.VilleCriteria;
import ma.sir.erh.dao.criteria.history.VilleHistoryCriteria;
import ma.sir.erh.dao.facade.core.VilleDao;
import ma.sir.erh.dao.facade.history.VilleHistoryDao;
import ma.sir.erh.dao.specification.core.VilleSpecification;
import ma.sir.erh.service.facade.admin.VilleAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class VilleAdminServiceImpl extends AbstractServiceImpl<Ville,VilleHistory, VilleCriteria, VilleHistoryCriteria, VilleDao,
VilleHistoryDao> implements VilleAdminService {


    public Ville findByReferenceEntity(Ville t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Ville.class,VilleHistory.class, VilleHistoryCriteria.class, VilleSpecification.class);
    }

    public VilleAdminServiceImpl(VilleDao dao, VilleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}