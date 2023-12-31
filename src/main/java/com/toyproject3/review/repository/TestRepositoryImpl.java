package com.toyproject3.review.repository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import com.toyproject3.review.model.QTestEntity;
import com.toyproject3.review.model.TestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TestRepositoryImpl implements TestRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public List<TestEntity> findAllByNameByQuerydsl(String name) {
        return queryFactory.selectFrom(QTestEntity.testEntity)
                .fetch();
    }

}
