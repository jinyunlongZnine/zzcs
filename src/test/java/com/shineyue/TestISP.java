package com.shineyue;

import com.Test1_9.CountModel;
import com.Test1_9.InputModel;
import com.Test1_9.PrintModel;
import com.Test1_9.StuScoreList;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description
 */
public class TestISP {
    /**
     *@Description
     *@Param  
     *@Return  
     *@Created
     */
    public static void main(String[] args) {

        CountModel countModel = StuScoreList.getCountModule();
        InputModel inputModel = StuScoreList.getInputModule();
        PrintModel printModel = StuScoreList.getPrintModule();
        countModel.countAverage();
        inputModel.insert();
        printModel.printStuInfo();
    }
}
