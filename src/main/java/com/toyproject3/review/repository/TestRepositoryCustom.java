package com.toyproject3.review.repository;

import com.toyproject3.review.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {

    public List<TestEntity> findAllByNameByQuerydsl(String name);
}
