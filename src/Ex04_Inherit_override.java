/*
 Today Point : [상속 관계]에서 override : 상속관계에서의 매서드 재정의
 - 상속관계에서 자식 클래스가 부모 클래스의 메서드의 재정의
 - 재정의(함수의 형태는 변화가 없고... 내용만 바뀌는 것)
 - 틀의 변화가 아니라 내용의 변화! {함수의 실행 블럭 내용 변경} 
 
 문법) 상속관계에서 ...
 1. 부모함수의 이름과 동일
 2. 부모함수의 parameter 동일
 3. 부모함수의 return type 동일
 4. 결국에는 {} 괄호안에 내용 변경 
 */

class Point3{
	int x =4;
	int y = 5;
	
	String getPosition() {
		return "x :" + this.x + "y :"+ this.y;
	}
}

// 3개의 점이 필요하다.
// 2개의 점을 가지고 있는 설계도...
class Point3D extends Point3{
	int z =6;
	
	//String getPosition3d() {return ...}
	//또 하나의 이름을 가진 함수를 만들고 싶지 않아요
	//부모가출력하는 함수를 가지고 있어요!
	//재정의 강제하는 방법
	//@Override 선언(Annotation)
	//Annotation : JAVA code 만으로 전달할 수 없는 부가적인 정보
	//[컴파일러]나 [개발툴]에게 전달하는 기능
	
	//@Override : 재정의 검사 ...
	
	@Override   //마우스 오른쪽 클릭 [Source]에서도 가능.
	String getPosition() {
		super.getPosition();
		return "x:" + this.x + " y:"+ this.y + " z:" + this.z;
	}
}



public class Ex04_Inherit_override {
	public static void main(String[] args) {
		Point3D point = new Point3D();
		point.x = 3;
		point.y = 6;
		point.z = 9;
		String result = point.getPosition();
		Point3 point1 = new Point3();
		System.out.println(result);
		System.out.println(point1.getPosition());
	}

}
