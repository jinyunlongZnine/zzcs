package com.abstractFactory;

import com.abstractFactory.Product1;
import com.abstractFactory.Product2;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/13
 * @Description
 */
public interface AbstractFactory {
    Product1 newProduct1();

    Product2 newProduct2();

}
