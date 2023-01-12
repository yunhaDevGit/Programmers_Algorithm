package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120830
// 양꼬치
public class LambSkewers {
    public static int solution(int n, int k) {
        int answer = 0;
        int service = n/10;
        answer = n*12000 + (k-service)*2000;
        return answer;
    }

    public static void main(String[] args) {
        int n = 43;
        int k = 4;
        System.out.println(solution(n,k));
    }
}
