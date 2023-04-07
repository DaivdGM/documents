package es.reposteria.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document(collection = "photos")
public class Photo {
  @Id
  private String id;

  private String title;

  private byte[] image;
  private String url;
}
