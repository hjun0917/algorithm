package algorithm.exam1122;

import java.util.Arrays;

public class Main {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        /*
        체크인 - 체크아웃 사이의 시간을 구해야한다.
        체크아웃 시, 익일의 시간은 24 + a 의 형태로 계산한다.
        오전 5시가 넘어가면 자동 전날 21시 체크아웃 처리를 한다.
         */

//        for (int i = 0; i < arr1.length; i++) {
//            int start = arr1[i];
//            int end = arr2[i];
//            if (end>28) {
//                end = 21;
//            }
//            answer += (end - start);
//        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i]>28) {
                arr2[i] = 21;
            }
            answer += (arr2[i] - arr1[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};

        System.out.println(method.solution(arr1, arr2));
    }
}