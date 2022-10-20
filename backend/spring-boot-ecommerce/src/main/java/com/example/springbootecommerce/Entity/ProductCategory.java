package com.example.springbootecommerce.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_category")
// @Data -- known bug when we use @Data with @OneToMany and  @ManyToOne so instead we use @Getter and @Setter
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")//cascade used to update the value this variable on the other table each time i applied changes on the variable
    private Set<Product> products;

}
