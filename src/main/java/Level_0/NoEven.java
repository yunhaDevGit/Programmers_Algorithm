package Level_0;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/120813
// 짝수는 싫어요
class NoEven {
    public static List<Integer> solution(int n) {
//     public static int[] solution(int n) {
//         return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i+=2) {
            list.add(i);
        }
        
        return list;
    }
    public static void main(String[] args) {
    
        int n = 10;
        System.out.println(solution(n));
    }
  
}
