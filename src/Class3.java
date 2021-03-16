public class Class3 {
	
	static void NumPairImpair(int nbr) {
		
	    if (nbr % 2 == 0) {
	      System.out.println("Le nombre est pair.");
	    }
	    else {
	      System.out.println("Le nombre est impair.");
	    }
	}
	
	public static void main(String[] args) {
		
		NumPairImpair(20);
		NumPairImpair(1);
		NumPairImpair(100);
		NumPairImpair(-105);
		NumPairImpair(+6);
		NumPairImpair(0);
	}
}