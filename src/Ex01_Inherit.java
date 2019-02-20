/*
객체지향언어(OOP) 3대 특징
상속
다형성
캡슐화(은닉화) : private

1. 상속
java > Child extends Base
c# > Child : Base

2. 상속특징
- 다중상속은 불가 (복잡성)
- 단일상속이 원칙 (계층적 상속을 사용해서 다중상속을 구현)
- 유일하게 Interfae만 다중상속 지원

3. 의미
진정한 의미 : [재사용성] >> 반복적인 코드 ... 공통코드 ... 부모
단점 : 초기 설계 비용 ..

재사용성 >> 설계시 >> 비용(시간, 공통분모, 추상화) 
 */

//Memory 로딩 모습... 누가 먼저 Momory에 올라갔을까

class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 50000;//상속이라도 사용 못함. 참조변수도, 상속관계도 접근불가
	public GrandFather(){
		System.out.println("할아부지");
	}
}

class Father extends GrandFather {
	public int fmoney= 1000;
	
	public Father() {
		System.out.println("아부징");
	}
}

class Child extends Father {
	public int cmoney = 100;
	
	public Child() {
		System.out.println("자슥");
	}
}



public class Ex01_Inherit {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.gmoney);
		System.out.println(c.fmoney);
		System.out.println(c.cmoney);
	}

}
