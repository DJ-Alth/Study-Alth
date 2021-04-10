import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] tnvhwk1 = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }; 
        int[] tnvhwk2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; 
        int[] tnvhwk3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; 

        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if ((tnvhwk1[i % tnvhwk1.length]) == answers[i]) {
                count[0]++;
            }
            if (tnvhwk2[i % tnvhwk2.length] == answers[i]) {
                count[1]++;
            }
            if (tnvhwk3[i % tnvhwk3.length] == answers[i]) {
                count[2]++;
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        // 최고 점수 찾기
        int max = Math.max(Math.max(count[0], count[1]), count[2]); 

        // 최고점자만 add 
        if(max==count[0]) list.add(1); 
        if(max==count[1]) list.add(2);
        if(max==count[2]) list.add(3);

        System.out.println("list " + list);
        
        // answer 리스트 길이만큼 초기화
        // answer = list.toArray(new Int[list.size()]); => toArray는 Object 형식으로 반환
        // Stream API를 사용하면 실행 시간이 오래걸림
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) { 
        // test case
        int[] answers = { 1, 2, 3, 4, 5 };

        int[] answer = solution(answers);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]); 
        }
    }
}
