package com.example.service;

import com.example.dao.PersonRepository;
import com.example.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
@Service
public class PersonService {

    @Resource
    private PersonRepository personRepository;

    @Transactional
    public List<People> getall(){
        return personRepository.findAll();
    }

    @Transactional
    public void insertTwo(){
        People person = new People();
        person.setName("test1");
        person.setAge(11);

        personRepository.save(person);

        System.out.print("1/0");

        People person1 = new People();
        person1.setName("test12");
        person1.setAge(12);

        personRepository.save(person1);
    }
}
