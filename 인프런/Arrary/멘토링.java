package 인프런.Arrary;

import java.util.Scanner;

public class 멘토링 {

    public static int solution(int[][] arr) {
        int answer = 0;
        System.out.println(arr.length);

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] arr = new int[X][Y];
        for(int i = 0; i < X; i++) {
            for(int j = 0; j < Y; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
}
