
public class Hexa {

	public static void main(String[] args) {
		int dc = 10; // 10진수로 대입
		int ha = 10;
		
		System.out.println("decimal(dc) : " + dc);
		System.out.println("hexa(ha) : " + ha);
		
		int a = 0xa;
		int b = 0xb; // 10진수 11
		int c = 0xc; // 10진수 12
		int d = 0xd; // 10진수 13
		int e = 0xe;
		int f = 0xf;
		
		System.out.println("hexa(0xa) : " + a);
		System.out.println("hexa(0xb) : " + b);
		System.out.println("hexa(0xc) : " + c);
		System.out.println("hexa(0xd) : " + d);
		System.out.println("hexa(0xe) : " + e);
		System.out.println("hexa(0xf) : " + f);
		
		System.out.printf("hexa(0xa) : %d, 0x%x\n", a, a);
		System.out.printf("hexa(0xb) : %d, 0x%x\n", b, b);
		System.out.printf("hexa(0xc) : %d, 0x%x\n", c, c);
		System.out.printf("hexa(0xd) : %d, 0x%x\n", d, d);
		System.out.printf("hexa(0xe) : %d, 0x%x\n", e, e);
		System.out.printf("hexa(0xf) : %d, 0x%x\n", f, f);
		
		int maxdec = 2147483647;
		int maxhex = 0x7fffffff;
		int mindec = -2147483648;
		System.out.printf("int max value(maxdec) : %d, 0x%x\n", maxdec, maxdec);
		System.out.printf("int max value(maxhex) : %d, 0x%x\n", maxhex, maxhex);
		System.out.printf("int max value(mindec) : %d, 0x%x\n", mindec, mindec);
	}

}
