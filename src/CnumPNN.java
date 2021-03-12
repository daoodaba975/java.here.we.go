public class CnumPNN {

	static void NumPNN(int nbr) {
		
		if(nbr > 0) {
			System.out.println(nbr+" est un nombre positif");
		}
		else if(nbr < 0) {
		     System.out.println(nbr+" est un nombre négatif");
		}
		else {
		     System.out.println(nbr+" est un nombre nul");
		}
	}
	
	public static void main(String[] args) {
		
		NumPNN(0);
		NumPNN(2);
		NumPNN(-60);
		NumPNN(+10);
		NumPNN(1);
		NumPNN(-987);
	}
}