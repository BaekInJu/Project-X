package teamtest;

import java.util.Arrays;

public class HelloBiodome01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static으로 선언한 메서드일경울 객체생성 없이 바로 사용가능
		//가장 먼저 호출되는 main메서드에 인자값을 넘겨주기 위해 args가 존자함. 
		//넘겨주는 문자열 만큼(공백으로 구별하여) 문자열 배열을 만들어 준다.
		//length()는 String클래스의 함수 
		//a.length는 배열의 길이를 알려주는 배열의 속성 
		

		if(args.length == 0) {   //입력이 없을때 메세지 출력 후 프로그램 종료 
			System.out.println("이름을 입력해 주세요.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		String name = "";    //빈 문자열 변수 생성 
		for(int i=0; i<args.length; i++) {
			name += args[i];     //문자열 변수 name에 공백으로 분리된 args배열 합치기
			name +=" ";   //이름 사이에 공백 넣기 
		}
		name = name.trim();   //앞뒤 공백 제거 
		
		char[] Nname = name.toCharArray(); //공백 포함, 이름 문자열을 문자 배열로 쪼갠다.
		if(Nname.length > 10) { 
			
			Nname = Arrays.copyOfRange(Nname, 0, 10);
			name = new String(Nname);
		}
		
		System.out.println("\""+name+"\"님 안녕하세요!");   //trim()을 통해 앞뒤 공백 제거 
	}
}
