package  ma.sir.erh.dao.specification.core;

import ma.sir.erh.zynerator.specification.AbstractSpecification;
import ma.sir.erh.dao.criteria.core.DepartementCriteria;
import ma.sir.erh.bean.core.Departement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DepartementSpecification extends  AbstractSpecification<DepartementCriteria, Departement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("nbrEmploye", criteria.getNbrEmploye(), criteria.getNbrEmployeMin(), criteria.getNbrEmployeMax());
        addPredicateBigDecimal("moyenneAge", criteria.getMoyenneAge(), criteria.getMoyenneAgeMin(), criteria.getMoyenneAgeMax());
        addPredicateFk("siege","id", criteria.getSiege()==null?null:criteria.getSiege().getId());
        addPredicateFk("siege","id", criteria.getSieges());
        addPredicateFk("siege","code", criteria.getSiege()==null?null:criteria.getSiege().getCode());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("station","id", criteria.getStation()==null?null:criteria.getStation().getId());
        addPredicateFk("station","id", criteria.getStations());
    }

    public DepartementSpecification(DepartementCriteria criteria) {
        super(criteria);
    }

    public DepartementSpecification(DepartementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
