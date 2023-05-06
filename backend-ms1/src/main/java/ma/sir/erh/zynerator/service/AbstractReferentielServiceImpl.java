package ma.sir.erh.zynerator.service;

import ma.sir.erh.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.erh.zynerator.criteria.BaseCriteria;
import ma.sir.erh.zynerator.history.HistBusinessObject;
import ma.sir.erh.zynerator.history.HistCriteria;
import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}