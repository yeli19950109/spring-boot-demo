package com.example.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Administrator on 2016/12/29.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

//    每20秒执行一次
//    @Scheduled(cron = "0/20 * * * * ?")
//    public void scheduled(){
//        System.out.println(">>>>>>>>>>>>>>>>>>>> SchedulingConfig.scheduler()");
//    }
}
