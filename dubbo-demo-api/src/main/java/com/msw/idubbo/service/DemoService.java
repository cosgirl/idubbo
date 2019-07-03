package com.msw.idubbo.service;

import com.msw.idubbo.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mashuangwei
 * @title: DemoService
 * @projectName idubbo
 * @description: TODO
 * @date 2019-07-01
 */
public interface DemoService {
    String sayHello(String name);

    Map<String, Person> query(Map<String, Person> map);

    ArrayList<Person> search(ArrayList<Person>  list);

}
