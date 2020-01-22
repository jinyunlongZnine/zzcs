package com.factoryMethod;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public class Factory2 implements AbstractFactory {
    @Override
    public AbstractProduct newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new Product2();
    }
}
