package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Departement;
import ma.sir.erh.bean.history.DepartementHistory;
import ma.sir.erh.dao.criteria.core.DepartementCriteria;
import ma.sir.erh.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.erh.dao.facade.core.DepartementDao;
import ma.sir.erh.dao.facade.history.DepartementHistoryDao;
import ma.sir.erh.dao.specification.core.DepartementSpecification;
import ma.sir.erh.service.facade.admin.DepartementAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.erh.service.facade.admin.StationAdminService ;
import ma.sir.erh.service.facade.admin.SiegeAdminService ;
import ma.sir.erh.service.facade.admin.EmployeAdminService ;


import java.util.List;
@Service
public class DepartementAdminServiceImpl extends AbstractServiceImpl<Departement,DepartementHistory, DepartementCriteria, DepartementHistoryCriteria, DepartementDao,
DepartementHistoryDao> implements DepartementAdminService {



    public List<Departement> findBySiegeId(Long id){
        return dao.findBySiegeId(id);
    }
    public int deleteBySiegeId(Long id){
        return dao.deleteBySiegeId(id);
    }
    public List<Departement> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Departement> findByStationId(Long id){
        return dao.findByStationId(id);
    }
    public int deleteByStationId(Long id){
        return dao.deleteByStationId(id);
    }

    public void configure() {
        super.configure(Departement.class,DepartementHistory.class, DepartementHistoryCriteria.class, DepartementSpecification.class);
    }

    @Autowired
    private StationAdminService stationService ;
    @Autowired
    private SiegeAdminService siegeService ;
    @Autowired
    private EmployeAdminService employeService ;
    public DepartementAdminServiceImpl(DepartementDao dao, DepartementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}