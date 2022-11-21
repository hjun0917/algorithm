// https://school.programmers.co.kr/learn/courses/30/lessons/12918
package algorithm.w2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Algorithm17 {
    public static void main(String[] args) {
        Solution17 exam = new Solution17();
        String word1 = "k123kf4";
        String word2 = "1234";
        System.out.println(exam.solution(word2));
    }
}

class Solution17 {
    public boolean solution(String s) {
        boolean answer = false;
        // s는 숫자 혹은 알바벳 대소문자

        // 숫자만 허용하늩 패턴을 정의해준다. (파라미터에는 정규식 활용)
        Pattern pattern = Pattern.compile("(^[0-9]*$)");
        // 정의된 패턴과 문자열을 비교해주는 매쳐를 정의해준다.
        Matcher matcher = pattern.matcher(s);

        // 이 부분에서 크게 실수함.
        // 문제의 조건을 확실하게 짚고 넘어가지 않아 5,6,28,29 테스트케이스에서
        // 틀렸음. 문자열 길이 조건을 넣어 주지 않아서 그랬던 것.
        if (s.length() == 4 || s.length() == 6) {
            if (matcher.find()) {
                answer = true;
            }
        }

        return answer;
    }
}

// ✅메서드 사용하지 않고, 배열을 통해서 풀이해보기.
// 참고 자료 : https://moonong.tistory.com/31

// try catch 를 통한 풀이도 생각해 보았는데,
// 학습을 따로 해보지 못해서 시도해보지 못했음.
// 이펙티브 자바 예외처리 관련된 항목에서 금기시 되는 풀이라고 함.
// 예외는 실제 예외 상황일때만 사용하라(...?)

class Solution17_1 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}