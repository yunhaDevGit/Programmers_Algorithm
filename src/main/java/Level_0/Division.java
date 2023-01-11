package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120806
// 두 수의 나눗셈
public class Division {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) Math.floor(((double) num1/num2)*1000);
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1, num2));
    }
}
