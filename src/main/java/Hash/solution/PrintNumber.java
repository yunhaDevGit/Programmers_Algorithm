package Hash.solution;

import java.util.*;

class PrintNumber {
    public static int solution(String s) {
        int answer = 0;
        Map<Integer,String> match = new HashMap<>();
        match.put(0,"zero");
        match.put(1,"one");
        match.put(2,"two");
        match.put(3,"three");
        match.put(4,"four");
        match.put(5,"five");
        match.put(6,"six");
        match.put(7,"seven");
        match.put(8,"eight");
        match.put(9,"nine");

        String number = "";
        int size = 0;

        while(s.length()>0){
            size = s.length();

            for(Integer key : match.keySet()){
                if(s.startsWith(match.get(key))){
                    s = s.substring(match.get(key).length());
                    number += key;
                    break;
                }
            }
            if(size==s.length()) {
                number += s.charAt(0);
                s = s.substring(1);
            }
        }
        answer = Integer.parseInt(number);

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int result = solution(s);
        System.out.println(result);
    }
}
