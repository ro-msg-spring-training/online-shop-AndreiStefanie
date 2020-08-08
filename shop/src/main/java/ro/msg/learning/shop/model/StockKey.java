package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Column;
import java.io.Serializable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class StockKey implements Serializable {
    @Column(name = "product_id")
    private int productId;

    @Column(name = "location_id")
    private int location;
}
