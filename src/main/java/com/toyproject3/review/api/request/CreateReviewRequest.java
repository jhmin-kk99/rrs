package com.toyproject3.review.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CreateReviewRequest {
    private  Long restaurantId;
    private  String content;
    private  double score;
}
