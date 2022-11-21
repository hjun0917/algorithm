// https://school.programmers.co.kr/learn/courses/30/lessons/12910
package algorithm.marathon;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm14 {
    public static void main(String[] args) {
        Solution14 exam = new Solution14();

        int[] arr = {5,9,7,10};
        int divisor = 5;
        System.out.println(Arrays.toString(exam.solution(arr, divisor)));
    }
}

class Solution14 {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        for (int a : arr) {
            if ( a%divisor == 0) {
                list.add(a);
            }
        }

        if (list.size()==0) {
            list.add(-1);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        // 값타입 배열을 얻기 위해서는 int 값을 꺼내서 배열로 저장해야 한다.
        // 이 때 사용하는 것이 stream이다.
        // list.stream(): Stream<Integer>을 반환한다.
        // mapToInt(Integer::intValue): Integer의 intValue() 메서드를 참조해서 값타입인 int로 언박싱한다.
        // toArray(): IntStream의 원소를 배열로 변환한다.
        return answer;
    }
}
