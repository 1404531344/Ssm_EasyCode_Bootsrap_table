package com.fz.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2024-02-10 15:57:29
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -14933778103897416L;
    
    private Integer sid;
    
    private String name;
    
    private Integer age;

    public Student() {
    }

    public Student(Integer sid, String name, Integer age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }



    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

