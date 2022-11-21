// https://school.programmers.co.kr/learn/courses/30/lessons/12930
package algorithm.w2;

public class Algorithm21 {
    public static void main(String[] args) {
        Solution21_1 exam = new Solution21_1();
        System.out.println(exam.solution("try hello hyeong jun"));
    }
}

class Solution21 {
    public String solution(String s) {
        String answer = "";
        // 문자열을  모두 분리해서 배열에 저장
        String[] words = s.split("");
        // 몇번째 인덱스의 문자인지 세어줄 count 선언
        int count = 0;
        // 배열 words 를 순회
        for (String word : words) {
            // 문자열을 카운트하며 문제에 맞게 처리
            // word 가 " "(공백)이면 count 를 0으로 초기화
            if (word.equals(" ")) {
                count = 0;
            } else {
                // word 가 " "(공백)이 아니면 count 의 홀수, 짝수를 판별해 소문자, 대문자로 변환
                word = count % 2 == 0 ? word.toUpperCase() : word.toLowerCase();
                count++;
            }
            answer += word;
        }
        return answer;
    }
}

// https://velog.io/@dkfma3323/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4%EC%9D%B4%EC%83%81%ED%95%9C-%EB%AC%B8%EC%9E%90-%EB%A7%8C%EB%93%A4%EA%B8%B0Java

// 오답. 문자열 맨 뒤에 공백이 붙어서 오답. 두 문자를 합칠 때 어떻게하면 좋을까?
// 문자 단위로 끊어 정리하여 정답을 낼 수는 없을까?
// 하나 이상의 공백문자 << 공백처리를 잘 해야할 듯.

class Solution21_1 {
    public String solution(String s) {
        String answer = "";
        String word = "";
        String[] words = s.split(" ");
        for (String value : words) {
            word = value;
            for (int j = 0; j < word.length(); j++) {
                String[] c = word.split("");
                if (j % 2 == 0) {
                    c[j] = c[j].toUpperCase();
                }
                answer = answer.concat(c[j]);
            }
            answer = answer.concat(" ");
        }
        answer = answer.substring(0, answer.length() - 1);
        return answer;
    }
}

// https://codechacha.com/ko/java-string-concat/