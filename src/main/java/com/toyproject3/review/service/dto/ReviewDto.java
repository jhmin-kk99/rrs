package com.toyproject3.review.service.dto;

import com.toyproject3.review.model.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
public class ReviewDto {
    private Double avgScore;
    private List<ReviewEntity> reviews;
    private ReviewDtoPage page;

    @Getter
    @Builder
    @AllArgsConstructor
    public static class ReviewDtoPage {
        private Integer offset;
        private Integer limit;
    }
}
