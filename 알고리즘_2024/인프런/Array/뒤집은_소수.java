package 알고리즘_2024.인프런.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은_소수 {
    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            StringBuilder sb = new StringBuilder();
            String string = sb.append(i).reverse().toString();
            int revInt = Integer.parseInt(string);

            if(revInt == 2) answer.add(revInt);
            if(revInt < 2 || revInt % 2 == 0) continue;

            boolean isDecimal = true;
            for(int j = 2; j < revInt; j++) {
                if(revInt % j == 0) {
                    isDecimal = false;
                    break;
                }
            }

            if(isDecimal) answer.add(revInt);
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i : solution(N, arr)) {
            System.out.print(i + " ");
        }
    }

}
