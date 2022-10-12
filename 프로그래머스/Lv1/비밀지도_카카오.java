package 프로그래머스.Lv1;

public class 비밀지도_카카오 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String[] realAnswer = new String[n];
            for(int i = 0; i < n; i++) {  // 10 -> 2진수 변환
                answer[i] = "";
                String arr1ToBinary = Integer.toBinaryString(arr1[i]);
                if( Integer.toBinaryString(arr1[i]).length() < n) {
                    int tmp = n - arr1ToBinary.length();
                    arr1ToBinary = "";
                    for(int j = 0; j < tmp; j++) {
                        arr1ToBinary += "0";
                    }
                    arr1ToBinary += Integer.toBinaryString(arr1[i]);
                } else {
                    arr1ToBinary = Integer.toBinaryString(arr1[i]);
                }

                // 숫자를 #로 변환
                for(String str : arr1ToBinary.split("")) {
                    if( str.equals("1")) {
                        answer[i] += "#";
                    } else {
                        answer[i] += " ";
                    }
                }
            }

            for(int i = 0; i < n; i++) {
                realAnswer[i] = "";
                String arr2ToBinary = Integer.toBinaryString(arr2[i]);
                if( Integer.toBinaryString(arr2[i]).length() < n) {
                    int tmp = n - arr2ToBinary.length();
                    arr2ToBinary = "";
                    for(int j = 0; j < tmp; j++) {
                        arr2ToBinary += "0";
                    }
                    arr2ToBinary += Integer.toBinaryString(arr2[i]);
                } else {
                    arr2ToBinary = Integer.toBinaryString(arr2[i]);
                }


                for(int j = 0; j < arr2ToBinary.length(); j++) {
                    if(arr2ToBinary.charAt(j) == '1' || answer[i].charAt(j) == '#') {
                        realAnswer[i] += "#";
                    } else {
                        realAnswer[i] += " ";
                    }

                }

            }

            return realAnswer;
        }
    }
}
