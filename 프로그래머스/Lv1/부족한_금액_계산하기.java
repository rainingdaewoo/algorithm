package 프로그래머스.Lv1;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += price * i;
        }
        if(total < money) {
            return 0;
        }

        return total - money;
    }
}
