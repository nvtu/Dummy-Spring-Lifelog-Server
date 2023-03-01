package nvtu.lscexp.service;

import java.util.List;

import nvtu.lscexp.model.Metadata;

public interface MetadataService {
    List<Metadata> getMetadataByDate(String date);
    List<String> getDateList();
}
