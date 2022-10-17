package 백준;

import java.util.HashMap;
import java.util.Scanner;

public class _2480번 {

    public static int solution(int[] arr) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.keySet()) {
            if(map.size() == 1 ) return 10000 + i * 1000;
            else if(map.size() == 2 && map.get(i) == 2) return 1000 + i * 100;
            else max = Math.max(max, i);

        }
        return max * 100;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
