package com.company;

public class Main {

    static boolean[] bool = new boolean[10040];

    public static void main(String[] args) {

        for(int i=1; i<10001;i++){
            check(i);

        }
        StringBuilder sb = new StringBuilder();
        for(int j =1; j<10001;j++){
            if(bool[j]==false) {
                sb.append(j).append('\n');
            }
        }
        System.out.print(sb);
    }

    public static void check(int i){
        int now = i;
        int result = i;
        while(now != 0){
            result += now % 10;
            now = now / 10;
        }

        bool[result] =true;

    }
}