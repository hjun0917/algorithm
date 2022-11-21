package algorithm.marathon;

public class Algorithm3 {
    public static void main(String[] args) {
        Solution3 exam = new Solution3();

        System.out.println(exam.solution("kim"));
        System.out.println(exam.solution("orange"));
        System.out.println(exam.solution("aaaaaaaaabaaaaaaaaa"));
        System.out.println(exam.solution("aaaaaaaaccaaaaaaaa"));
    }
}

class Solution3 {
    public String solution(String s) {
        String answer = "";

        int s_len = s.length();
        if (s_len%2 == 0) {
            answer = s.substring(s_len/2-1, s_len-(s_len/2-1));
        } else {
            answer = s.substring(s_len/2, s_len-s_len/2);
        }

        return answer;
    }
}