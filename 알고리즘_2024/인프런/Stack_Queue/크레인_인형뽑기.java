package 알고리즘_2024.인프런.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class 크레인_인형뽑기 {
    private static int solution(int N, int[][] board, int M, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();
        int answer = 0;

        for(int i = 0; i < M; i++) {
            int y = 0;
            int x = moves[i] - 1;

            while(y < N) {

                if(board[y][x] == 0) {
                    y++;
                } else {
                    if(stack.peek() != null && stack.peek() == board[y][x]) {
                        stack.pop();
                        board[y][x] = 0;
                        answer += 2;
                    } else {
                        stack.push(board[y][x]);
                        board[y][x] = 0;
                    }
                    break;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                board[i][j]= sc.nextInt();
            }
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for(int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(N, board, M, moves));
    }

}
