package es.reposteria.documents.controller;

import es.reposteria.documents.entities.Customer;
import es.reposteria.documents.entities.Photo;
import es.reposteria.documents.repositories.CustomerRepository;
import es.reposteria.documents.repositories.PhotoRepository;
import es.reposteria.documents.ws.WebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@RestController
public class Contoller {

  @Autowired
  CustomerRepository customerRepository;
  @Autowired
  PhotoRepository photoRepository;

  @Autowired
  WebService webService;



  @PostMapping("/prueba")
  public void prueba() {
    log.info("Incio");
    customerRepository.save(Customer.builder()
        .firstName("David")
        .lastName("Garcia")
      .build());

  }

  @GetMapping("/consulta")
  public String getPrueba() {
    log.info("Incio");
    return customerRepository.findByFirstName("David").toString();

  }

  @PostMapping("/photo")
  public Photo savePhoto(@RequestBody Photo photo) {
    return photoRepository.save(photo);
  }

  @GetMapping("/photo/{title}")
  public Photo getPhoto(@PathVariable String title) {
    return photoRepository.findByTitle(title);
  }

  @PostMapping("/photo-url")
  public Photo savePhotoByUrl(@RequestBody Photo photo) {
    photo.setImage(webService.donwloadImage(photo.getUrl()));
    return photoRepository.save(photo);
  }

}
