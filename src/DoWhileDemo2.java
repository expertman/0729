
public class DoWhileDemo2 {
	public static void main(String[] args) {
		//1부터 6까지의 랜덤값 2개를 추출하되 서로 다른 2개를 출력하는 프로그램.
		//int rand1, rand2;
		//for(  ;   ; ) {
		//while(true) {
		//	rand1 = (int)(Math.random() * 6 + 1);
		//	rand2 = (int)(Math.random() * 6 + 1);
		//	if(rand1 != rand2)  break;
		//}
		
//		do {
//			rand1 = (int)(Math.random() * 6 + 1);
//			rand2 = (int)(Math.random() * 6 + 1);
//		}while(rand1 == rand2);
//		
//		System.out.println("rand1 = " + rand1 + ", rand2 = " + rand2);
		
		//1부터 45까지 서로 다른 숫자 6개 추출하기
		int rand1, rand2, rand3, rand4, rand5, rand6;
		do {
			rand1 = (int)(Math.random() * 45 + 1);
			rand2 = (int)(Math.random() * 45 + 1);
			rand3 = (int)(Math.random() * 45 + 1);
			rand4 = (int)(Math.random() * 45 + 1);
			rand5 = (int)(Math.random() * 45 + 1);
			rand6 = (int)(Math.random() * 45 + 1);
		}while(rand1 == rand2 || rand1 == rand3 || rand1 == rand4 || rand1 == rand5 || rand1 == rand6 ||
				   rand2 == rand3 || rand2 == rand4 || rand2 == rand5 || rand2 == rand6 ||
				   rand3 == rand4 || rand3 == rand5 || rand3 == rand6 ||
				   rand4 == rand5 || rand4 == rand6 ||
				   rand5 == rand6);
		System.out.printf("%d, %d, %d, %d, %d, %d\n", rand1, rand2, rand3, rand4, rand5, rand6);
	}
}
