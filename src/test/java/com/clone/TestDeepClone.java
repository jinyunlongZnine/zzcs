package com.clone;

import com.shineyue.Student;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public class TestDeepClone {
    @Test
    public void test01() throws IOException, ClassNotFoundException {
        Student student = new Student(23, "yang");
        Student student2 ;
        // 使用ByteOutputStream和ObjectOutputStream将对象序列化
        ByteOutputStream byteOutputStream = new ByteOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        // 使用ByteArrayInputStream和ObjectInputStream反序列化
        ByteArrayInputStream byteArrayInputStream =  new ByteArrayInputStream(byteOutputStream.getBytes());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        student2 = (Student) objectInputStream.readObject();
        //关闭流
        objectInputStream.close();
        byteArrayInputStream.close();
        objectOutputStream.close();
        byteOutputStream.close();
        System.out.println("student2 = " + student2);
    }
}
