package com.example.model;

/**
 * Created by Administrator on 2016/12/28.
 */
import javax.persistence.*;

@Entity
@Table(name="People")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",length = 36, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
