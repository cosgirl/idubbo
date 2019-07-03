package com.msw.idubbo.consumer.rest;

import com.msw.idubbo.entity.Person;
import com.msw.idubbo.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author mashuangwei
 * @title: DemoController
 * @projectName idubbo
 * @description: TODO
 * @date 2019-07-01
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0", check = false)
    private DemoService demoService;

    @GetMapping("/dubbo")
    public String sayHi(String name){
        return demoService.sayHello(name);
    }

    @GetMapping("/search")
    public ArrayList<Person> search(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("msw", 19));
        return demoService.search(list);
    }
}
