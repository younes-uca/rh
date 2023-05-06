package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Assurance;
import ma.sir.erh.bean.history.AssuranceHistory;
import ma.sir.erh.dao.criteria.core.AssuranceCriteria;
import ma.sir.erh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.erh.dao.facade.core.AssuranceDao;
import ma.sir.erh.dao.facade.history.AssuranceHistoryDao;
import ma.sir.erh.dao.specification.core.AssuranceSpecification;
import ma.sir.erh.service.facade.admin.AssuranceAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.erh.service.facade.admin.LienParenteAdminService ;
import ma.sir.erh.service.facade.admin.CompagnieAssuranceAdminService ;
import ma.sir.erh.service.facade.admin.SocieteAdminService ;
import ma.sir.erh.service.facade.admin.EmployeAdminService ;


import java.util.List;
@Service
public class AssuranceAdminServiceImpl extends AbstractServiceImpl<Assurance,AssuranceHistory, AssuranceCriteria, AssuranceHistoryCriteria, AssuranceDao,
AssuranceHistoryDao> implements AssuranceAdminService {



    public List<Assurance> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public List<Assurance> findByCompagnieAssuranceId(Long id){
        return dao.findByCompagnieAssuranceId(id);
    }
    public int deleteByCompagnieAssuranceId(Long id){
        return dao.deleteByCompagnieAssuranceId(id);
    }
    public List<Assurance> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Assurance> findByLienParenteId(Long id){
        return dao.findByLienParenteId(id);
    }
    public int deleteByLienParenteId(Long id){
        return dao.deleteByLienParenteId(id);
    }

    public void configure() {
        super.configure(Assurance.class,AssuranceHistory.class, AssuranceHistoryCriteria.class, AssuranceSpecification.class);
    }

    @Autowired
    private LienParenteAdminService lienParenteService ;
    @Autowired
    private CompagnieAssuranceAdminService compagnieAssuranceService ;
    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private EmployeAdminService employeService ;
    public AssuranceAdminServiceImpl(AssuranceDao dao, AssuranceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}