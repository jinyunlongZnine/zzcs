package com.Test1_9;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description
 */
public class StuScoreList implements CountModel,InputModel,PrintModel {

    //构造方法私有
    private StuScoreList(){}

    public static InputModel getInputModule()
    {
        return (InputModel)new StuScoreList();
    }
    public static CountModel getCountModule()
    {
        return (CountModel)new StuScoreList();
    }
    public static PrintModel getPrintModule()
    {
        return (PrintModel)new StuScoreList();
    }

    public void insert()
    {
        System.out.println("输入模块的insert()方法被调用！");
    }
    public void delete()
    {
        System.out.println("输入模块的delete()方法被调用！");
    }
    public void modify()
    {
        System.out.println("输入模块的modify()方法被调用！");
    }
    public void countTotalScore()
    {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }
    public void countAverage()
    {
        System.out.println("统计模块的countAverage()方法被调用！");
    }
    public void printStuInfo()
    {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }
    public void queryStuInfo()
    {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
