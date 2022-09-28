package 인프런.Stack_Queue;

import java.util.*;

public class 공주_구하기 {
    // 길이가 N인 배열 생성(각 배열의 값은 1~N까지)
    // 배열을 스택에 집어 넣음
    // 만약 스택 길이가 K가 되면 stack에서 Pop한 배열 값을 삭제
    // 스택 초기화
    // 반복
    public static int solution(int N, int K) {
        //
        int count = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            Q.offer(i + 1);
        }

        while(Q.size() != 1) {
            int temp = Q.poll();
            count++;
            if(count == K) {
                count = 0;
            } else {
                Q.offer(temp);
            }
        }

        return Q.poll();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solution(N, K));
    }
}
