package nvtu.lscexp.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import nvtu.lscexp.model.Metadata;
import nvtu.lscexp.repository.MetadataRepository;

@Service
@Transactional
public class MetadataServiceImpl implements MetadataService {
    
    @Autowired
    private MetadataRepository metadataRepository;
    
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Metadata> getMetadataByDate(String date) {
        List<Metadata> metadataList = this.metadataRepository.findByDate(date);
        return metadataList;
    }

    @Override
    public List<String> getDateList() {
        final String COLLECTION_NAME = "Metadata";
        List<String> dateList = new ArrayList<String>();
        MongoCollection<Document> collection = mongoTemplate.getCollection(COLLECTION_NAME);
        DistinctIterable<String> distinctIterable = collection.distinct("date", String.class);
        MongoCursor<String> cursor = distinctIterable.iterator();
        while (cursor.hasNext()) {
            String date = cursor.next();
            dateList.add(date);
        }
        return dateList;
    }
}
