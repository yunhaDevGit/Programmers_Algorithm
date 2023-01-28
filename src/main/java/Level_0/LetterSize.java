package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120898
// 편지
public class LetterSize {
    public static int solution(String message) {
        return message.length() * 2;
    }
    public static void main(String[] args) {
        String message = "hello world";
        System.out.println(solution(message));
    }
}
