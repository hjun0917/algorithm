package algorithm.marathon;

public class Algorithm5 {
    public static void main(String[] args) {
/*
        Solution5 exam = new Solution5(Solution5.solution("123"));
        non-static method cannot be referenced from a static context
        static 이미 객체화되어 있어서 바로 사용할 수 있는 녀석.
        non-static 아직 객체화되어 있지 않아서, new 키워드를 통해 객체화한 후 사용할 수 있는 녀석
*/
        Solution5 exam = new Solution5();
        System.out.println(exam.solution("-777"));
    }
}

class Solution5 {
    public int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }
}