package 백준;

public class _4673번 {

    public static int solution(int number) {
        int answer = number;

        while(number != 0) {
            answer = answer + (number % 10);
            number /= 10;
        }

        return answer;
    }

    public static void main(String[] args){

        boolean[] answer = new boolean[10001];
        for(int i = 1; i < answer.length; i++) {
            int n = solution(i);
            if(n < 10001) answer[n] = true;
        }
        for(int i = 1; i < answer.length; i++) {
            if(answer[i] == false) {
                System.out.println(i);
            }
        }
    }
}
