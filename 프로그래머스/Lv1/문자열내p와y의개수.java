package 프로그래머스.Lv1;

class Solution {

    public boolean solution(String s) {
        boolean answer = true;
        int y = 0;
        int p = 0;
        for(int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == 'y' || s.charAt(i) == 'Y' ) {
                y++;
            } else if( s.charAt(i) == 'p' || s.charAt(i) == 'P' ) {
                p++;
            }
        }
        if(y != p) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        Solution sol = new Solution();
        System.out.println(sol.solution(s));

    }
}
