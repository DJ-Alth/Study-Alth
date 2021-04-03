import java.util.*;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String name : participant) {
            hm.put(name, hm.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            if(hm.containsKey(name)){
                hm.put(name, hm.get(name) - 1);
            }
        }

        for (String name : hm.keySet()) {
            if(hm.get(name) == 1) {
                answer = name;
            }
        }

        return answer;
    }

    public static void main(String[] args) { 
        // test case
        String[] participant = {"mislav", "stanko", "mislav", "ana"};

        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion)); 
    }
}