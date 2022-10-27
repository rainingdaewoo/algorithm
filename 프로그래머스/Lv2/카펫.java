package 프로그래머스.Lv2;

public class 카펫 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            int area = brown + yellow;

            // 가로와 세로의 길이는 3 이상이어야 함.
            for(int i = 3; i < area; i++) {
                int height = i;            // 세로
                int width = area / height;   // 가로

                if(height < 3) continue;

                if( height <= width && (height - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }

            }
            return answer;
        }
    }
}
