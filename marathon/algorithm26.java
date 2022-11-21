// https://school.programmers.co.kr/learn/courses/30/lessons/12943
package algorithm.marathon;

import java.util.Arrays;

public class algorithm26 {
    public static void main(String[] args) {
        Solution26 exam = new Solution26();
        int[] arr = {4,2,3,1};
        System.out.println(Arrays.toString(exam.solution(arr)));
    }
}

class Solution26 {
    public int[] solution(int[] arr) {
        int[] answer;

        // 배열을 stream 형태로 만들어 최소값을 찾는다.
        int value = Arrays.stream(arr).min().getAsInt();
        // filter와 != 부정비교식을 이용하여 최소값을 list에서 제거 후 배열로 변환 시켜준다.
        answer = Arrays.stream(arr).filter(min_value -> min_value != value).toArray();

        if (arr.length == 1) {
            int[] except = new int[]{-1};
            return except;
        }
        return answer;
    }
}