package com.scaler.productservicejan31capstone.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel
{
    private String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)

    @JsonIgnore
    private List<Product> products;

}
