package 프로그래머스.Lv1;

public class 두_정수_사이의_합 {
    // 1. 큰 수를 max 작은 수를 min이란는 변수로 둠
    // 2. 만약 같으면 a를 리턴
    // 3. 큰 수 - 작은 수 + 1 길이의 int 배열 생성
    // 4. 작은 수부터 큰 수까지 반복문 돌려서 배열에 집어 넣음
    public long solution(int a, int b) {
        long sum = 0;
        int highNum = 0;
        int lowNum = 0;

        if( a == b ) {
            return a;
        } else if (a > b) {
            highNum = a;
            lowNum = b;
        } else {
            highNum = b;
            lowNum = a;
        }

        for(int i = lowNum; i <= highNum; i++) {
            sum += i;
        }
        return sum;
    }
}
