package com.example.dao;

import com.example.model.People;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
public interface PersonRepository extends JpaRepository<People,Integer>{

    public Page<People> findAll(Pageable pageable);
    public List<People> findByAge(Integer age);
    public Page<People> findByName(String name,Pageable pageable);
    public Page<People> findByNameAndAge(String name,Integer age,Pageable pageable);
    public List<People> findByName(String name);
}
