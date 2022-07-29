import java.util.Scanner;

public class BranchDemo {
	public static void main(String[] args) {
//		for(int i = 1 ; i < 101 ; i++) {
//			if(i % 7 == 0 ) System.out.print(i + "\t");
//			else continue;
//		}
//		outer : 
//		for(int i = 65 ; i < 91 ; i++) {
//			int j = 65;  //초기치
//			inner : 
//			while(j <= i) {   //조건
//				System.out.printf("%c", j);
//				if(j == 70) break outer;
//				j++;    //증감
//			}
//			System.out.println();
//		}
		
		String systemPassword = "ABCD";
		Scanner sc = new Scanner(System.in);
		System.out.print("Input password : ");
		String userPassword = sc.nextLine();
		int i;
		for(i = 0 ; i < 4 ; i++) {
			if(systemPassword.charAt(i) == userPassword.charAt(i))  continue;
			else break;
		}
		if(i == 4) System.out.println("Success");
		else System.out.println("Failure");
	}
}




