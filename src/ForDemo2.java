
public class ForDemo2 {
	public static void main(String[] args) {
		/*
		 * x는 1부터 2씩 증가, 
		 * y는 100부터 3씩 감소할 때
		 * 교차할 때의 x, y의 값은?
		 */
//		int x, y;
//		for(x = 1, y = 100 ; x < 101 ; x += 2, y -= 3) {
//			if(x > y) break;
//		}
//		System.out.printf("x = %d, y = %d\n", x, y);
		
		//1부터 10까지 출력하기
		//int i = 1; //초기화
		//for(      ; i < 11 ;     ) {
		//	System.out.print(i + "\t");
		//	i++;
		//}
		int y = 1;    //초기화
		while(y < 11) {
			System.out.print(y + "\t");
			y++;     //증감
		}
//		for( ; ; ) {
//			System.out.println("hello, world");
//		}
		
	}
}
