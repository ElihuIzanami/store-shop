package com.eime.storeshope.request;

import com.eime.storeshope.model.Category;
import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;

@Data
public class AddProductRequest {

    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;


}
