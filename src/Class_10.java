public class Class_10 {

	static void MajMin(String c) {
		
		if(c.equals(c.toUpperCase()))
		{
		   System.out.println(c + " est en majuscules");
		}
        else {
        	System.out.println(c + " est en minuscules");
        }
		
	}
	
	public static void main(String[] args) {
		
		MajMin("A");
		MajMin("j");
		MajMin("G");
		MajMin("z");
		MajMin("D");
		MajMin("e");
	}
}