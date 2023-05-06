package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.EtatDemandeCongeHistory;
import ma.sir.erh.bean.core.EtatDemandeConge;
import ma.sir.erh.ws.dto.EtatDemandeCongeDto;

@Component
public class EtatDemandeCongeConverter extends AbstractConverter<EtatDemandeConge, EtatDemandeCongeDto, EtatDemandeCongeHistory> {


    public  EtatDemandeCongeConverter(){
        super(EtatDemandeConge.class, EtatDemandeCongeDto.class, EtatDemandeCongeHistory.class);
    }

    @Override
    public EtatDemandeConge toItem(EtatDemandeCongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatDemandeConge item = new EtatDemandeConge();
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
    public EtatDemandeCongeDto toDto(EtatDemandeConge item) {
        if (item == null) {
            return null;
        } else {
            EtatDemandeCongeDto dto = new EtatDemandeCongeDto();
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
