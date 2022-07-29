import java.util.Scanner;

public class ForDemo1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단 ? : ");
//		int dan = sc.nextInt();
//		for(int i = 1 ; i < 10 ; i++) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//		}
		//★★★★★
		//for(int i = 1 ; i < 6 ; i++) {
		//	System.out.print("★\t");
		//}
		//★
		//★
		//★
		//★
		//★
		//for(int i = 1 ; i < 6 ; i++) {
		//	System.out.println("★");
		//}
		/*
		 * ★
		 * ★★
		 * ★★★
		 * ★★★★
		 * ★★★★★
		 */
//		for(int i = 1 ;  i <= 5 ; i++) {   //밑으로 내려가는 반복
//			for(int j = 1 ; j <= i ; j++) {   //옆으로 가는 반복
//				System.out.print("★\t");
//			}
//			System.out.println();
//		}
		/*
		 * ★★★★★
		 * ★★★★
		 * ★★★
		 * ★★
		 * ★
		 */
//		for(int i = 5 ; i > 0 ; i--) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("★\t");
//			}
//			System.out.println();
//		}
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 * ABCDEF
		 * ...
		 * ABCDEFG....Z
		 */
//		for(int i = 65 ; i <= 90 ; i++) {
//			for(int j = 65 ; j <= i ; j++) {
//				System.out.printf("%c", j);
//			}
//			System.out.println();
//		}
		
		for(int i = 1 ; i < 10 ; i++) {
			for(int dan = 2 ; dan < 10 ; dan++) {
				System.out.printf("%d x %d = %d\t\t", dan, i, dan * i);
			}
			System.out.println();
		}
	}
}






