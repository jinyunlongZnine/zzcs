package com.shineyue;

import org.junit.Test;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/8
 * @Description
 */
public class TestStudent {
    @Test
    public void test01(){
        Student student = new Student();
        student.setName("jin");
        System.out.println(student.getName());
    }



}
