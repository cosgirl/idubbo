package com.msw.idubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author mashuangwei
 * @title: Person
 * @projectName idubbo
 * @description: TODO
 * @date 2019-07-03
 */
@Data
public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
