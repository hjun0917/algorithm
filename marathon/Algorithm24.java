// https://school.programmers.co.kr/learn/courses/30/lessons/12933
package algorithm.marathon;

import java.util.Arrays;
import java.util.stream.Stream;

public class Algorithm24 {
    public static void main(String[] args) {
        Solution24 exam = new Solution24();
        System.out.println(exam.solution(1234));
    }
}

class Solution24 {
    public long solution(long n) {
        long answer = 0;
        String word ="";
        int[] nums = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        int[] revers_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            revers_nums[i] = nums[nums.length-(i+1)];
        }
        for (int revers_num : revers_nums) {
           word += revers_num;
        }
        answer = Long.parseLong(word);
        return answer;
    }
}