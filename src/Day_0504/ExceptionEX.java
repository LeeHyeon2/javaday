package Day_0504;

public class ExceptionEX {

	public static void main(String[] args) {
		try {
			//System.out.println(100 / 0);
			String a = null;
			System.out.println(a.length());
		}catch(ArithmeticException e) {
			System.out.println("띠용");
		}catch(NullPointerException e) {
			System.out.println("null뜬다");
		}
		
	}
}