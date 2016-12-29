package com.example.controller;

/**
 * Created by Administrator on 2016/12/28.
 */
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Demo;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;
    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping("")
    public Demo get(long id){
//        Demo demo= new Demo();
//        demo.setId(1);
//        demo.setName("demo");
        return demoService.getById(id);
    }

    @RequestMapping("/add")
    public String add(){
        Demo d = new Demo();
        d.setName("angel");
        d.setPassword("123456");
        demoService.save(d);
        return "ok.DemoController.save";
    }

    @RequestMapping("/email")
    public String email(){
        //SimpleMailMessage message = new SimpleMailMessage();

        // message.setFrom("631300329@qq.com");//发送者.
        // message.setTo("1549151619@qq.com");//接收者.
        // message.setSubject("测试邮件（邮件主题）");//邮件主题.
        // message.setText("这是邮件内容");//邮件内容.

        //mailSender.send(message);//发送邮件
        return "邮件测试失败";
    }
}
