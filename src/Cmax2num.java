public class Cmax2num {

	static void MaxNum(int a, int b) {
		
		if(a>b) {
			System.out.println(a+" est le maximum !");
		}
		else if(a<b) {
			System.out.println(b+" est le maximum !");
		}
		else {
			System.out.println("les deux nombres sont egaux !");
		}
	}
	
	public static void main(String[] args) {
		
		MaxNum(20,30);
		MaxNum(-1,3);
		MaxNum(100,200);
		MaxNum(-10,-15);
		MaxNum(+6,-4);
		MaxNum(0,0);
	}
}
