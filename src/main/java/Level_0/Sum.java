package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120802
// 두 수의 합
class Sum {
    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        System.out.println(solution(2,5));
    }
}
