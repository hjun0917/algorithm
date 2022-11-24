package algorithm.exam1124;

public class Question1 {
    public String solution(int[] arr1) {
        String answer = "";

        int front = check(arr1);

        switch (front) {
            case 1: answer = "도"; break;
            case 2: answer = "개"; break;
            case 3: answer = "걸"; break;
            case 4: answer = "윷"; break;
            case 0: answer = "모"; break;
        }

        return answer;
    }

    public int check(int[] arr1) {
        int front = 0;
        for (int i = 0; i < 4; i++) {
            if (arr1[i] == 0) {
                front++;
            }
        }

        return front;
    }

    public static void main(String[] args) {
        Question1 method = new Question1();
        int[] arr1 = {0, 0, 0, 0};
        System.out.println(method.solution(arr1));
    }
}
