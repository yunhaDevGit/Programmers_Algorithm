package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120817
// 배열의 평균값
public class Average {
    public static double solution(int[] numbers) {
//        return Arrays.stream(numbers).average().orElse(0);
        double answer = 0;
        int length = numbers.length;
        int sum = 0;
        for(int i=0;i<length;i++) {
            sum += numbers[i];
        }
        answer = (double) sum/length;
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(numbers));
    }
}
