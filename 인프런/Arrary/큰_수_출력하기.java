package 인프런.Arrary;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기 {
    // 1.  N만큼 int 배열 생성
    // 2.  배열에 숫자를 집어넣고 반복문 돌림
    // 3.  만약 이전 값보다 큰 경우만 answer에 추가
    public static ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < N; i++) {
            if(arr[i] > arr[i -1]) {
                answer.add(arr[i]);
            }
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
