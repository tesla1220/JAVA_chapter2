package com.ohgiraffers.section03.increment;

public class review {

    public static void main(String[] args) {

        int firstNum = 20;

        int result1 = firstNum++ * 3 ;

        System.out.println( " result1 = " + result1 );
        System.out.println( " firstNum = " + firstNum );

        int secondNum = 20 ;

        int result2 = ++secondNum * 3;

        System.out.println( " result2 = " + result2 );
        System.out.println( " secondNum = " + secondNum );



        int num1 = 10;

        int addNum = num1++ ;

        System.out.println( "addNum = " + num1 );
        System.out.println( " num1 = " + num1 );

        int thirdNum = 10 ;
        int result3 = thirdNum++ ;

        System.out.println( " result3 = " + thirdNum );
        System.out.println( " thirdNum = " + thirdNum );



        String busNumber = "상암08" ;
        int minute = 3 ;
        double distance = 1.2;
        System.out.println( busNumber + "번 버스");
        System.out.println( "약" + minute + "분 후 도착");
        System.out.println("남은 거리 +" + distance + "km");

        System.out.println();


    }
}
