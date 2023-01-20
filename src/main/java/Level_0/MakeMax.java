import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120847?language=java
// 최댓값 만들기
class MakeMax {
    public static int solution(int[] numbers) {
        Arrays.sort(numbers) ;
        int length = numbers.length;
        int answer = numbers[length-1]*numbers[length-2];
        return answer;
    }
  
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        System.out.println(solution(numbers));
    }
}
