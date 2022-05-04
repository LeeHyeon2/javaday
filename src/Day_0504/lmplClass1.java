package Day_0504;

public class lmplClass1 implements TestInterface {
	
	@Override
	public void hello() {
		System.out.println("Implclass의.hello()");
	}
	
	@Override
	public void hello2(String name){

		System.out.println("Implclass1.hello2();" + name);
	}

}
