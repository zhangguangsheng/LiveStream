package com.team.finn.utils;

import java.text.DecimalFormat;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class CalculationUtils {

      public static String  getOnLine(int number)
      {
          DecimalFormat df=new DecimalFormat(".#");
               if(number<10000)
               {
                   return number+"";
               }
              else{
                     double  nums=(double)number/10000;
                   String result=df.format(nums);
                   return  result+"万";
               }
      }

}
