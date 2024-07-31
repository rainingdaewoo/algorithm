package 알고리즘_2024.인프런.HashMap_TreeSet;

import java.util.*;

public class K번째_큰_수 {

    public static int solution(int N, int K, int[] arr) {
        int answer = -1;
        Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    treeSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        if(treeSet.size() < K) return -1;

        int count = 0;
        for (Integer i : treeSet) {
            count++;
            if(count == K) {
                answer = i;
                break;
            }
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

