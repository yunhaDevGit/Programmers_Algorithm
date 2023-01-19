package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120826
// 특정 문자 제거하기
public class RemoveString {
    public static String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution(my_string, letter));
    }
}
