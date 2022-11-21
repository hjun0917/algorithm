// https://school.programmers.co.kr/learn/courses/30/lessons/42576
package algorithm.marathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm20 {
    public static void main(String[] args) {
        Solution20 exam = new Solution20();
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"eden", "kiki"};
        System.out.println(exam.solution(arr1, arr2));
    }
}

// 아래의 풀이는 효율성 테스트를 통과하지 못함.
class Solution20_1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // List는 가변적으로 길이를 변경할 수 있는 자료구조라고 한다.
        // 배열을 리스트로 변경한 뒤에 요소들을 제거하고,
        // 그 리스트 String 으로 변경하는 방법을 사용하였다.
        List<String> list = new ArrayList<>(Arrays.asList(participant));

        for (String s : completion) {
            list.remove(s);
        }


        answer = list.toString();
        // .replaceAll("[^a-zA-z]", " ") -> [ ] 가 왜 안ㅇ빠져 나갈까...?
        return answer.substring(1, answer.length() - 1);
    }
}

class Solution20 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        return answer;
    }
}