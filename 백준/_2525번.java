package 백준;

import java.util.*;

public class _2525번 {

    public static int[] solution(int[] nowTime, int needTime) {
        int[] answer = new int[2];
        int timeToMinute = (nowTime[0] * 60) + nowTime[1];
        //System.out.println( (timeToMinute + needTime) / 60 );
       // System.out.println( (timeToMinute + needTime) % 60 );
        answer[0] = ((timeToMinute + needTime) / 60) % 24;
        answer[1] = (timeToMinute + needTime) % 60;
        //if(answer[0] % 24 == 0) answer[0] = 0;
        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] nowTime = new int[2];
        for(int i = 0; i < 2; i++) {
            nowTime[i] = sc.nextInt();
        }
        int needTime = sc.nextInt();

        for(int i : solution(nowTime, needTime)) {
            System.out.print(i + " ");
        }
    }
}
