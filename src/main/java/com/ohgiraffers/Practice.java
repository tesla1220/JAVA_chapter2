package com.ohgiraffers;

public class Practice {

    public static void main(String[] args) {

        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println( y >= 5 || x < 0 && x > 2 );
        System.out.println( y += 10 - x++ ); // 계산 순서: 10-x + y = 13
        System.out.println( x+=2 );
        System.out.println( !('A' <= c && c <= 'Z'));  // && -> and, 둘 다 모두 true여야 true값 출력, ! 부정형이므로 반대값 출력
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */
        int numOfApples = 92;
        int sizeOfBucket = 10;

        int numOfBucket = numOfApples / sizeOfBucket + ((numOfApples % sizeOfBucket) > 0 ? 0 : 1);


        // numOfApples / sizeOfBucket = 몫 : 9
        // numOfApples % sizeOfBucket = 나머지 2
        // 나머지가 0보다 클 경우 1을 반환
        // 나머지가 0일 경우 0을 반환

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

         /* 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
        만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
		int num = 456;
		System.out.println( /* (1) );*/

        int num =456;
        System.out.println( " result : " +  (num / 100 * 100 ));

        int num1 = 111;
        System.out.println( "result : " + (num1 / 100 * 100));


        /* 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
        (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
		int num = 333;
		System.out.println( /* (1) */

        int num2 = 777;
        System.out.println("result2 : " + ((num2 / 10) * 10 +1 ));

        int num3 = 555;
        System.out.println( "result : " + (( num3 / 10) * 10 + 1 ));














    }
}
