package Level_0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120821
// 배열 뒤집기
public class ReverseArray {
    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        for(int i = 0; i< length; i++){
            answer[i] = num_list[length-i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(array)));
    }
}
