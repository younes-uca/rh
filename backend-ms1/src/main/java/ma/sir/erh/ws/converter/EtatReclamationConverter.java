package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.EtatReclamationHistory;
import ma.sir.erh.bean.core.EtatReclamation;
import ma.sir.erh.ws.dto.EtatReclamationDto;

@Component
public class EtatReclamationConverter extends AbstractConverter<EtatReclamation, EtatReclamationDto, EtatReclamationHistory> {


    public  EtatReclamationConverter(){
        super(EtatReclamation.class, EtatReclamationDto.class, EtatReclamationHistory.class);
    }

    @Override
    public EtatReclamation toItem(EtatReclamationDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatReclamation item = new EtatReclamation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public EtatReclamationDto toDto(EtatReclamation item) {
        if (item == null) {
            return null;
        } else {
            EtatReclamationDto dto = new EtatReclamationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
