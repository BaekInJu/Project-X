package teamtest;

public class HelloBiodome02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.out.println("입력을 잘못하셨습니다.");
			System.exit(0);
		}
		//각각의 에너지양 수치의 최댓값은 30,000이기 때문에 short로 선언 
		short solar = Short.parseShort(args[0]);
		short wind = Short.parseShort(args[1]);
		short geothermal = Short.parseShort(args[2]);
		//문자열로 받아온 각각의 데이터를 short로 타입 변경 
		int sum = solar + wind + geothermal;
		
		System.out.println("총 에너지 생성량은 "+sum+"입니다.");
		
		double solarPt = (double)solar / sum * 100;
		double windPt = (double)wind / sum * 100;
		double geothermalPt = (double)geothermal / sum * 100;
//		System.out.println(
//				"태양광 "+solarPt+"%, "+
//				"풍력 "+windPt+"%, "+
//				"지열 "+geothermalPt+"%");
		
		//보너스 문제
		System.out.printf("태양광 %.8f%%, 풍력 %.8f%%, 지열 %.8f%%", solarPt, windPt, geothermalPt);
		//%만 하면 안되고 %%  이렇게 해야함 이게 이스케이프 시퀀스, %는 서식 지정자 
	}


}
