package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120820
// 나이 구하기
public class Age {
    public static int solution(int age) {
        int answer = 0;
        answer = 2022 - (age-1);
        return answer;
    }

    public static void main(String[] args) {
        int age = 30;
        System.out.println(solution(age));
    }
}
