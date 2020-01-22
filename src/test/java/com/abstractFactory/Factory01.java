package com.abstractFactory;
/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public class Factory01 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("工厂1生产产品1");
        return new Product1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("工厂1生产产品2");
        return new Product2();
    }
}
