package algorithm.w2;

import java.util.Arrays;

public class Algorithm11 {
    public static void main(String[] args) {
        Solution11 exam = new Solution11();
        System.out.println(Arrays.toString(exam.solution(3,3)));
    }
}

class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long num = 0;
        for (int i = 0; i < n; i++) {
            num += x;
            answer[i] = num;
        }

        return answer;
    }
}