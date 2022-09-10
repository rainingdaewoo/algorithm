package 프로그래머스.Lv1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = "";
        int strLength = s.length();
        if ( strLength % 2 == 0) {
            answer = s.substring((strLength/2 - 1), (strLength/2 + 1));
        } else {
            answer = s.substring(strLength/2, (strLength/2 + 1));
        }
        return answer;
    }
}
