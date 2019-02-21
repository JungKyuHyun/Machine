// 변수 <-> 상수
// 상수 : 한번 값이 정해지면 변경 불가...
// 시스템에서 한번 값이 정해지면 변경 되지 말아야 될 것: 시스템 버전번호
// 일반 상식선에 값이 정해지면 변경되지 말아야 될것: 고유값: 주민번호, PI

// 상수 관용적으로 대문자
// Java : final int NUM=100;
// C# : const int NUM=200;

//final 키워드
//클래스 앞에 : final class Car{} >> 상속불가 (extends 불가)
//함수 앞에 : public final void print(){} >> 상속관계에서 재정의 하지마!(사용빈도 거의 없음)

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	void method() {
		//시스템 상수(static final double = PI=3.14159 ...
		System.out.println(Math.PI);
	}
}

//질문 : Vcard타입으로 만드는 모든 객체는 결국 같은 상수값을 가진다.
// 객체마다 다른 상수값을 갖고 싶어요!


//상수 값이 한번 설정 변경...
class Vcard2{
//	final String KIND; //객체 만들고 초기화 안하면 어필히자...
//	final int NUM;
	
}
public class Ex07_Final {
	public static void main(String[] args) {
		Vcard v = new Vcard();
//		v.KIND ="AAA"; 안된다!
		System.out.println(v.KIND);
		v.method();
		
		//p9
//		Vcard2 num2 new Vcard2;{"space", i)
		
	}
}
