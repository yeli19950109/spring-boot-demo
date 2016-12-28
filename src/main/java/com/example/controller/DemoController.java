package com.example.controller;

/**
 * Created by Administrator on 2016/12/28.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Demo;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("")
    public Demo get(){
        Demo demo= new Demo();
        demo.setId(1);
        demo.setName("demo");
        return demo;
    }
}
