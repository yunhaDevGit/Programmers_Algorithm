package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120924
// 다음에 올 숫자
class NextNumber {
    public static int solution(int[] common) {
        int answer = 0;
        int num = 0;
        int length = common.length;
        if (length > 2) {
            if((common[2]-common[1])==(common[1]-common[0])) {
                num = common[2]-common[1];
                answer = common[length-1] + num;
            }else if((common[2]/common[1])==(common[1]/common[0])) {
                num = common[2]/common[1];
                answer = common[length-1] * num;
            }
        }

        return answer;
    }

//    public int solution(int[] common) {
//        int answer = 0;
//        int x = common[1] - common[0];
//        int y = common[2] - common[1];
//        if (x == y) {
//            answer = common[common.length - 1] + y;
//        } else {
//            answer = common[common.length - 1] * common[2] / common[1];
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        int common[] = {2, 4, 8};
        System.out.println(solution(common));
    }
}