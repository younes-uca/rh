package  ma.sir.erh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.erh.bean.core.EtatReclamation;
import ma.sir.erh.bean.history.EtatReclamationHistory;
import ma.sir.erh.dao.criteria.core.EtatReclamationCriteria;
import ma.sir.erh.dao.criteria.history.EtatReclamationHistoryCriteria;
import ma.sir.erh.service.facade.admin.EtatReclamationAdminService;
import ma.sir.erh.ws.converter.EtatReclamationConverter;
import ma.sir.erh.ws.dto.EtatReclamationDto;
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

@Api("Manages etatReclamation services")
@RestController
@RequestMapping("/api/admin/etatReclamation/")
public class EtatReclamationRestAdmin  extends AbstractController<EtatReclamation, EtatReclamationDto, EtatReclamationHistory, EtatReclamationCriteria, EtatReclamationHistoryCriteria, EtatReclamationAdminService, EtatReclamationConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatReclamations")
    @GetMapping("")
    public ResponseEntity<List<EtatReclamationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatReclamations")
    @GetMapping("optimized")
    public ResponseEntity<List<EtatReclamationDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatReclamation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatReclamationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatReclamation")
    @PostMapping("")
    public ResponseEntity<EtatReclamationDto> save(@RequestBody EtatReclamationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatReclamation")
    @PutMapping("")
    public ResponseEntity<EtatReclamationDto> update(@RequestBody EtatReclamationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatReclamation")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatReclamationDto>> delete(@RequestBody List<EtatReclamationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatReclamation")
    @DeleteMapping("")
    public ResponseEntity<EtatReclamationDto> delete(@RequestBody EtatReclamationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatReclamation")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatReclamations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatReclamations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatReclamationDto>> findByCriteria(@RequestBody EtatReclamationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatReclamations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatReclamationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReclamations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatReclamationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatReclamation data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatReclamationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatReclamation history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatReclamation paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatReclamationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReclamation history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatReclamationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatReclamation history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatReclamationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatReclamationRestAdmin (EtatReclamationAdminService service, EtatReclamationConverter converter) {
        super(service, converter);
    }


}