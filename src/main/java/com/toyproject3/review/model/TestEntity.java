package com.toyproject3.review.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "test")
public class TestEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;

    public TestEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public TestEntity() {

    }

    public void changeNameAndAge(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
