//package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int count =0;
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i=0; i<num;i++){
            String str = br.readLine();
            arrayList.add(str);
        }

        for(int j =0;j<arrayList.size();j++){
            if(!check(arrayList.get(j))){
                count ++;
            }
        }

        System.out.println(count);
    }

    public static boolean check(String str){
        boolean[] bool = new boolean[26];

        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length;i++){
            if(bool[ch[i] - 'a'] == false){
                if(i == ch.length-1){
                    break;
                }
                if(ch[i] == ch[i+1]){
                    bool[ch[i]-'a'] = false;
                }else if(ch[i] != ch[i+1]){
                    bool[ch[i]-'a'] = true;
                }
            }else{
                return true;
            }
        }
        return false;

    }
}