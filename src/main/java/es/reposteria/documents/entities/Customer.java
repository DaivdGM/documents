package es.reposteria.documents.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
public class Customer {

  @Id
  private String id;

  private String firstName;
  private String lastName;

  public Customer() {}

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
      "Customer[id=%s, firstName='%s', lastName='%s']",
      id, firstName, lastName);
  }

}
