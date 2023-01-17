package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120854
// 배열 원소의 길이
public class ArrayArgsLength {
    public static int[] solution(String[] strlist) {
        int length = strlist.length;
        int[] answer = new int[length];
        for(int i=0;i<length;i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String arr[] = {"We", "are", "the", "world!"};
        System.out.println(solution(arr));
    }
}
