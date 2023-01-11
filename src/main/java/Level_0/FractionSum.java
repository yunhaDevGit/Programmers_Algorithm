package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120808
// 분수의 합

public class FractionSum {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numer = (numer1*denom2) + (numer2*denom1);
        int denom = denom1 * denom2;

        int max = 0;
        for(int i=1;i<=denom && i<=numer;i++) {
            if(denom%i==0 && numer%i==0)
                max = i;
        }

        int[] answer = {numer/max,denom/max};
        return answer;
    }

    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        System.out.println(solution(numer1,denom1,numer2,denom2));
    }
}
