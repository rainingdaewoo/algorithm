package baekjoon_20121210;

import java.util.Scanner;

public class backjoon_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt(); // 고정비용
		int B = sc.nextInt(); // 가변 비용
		int C = sc.nextInt(); // 상품 가격
		int BEP = 1; // 상품 개수 및 손익분기점
		
		if(B >= C) {
			BEP = -1;
		} else{
			BEP = A/(C-B) + 1;
		}
		
		System.out.println(BEP);	
		
		
		
		
	}

}
