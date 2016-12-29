package com.example.service;

import com.example.dao.DemoDao;
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
    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo)
    {
        demoRepository.save(demo);
    }

    public Demo getById(long id)
    {
        //demoRepository.findOne(id);
        // 在demoRepository可以直接使用findOne进行获取
        return demoDao.getById(id);
    }
}
