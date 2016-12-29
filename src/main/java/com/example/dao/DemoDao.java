package com.example.dao;

import com.example.model.Demo;
import com.sun.rowset.internal.Row;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/29.
 */

@Repository
public class DemoDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Demo getById(long id)
    {
        String sql="select * from Demo where id=? ";
        RowMapper<Demo> rowMapper=new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
}
