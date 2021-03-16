public class Class7 {

	static void Alpha(char ch) {
		
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        	System.out.println(ch + " est une lettre.");
        }
        else {
        	System.out.println(ch + " n'est pas une lettre.");
        }
		
	}
	
	public static void main(String[] args) {
		
		Alpha(';');
		Alpha('§');
		Alpha('5');
		Alpha('L');
		Alpha('a');
		Alpha('D');
	}
}