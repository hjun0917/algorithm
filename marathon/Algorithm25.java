// https://school.programmers.co.kr/learn/courses/30/lessons/12934
package algorithm.marathon;

public class Algorithm25 {
    public static void main(String[] args) {
        Solution25 exam = new Solution25();
        System.out.println(exam.solution(121));
    }
}

class Solution25 {
    public long solution(long n) {
        long answer = -1;

        // 정수 n은 2로 나누어 실수 d에 저장.
        double d = (double)n/2;
        int count = 1;
        // 실수 d 를 1 부터 count 까지 차례로 빼 줌. ( count 가 더 커질 때 까지 )
        while(count < d ) {
            d -= count;
            count++;
        }
        // 더 커진 (count 값)과 (작아진 d 의 값에 2를 곱)해 비교. 동일하면 해당 count 가 제곱근
        if ( count == d*2) {
            answer = count + 1;
            return answer*answer;
        }
        return answer;
    }
}

// [참고] https://mathbang.net/634