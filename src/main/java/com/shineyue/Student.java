package com.shineyue;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.io.Serializable;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/8
 * @Description
 */
@Data
public class Student implements Serializable {
    private int age;
    private String name;

    public Student(){}

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
