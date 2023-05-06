package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Education;
import ma.sir.erh.bean.history.EducationHistory;
import ma.sir.erh.dao.criteria.core.EducationCriteria;
import ma.sir.erh.dao.criteria.history.EducationHistoryCriteria;
import ma.sir.erh.dao.facade.core.EducationDao;
import ma.sir.erh.dao.facade.history.EducationHistoryDao;
import ma.sir.erh.dao.specification.core.EducationSpecification;
import ma.sir.erh.service.facade.admin.EducationAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EducationAdminServiceImpl extends AbstractServiceImpl<Education,EducationHistory, EducationCriteria, EducationHistoryCriteria, EducationDao,
EducationHistoryDao> implements EducationAdminService {


    public Education findByReferenceEntity(Education t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Education.class,EducationHistory.class, EducationHistoryCriteria.class, EducationSpecification.class);
    }

    public EducationAdminServiceImpl(EducationDao dao, EducationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}