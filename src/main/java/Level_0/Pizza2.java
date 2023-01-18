package Level_0;

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
