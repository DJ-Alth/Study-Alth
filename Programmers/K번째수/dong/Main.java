package com.company;

import java.util.*;

class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length;i++){
            answer[i]=cutting(array,commands[i]);

        }

        return answer;
    }
    public static int cutting(int[] array, int[] commands){
        List<Integer> list = new ArrayList<>();

        for(int i=commands[0]; i<=commands[1]; i++){
            list.add(array[i-1]);
        }
        Collections.sort(list);


        return list.get(commands[2]-1);
    }

    public static void main(String[] args) {
        int[] array= new int[]{1,5,2,6,3,7,4};
        int[][] commands= new int[][]{
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        Solution s = new Solution();
        int[] result = s.solution(array,commands);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
    }

}
