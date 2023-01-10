package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120805?language=java
// 몫 구하기
public class GetQuotient {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        solution(num1, num2);
    }
}
