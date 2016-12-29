package com.example.service;

import com.example.model.Demo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.dao.DemoRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/12/29.
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;

    @Transactional
    public void save(Demo demo)
    {
        demoRepository.save(demo);
    }
}
