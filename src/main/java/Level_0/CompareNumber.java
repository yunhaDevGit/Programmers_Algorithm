package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120807
// 숫자 비교하기

public class CompareNumber {
    public static int solution(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        } else
            return -1;

        // answer = (num1==num2) ? 1 : -1
        // return answer;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        System.out.println(solution(num1, num2));
    }
}
