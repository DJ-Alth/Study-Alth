import java.io.*;

public class App {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int num = 0, index = 0;

        int k = Integer.parseInt(s[0]);
        int[] arr = new int[k];
        int n = Integer.parseInt(s[1]);

        // 크기가 k인 정수형 배열 arr을 중복 없이 1 ~ k 사이의 난수로 초기화
        for(int i = 0; i < k; i++) {           
            arr[i] = (int)((Math.random()*k) + 1);   
            
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    i--;
                }
            } 
        }
        
        // 확인용 
        System.out.println("\n init arr ");
        for(int i = 0; i < k; i++) {
            System.out.println("arr [" + i + "] = " + arr[i]);
        } 

        int min = arr[0];

    
        for(; index < n; index++) {
            // 둘 중 더 작은 수로 저장
            if(min > arr[index]) {
                min = arr[index];
                System.out.println("min " + min);
            }
        }

        for(int i =0; i < n; i++) {
            arr[i] = min;
        }

        // 확인용
        System.out.println("\n change arr ");
        for(int j=0; j < n; j++) {
            System.out.println("arr [" + j + "] = " + arr[j]); 
        }
    }
}