package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.VilleHistory;
import ma.sir.erh.bean.core.Ville;
import ma.sir.erh.ws.dto.VilleDto;

@Component
public class VilleConverter extends AbstractConverter<Ville, VilleDto, VilleHistory> {


    public  VilleConverter(){
        super(Ville.class, VilleDto.class, VilleHistory.class);
    }

    @Override
    public Ville toItem(VilleDto dto) {
        if (dto == null) {
            return null;
        } else {
        Ville item = new Ville();
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
    public VilleDto toDto(Ville item) {
        if (item == null) {
            return null;
        } else {
            VilleDto dto = new VilleDto();
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
