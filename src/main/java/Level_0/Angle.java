package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120829
// 각도기
public class Angle {
    public static int solution(int angle) {
        // return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
        int answer = 0;
        if(angle < 90)
            answer = 1;
        else if(angle == 90)
            answer = 2;
        else if(angle > 90 && angle < 180)
            answer = 3;
        else if(angle == 180)
            answer = 4;
        return answer;
    }

    public static void main(String[] args) {
        int angle = 80;
        System.out.println(solution(angle));
    }
}
