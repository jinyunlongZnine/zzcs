package com.abstractFactory;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public class Test01 {
    public static void main(String[] args) {
        Factory01 factory01 = new Factory01();
        System.out.println(factory01.newProduct1());
        factory01.newProduct2();
    }
}
