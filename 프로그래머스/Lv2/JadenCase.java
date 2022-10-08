package 프로그래머스.Lv2;

import java.util.Arrays;

public class JadenCase {
    class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();
            boolean t = true;

            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == ' ') {
                    sb.append(" ");
                    t = true;
                } else {
                    if (t) {
                        sb.append(Character.toUpperCase(c));
                    } else {
                        sb.append(Character.toLowerCase(c));
                    }
                    t = false;
                }
            }
            return sb.toString();
        }
    }

}