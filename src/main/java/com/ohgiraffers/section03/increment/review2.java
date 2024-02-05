package com.ohgiraffers.section03.increment;

public class review2 {

    public static void main(String[] args) {

        int firstNum = 20;
        int result1 = firstNum ++ *3;

        System.out.println(result1);
        System.out.println(firstNum);
        System.out.println( " result1 = " + result1 );
        System.out.println( " firstNumber = " + firstNum );

        int secondNum = 20;

        int result2 = ++secondNum * 3; //  = 1+secondNum (3은 이 식에서 관련이 없다.)

        System.out.println(secondNum);
        System.out.println(result2);
        System.out.println( " secondNum = " + secondNum);
        System.out.println( " result2 = " + result2);

        System.out.println(result2);


    }
}
