package com.realizeType;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description
 */
public class RealizeType implements Cloneable {

    public RealizeType(){
        System.out.println("原型对象构建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型对象复制成功!");
        return super.clone();
    }
}
