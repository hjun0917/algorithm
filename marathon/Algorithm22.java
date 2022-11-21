// https://school.programmers.co.kr/learn/courses/30/lessons/12931
package algorithm.marathon;

public class Algorithm22 {
    public static void main(String[] args) {
        Algorithm22 exam = new Algorithm22();
        System.out.println(exam.solution(987));
    }

    public int solution(int n) {
        String num = Integer.toString(n);
        String[] nums = num.split("");
        int sum = 0;
        for (String s : nums) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    // 다른 사람의 형변환을 하지 않는 코드.
    public int solution_1(int n) {
        int answer = 0;

        while (n != 0) {
            // n을 10으로 나눈 나머지. 1의 자리값
            answer += n % 10;
            // n을 10으로 나눈 몫. 1의 자리값을 제외한 값.
            n /= 10;
        }
        return answer;
    }
}

