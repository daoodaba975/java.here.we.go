public class Class8 {

	static void VoyelleConsonne(char c) {
		
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
        	System.out.println(c + " est une voyelle.");
        }
        else {
        	System.out.println(c + " est une consonne.");
        }
		
	}
	
	public static void main(String[] args) {
		
		VoyelleConsonne('A');
		VoyelleConsonne('d');
		VoyelleConsonne('i');
		VoyelleConsonne('o');
		VoyelleConsonne('H');
		VoyelleConsonne('k');
	}
}