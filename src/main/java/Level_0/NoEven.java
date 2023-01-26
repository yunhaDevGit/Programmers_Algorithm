import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/120813
// 짝수는 싫어요
class NoEven {
    public static List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i+=2) {
            list.add(i);
        }
        
        return list;
    }
    public void static main(String[] args) {
    
        int n = 10;
        System.out.println(solution(n));
    }
  
}
