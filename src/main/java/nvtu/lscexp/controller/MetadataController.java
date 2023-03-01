package nvtu.lscexp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvtu.lscexp.model.Metadata;
import nvtu.lscexp.service.MetadataService;

@RestController
@RequestMapping("/metadata")
public class MetadataController {

    @Autowired
    private MetadataService metadataService; 
    
    @GetMapping("/date-list")
    public ResponseEntity< List<String> > getDateList() {
        List<String> dateList = this.metadataService.getDateList();
        return ResponseEntity.ok().body(dateList);
    }

    @GetMapping("/get-metadata-by-id")
    @Query(value = "{'id': ?0}")
    public ResponseEntity< Metadata > getMetadataById(String id) {
        Metadata metadata = this.metadataService.getMetadataById(id);
        return ResponseEntity.ok().body(metadata);
    }

    @GetMapping("/filter-by-date")
    @Query(value = "{'date': ?0}")
    public ResponseEntity< List<String> > getMetadataByDate(String date) {
        List<String> metadata = this.metadataService.getItemByDate(date);
        return ResponseEntity.ok().body(metadata);
    }

}
