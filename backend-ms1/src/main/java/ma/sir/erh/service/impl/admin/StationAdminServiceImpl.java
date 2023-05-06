package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Station;
import ma.sir.erh.bean.history.StationHistory;
import ma.sir.erh.dao.criteria.core.StationCriteria;
import ma.sir.erh.dao.criteria.history.StationHistoryCriteria;
import ma.sir.erh.dao.facade.core.StationDao;
import ma.sir.erh.dao.facade.history.StationHistoryDao;
import ma.sir.erh.dao.specification.core.StationSpecification;
import ma.sir.erh.service.facade.admin.StationAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.erh.bean.core.Departement;

import ma.sir.erh.service.facade.admin.VilleAdminService ;
import ma.sir.erh.service.facade.admin.DepartementAdminService ;
import ma.sir.erh.service.facade.admin.EmployeAdminService ;


import java.util.List;
@Service
public class StationAdminServiceImpl extends AbstractServiceImpl<Station,StationHistory, StationCriteria, StationHistoryCriteria, StationDao,
StationHistoryDao> implements StationAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Station create(Station t) {
        super.create(t);
        if (t.getDepartements() != null) {
                t.getDepartements().forEach(element-> {
                    element.setStation(t);
                    departementService.create(element);
            });
        }
        return t;
    }

    public Station findWithAssociatedLists(Long id){
        Station result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setDepartements(departementService.findByStationId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        departementService.deleteByStationId(id);
    }


    public void updateWithAssociatedLists(Station station){
    if(station !=null && station.getId() != null){
            List<List<Departement>> resultDepartements= departementService.getToBeSavedAndToBeDeleted(departementService.findByStationId(station.getId()),station.getDepartements());
            departementService.delete(resultDepartements.get(1));
            ListUtil.emptyIfNull(resultDepartements.get(0)).forEach(e -> e.setStation(station));
            departementService.update(resultDepartements.get(0),true);
    }
    }


    public List<Station> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Station> findByVilleId(Long id){
        return dao.findByVilleId(id);
    }
    public int deleteByVilleId(Long id){
        return dao.deleteByVilleId(id);
    }

    public void configure() {
        super.configure(Station.class,StationHistory.class, StationHistoryCriteria.class, StationSpecification.class);
    }

    @Autowired
    private VilleAdminService villeService ;
    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private EmployeAdminService employeService ;
    public StationAdminServiceImpl(StationDao dao, StationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}