package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120816?language=java
// 피자 나눠 먹기 (3)
class Pizza2 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice == 0)
            answer = n/slice;
        else 
            answer = (n/slice) + 1;
        return answer;
    }
  
    public static void main(String[] args) {
        int slice = 8;
        int n = 3;
        System.out.println(solution(slice, n));
    }
}
