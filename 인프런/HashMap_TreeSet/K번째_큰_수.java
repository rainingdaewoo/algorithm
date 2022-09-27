package 인프런.HashMap_TreeSet;

import java.util.*;

public class K번째_큰_수 {

    public static int solution(int N, int K, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int z = j + 1; z < N; z++) {
                    Tset.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }
        int cnt = 1;
        for(int x : Tset) {
            if(cnt == K) {
                return x;
            }
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(N, K, arr));
    }
}
