package ma.sir.erh.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.erh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "message")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="message_seq",sequenceName="message_seq",allocationSize=1, initialValue = 1)
public class Message   extends AuditBusinessObject     {

    private Long id;

    private Long idEmeteur ;
    private Long idDestinataire ;
    @Column(length = 500)
    private String message;
    private LocalDateTime dateEnvoi ;
    @Column(columnDefinition = "boolean default false")
    private Boolean replied = false;



    public Message(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="message_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getIdEmeteur(){
        return this.idEmeteur;
    }
    public void setIdEmeteur(Long idEmeteur){
        this.idEmeteur = idEmeteur;
    }
    public Long getIdDestinataire(){
        return this.idDestinataire;
    }
    public void setIdDestinataire(Long idDestinataire){
        this.idDestinataire = idDestinataire;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public LocalDateTime getDateEnvoi(){
        return this.dateEnvoi;
    }
    public void setDateEnvoi(LocalDateTime dateEnvoi){
        this.dateEnvoi = dateEnvoi;
    }
    public Boolean  getReplied(){
        return this.replied;
    }
    public void setReplied(Boolean replied){
        this.replied = replied;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id != null && id.equals(message.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

