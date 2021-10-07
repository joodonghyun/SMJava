/*
 * 자동타입변환
 * 1.작은 타입에서 큰 타입으로 변환
 * 2.문자형(char)은 양수값만 처리하므로 byte의 마이너스 값을 캐스팅하면
 *   플러스(plus)로 바뀐다.
 */
public class PromotionConvert {

	public static void main(String[] args) {
		byte b1 = 65;
		int n1 = b1; // 자동캐스팅
		
		
		
		System.out.println("b1 : " + b1);
		System.out.println("n1 : " + n1);
		
		// char c1 = b1; 자동캐스팅이 안됨
		
		char c1 = (char)b1;
		char ca = 65;
		
		
		
		
		
		
		// 00 00 ff 00
		
		System.out.println("char : " + c1);
		

	}

}
