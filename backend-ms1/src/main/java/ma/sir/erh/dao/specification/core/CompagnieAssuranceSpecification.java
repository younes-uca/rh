package  ma.sir.erh.dao.specification.core;

import ma.sir.erh.zynerator.specification.AbstractSpecification;
import ma.sir.erh.dao.criteria.core.CompagnieAssuranceCriteria;
import ma.sir.erh.bean.core.CompagnieAssurance;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAssuranceSpecification extends  AbstractSpecification<CompagnieAssuranceCriteria, CompagnieAssurance>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public CompagnieAssuranceSpecification(CompagnieAssuranceCriteria criteria) {
        super(criteria);
    }

    public CompagnieAssuranceSpecification(CompagnieAssuranceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
