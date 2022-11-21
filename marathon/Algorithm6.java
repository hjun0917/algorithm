package algorithm.marathon;

public class Algorithm6 {
    public static void main(String[] args) {
        Solution6 exam = new Solution6();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(exam.solution(arr));
    }
}

class Solution6 {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}