package com.example.basicjava;

/**
 * 삼항 연산자, 시프트 연산자, 비트연산자 문제
 * 삼항 연산자에서 수식 ? a : b -> 수식이 true면 a, false면 b값을 반환한다.
 * | -> OR연산자로 a | b -> 둘 중 하나라도1이면 1을 출력한다.
 * |(OR연산자), &(AND연산자), ^(XOR연산자) : 비트연산자
 * ||(논리OR연산자), &&(논리AND연산자) : 논리연산자
 * 8>>3 ->1 시프트 연산자로 오른쪽으로 3칸 이동한다. 2<<3 오른쪽으로 3칸 이동 16
 * 연산자 우선순위는 사칙연산자, 시프트 연산자, 비트연산자 순으로 계산된다.
 * */
public class Solution_C {

    public static void main(String[] args) {

        int a = 5, b = 9, c;
        c = b % 5 < 5 ? 1 : 0;  //9 % 5 = 4 < 5 true -> 1
        c = c | c <<3;          //연산자 우선순위 <<시프트 연산자
        System.out.printf("%d",c | c << 3);
        System.out.println();
        System.out.printf("%d",2<<3);
        c = a <5 || c>=10 ? c-a : c+a;  // c + a = 8 + 5 = 13


    }

}
