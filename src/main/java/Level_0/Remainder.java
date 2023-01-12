package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120810
// 나머지 구하기
public class Remainder {
    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1%num2;
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        System.out.println(solution(num1, num2));
    }
}
