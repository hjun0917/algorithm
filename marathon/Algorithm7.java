package algorithm.marathon;

public class Algorithm7 {
    public static void main(String[] args) {
        Solution7 exam = new Solution7();
        int[] arr = {1, 2, 3, 4, 5};
        boolean[] signs = {true, false, true, false, true};
        System.out.println(exam.solution(arr, signs));
    }
}

class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int num;
            if (signs[i]) {
                num = +absolutes[i];
            } else {
                num = -absolutes[i];
            }
            answer += num;
        }

//        삼항식 활용을 참고한 코드
//        for (int i = 0; i < absolutes.length; i++) {
//            answer += absolutes[i] * (signs[i] ? 1 : -1);
//        }
        return answer;
    }
}