public class CnumDIV {

	static void Divisible(int nbr) {
		
		int reste;
		boolean flag = true;
		  	        
		for(int i=2; i <= nbr/2; i++) {
		     reste = nbr%i;
		            
		     if(reste == 0) {
		        flag = false;
		        break;
		     }
		  }
		if(flag) {
		     System.out.println(nbr + " est un nombre premier");
		}
		else {
		     System.out.println(nbr + " n'est pas un nombre premier");
		}
	}
	
	public static void main(String[] args) {
		
		Divisible(30);
		Divisible(1);
		Divisible(25);
		Divisible(5);
		Divisible(-14);
		Divisible(66);
	}
}