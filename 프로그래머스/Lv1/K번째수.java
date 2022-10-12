package 프로그래머스.Lv1;
import java.util.*;

public class K번째수 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];


            for(int i = 0; i < commands.length; i++) {
                int[] tmpArr = new int[commands[i][1] - commands[i][0] + 1];
                int index = 0;
                for(int j = 0; j < tmpArr.length; j++) {// 배열 자르기
                    tmpArr[j] = array[j + commands[i][0] - 1];
                }

                // 자른 배열 정렬
                Arrays.sort(tmpArr);

                answer[i] = tmpArr[commands[i][2] - 1];
            }
            return answer;
        }
    }
}
