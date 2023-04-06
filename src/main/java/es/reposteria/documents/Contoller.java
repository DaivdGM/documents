package es.reposteria.documents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Contoller {

  @Autowired
  CustomerRepository customerRepository;



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

}
