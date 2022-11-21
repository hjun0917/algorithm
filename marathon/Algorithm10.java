package algorithm.marathon;

import java.util.Arrays;

public class Algorithm10 {
    public static void main(String[] args) {
        Solution10 exam = new Solution10();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{1,2},{2,3}};
        System.out.println(Arrays.deepToString(exam.solution(arr1, arr2)));
    }
}

class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        /* 1. 행열을 답을 배열을 2개 생성한다.
        * 2. 배열의 인덱스를 이용해 같은 열에 있는 값들을 더해준다.*/

        for ( int i = 0 ; i < arr1.length ; i++) {
            // arr1 배열 껍질을 뜯고,
            // 그 안에 있는 배열의 크기를 따라야하기 때문에 arr[0]의 길이를 알아야 한다.
            for ( int j = 0 ; j < arr1[0].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}