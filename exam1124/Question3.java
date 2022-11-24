package algorithm.exam1124;

import java.util.Arrays;

public class Question3 {
    public void solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = 0; j < arr[0].length; j++) {
                if (checkIndex(arr, i, j)) {
                    temp = "*";
                } else {
                    temp = arr[i][j] + "";
                }
                System.out.print(temp+" ");
            }
            System.out.println();
        }

//        char star1 = 42;
//        System.out.println((int)star1);
//
//        char star2 = '*';
//        System.out.println(star2);
    }

    public boolean checkIndex(int[][] arr, int i, int j) {
        // 왜 플레그 초기값을 true 로 주었나?
        // 단 하나라도 예외상황이 있으면 false 를 반환해 주어야 내가 원하는 결과가 나옴.
        // 초기값을 false 로 주고 조건 만족시 true 로 바꿔주면, 그 아래 조건을 만족하는 여부와 관계없이
        // true 가 들어가 원하는 결과 값이 나오지 않음
        boolean flag = true;
        // 상
        if (i > 0 && arr[i][j] <= arr[i - 1][j]) flag = false;
        // 하
        if (i < arr.length - 1 && arr[i][j] <= arr[i + 1][j]) flag = false;
        // 좌
        if (j > 0 && arr[i][j] <= arr[i][j - 1]) flag = false;
        // 우
        if (j < arr.length - 1 && arr[i][j] <= arr[i][j + 1]) flag = false;
        return flag;
        // 클 때 -> 작아도 안되고, 같아도 안된다.
    }

//    public boolean checkIndex(int[][] arr, int i, int j) {
//        boolean flag = false;
//        if (i == 0 && j == 0 && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]) flag = true;
//        if (i == 0 && j == 4 && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j]) flag = true;
//        if (i == 4 && j == 0 && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i - 1][j]) flag = true;
//        if (i == 4 && j == 4 && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
//        if (i != 0 && i != 4 && j != 0 && j != 4
//                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]
//                && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
//        if (i == 0 && j != 0 && j != 4
//                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1]) flag = true;
//        if (i == 4 && j != 0 && j != 4
//                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
//        if (j == 0 && i != 0 && i != 4
//                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i - 1][j]) flag = true;
//        if (j == 4 && i != 0 && i != 4
//                && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
//        return flag;
//    }

    public static void main(String[] args) {
        Question3 method = new Question3();
        int[][] arr1 = {{7, 4, 6, 5, 9}, {6, 1, 3, 4, 5}, {4, 8, 5, 6, 9}, {1, 3, 0, 6, 4}, {6, 4, 8, 1, 7}};

        method.solution(arr1);
    }
}
