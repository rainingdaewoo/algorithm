package 프로그래머스.Lv1;

public class 약수의_개수와_덧 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }

            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
