package Day;

public class DAy_0422_2 {
	public static void main(String[] args) {
		// Human 클래스에 대한 객체(인스턴스) 생성2222222222222222222222222222222222222222222222222222222222
		Human human1 = new Human();
		// [클래스이름] [객체이름(마음대로)] = new [클래스 생성자]
		// human 객체에 정보를 담아봄
		System.out.println(human1.name);
		human1.name = "홍길동";
		System.out.println(human1.name);
		
		Human human2 = new Human();
		human2.name = "홍길동";
		System.out.println(human2.name);
		
		Human human3 = new Human("ㅇㅇㅇ");
		
		Human human4 = new Human(12);
		
		String var1 = "ㅎㅎㅎ";
		Human human5 = new Human(var1);
		
		Human human6 = new Human("ddd" , 12 , "qqq" , "555") ;
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);
	}
}
