package Day_0504;

public class InterfaceMain {

	public static void main(String[] args) {
		// TestInterface interface1 = new TestInterface();
		TestInterface impl1 = new lmplClass1();
		impl1.hello();
		impl1.hello2("바로핑");
		impl1 = new lmplClass2();
		impl1.hello();
		impl1.hello2("맛나핑");
		
		
		// ImplClass1으로 개발을하다가 ImpClass2로 바꿔야하는경우
		lmplClass1 implc1 = new lmplClass1();
		implc1.hello();
		implc1.hello2("차차핑");
		lmplClass2 implc2 = new lmplClass2();
		implc2.hello();
		implc2.hello2("해핑");
		
		
	}

}
