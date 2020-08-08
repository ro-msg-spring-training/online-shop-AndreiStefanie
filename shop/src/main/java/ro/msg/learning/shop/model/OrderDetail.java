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
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    @EmbeddedId
    private OrderDetailKey id;

    @ManyToOne
    @JoinColumn(
        name = "product_id",
        insertable = false,
        updatable = false
    )
    private Product product;

    @ManyToOne
    @JoinColumn(
        name = "order_id",
        insertable = false,
        updatable = false
    )
    private Order order;

    private int quantity;
}
