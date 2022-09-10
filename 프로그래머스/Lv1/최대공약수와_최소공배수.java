package 프로그래머스.Lv1;

public class 최대공약수와_최소공배수 {
    public int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        answer[0] =gcd;
        answer[1] = lcm;
        return answer;
    }
}
