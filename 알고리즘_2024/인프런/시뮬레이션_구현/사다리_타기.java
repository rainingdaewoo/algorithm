package 알고리즘_2024.인프런.시뮬레이션_구현;

import java.util.*;

public class 사다리_타기 {
    public static char[] solution(int n, int[][] ladder){
        char[] answer = new char[n];

        for(int i = 0; i < n; i++) {
            answer[i] = (char) (i + 65);
        }
        for(int[] line : ladder) {
            for (int x : line) {
                char tmp = answer[x];
                answer[x] = answer[x - 1];
                answer[x - 1] = tmp;
            }
        }
       /* char[] student = new char[n];
        for(int i = 0; i < n; i++) {
            student[i] = (char) ('A' + i);
        }

        for(int i = 0; i < student.length; i++) {
            int startNum = student[i] - 64;
            for(int j = 0; j < ladder.length; j++) {
                for(int k = 0; k < ladder[j].length; k++) {
                    if(startNum == ladder[j][k]) {
                        startNum++;
                    } else if ( startNum == ladder[j][k] + 1) {
                        startNum--;
                    }
                }
            }
            answer[startNum - 1] = student[i];*/



        return answer;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }

}

