package Day_0503;

import java.util.*;

public class Day_0503 {

	public static void main(String[] args) {
		// key : 정수(int) , value : 문자(String)
		
		Map<Integer , String> map1 = new HashMap<>();
		//저장
		map1.put(1,"hi"); 
		map1.put(2,"hello");
		// 가져오기
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		
		// key: 문자(String), value: 문자(String)
		// map2 선언 후 data를 저장
		Map<String , String> map2 = new HashMap<>();
		map2.put("일번", "안녕");
		map2.put("이번", "안녕하세요");
		map2.put("일번","잘가");
		System.out.println(map2.get("일번"));
		System.out.println(map2.get("이번"));
		
		// 반복문에 활용 ketSet() 
		for(String s : map2.keySet()) {
			System.out.println(s);
			System.out.println(map2.get(s));
		}
		
		map2.remove("가");
		
		/*
		 * StudentDTO를 만들어서
		 * 관리번호 , 이름 , 전화번호 , 전공 필드를 만들고
		 * 
		 * main 메서드에서 student객체를 담을 수 있는 studentMap을 선언하여
		 * 두 학생의 정보를 map에 저장하고 반복문으로 출력해보기
		 * key값은 관리번호를 넣기로함
		 */
		
		/*List<StudentDTO> sList = new ArrayList<>();
		
		StudentDTO sd = new StudentDTO(1L,"lee","010","com");
		StudentDTO sd1 = new StudentDTO(2l,"kim","011","elec");
		sList.add(sd);
		sList.add(sd1);
		
		Map<Long,String> map3 = new HashMap<>();
		map3.put(sList.get(0).getId() , sList.get(0).getName());
		map3.put(sList.get(1).getId() , sList.get(1).getName());
		
		for(Long s : map3.keySet()) {
			System.out.println(map3.get(s));
		}*/
		
		Map<Long, StudentDTO> studentMap = new HashMap<>();
		Long id = 1L;
		String stidentName ="학생1";
		String phNum = "010-1111-1111";
		String major = "com";
		
		StudentDTO student = new StudentDTO(id,stidentName,phNum,major);
		studentMap.put(id,student);
		
		id = 2L;
		stidentName ="학생2";
		phNum = "010-1111-2222";
		major = "elec";
		student = new StudentDTO(id,stidentName,phNum,major);
		studentMap.put(id,student);
		
		for(Long s : studentMap.keySet()) {
			System.out.println(s);
			System.out.println(studentMap.get(s));
			System.out.println(studentMap.get(s).getName());
		}
		
	}

}
