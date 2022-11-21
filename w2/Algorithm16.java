// https://school.programmers.co.kr/learn/courses/30/lessons/12916
package algorithm.w2;

import java.util.Scanner;

public class Algorithm16 {
    public static void main(String[] args) {
        Solution16_1 exam = new Solution16_1();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(exam.solution(s));
    }
}

class Solution16_1 {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();

        long count_p = s.chars().filter(ch -> ch == 'p').count();
        long count_y = s.chars().filter(ch -> ch == 'y').count();

        if (count_p != count_y) {
            answer = false;
            return answer;
        }

        return answer;
    }
}

class Solution16 {
    boolean solution(String s) {
        boolean answer = true;

        String word = s.toLowerCase();
        // 문자열을 모두 소문자로 변경
        int p = countChar(word, 'p');
        int y = countChar(word, 'y');
        // 반복문을 이용해서 알파벳의 개수를 샘.
        if (p != y) {
            return false;
        }

        return answer;
    }

    // 알파벳을 새어주는 메서드 ( 알파벳은 char 타입으로 받는다.)
    private int countChar(String word, char alphabet) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == alphabet) {
                count++;
            }
        }
        return count;
    }
}