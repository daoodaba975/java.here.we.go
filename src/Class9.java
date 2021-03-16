public class Class9 {

	static void Verif(char c) {
		
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
        	System.out.println(c + " est une voyelle.");
        }
        else {
        	System.out.println(c + " est une consonne.");
        }
		
	}
	
	public static void main(String[] args) {
		
		Verif('A');
		Verif('d');
		Verif('i');
		Verif('o');
		Verif('H');
		Verif('k');
	}
}