package  ma.sir.erh.dao.specification.core;

import ma.sir.erh.zynerator.specification.AbstractSpecification;
import ma.sir.erh.dao.criteria.core.MessageCriteria;
import ma.sir.erh.bean.core.Message;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class MessageSpecification extends  AbstractSpecification<MessageCriteria, Message>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateLong("idEmeteur", criteria.getIdEmeteur(), criteria.getIdEmeteurMin(), criteria.getIdEmeteurMax());
        addPredicateLong("idDestinataire", criteria.getIdDestinataire(), criteria.getIdDestinataireMin(), criteria.getIdDestinataireMax());
        addPredicate("dateEnvoi", criteria.getDateEnvoi(), criteria.getDateEnvoiFrom(), criteria.getDateEnvoiTo());
        addPredicateBool("replied", criteria.getReplied());
    }

    public MessageSpecification(MessageCriteria criteria) {
        super(criteria);
    }

    public MessageSpecification(MessageCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
