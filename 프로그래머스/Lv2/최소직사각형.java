package 프로그래머스.Lv2;
import java.util.*;

public class 최소직사각형 {

    class Solution {
        // [가로, 세로]
        public int solution(int[][] sizes) {
            int answer = 0;
            int maxWidth = 0;
            int maxHeight = 0;
            for(int i = 0; i < sizes.length; i++) {
                int width = Math.max(sizes[i][0], sizes[i][1]);
                int height = Math.min(sizes[i][0], sizes[i][1]);
                maxWidth = Math.max(maxWidth, width);
                maxHeight = Math.max(maxHeight, height);
            }
            answer = maxWidth * maxHeight;
            // System.out.println(maxWidth);
            // System.out.println(minHeight);
            return answer;
        }
    }
}
