/*
 Q) 삼각형을 만드세요.
 
 정의 : 삼각형은 3개의 점과 색상 그리고 "그리다(출력)"라는 기능을 가지고 있다.
 Shape1, Point1 클래스를 활용해서 작업.
 3개의 점 => (x,y) (x,y) (x,y)
 default 삼각형을 그릴 수도 있고 3개의 좌표값을 받아서 그림을 그릴 수도 있다.
 Triangle1 클래스완성하기
 */


// ** 기준점 잡기 && //

//>> 원(자식)은 도형(부모)이다. => "A은 B이다"가 성립하면(B가 부모), 상속관계(extends)
//>> 원은 점을 가지고 있다. => "A는 B를 가지고 있다."가 성립하면 포함관계(member field)

class Shape1{   
	void draw() {
		System.out.println("그림을 그리다.");
	}
}

class Point1{ //좌표를 입력 받는 클래스
	int x;
	int y;
	
	Point1(){
		this(0,0);
	}
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Triangle1 extends Shape1{
	Point1 x;
	Point1 y;
	Point1 z;
	
	Triangle1(){
		this(new Point1(1,1),new Point1(1,3), new Point1(3,1));
	}
	
	Triangle1(Point1 x, Point1 y, Point1 z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void trianglePoint() {
		System.out.printf("x : (%d, %d)", x.x, x.y);
		System.out.printf("y : (%d, %d)", y.x, y.y);
		System.out.printf("x : (%d, %d)", z.x, z.y);
	}
}




public class Ex02_1_inherit_Comosite {
	public static void main(String[] args) {
		
	}

}
