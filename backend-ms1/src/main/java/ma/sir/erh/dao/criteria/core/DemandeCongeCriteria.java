package  ma.sir.erh.dao.criteria.core;


import ma.sir.erh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class DemandeCongeCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private LocalDateTime startTime;
    private LocalDateTime startTimeFrom;
    private LocalDateTime startTimeTo;
    private LocalDateTime endTime;
    private LocalDateTime endTimeFrom;
    private LocalDateTime endTimeTo;
    private String nbrJourConge;
    private String nbrJourCongeMin;
    private String nbrJourCongeMax;

    private EmployeCriteria chefRH ;
    private List<EmployeCriteria> chefRHs ;
    private EmployeCriteria chedDepartement ;
    private List<EmployeCriteria> chedDepartements ;
    private DepartementCriteria departement ;
    private List<DepartementCriteria> departements ;
    private EtatDemandeCongeCriteria etatDemandeConge ;
    private List<EtatDemandeCongeCriteria> etatDemandeConges ;
    private TypeDemandeCongeCriteria typeDemandeConge ;
    private List<TypeDemandeCongeCriteria> typeDemandeConges ;


    public DemandeCongeCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

    public LocalDateTime getStartTime(){
        return this.startTime;
    }
    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }
    public LocalDateTime getStartTimeFrom(){
        return this.startTimeFrom;
    }
    public void setStartTimeFrom(LocalDateTime startTimeFrom){
        this.startTimeFrom = startTimeFrom;
    }
    public LocalDateTime getStartTimeTo(){
        return this.startTimeTo;
    }
    public void setStartTimeTo(LocalDateTime startTimeTo){
        this.startTimeTo = startTimeTo;
    }
    public LocalDateTime getEndTime(){
        return this.endTime;
    }
    public void setEndTime(LocalDateTime endTime){
        this.endTime = endTime;
    }
    public LocalDateTime getEndTimeFrom(){
        return this.endTimeFrom;
    }
    public void setEndTimeFrom(LocalDateTime endTimeFrom){
        this.endTimeFrom = endTimeFrom;
    }
    public LocalDateTime getEndTimeTo(){
        return this.endTimeTo;
    }
    public void setEndTimeTo(LocalDateTime endTimeTo){
        this.endTimeTo = endTimeTo;
    }
    public String getNbrJourConge(){
        return this.nbrJourConge;
    }
    public void setNbrJourConge(String nbrJourConge){
        this.nbrJourConge = nbrJourConge;
    }   
    public String getNbrJourCongeMin(){
        return this.nbrJourCongeMin;
    }
    public void setNbrJourCongeMin(String nbrJourCongeMin){
        this.nbrJourCongeMin = nbrJourCongeMin;
    }
    public String getNbrJourCongeMax(){
        return this.nbrJourCongeMax;
    }
    public void setNbrJourCongeMax(String nbrJourCongeMax){
        this.nbrJourCongeMax = nbrJourCongeMax;
    }
      

    public EmployeCriteria getChefRH(){
        return this.chefRH;
    }

    public void setChefRH(EmployeCriteria chefRH){
        this.chefRH = chefRH;
    }
    public List<EmployeCriteria> getChefRHs(){
        return this.chefRHs;
    }

    public void setChefRHs(List<EmployeCriteria> chefRHs){
        this.chefRHs = chefRHs;
    }
    public EmployeCriteria getChedDepartement(){
        return this.chedDepartement;
    }

    public void setChedDepartement(EmployeCriteria chedDepartement){
        this.chedDepartement = chedDepartement;
    }
    public List<EmployeCriteria> getChedDepartements(){
        return this.chedDepartements;
    }

    public void setChedDepartements(List<EmployeCriteria> chedDepartements){
        this.chedDepartements = chedDepartements;
    }
    public DepartementCriteria getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementCriteria departement){
        this.departement = departement;
    }
    public List<DepartementCriteria> getDepartements(){
        return this.departements;
    }

    public void setDepartements(List<DepartementCriteria> departements){
        this.departements = departements;
    }
    public EtatDemandeCongeCriteria getEtatDemandeConge(){
        return this.etatDemandeConge;
    }

    public void setEtatDemandeConge(EtatDemandeCongeCriteria etatDemandeConge){
        this.etatDemandeConge = etatDemandeConge;
    }
    public List<EtatDemandeCongeCriteria> getEtatDemandeConges(){
        return this.etatDemandeConges;
    }

    public void setEtatDemandeConges(List<EtatDemandeCongeCriteria> etatDemandeConges){
        this.etatDemandeConges = etatDemandeConges;
    }
    public TypeDemandeCongeCriteria getTypeDemandeConge(){
        return this.typeDemandeConge;
    }

    public void setTypeDemandeConge(TypeDemandeCongeCriteria typeDemandeConge){
        this.typeDemandeConge = typeDemandeConge;
    }
    public List<TypeDemandeCongeCriteria> getTypeDemandeConges(){
        return this.typeDemandeConges;
    }

    public void setTypeDemandeConges(List<TypeDemandeCongeCriteria> typeDemandeConges){
        this.typeDemandeConges = typeDemandeConges;
    }
}
