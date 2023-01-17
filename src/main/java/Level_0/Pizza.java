package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120814
// 피자 나눠먹기
public class Pizza {
    public static int solution(int n) {
        int answer = n/7;
        if(n%7!=0){
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8));
    }
}
