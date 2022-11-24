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
                    temp = String.valueOf(arr[i][j]);
                }
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }

    public boolean checkIndex(int[][] arr, int i, int j) {
        boolean flag = false;
        if (i == 0 && j == 0 && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]) flag = true;
        if (i == 0 && j == 4 && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j]) flag = true;
        if (i == 4 && j == 0 && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i - 1][j]) flag = true;
        if (i == 4 && j == 4 && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
        if (i != 0 && i != 4 && j != 0 && j != 4
                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]
                && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
        if (i == 0 && j != 0 && j != 4
                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1]) flag = true;
        if (i == 4 && j != 0 && j != 4
                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
        if (j == 0 && i != 0 && i != 4
                && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i - 1][j]) flag = true;
        if (j == 4 && i != 0 && i != 4
                && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) flag = true;
        return flag;
    }

    public static void main(String[] args) {
        Question3 method = new Question3();
        int[][] arr1 = {{7, 4, 6, 5, 9}, {6, 1, 3, 4, 5}, {4, 8, 5, 6, 9}, {1, 3, 0, 6, 4}, {6, 4, 8, 1, 7}};

        method.solution(arr1);
    }
}
