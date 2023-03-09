import java.util.*;

class PushString {
    public static int solution(String A, String B) {
        int answer = -1;
        for(int i=0;i<A.length();i++) {
            
            if(A.equals(B)) {
                answer=i;
                break;
            }
            A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
        }
        return answer;
    }
  
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
    }
}
