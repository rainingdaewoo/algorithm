package 프로그래머스.Lv1;

public class _3진법_뒤집기 {
    public int solution(int n) {
        int answer = 0;
        String n3 = Integer.toString(n,3);
        StringBuffer sb = new StringBuffer(n3);
        n3 = sb.reverse().toString();

        return Integer.parseInt(n3,3);
    }
}
