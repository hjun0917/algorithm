// https://school.programmers.co.kr/learn/courses/30/lessons/12943
package algorithm.w2;

public class Algorithm27 {
    public static void main(String[] args) {
        Solution27 exam = new Solution27();
        System.out.println(exam.solution(626331));
    }

}

class Solution27 {
    public int solution(int num) {
        // int 타입의 범위를 넘어 설 경우를 대비해 long 타입 변수에 num 을 저장.
        long answer = num;
        int count = 0;

        while (answer != 1) {
            // count 가 501이고, 문제를 해결하지 못했으면 -1 리턴
            // ( 이는 500번 째 반복에서도 1이 되지 못한 경우이다. )
            if (count == 501) {
                return -1;
            }
            // 반복 횟수 증가.
            count++;
            // answer 가 짝수일 경우 나누기 2
            if (answer % 2 == 0) {
                answer = answer / 2;
            } else {
                // 그렇지 않을 경우 곱하기 3, 더하기 1
                answer = answer * 3 + 1;
            }
        }
        return count;
    }
}

// 리턴값 488 오류는 타입오류
// 이러한 류의 오류를 실행 전에 어떻게 잡을 수 있는지 고민해보기.