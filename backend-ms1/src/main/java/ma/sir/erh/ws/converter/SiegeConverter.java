package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.SiegeHistory;
import ma.sir.erh.bean.core.Siege;
import ma.sir.erh.ws.dto.SiegeDto;

@Component
public class SiegeConverter extends AbstractConverter<Siege, SiegeDto, SiegeHistory> {


    public  SiegeConverter(){
        super(Siege.class, SiegeDto.class, SiegeHistory.class);
    }

    @Override
    public Siege toItem(SiegeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Siege item = new Siege();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


        return item;
        }
    }

    @Override
    public SiegeDto toDto(Siege item) {
        if (item == null) {
            return null;
        } else {
            SiegeDto dto = new SiegeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
