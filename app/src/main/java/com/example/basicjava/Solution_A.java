package com.example.basicjava;

/**
 * 정보처리기사 실기 2022년 3회 자바 문제
 * 자기보다 큰 수가 몇개있는지 찾는 프로그램
 * 77은 1개 -> result[0] = 2
 * 32는 3개 -> result[1] = 4
 * 10은 4개 -> result[2] = 5
 * 99는 0개 -> result[3] = 1
 * 50은 2개 -> result[4] = 3
 * 출력 결과: 2
 *         4
 *         5
 *         1
 *         3
 *
 * */
public class Solution_A {
    public static void main(String[] args) {
        int result[] = new int[5];
        int arr[] = {77,32,10,99,50};

        for(int i=0;i<5;i++) { //i=0~4 자기보다 큰수가 몇개 있는지 찾는 프로그램 77은 1개 -> 1+1 =2
            result[i] =1;   //result[0]=1 -> result[0] = 2

            for(int j=0;j<5;j++){   //j=0~4
                if(arr[i]<arr[j]){ //arr[0]일때 j0~4까지 전체 비교
                    result[i]++;
                }
            }
        }
        for(int k=0;k<5;k++){   //k0~4
            System.out.println(result[k]);  //result[0]~[4]
        }
    }
}

