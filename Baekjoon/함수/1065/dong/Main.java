package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int count =0;
        for(int i=1; i<=num;i++){
            boolean var = check(i);

            if(var == true){
                count++;
            }
        }

        System.out.print(count);
    }

    public static boolean check(int i){
        ArrayList<Integer> ar = new ArrayList<>();

        boolean result = false;
        int prev =0;
        int now = i;

        int prev_ch = 0; //차이
        int ch = 0;
        while(now != 0){
            prev = now % 10; //처음에는 일의자리
            now = now / 10;

            ar.add(prev);
        }

        if(ar.size()<3){
            result = true;
        }else if(ar.size() == 3){
            prev_ch = ar.get(0) - ar.get(1);
            ch = ar.get(1) - ar.get(2);

            if(prev_ch == ch){
                result = true;
            }else {
                result = false;
            }
        }else{
            result = false;
        }

        return result;



    }
}