// https://school.programmers.co.kr/learn/courses/30/lessons/12919
package algorithm.w2;

public class Algorithm18 {
    public static void main(String[] args) {
        Solution18 exam = new Solution18();
        String[] arr = {"Jane", "Kim"};
        System.out.println(exam.solution(arr));
    }
}

class Solution18 {
    public String solution(String[] seoul) {
        String answer = "";

        // 배열의 길이만 큼 for문을 돌면서
        // Kim 과 같은 값을 가진 인덱스를 찾으면
        // text를 반환
        // String 은 equals 메서드로 값을 비교해야함
        // == 으로 비교하게 되면, 객체가 담긴 메모리의 위치를 비교함.
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다";
            }
        }

        return answer;
    }
}