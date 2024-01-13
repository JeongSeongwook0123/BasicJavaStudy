package com.example.basicjava;


/**
 * 정보처리기사 실기 기출문제 2023년 1회
 * Static.b++ = 10 출력 후 값 증가
 * st.b = 11
 * a = 10
 * st.a = 20
 * 출력 결과:10
 *         11
 *         10
 *         20
 *
 * */
class Static{
    public int a=20;
    static int b=0;

}

public class Solution_B {
    public static void main(String[] args) {
        int a;
        a = 10;
        Static.b = a;

        Static st = new Static();

        System.out.println(Static.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.println(st.a);
    }
}



