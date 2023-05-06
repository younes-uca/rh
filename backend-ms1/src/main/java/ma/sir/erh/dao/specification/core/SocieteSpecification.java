package  ma.sir.erh.dao.specification.core;

import ma.sir.erh.zynerator.specification.AbstractSpecification;
import ma.sir.erh.dao.criteria.core.SocieteCriteria;
import ma.sir.erh.bean.core.Societe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SocieteSpecification extends  AbstractSpecification<SocieteCriteria, Societe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SocieteSpecification(SocieteCriteria criteria) {
        super(criteria);
    }

    public SocieteSpecification(SocieteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
