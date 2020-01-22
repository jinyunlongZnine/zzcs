package com.factoryMethod;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public class Factory1 implements AbstractFactory {
    @Override
    public AbstractProduct newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new Product1();
    }
}
