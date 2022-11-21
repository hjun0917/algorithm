// https://school.programmers.co.kr/learn/courses/30/lessons/12901
package algorithm.marathon;

public class Algorithm13 {
    public static void main(String[] args) {
        Solution13 exam = new Solution13();
        System.out.println(exam.solution(5, 24));

    }
}

class Solution13 {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int d = 0;
        for (int i = 0; i < a; i++) {
            d += month[i];
        }
        d -= month[a-1];
        int day = (d + b) % 7;
        switch (day) {
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }
        return answer;
    }
}
