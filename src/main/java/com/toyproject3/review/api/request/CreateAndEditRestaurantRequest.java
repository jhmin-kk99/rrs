package com.toyproject3.review.api.request;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CreateAndEditRestaurantRequest {
    private  String name;
    private  String address;
    private  List<CreateAndEditRestaurantRequestMenu> menus;
}
