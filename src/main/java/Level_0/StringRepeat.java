// https://school.programmers.co.kr/learn/courses/30/lessons/120825
// 문자 반복 출력하기
class StringRepeat {
    public static String solution(String my_string, int n) {
        String[] c = my_string.split("");
        int count = c.length;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<count;i++) {
            for(int j=0;j<n;j++){
                sb.append(c[i]);
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
  
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        System.out.println(solution(my_string, n));
    }
}
