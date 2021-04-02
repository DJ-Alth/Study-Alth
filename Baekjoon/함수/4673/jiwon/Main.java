import java.util.ArrayList;

public class Main {
    ArrayList<Integer> list = new ArrayList<Integer>(10040);
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    public void init() {
        for(int i= 1; i < 10001; i ++) {
            list.add(i);
        }
        //System.out.println("list size : " + list.size());
    }

    // 수열
    public void d() {
        int num = 0;

        for(int i = 0; i < 10001; i++) {
            // 1의 자리
            if(i < 10) {
                num = i + (i / 1) + (i % 1);
                list2.add(num);
            }

            // 10의 자리
            if(i >= 10 && i < 100) {
                num = i + (i / 10) + (i % 10);
                list2.add(num);
            }

            // 100의 자리
            if(i >= 100 && i < 1000) {
                num = i + (i / 100) + ((i % 100) / 10) + ((i % 100) % 10);
                list2.add(num);
            }

            // 1000의 자리
            if(i >= 1000) {
                num = i + (i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (((i % 1000) % 100) % 10);
                list2.add(num);
            }
        }

        //System.out.println("list2 size : " + list2.size());
    }

    public static void main(String[] args) {
        try {
            Main main = new Main();
        
            main.init();
            main.d();
    
            main.list.removeAll(main.list2);
        
            for (int i = 0; i < 10001; i++ ) {
               System.out.print(main.list.get(i) + " ");
            }
        } catch (Exception e) {
            
        }
    }
}
