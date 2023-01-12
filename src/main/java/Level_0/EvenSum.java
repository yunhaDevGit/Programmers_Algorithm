package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120831
// 짝수의 합
public class EvenSum {
    public static int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i+=2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println(solution(n));
    }
}
