package com.example.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2016/12/28.
 */
@Entity
@Table(name = "Demo")
public class Demo {
    @Id @GeneratedValue
    private long id;//主键.
    private String name;//测试名称
    @JSONField(serialize=false)  //加上之后该字段不会返回
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
