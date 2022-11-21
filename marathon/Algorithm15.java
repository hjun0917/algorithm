// https://school.programmers.co.kr/learn/courses/30/lessons/70128
package algorithm.marathon;

public class Algorithm15 {
    public static void main(String[] args) {
    Solution15 exam = new Solution15();
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {-3,-1,0,2};
        System.out.println(exam.solution(arr1, arr2));
    }
}

// 내적?
// 내적은 벡터를 마치 수처럼 곱하는 개념이다.
// 동일한 위치에 있는 수를 곱해, 다 더한다.

class Solution15 {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }
}