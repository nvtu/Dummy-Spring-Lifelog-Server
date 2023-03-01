package nvtu.lscexp.service;

import java.util.List;

import nvtu.lscexp.model.Metadata;

public interface MetadataService {
    List<String> getItemByDate(String date);
    Metadata getMetadataById(String id);
    List<String> getDateList();
}
