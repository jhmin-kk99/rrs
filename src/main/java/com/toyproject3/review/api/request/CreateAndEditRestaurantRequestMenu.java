package com.toyproject3.review.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class CreateAndEditRestaurantRequestMenu {
    private  String name;
    private  Integer price;
}
