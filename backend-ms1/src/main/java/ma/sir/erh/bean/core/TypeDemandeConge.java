package ma.sir.erh.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.erh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "type_demande_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_demande_conge_seq",sequenceName="type_demande_conge_seq",allocationSize=1, initialValue = 1)
public class TypeDemandeConge   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private Integer nbrJourConge = 0;



    public TypeDemandeConge(){
        super();
    }

    public TypeDemandeConge(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_demande_conge_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public Integer getNbrJourConge(){
        return this.nbrJourConge;
    }
    public void setNbrJourConge(Integer nbrJourConge){
        this.nbrJourConge = nbrJourConge;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeDemandeConge typeDemandeConge = (TypeDemandeConge) o;
        return id != null && id.equals(typeDemandeConge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

