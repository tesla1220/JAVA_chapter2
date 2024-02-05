package com.ohgiraffers.section01;

public class review {

    public static void main(String[] args) {

        System.out.println(123+123);
        System.out.println(123/10);
        System.out.println(123%10);

        System.out.println("===========실수와 실수의 연산===========");
        System.out.println(1.23-0.23);
        System.out.println(1.23/10.0);

        System.out.println("===========정수와 실수의 연산==========");
        System.out.println(123/0.5);
        System.out.println(123%0.5);

        System.out.println('안'+'녕');

        System.out.println('a'-1.0);
        System.out.println('a'/10);

        System.out.println("============문자열과 문자열의 연산===========");
        System.out.println("hello"+"world");
//        System.out.println("hello"-"world");
        System.out.println("hello"+'a');
//        System.out.println("hello"/"world");

        System.out.println("hello"+123);
        System.out.println("hello"+123.456);
        System.out.println("helo"+'a');
        System.out.println("hello"+true);

        System.out.println(9 + "9");
        System.out.println("9" + "9");

        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("7"+ 7 + 7 );

        System.out.println(("9" + ( 9 + 9 )));

        System.out.println("10과 20의 합: " + ( 10 + 20 )) ;
        System.out.println( " 10과 20의 합 : " + 10 + 20 );

        System.out.println( "보너스를 포함한 급여 : " + ( 1000000 + 200000) + "원");

        int salary = 100000 ;
        int bonus  = 20000 ;
        System.out.println(" 수정된 보너스를 포함한 급여 : " + (salary + bonus ) + "원" );

        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");


       int point = 100;
        System.out.println( " 1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 7번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 8번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 9번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println( " 10번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");


        int sum = 0;
        System.out.println("처음의 sum : " + sum);
        sum = sum + 10;
        System.out.println("2번째 sum : " + sum);
        sum = sum + 10;
        System.out.println("3번째 sum : " + sum);


        int inum;
        inum = 3;
        inum = 4;
        System.out.println(inum + inum);

        String str = "안녕";
        double dnum;
        dnum = 30.0;
        System.out.println(str + (dnum + dnum));

        System.out.println(true + "");
        System.out.println('J' + "ava");
//        System.out.println(true + null);





    }
}
