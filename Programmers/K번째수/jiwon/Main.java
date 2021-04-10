package Programmers.K번째수.jiwon;

import java.util.*;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j-1]);
            }

            Collections.sort(list);
            int k = list.get(commands[i][2]-1);
            answer[i] = k;
        }

        return answer;
    }

    public static void main(String[] args) { 
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; 

        int[] result = solution(array, commands);

        for (int i = 0; i < commands.length; i++) {     
            System.out.println(result[i]); 
        }
    }
}