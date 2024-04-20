package teamtest;

class Calc04{
	private double temp;
	private double hum;
	private double oxy;
	
	public Calc04(double temp, double hum, double oxy) {
		this.temp = temp;
		this.hum = hum;
		this.oxy = oxy;
	}
	
	public int calc() {
		
		return 0;
	}
	
	public boolean temp(double a) {
		if(a>=10 && a <= 27.5) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean hum(double a) {
		if(a>=40 && a <= 60) {
			return true;
		}else {
			return false;
		}
	}
	public boolean oxy(double a) {
		if(a>=19.5 && a <= 23.5) {
			return true;
		}else {
			return false;
		}
	}
	public void print() {
		return;
	}
}

public class HelloBiodome04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//입력 오류 방지 부분 
				if(args.length != 3) { //입력 오류시 메세지 출력 후 프로그램 종료
					System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요"); 
					System.exit(0);
				}
				
				//사용자로부터 입력된 문자열들을 실수로 형변환 
				double temp = Double.parseDouble(args[0]);
				double hum = Double.parseDouble(args[1]);
				double oxy = Double.parseDouble(args[2]);
				
				//객체 생성
				Calc04 calc = new Calc04(temp, hum, oxy);
			
				//출력 
				System.out.println(calc.calc());
	}
}
