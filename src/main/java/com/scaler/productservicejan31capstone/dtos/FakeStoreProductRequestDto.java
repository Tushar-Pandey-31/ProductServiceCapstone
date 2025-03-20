package com.scaler.productservicejan31capstone.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductRequestDto
{
    String title;
    String description;
    double price;
    String image;
    String category;
}
