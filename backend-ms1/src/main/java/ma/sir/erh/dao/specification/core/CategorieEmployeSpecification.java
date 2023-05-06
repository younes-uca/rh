package  ma.sir.erh.dao.specification.core;

import ma.sir.erh.zynerator.specification.AbstractSpecification;
import ma.sir.erh.dao.criteria.core.CategorieEmployeCriteria;
import ma.sir.erh.bean.core.CategorieEmploye;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CategorieEmployeSpecification extends  AbstractSpecification<CategorieEmployeCriteria, CategorieEmploye>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public CategorieEmployeSpecification(CategorieEmployeCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeSpecification(CategorieEmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
