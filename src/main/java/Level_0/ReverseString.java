package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120822
// 문자열 뒤집기
public class ReverseString {
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("sdkjs"));
    }
}
