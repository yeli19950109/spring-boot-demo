package com.example.controller;

/**
 * Created by Administrator on 2016/12/28.
 */
import com.example.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Demo;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("")
    public Demo get(){
        Demo demo= new Demo();
        demo.setId(1);
        demo.setName("demo");
        return demo;
    }

    @RequestMapping("/add")
    public String add(){
        Demo d = new Demo();
        d.setName("angel");
        d.setPassword("123456");
        demoService.save(d);
        return "ok.DemoController.save";
    }
}
