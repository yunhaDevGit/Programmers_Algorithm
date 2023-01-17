package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120824
// 짝수 홀수 개수
public class EvenOddCount {
    public static int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int num:num_list) {
            if(num%2==0)
                answer[0]++;
            else
                answer[1]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int num_list[] = {1, 2, 3, 4, 5};
        System.out.println(solution(num_list));
    }
}
