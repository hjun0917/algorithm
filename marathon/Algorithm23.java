// https://school.programmers.co.kr/learn/courses/30/lessons/12932
package algorithm.marathon;

import java.util.Arrays;
import java.util.stream.Stream;

public class Algorithm23 {
    public static void main(String[] args) {
        Solution23 exam = new Solution23();
        System.out.println(Arrays.toString(exam.solution(12345)));
    }
}

class Solution23 {
    public int[] solution(long n) {
        int[] arr1 = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = new int[arr1.length];

        for (int i = 0 ; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length-(i+1)];
        }
        return arr2;
    }
}

// https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_int%EB%A5%BC_%EC%9E%90%EB%A6%BF%EC%88%98_int_%EB%B0%B0%EC%97%B4%EB%A1%9C_%EB%B6%84%ED%95%A0