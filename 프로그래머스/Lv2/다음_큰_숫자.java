package 프로그래머스.Lv2;

public class 다음_큰_숫자 {

    class Solution {
        // n, n + 1, n + 2... 와 같이 while 문을 돌림
        // 만약 이진수로 변환 후 1의 개수가 같으면 break;

        public int solution(int n) {
            String nTo2 = Integer.toBinaryString(n);
            int answer = n + 1;
            int count = 0;
            for(int i = 0; i < nTo2.length(); i++) {
                if(nTo2.charAt(i) == '1') {
                    count++;
                }
            }
            //System.out.println(nTo2);
            // System.out.println(count);
            int nextNumberCount = 0;

            while(count != nextNumberCount) {
                nextNumberCount = 0;
                String answerTo2 = Integer.toBinaryString(answer++);
                for(int i = 0; i < answerTo2.length(); i++) {
                    if(answerTo2.charAt(i) == '1') {
                        nextNumberCount++;
                    }
                }
                //System.out.println(answerTo2);
                // break;
            }

            return --answer;
        }
    }
}
