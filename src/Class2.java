public class Class2 {

	static void Max3Num(int a, int b, int c) {
		
		if(a>b & a>c) {
			System.out.println(a+" est le maximum !");
		}
		else if(b>a & b>c) {
			System.out.println(b+" est le maximum !");
		}
		else if(c>a & c>b) {
			System.out.println(c+" est le maximum !");
		}
		else {
			System.out.println("les trois nombres sont egaux !");
		}	
	}
	
	public static void main(String[] args) {
		
		Max3Num(20,30,3);
		Max3Num(-1,3,8);
		Max3Num(100,200,80);
		Max3Num(-10,-15,-90);
		Max3Num(+6,-4,2);
		Max3Num(0,0,0);
	}
}
