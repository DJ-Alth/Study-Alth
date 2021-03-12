package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int count =0;
        String[] array = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};



        for(int i=0; i< 8;i++){
            if(str.contains(array[i])){
                str = str.replaceAll(array[i]," ");
                count++;
            }

        }
        count += str.length()-count;

        System.out.print(count);

    }
}