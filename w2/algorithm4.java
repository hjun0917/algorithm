package hanghae99.w2;

public class algorithm4 {
    public static void main(String[] args) {
        Solution4 exam = new Solution4();
        System.out.println(exam.solution(1, 10));
    }
}

class Solution4 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            for (; b < a + 1; b++) {
                answer += b;
            }
            return answer;
        }

        for (; a < b + 1; a++) {
            answer += a;
        }
        return answer;
    }
}