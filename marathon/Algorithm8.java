package algorithm.marathon;

public class Algorithm8 {
    public static void main(String[] args) {
        Solution8 exam = new Solution8();
        int[] scores = {100, 98, 99};
        System.out.println(exam.solution(scores));
    }
}

class Solution8 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = (double) sum / arr.length;
        return answer;
    }
}