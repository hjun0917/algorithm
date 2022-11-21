// https://school.programmers.co.kr/learn/courses/30/lessons/12922
package algorithm.w2;

public class Algorithm19 {
    public static void main(String[] args) {
        Solution19_1 exam = new Solution19_1();
        System.out.println(exam.solution(5));
    }
}

class Solution19 {
    public String solution(int n) {
        String answer = "";
        String a = "수";
        String b = "박";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                //
                answer = answer.concat(a);
            } else {
                answer = answer.concat(b);
            }
        }

        return answer;
    }
}

class Solution19_1 {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        String a = "수";
        String b = "박";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb = sb.append(a);
            } else {
                sb = sb.append(b);
            }
        }

        String answer = sb.toString();

        return answer;
    }
}

// https://devdy.tistory.com/9
// concat 과 StringBuilder

// https://junghn.tistory.com/entry/JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B6%99%EC%9D%B4%EB%8A%94-%EB%B0%A9%EB%B2%95concat-StringBuilder-StringBuffer
// java 문자열 붙이는 방법

