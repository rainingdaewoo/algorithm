package 백준.baekjoon_20211129;


public class Test{
	long sum(int[] a) {
		long sum = 0;
		 for(int i = 0; i < a.length; i++) {
			 sum += a[i]; 
		 }
		return sum;
	}
}
