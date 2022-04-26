package Day_0426;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		// String 객체를 담기위한 ArrayList
		List<String> list1 = new ArrayList<>();
		// 저장
		list1.add("Hello");
		list1.add("hihi");
		list1.add(1, "kkkk");
		list1.add(1, "0000");

		// 꺼내기: get 메서드
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));

		// 크기확인: size 메서드
		System.out.println(list1.size());

		// 삭제 : remove 메서드
		System.out.println(list1.get(1));
		list1.remove(1);
		System.out.println(list1.get(1));

		// for문을 이용하여 list에 담긴 내용 모두 출력하기
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("list.get[" + i + "] = " + list1.get(i));
		}
		
		// for each(advanced for)
		for(String a: list1) {
			System.out.println(a);
		}
		
		// 정수를 담는 list
		// Wrapper Class
		// int-Integer , long-Long , double-Double , boolean-Boolean
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		System.out.println(list2.get(0));
		for(Integer num: list2) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
