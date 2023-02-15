package Level_0;

import java.util.Arrays;

// 중앙값
// https://school.programmers.co.kr/learn/courses/30/lessons/120811
public class MiddleValue {
    public static int solution(int[][] triangle) {
        int newArray[][] = new int[triangle.length][triangle.length];
        int max=0;
        int h = triangle.length;
        newArray[0][0] = triangle[0][0];


        for(int i=1;i<h;i++){
            int w = triangle[i].length;
            for(int j=0;j<w;j++){
                max = newArray[i-1][j];
                for(int k=0;k<2;k++) {
                        if(j-k>=0&&triangle[i-1].length>j-k) {
                            if (max <= newArray[i-1][j - k]) {
                                max = newArray[i-1][j - k] + triangle[i][j];
                                newArray[i][j] = max;
                            }
                        }
                }
            }
        }

        int answer = 0;
        for(int i=0;i<newArray[triangle.length-1].length;i++) {
            if(answer<newArray[triangle.length-1][i])
                answer = newArray[triangle.length-1][i];
        }
        return answer;
    }


    public static void main(String[] args) {
        int array[][] = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(array));
    }
}
