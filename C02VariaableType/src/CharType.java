
public class CharType {

	public static void main(String[] args) {
		char chA = 'A';
		char cha = 'a';
		char hangeul = '한';
		
		System.out.println("chA : " + chA);
		System.out.println("cha : " + cha);
		System.out.println("hangeul : " + hangeul);

		char chA1 = 65;
		char chA2 = 0x41;
		char chA3 = 0x0041;
		
		System.out.println("chA1 : " + chA1);
		System.out.println("chA2 : " + chA2);
		System.out.println("chA3 : " + chA3);
		
	    char hanunicode = '\uac00';
	    System.out.println("hanunicode : " + hanunicode);
	    
		
	}

}
