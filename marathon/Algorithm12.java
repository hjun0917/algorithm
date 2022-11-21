// https://school.programmers.co.kr/learn/courses/30/lessons/82612

package algorithm.marathon;

public class Algorithm12 {
    public static void main(String[] args) {
        Solution12 exam = new Solution12();
        System.out.println(exam.solution(2, 10, 3));
    }
}

class Solution12 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        /* 1. 놀이기구가격 price
         * 2. n회 탈 때 마다, n배의 price를 받음(n번째 탑승시 price*n)
         * 3. n회를 탈 때 필요한 allPrice를 구함
         * 4. allPrice 에서 준비된 돈 money를 빼서 원하는 값을 구함
         * 5. 부족하면 부족한 금액을 return, 금액이 부족하지 않으면 0 return */

        long allPrice = 0;

        for (int i = 0; i < count; i++) {
            allPrice += (long) price * (i + 1);
            System.out.println(allPrice);
        }

        answer = allPrice - money;

//        if ( answer < 0 ) {
//            return 0;
//        }

        return (answer < 0 ? 0 : answer);
    }
}