package es.reposteria.documents.repositories;

import es.reposteria.documents.entities.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
  public Photo findByTitle(String title);
}
