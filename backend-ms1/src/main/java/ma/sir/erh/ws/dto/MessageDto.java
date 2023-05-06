package  ma.sir.erh.ws.dto;

import ma.sir.erh.zynerator.audit.Log;
import ma.sir.erh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageDto  extends AuditBaseDto {

    private Long idEmeteur  ;
    private Long idDestinataire  ;
    private String message  ;
    private String dateEnvoi ;
    private Boolean replied  ;




    public MessageDto(){
        super();
    }



    @Log
    public Long getIdEmeteur(){
        return this.idEmeteur;
    }
    public void setIdEmeteur(Long idEmeteur){
        this.idEmeteur = idEmeteur;
    }

    @Log
    public Long getIdDestinataire(){
        return this.idDestinataire;
    }
    public void setIdDestinataire(Long idDestinataire){
        this.idDestinataire = idDestinataire;
    }

    @Log
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEnvoi(){
        return this.dateEnvoi;
    }
    public void setDateEnvoi(String dateEnvoi){
        this.dateEnvoi = dateEnvoi;
    }

    @Log
    public Boolean getReplied(){
        return this.replied;
    }
    public void setReplied(Boolean replied){
        this.replied = replied;
    }






}
