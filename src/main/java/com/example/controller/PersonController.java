package com.example.controller;

import com.example.dao.PersonRepository;
import com.example.model.People;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/29.
 */
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @GetMapping(value = "/person")
    private List<People> peopleList(){
        return personService.getall();
    }

    @PostMapping(value = "/person/{pageNum}/{pageSize}")
    private Page peoplePage(@PathVariable("pageNum") Integer pageNum,
                            @PathVariable("pageSize") Integer pageSize/*,
                            @RequestParam("name") String name,*/
                            /*@RequestParam("age") Integer age*/){
        pageNum=(pageNum-1<0)?0:pageNum-1;
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        Pageable pageable=new PageRequest(pageNum,pageSize,sort);
        Page<People> datas = personRepository.findAll(pageable);
//        Page<People> datas = personRepository.findByNameAndAge(name,age,pageable);
        return datas;

    }

    @PostMapping(value = "/person")
    public People personAdd(@RequestParam("name") String name,
                            @RequestParam("age") Integer age) {
        People person = new People();
        person.setName(name);
        person.setAge(age);

        return personRepository.save(person);
    }

    @GetMapping(value = "/person/{id}")
    public People personFindOne(@PathVariable("id") Integer id) {
        return personRepository.findOne(id);
    }

    @DeleteMapping(value = "/person/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        personRepository.delete(id);
    }

    @PutMapping(value = "/person/{id}")
    public People personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {
        People person = new People();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    @GetMapping(value = "/person/age/{age}")
    public List<People> personListByAge(@PathVariable("age") Integer age) {
        return personRepository.findByAge(age);
    }

    /**
     * 事务测试
     */
    @PostMapping("/person/two")
    public Map personTwo(){
        personService.insertTwo();
        Map res=new HashMap();
        res.put("message","success");
        return res;
    }
}
