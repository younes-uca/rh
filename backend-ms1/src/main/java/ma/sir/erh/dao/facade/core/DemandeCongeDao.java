package ma.sir.erh.dao.facade.core;

import ma.sir.erh.zynerator.repository.AbstractRepository;
import ma.sir.erh.bean.core.DemandeConge;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DemandeCongeDao extends AbstractRepository<DemandeConge,Long>  {

    List<DemandeConge> findByChefRHId(Long id);
    int deleteByChefRHId(Long id);
    List<DemandeConge> findByChedDepartementId(Long id);
    int deleteByChedDepartementId(Long id);
    List<DemandeConge> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<DemandeConge> findByEtatDemandeCongeId(Long id);
    int deleteByEtatDemandeCongeId(Long id);
    List<DemandeConge> findByTypeDemandeCongeId(Long id);
    int deleteByTypeDemandeCongeId(Long id);

}
