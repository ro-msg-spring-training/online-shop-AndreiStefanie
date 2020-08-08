package ro.msg.learning.shop.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Address implements Serializable {

    private String country;

    private String city;

    private String county;

    private String streetAddress;
}
