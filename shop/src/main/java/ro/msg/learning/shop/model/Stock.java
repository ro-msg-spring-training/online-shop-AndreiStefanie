package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stock")
public class Stock implements Serializable {
    @EmbeddedId
    private StockKey id;

    @ManyToOne
    @JoinColumn(
        name = "product_id",
        insertable = false,
        updatable = false
    )
    private Product product;

    @ManyToOne
    @JoinColumn(
        name = "location_id",
        insertable = false,
        updatable = false
    )
    private Location location;

    private int quantity;
}
