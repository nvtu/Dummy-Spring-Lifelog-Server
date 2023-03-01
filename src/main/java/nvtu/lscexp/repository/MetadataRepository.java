package nvtu.lscexp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import nvtu.lscexp.model.Metadata;

@RepositoryRestResource(collectionResourceRel = "metadata", path = "metadata")
public interface MetadataRepository extends MongoRepository<Metadata, String>{
    List<Metadata> findByDate(@Param("date") String date); 
}
