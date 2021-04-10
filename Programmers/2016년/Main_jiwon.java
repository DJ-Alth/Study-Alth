class Solution {
    
    public static String solution(int a, int b) {
        String answer = "";
        
        int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] dayOfweek = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        int d = 0, result = 0;

        for (int i = 0; i < (a -1); i++) {
            d = d + month[i];
       }

        result = ((d + b) % 7);

        answer = dayOfweek[result];

        return answer;
    }

    public static void main(String[] args) { 
        // test case
        int a = 5;
        int b = 24;
        
        System.out.println(solution(a, b)); 
    }
}