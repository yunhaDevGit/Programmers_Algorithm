package Level_0;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/120924
// 다음에 올 숫자
class NextNumber {
        public static List<Integer> solution(int num, int total) {
            List<Integer> answer = new ArrayList<>();
            boolean even = false;
            int sum, mid, count = 0;
            if(num%2==0) {
                even = true;
            }

            if(even){
                sum = total/(num/2); // 7
                mid = sum/2; // 3
                count = num/2; // 2
                for(int i=count-1;i>0;i--) {
                    answer.add(mid-i);
                }
                answer.add(mid);
                for(int i=1;i<=count;i++) {
                    answer.add(mid+i);
                }
            } else {
                mid = total/num;
                count = (num-1)/2; // 2
                for(int i=count;i>0;i--){
                    answer.add(mid-i);
                }
                answer.add(mid);
                for(int i=1;i<=count;i++){
                    answer.add(mid+i);
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
        System.out.println(solution(4,14));
    }
}