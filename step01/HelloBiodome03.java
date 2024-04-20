package teamtest;
class Calc{
	//사용자 생명지수, 온도, 습도, 산소 농도의 값이 크지 않기 때문에 float타입으로 정의 
	//한번 정의 후 바뀔 일이 없기 때문에 final을 통해 상수정의 
	//상수로 선언되어 변경이 불가능함. 그렇기 때문에 외부에서 접근 가능한 public으로 정의 
	public final float PI = 3.14f;
	public final float COEF = 0.415f;
	
	private double temp;
	private double hum;
	private double oxy;
	
	public Calc(float temp, float hum, float oxy) {
		this.temp = temp;
		this.hum = hum;
		this.oxy = oxy;
	}
	
	
	//최종 생명지수를 계산하는 메서드 
	public double calc() {
		
		double ret = COEF * abs(root(this.hum) - this.temp) + (this.oxy/(PI*PI));  //생명지수 구하기 연산 
		
		return ret;
	}
	
	//루트 연산 메서드 
	public double root(double a) { 
		//좀더 이해가 필요 
		float precision = 0.000001f;
		double start = 0;
        double end = a;
        double mid;

        while (true) {
            mid = (start + end) / 2;
            double square = mid * mid;

            if (Math.abs(square - a) <= precision) {
                return mid;
            }

            if (square < a) {
                start = mid;
            } else {
                end = mid;
            }
        }
	}
	
	//절댓값 구하기 메서
	public double abs(double a) {
		if(a<0) {
			return a*=-1;
		} else {
			return a;
		}
	}
	public void print() {
		//보너스문제 
		//printf()를 통해 소숫점 자릿수 지정 
		System.out.printf("생명지수 H = %.2f", calc());
	}
}
public class HelloBiodome03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//입력 오류 방지 부분 
		if(args.length != 3) { //입력 오류시 메세지 출력 후 프로그램 종료
			System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요"); 
			System.exit(0);
		}
		
		//사용자로부터 입력된 문자열들을 실수로 형변환 
		float temp = Float.parseFloat(args[0]);
		float hum = Float.parseFloat(args[1]);
		float oxy = Float.parseFloat(args[2]);
		
		//객체 생성
		Calc calc = new Calc(temp, hum, oxy);
		
		//출력 
		calc.print();
	}

}
