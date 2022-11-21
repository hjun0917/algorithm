package algorithm.marathon;

public class Algorithm2 {
    public static void main(String[] args) {
        Solution2 exam = new Solution2();

        System.out.println(exam.solution(-9));
    }
}

class Solution2 {
    public String solution(int num) {
        String answer = "Odd";

        if (num%2 == 0) {
            answer = "Even";
        }

        return answer;
    }
}