package  ma.sir.erh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.erh.bean.core.CompagnieAssurance;
import ma.sir.erh.bean.history.CompagnieAssuranceHistory;
import ma.sir.erh.dao.criteria.core.CompagnieAssuranceCriteria;
import ma.sir.erh.dao.criteria.history.CompagnieAssuranceHistoryCriteria;
import ma.sir.erh.service.facade.admin.CompagnieAssuranceAdminService;
import ma.sir.erh.ws.converter.CompagnieAssuranceConverter;
import ma.sir.erh.ws.dto.CompagnieAssuranceDto;
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

@Api("Manages compagnieAssurance services")
@RestController
@RequestMapping("/api/admin/compagnieAssurance/")
public class CompagnieAssuranceRestAdmin  extends AbstractController<CompagnieAssurance, CompagnieAssuranceDto, CompagnieAssuranceHistory, CompagnieAssuranceCriteria, CompagnieAssuranceHistoryCriteria, CompagnieAssuranceAdminService, CompagnieAssuranceConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all compagnieAssurances")
    @GetMapping("")
    public ResponseEntity<List<CompagnieAssuranceDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all compagnieAssurances")
    @GetMapping("optimized")
    public ResponseEntity<List<CompagnieAssuranceDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a compagnieAssurance by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CompagnieAssuranceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  compagnieAssurance")
    @PostMapping("")
    public ResponseEntity<CompagnieAssuranceDto> save(@RequestBody CompagnieAssuranceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  compagnieAssurance")
    @PutMapping("")
    public ResponseEntity<CompagnieAssuranceDto> update(@RequestBody CompagnieAssuranceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of compagnieAssurance")
    @PostMapping("multiple")
    public ResponseEntity<List<CompagnieAssuranceDto>> delete(@RequestBody List<CompagnieAssuranceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified compagnieAssurance")
    @DeleteMapping("")
    public ResponseEntity<CompagnieAssuranceDto> delete(@RequestBody CompagnieAssuranceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified compagnieAssurance")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple compagnieAssurances by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds compagnieAssurances by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CompagnieAssuranceDto>> findByCriteria(@RequestBody CompagnieAssuranceCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated compagnieAssurances by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CompagnieAssuranceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports compagnieAssurances by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CompagnieAssuranceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets compagnieAssurance data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CompagnieAssuranceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets compagnieAssurance history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets compagnieAssurance paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CompagnieAssuranceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports compagnieAssurance history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CompagnieAssuranceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets compagnieAssurance history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CompagnieAssuranceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CompagnieAssuranceRestAdmin (CompagnieAssuranceAdminService service, CompagnieAssuranceConverter converter) {
        super(service, converter);
    }


}