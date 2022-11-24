package algorithm.exam1124;

public class Question2 {
    public void solution(int star) {
        // 코드 작성
        String shape = "*";
        String blank = " ";

        for (int i = 0; i < star; i++) {
            int sequence = 1 + (2 * i);
            System.out.print(blank.repeat(star-i-1));
            System.out.println(shape.repeat(sequence));
        }
    }


    public static void main(String[] args) {
        Question2 method = new Question2();
        int star = 6;
        method.solution(star);
    }
}
