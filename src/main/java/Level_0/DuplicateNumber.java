package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120583
// 중복된 숫자 개수
public class DuplicateNumber {
    public static int solution(int[] array, int n) {
        int answer = 0;
        for(int num : array) {
            if(num==n)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int array[] = {1, 1, 2, 3, 4, 5};
        System.out.println(solution(array, 1));
    }
}
