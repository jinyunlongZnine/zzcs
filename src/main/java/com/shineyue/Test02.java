package com.shineyue;

import org.junit.Test;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2019/12/24
 * @Description test02
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("--------");
        System.out.println("args = " + args);

    }
    @Test
    public void testSf () {
        int a = 10;
        int b = 11;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (b-a+1); j++) {

            }
        }
    }
}
