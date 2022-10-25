package 구름;
import java.io.*;
import java.util.*;

public class 의좋은_형제 {
    public static int[] solution(int[] arr, int D) {
        //int[] answer = new int[2];
        for(int i = 1; i <= D; i++) {

            if(i % 2 != 0) {// 진우가 선우에게 주는 날
                int temp = arr[0];
                if(temp % 2 != 0) temp++; // 만약 줄 식량이 홀수이면 ++해서 짝수로
                temp /= 2;
                arr[0] -= temp;
                arr[1] += temp;
            } else {        // 선우가 진우에게 주는 날
                int temp = arr[1];
                if(temp % 2 != 0) temp++;
                temp /= 2;
                arr[0] += temp;
                arr[1] -= temp;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[2];
        for(int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }

        int D = sc.nextInt();


        for(int i : solution(arr, D)) {
            System.out.print(i + " ");
        }
    }
}
