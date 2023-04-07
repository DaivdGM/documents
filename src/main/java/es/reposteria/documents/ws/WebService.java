package es.reposteria.documents.ws;

import org.springframework.stereotype.Service;

@Service
public interface WebService {
  public byte[] donwloadImage(String url);
}
