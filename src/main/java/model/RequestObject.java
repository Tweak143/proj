package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestObject {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;
}
