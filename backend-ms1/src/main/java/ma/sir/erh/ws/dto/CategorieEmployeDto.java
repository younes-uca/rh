package  ma.sir.erh.ws.dto;

import ma.sir.erh.zynerator.audit.Log;
import ma.sir.erh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategorieEmployeDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String description  ;




    public CategorieEmployeDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }






}
