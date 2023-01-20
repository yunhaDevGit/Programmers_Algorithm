import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/120889?language=java
// 삼각형의 완성 조건
class Triangle {
    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[0]+sides[1]>sides[2])
            answer=1;
        else
            answer=2;
        return answer;
    }
  
    public static void main(String[] args) {
        int sides[] = {1, 2, 3};
        System.out.println(solution(sides));
    }
}
