package  ma.sir.erh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.erh.zynerator.util.StringUtil;
import ma.sir.erh.zynerator.converter.AbstractConverter;
import ma.sir.erh.zynerator.util.DateUtil;
import ma.sir.erh.bean.history.MessageHistory;
import ma.sir.erh.bean.core.Message;
import ma.sir.erh.ws.dto.MessageDto;

@Component
public class MessageConverter extends AbstractConverter<Message, MessageDto, MessageHistory> {


    public  MessageConverter(){
        super(Message.class, MessageDto.class, MessageHistory.class);
    }

    @Override
    public Message toItem(MessageDto dto) {
        if (dto == null) {
            return null;
        } else {
        Message item = new Message();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIdEmeteur()))
                item.setIdEmeteur(dto.getIdEmeteur());
            if(StringUtil.isNotEmpty(dto.getIdDestinataire()))
                item.setIdDestinataire(dto.getIdDestinataire());
            if(StringUtil.isNotEmpty(dto.getMessage()))
                item.setMessage(dto.getMessage());
            if(StringUtil.isNotEmpty(dto.getDateEnvoi()))
                item.setDateEnvoi(DateUtil.stringEnToDate(dto.getDateEnvoi()));
            if(dto.getReplied() != null)
                item.setReplied(dto.getReplied());


        return item;
        }
    }

    @Override
    public MessageDto toDto(Message item) {
        if (item == null) {
            return null;
        } else {
            MessageDto dto = new MessageDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getIdEmeteur()))
                dto.setIdEmeteur(item.getIdEmeteur());
            if(StringUtil.isNotEmpty(item.getIdDestinataire()))
                dto.setIdDestinataire(item.getIdDestinataire());
            if(StringUtil.isNotEmpty(item.getMessage()))
                dto.setMessage(item.getMessage());
            if(item.getDateEnvoi()!=null)
                dto.setDateEnvoi(DateUtil.dateTimeToString(item.getDateEnvoi()));
                dto.setReplied(item.getReplied());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
