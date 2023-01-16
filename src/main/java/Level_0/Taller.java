package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120585
// 머쓱이보다 키 큰 사람
public class Taller {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int h : array) {
            if(h>height)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int array[] = {149, 180, 192, 170};
        int height = 167;

        System.out.println(solution(array, height));
    }
}
