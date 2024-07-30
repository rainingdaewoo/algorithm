package 알고리즘_2024.인프런.HashMap_TreeSet;

import java.util.*;

public class 매출액의_종류 {

    public static ArrayList<Integer> solution(int N, int K, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int lt = 0;

        for (int i = 0; i < K; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for(int i = K; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.put(arr[lt], map.get(arr[lt] ) - 1 );
            if( map.get(arr[lt]) == 0 ) {
                map.remove(arr[lt] );
            }
            lt++;
            answer.add(map.size());
        }


        // 타입아웃
       /* for (int i = 0; i < arr.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            if( i + K > arr.length) {
                break;
            }
            for(int j = i; j < i + K; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            answer.add(map.size());
        }*/

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

        for(int i : solution(N, K, arr)) {
            System.out.print(i + " ");
        }
    }
}

