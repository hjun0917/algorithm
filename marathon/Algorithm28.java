// https://wakestand.tistory.com/423
package algorithm.marathon;

import java.util.stream.Stream;

public class Algorithm28 {
    public static void main(String[] args) {
        Solution28 exam = new Solution28();
        System.out.println(exam.solution(18));
    }
}

class Solution28 {
    public boolean solution(int x) {
        boolean answer = false;
        int[] nums = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (x%sum == 0) {
            answer = true;
        }

        return answer;
    }
}