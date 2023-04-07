package es.reposteria.documents.ws;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebServiceInmpl implements WebService {

  public byte[] donwloadImage(String url) {
    return WebClient.create(url)
      .get()
      .accept(MediaType.IMAGE_JPEG)
      .retrieve()
      .bodyToMono(byte[].class)
      .block();
  }
}
