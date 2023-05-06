package  ma.sir.erh.dao.criteria.core;


import ma.sir.erh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class MessageCriteria extends  BaseCriteria  {

    private String idEmeteur;
    private String idEmeteurMin;
    private String idEmeteurMax;
    private String idDestinataire;
    private String idDestinataireMin;
    private String idDestinataireMax;
    private String message;
    private String messageLike;
    private LocalDateTime dateEnvoi;
    private LocalDateTime dateEnvoiFrom;
    private LocalDateTime dateEnvoiTo;
    private Boolean replied;



    public MessageCriteria(){}

    public String getIdEmeteur(){
        return this.idEmeteur;
    }
    public void setIdEmeteur(String idEmeteur){
        this.idEmeteur = idEmeteur;
    }   
    public String getIdEmeteurMin(){
        return this.idEmeteurMin;
    }
    public void setIdEmeteurMin(String idEmeteurMin){
        this.idEmeteurMin = idEmeteurMin;
    }
    public String getIdEmeteurMax(){
        return this.idEmeteurMax;
    }
    public void setIdEmeteurMax(String idEmeteurMax){
        this.idEmeteurMax = idEmeteurMax;
    }
      
    public String getIdDestinataire(){
        return this.idDestinataire;
    }
    public void setIdDestinataire(String idDestinataire){
        this.idDestinataire = idDestinataire;
    }   
    public String getIdDestinataireMin(){
        return this.idDestinataireMin;
    }
    public void setIdDestinataireMin(String idDestinataireMin){
        this.idDestinataireMin = idDestinataireMin;
    }
    public String getIdDestinataireMax(){
        return this.idDestinataireMax;
    }
    public void setIdDestinataireMax(String idDestinataireMax){
        this.idDestinataireMax = idDestinataireMax;
    }
      
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessageLike(){
        return this.messageLike;
    }
    public void setMessageLike(String messageLike){
        this.messageLike = messageLike;
    }

    public LocalDateTime getDateEnvoi(){
        return this.dateEnvoi;
    }
    public void setDateEnvoi(LocalDateTime dateEnvoi){
        this.dateEnvoi = dateEnvoi;
    }
    public LocalDateTime getDateEnvoiFrom(){
        return this.dateEnvoiFrom;
    }
    public void setDateEnvoiFrom(LocalDateTime dateEnvoiFrom){
        this.dateEnvoiFrom = dateEnvoiFrom;
    }
    public LocalDateTime getDateEnvoiTo(){
        return this.dateEnvoiTo;
    }
    public void setDateEnvoiTo(LocalDateTime dateEnvoiTo){
        this.dateEnvoiTo = dateEnvoiTo;
    }
    public Boolean getReplied(){
        return this.replied;
    }
    public void setReplied(Boolean replied){
        this.replied = replied;
    }

}
