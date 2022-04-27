package Day;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// add1 메서드를 호출
		Calculator cal1 = new Calculator();
		// 리턴이 있는 메서드를 호출할 때는 호출결과 처리를 위한 코드 필요
		int result = cal1.add2(10,20);
		System.out.println(result);
		
		// add2 메서드 호출
		//Calculator cal2 = new Calculator();
		//int sum = cal2.add2(10, 20);
		//System.out.println(sum);
		result = cal1.add2(10,20);
		System.out.println(result);
		
		int num1 = 10;
		int num2 = 20;
		result = cal1.add2(num1,num2);
		System.out.println(result);
		
		// add3 메서드 호출
		cal1.add3();
		
		// add4 메서드 호출
		cal1.add4(10,20);
		
		// add5 메서드 호출
		String strResult = cal1.add5();
		System.out.println(strResult);
		
		// add6 메서드 호출
		String strR = cal1.add6("ㅎㅇ", 10);
		System.out.println(strR);
		
		// add7 메서드 호출
		boolean boolean1 = cal1.add7(1,2);
		System.out.println(boolean1);
		// add8 메서드 호출
		boolean boolean2 = cal1.add8(1, 2);
		System.out.println(boolean2);
	}

}
