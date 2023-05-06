import {EtatDemandeCongeCriteria} from './EtatDemandeCongeCriteria.model';
import {DepartementCriteria} from './DepartementCriteria.model';
import {TypeDemandeCongeCriteria} from './TypeDemandeCongeCriteria.model';
import {EmployeCriteria} from './EmployeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class DemandeCongeCriteria  extends   BaseCriteria  {

    public id: number;
    public ref: string;
    public refLike: string;
    public startTime: Date;
    public startTimeFrom: Date;
    public startTimeTo: Date;
    public endTime: Date;
    public endTimeFrom: Date;
    public endTimeTo: Date;
     public nbrJourConge: number;
     public nbrJourCongeMin: number;
     public nbrJourCongeMax: number;
  public chefRH: EmployeCriteria ;
  public chefRHs: Array<EmployeCriteria> ;
  public chedDepartement: EmployeCriteria ;
  public chedDepartements: Array<EmployeCriteria> ;
  public departement: DepartementCriteria ;
  public departements: Array<DepartementCriteria> ;
  public etatDemandeConge: EtatDemandeCongeCriteria ;
  public etatDemandeConges: Array<EtatDemandeCongeCriteria> ;
  public typeDemandeConge: TypeDemandeCongeCriteria ;
  public typeDemandeConges: Array<TypeDemandeCongeCriteria> ;

}
