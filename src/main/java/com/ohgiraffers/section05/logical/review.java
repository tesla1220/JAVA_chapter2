package com.ohgiraffers.section05.logical;

public class review {
    public static void main(String[] args) {

        byte num1 = 127;
        System.out.println(" num1 : " + num1);

        num1++;
        System.out.println( " num1 overflow" + num1 );

        byte bnum = 10;
        int inum = 20 ;
        long lum = 3;
        float fnum = 1.5f ;
        int sum = inum + (int)fnum ;
        byte bsum = (byte) (sum + inum) ;
        System.out.println(bsum);

        final int X = 10;
        int sum1 = X ;
        sum1 = X + 10 ;
        System.out.println(sum1);

        char ch1 = 'a' ;
        int charNumber = ch1 ;
        System.out.println( "charNumber = " + charNumber);

        char ch2 = 65;
        System.out.println( " ch2= " + ch2 );

        System.out.println( " ch2 " + ch2 + 1 );


    }
}


