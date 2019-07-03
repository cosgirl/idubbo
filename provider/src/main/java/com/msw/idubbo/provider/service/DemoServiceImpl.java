package com.msw.idubbo.provider.service;

import com.msw.idubbo.entity.Person;
import com.msw.idubbo.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author mashuangwei
 * @title: DemoServiceImpl
 * @projectName idubbo
 * @description: TODO
 * @date 2019-07-01
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hi " + name;
    }

    @Override
    public Map<String, Person> query(Map<String, Person> map) {
        Person person = new Person("林志玲",18);

        map.put("小姐姐",  person);
        return map;
    }

    @Override
    public ArrayList<Person> search(ArrayList<Person> list) {
        Person person = new Person("林志玲",18);
        list.add(person);
        return list;
    }
}
