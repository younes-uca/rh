package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.SoldAnnuelConge;
import ma.sir.erh.bean.history.SoldAnnuelCongeHistory;
import ma.sir.erh.dao.criteria.core.SoldAnnuelCongeCriteria;
import ma.sir.erh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.erh.dao.facade.core.SoldAnnuelCongeDao;
import ma.sir.erh.dao.facade.history.SoldAnnuelCongeHistoryDao;
import ma.sir.erh.dao.specification.core.SoldAnnuelCongeSpecification;
import ma.sir.erh.service.facade.admin.SoldAnnuelCongeAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.erh.service.facade.admin.EmployeAdminService ;


import java.util.List;
@Service
public class SoldAnnuelCongeAdminServiceImpl extends AbstractServiceImpl<SoldAnnuelConge,SoldAnnuelCongeHistory, SoldAnnuelCongeCriteria, SoldAnnuelCongeHistoryCriteria, SoldAnnuelCongeDao,
SoldAnnuelCongeHistoryDao> implements SoldAnnuelCongeAdminService {



    public List<SoldAnnuelConge> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }

    public void configure() {
        super.configure(SoldAnnuelConge.class,SoldAnnuelCongeHistory.class, SoldAnnuelCongeHistoryCriteria.class, SoldAnnuelCongeSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    public SoldAnnuelCongeAdminServiceImpl(SoldAnnuelCongeDao dao, SoldAnnuelCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}