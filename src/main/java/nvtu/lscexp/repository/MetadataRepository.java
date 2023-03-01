package nvtu.lscexp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import nvtu.lscexp.model.Metadata;

@RepositoryRestResource(collectionResourceRel = "metadata", path = "metadata")
public interface MetadataRepository extends MongoRepository<Metadata, String>{

    @Query(value = "{'date': ?0}", fields = "{'_id': 1}")
    List<Metadata> findByDate(String date); 
}
