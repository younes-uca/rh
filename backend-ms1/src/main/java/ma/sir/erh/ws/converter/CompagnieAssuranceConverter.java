package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.CompagnieAssuranceHistory;
import ma.sir.erh.bean.core.CompagnieAssurance;
import ma.sir.erh.ws.dto.CompagnieAssuranceDto;

@Component
public class CompagnieAssuranceConverter extends AbstractConverter<CompagnieAssurance, CompagnieAssuranceDto, CompagnieAssuranceHistory> {


    public  CompagnieAssuranceConverter(){
        super(CompagnieAssurance.class, CompagnieAssuranceDto.class, CompagnieAssuranceHistory.class);
    }

    @Override
    public CompagnieAssurance toItem(CompagnieAssuranceDto dto) {
        if (dto == null) {
            return null;
        } else {
        CompagnieAssurance item = new CompagnieAssurance();
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
    public CompagnieAssuranceDto toDto(CompagnieAssurance item) {
        if (item == null) {
            return null;
        } else {
            CompagnieAssuranceDto dto = new CompagnieAssuranceDto();
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
