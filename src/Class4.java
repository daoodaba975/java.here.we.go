public class Class4 {

	static void AnneeBisextile(int y) {
		
		boolean b = false;
		
		if(y % 400 == 0) {
	        b = true;
	    }
	    else if (y % 100 == 0) {
	        b = false;
	    }
	    else if(y % 4 == 0) {
	        b = true;
	    }
	    else {
	        b = false;
	    }
	    if(b == true) {
	        System.out.println("L'ann�e "+ y +" est une ann�e bissextile");
	    }
	    else {
	        System.out.println("L'ann�e "+ y +" n'est pas une ann�e bissextile");
	    }
	}
	
	public static void main(String[] args) {
		
		AnneeBisextile(2010);
		AnneeBisextile(1997);
		AnneeBisextile(1960);
		AnneeBisextile(2025);
		AnneeBisextile(2020);
		AnneeBisextile(1987);
	}
}