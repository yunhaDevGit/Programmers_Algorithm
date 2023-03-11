package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120912
// 7의 개수

public class SevenCount {
    public static int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<array.length;i++) {
            sb.append(array[i]);
        }
        String str = sb.toString();
        for(int i=0;i<str.length();i++) {
            if("7".equals(String.valueOf(str.charAt(i))))
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int array[] = {7, 77, 17};
        System.out.println(solution(array));
    }
}
