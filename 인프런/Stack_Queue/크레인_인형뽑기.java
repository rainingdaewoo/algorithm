package 인프런.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][pos -1 ] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if( !stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
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

        System.out.println(solution(board, moves));
    }
}
