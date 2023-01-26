// https://school.programmers.co.kr/learn/courses/30/lessons/120833
// 배열 자르기
class CutArray {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1;
        int[] answer = new int[length+1];
        for(int i = 0; i<=length;i++){
            answer[i]=numbers[num1+i];
        }
        return answer;
    }
  
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 3;
        int num2 = 5;
        System.out.println(solution(numbers, num1, num2));
    }
}
