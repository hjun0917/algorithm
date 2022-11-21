package algorithm.marathon;

public class Algorithm9 {
    public static void main(String[] args) {
        Solution9 exam = new Solution9();
        System.out.println(exam.solution("01022229296"));
    }
}

class Solution9 {
    public String solution(String phone_number) {
        String answer = "";

        int s = phone_number.length();
        String frontNums = phone_number.substring(0, s-4);
        String secret = "*".repeat(frontNums.length());
        String backNums = phone_number.substring(s-4, s);

        answer = secret + backNums;

        return answer;
    }
}