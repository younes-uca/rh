package ma.sir.erh.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.erh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "compagnie_assurance")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="compagnie_assurance_seq",sequenceName="compagnie_assurance_seq",allocationSize=1, initialValue = 1)
public class CompagnieAssurance   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;



    public CompagnieAssurance(){
        super();
    }

    public CompagnieAssurance(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="compagnie_assurance_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
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

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompagnieAssurance compagnieAssurance = (CompagnieAssurance) o;
        return id != null && id.equals(compagnieAssurance.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

