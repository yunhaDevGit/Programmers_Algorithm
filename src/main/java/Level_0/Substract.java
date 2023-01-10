package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120803
// 두 수의 차
class Substract {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1, num2));
    }
}