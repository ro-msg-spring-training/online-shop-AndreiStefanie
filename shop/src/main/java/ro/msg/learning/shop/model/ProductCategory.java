package ro.msg.learning.shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_categories")
public class ProductCategory extends BaseEntity {

    private String name;

    private String description;

    @OneToMany(
        mappedBy = "category",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Product> products;
}
