package Level_0;

import java.util.Arrays;

// 중앙값
// https://school.programmers.co.kr/learn/courses/30/lessons/120811
public class MiddleValue {
    public static int solution(int[] array) {
        Arrays.sort(array);
        int size = array.length;
        return array[size/2];
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 7, 10, 1};
        System.out.println(solution(array));
    }
}
