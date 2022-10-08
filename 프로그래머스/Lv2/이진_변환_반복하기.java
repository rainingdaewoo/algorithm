package 프로그래머스.Lv2;

public class 이진_변환_반복하기 {

    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[2];
            int chang2 = 1;
            int deleteZero = 0;
            while(!s.equals("1")) {
                if( s.contains("0") ) {
                    String[] strArr = s.split("");
                    String tmp = "";
                    for(String str : strArr) {
                        if(str.equals("1")){
                            tmp += str;
                        } else {
                            deleteZero++;
                        }
                    }
                    s = tmp;
                } else {
                    s = Integer.toBinaryString(s.length());
                    chang2++;
                }
            }
            answer[0] = chang2;
            answer[1] = deleteZero;

            return answer;
        }
    }
}
