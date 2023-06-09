package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.LienParenteHistory;
import ma.sir.erh.bean.core.LienParente;
import ma.sir.erh.ws.dto.LienParenteDto;

@Component
public class LienParenteConverter extends AbstractConverter<LienParente, LienParenteDto, LienParenteHistory> {


    public  LienParenteConverter(){
        super(LienParente.class, LienParenteDto.class, LienParenteHistory.class);
    }

    @Override
    public LienParente toItem(LienParenteDto dto) {
        if (dto == null) {
            return null;
        } else {
        LienParente item = new LienParente();
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
    public LienParenteDto toDto(LienParente item) {
        if (item == null) {
            return null;
        } else {
            LienParenteDto dto = new LienParenteDto();
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
