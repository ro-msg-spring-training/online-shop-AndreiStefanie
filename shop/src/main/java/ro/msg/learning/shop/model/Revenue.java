package ro.msg.learning.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "revenue")
public class Revenue extends BaseEntity {

    @ManyToOne
    @JoinColumn(
        name = "location_id",
        insertable = false,
        updatable = false
    )
    private Location location;

    @Column(name = "created_at")
    private LocalDate date;

    private BigInteger amount;

    private String currency;
}
