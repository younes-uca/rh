package  ma.sir.erh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.erh.bean.core.Message;
import ma.sir.erh.bean.history.MessageHistory;
import ma.sir.erh.dao.criteria.core.MessageCriteria;
import ma.sir.erh.dao.criteria.history.MessageHistoryCriteria;
import ma.sir.erh.service.facade.admin.MessageAdminService;
import ma.sir.erh.ws.converter.MessageConverter;
import ma.sir.erh.ws.dto.MessageDto;
import ma.sir.erh.zynerator.controller.AbstractController;
import ma.sir.erh.zynerator.dto.AuditEntityDto;
import ma.sir.erh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.erh.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.erh.zynerator.dto.FileTempDto;

@Api("Manages message services")
@RestController
@RequestMapping("/api/admin/message/")
public class MessageRestAdmin  extends AbstractController<Message, MessageDto, MessageHistory, MessageCriteria, MessageHistoryCriteria, MessageAdminService, MessageConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all messages")
    @GetMapping("")
    public ResponseEntity<List<MessageDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a message by id")
    @GetMapping("id/{id}")
    public ResponseEntity<MessageDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  message")
    @PostMapping("")
    public ResponseEntity<MessageDto> save(@RequestBody MessageDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  message")
    @PutMapping("")
    public ResponseEntity<MessageDto> update(@RequestBody MessageDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of message")
    @PostMapping("multiple")
    public ResponseEntity<List<MessageDto>> delete(@RequestBody List<MessageDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified message")
    @DeleteMapping("")
    public ResponseEntity<MessageDto> delete(@RequestBody MessageDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified message")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple messages by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds messages by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<MessageDto>> findByCriteria(@RequestBody MessageCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated messages by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody MessageCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports messages by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody MessageCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets message data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody MessageCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets message history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets message paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody MessageHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports message history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody MessageHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets message history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody MessageHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public MessageRestAdmin (MessageAdminService service, MessageConverter converter) {
        super(service, converter);
    }


}