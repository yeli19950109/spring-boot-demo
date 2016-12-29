package com.example.dao;

import com.example.model.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2016/12/29.
 */
public interface DemoRepository extends CrudRepository<Demo,Long> {
}
