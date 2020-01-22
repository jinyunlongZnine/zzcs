package com.factoryMethod;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public class Test01 {
    public static void main(String[] args) {
        Factory1 factory1 =  new Factory1();
        factory1.newProduct();

        Factory2 factory2 = new Factory2();
        factory2.newProduct();
    }
}
