
public class WhileDemo {
	public static void main(String[] args) {
//		int i = 1;
//		while(i < 10) {
//			int j = 2;
//			while(j < 10) {
//				System.out.printf("%d x %d = %d\t\t", j, i, j * i);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		/*
		 * 1. 다음과 같은 출력을 할 수 있도록 프로그래밍 하시오.
			    A        B       C        D      E
			    f         g       h        i       j
			    K        L        M       N     O
			    p        q       r        s        t
			    U        V       W       X      Y
			    z
		 */
		int i = 65;
		int count = 0;
		int line = 1;
		while(i < 91) {
			if(line % 2 == 0) System.out.printf("%c\t", i + 32);
			else System.out.printf("%c\t", i);
			count++;
			if(count % 5 == 0 ) {
				System.out.println();
				line++;
			}
			i++;
		}
	}
}







