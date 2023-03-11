package Level_0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120913
// 잘라서 배열로 저장하기
class CutAndArray {
    public static String[] solution(String my_str, int n) {

        int size;
        int length = my_str.length();
        if(length%n==0){
            size = length/n;
        } else {
            size = length/n+1;
        }

        String[] answer = new String[size];
        int index=0;
        for(int i=0;i<size;i++){
            if(index+n<=length) {
                answer[i] = my_str.substring(index, index+n);
            } else {
                answer[i] = my_str.substring(index, length);
            }
            index += n;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1Addfggg4556b", 6));
    }
}
