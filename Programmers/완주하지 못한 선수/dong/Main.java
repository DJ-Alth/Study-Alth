package com.company;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map1 = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i< participant.length;i++){
            set.add(participant[i]);
            if(map1.containsKey(participant[i])){
                map1.put(participant[i], map1.get(participant[i])+1);
            }else{
                map1.put(participant[i],1);
            }

        }

        for(int i=0;i<completion.length;i++){
            if(map1.containsKey(completion[i])){
                map1.put(completion[i],map1.get(completion[i])-1);
            }
        }

        List<String> list = new ArrayList<>(set);
        for(int j=0; j<map1.size();j++){
            if(map1.get(list.get(j)) == 1){
                answer = list.get(j);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant= new String[]{"leo","kiki","eden"};
        String[] completion= new String[]{"eden","kiki"};

        Solution s = new Solution();
        String result = s.solution(participant,completion);

        System.out.println(result);
    }

}
