package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120804
// 두 수의 곱
public class Multiply {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        System.out.println(solution(3,4));
    }
}
