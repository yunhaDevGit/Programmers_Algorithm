package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120809
// 배열 두 배 만들기

public class DoubleArray {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] answer = new int[length];
        for(int i=0;i<length;i++){
            answer[i] = numbers[i]*2;
        }

        return answer;
    }
}
