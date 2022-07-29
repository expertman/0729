import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String y_n;
		do{
			System.out.print("정수 한 개 : ");
			int su = sc.nextInt();
			System.out.println(su + "는 " + ((su % 2 == 0) ? "짝수입니다." : "홀수입니다.")) ;
			System.out.print("Again(y/n) ? : ");
			y_n = sc.next();
		}while(y_n.equals("y") || y_n.equals("Y"));
		System.out.println("Program is over...");
	}
}
