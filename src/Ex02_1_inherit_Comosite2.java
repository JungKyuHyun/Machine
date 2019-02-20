/*
 Q) 삼각형을 만드세요.
 
 정의 : 삼각형은 3개의 점과 색상 그리고 "그리다(출력)"라는 기능을 가지고 있다.
 Shape1, Point1 클래스를 활용해서 작업.
 3개의 점 => (x,y) (x,y) (x,y)
 default 삼각형을 그릴 수도 있고 3개의 좌표값을 받아서 그림을 그릴 수도 있다.
 Triangle1 클래스완성하기
 */


// ** 기준점 잡기 && //

// >> 원(자식)은 도형(부모)이다. => "A은 B이다"가 성립하면(B가 부모), 상속관계(extends)
// >> 원은 점을 가지고 있다.    => "A는 B를 가지고 있다."가 성립하면 포함관계(member field)


class Shape2{   
	void draw() {
		System.out.println("그림을 그리다.");
	}
}

class Point2{ //좌표를 입력 받는 클래스
	int x;
	int y;
	
	Point2(){//디폴트 생성자
		this(0,0);
	}
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Triangle2 extends Shape2{
//	Point2 x;
//	Point2 y;
//	Point2 z;
	Point2[] point2Array; 
	
	Triangle2(){
		//int[] a = new int[]{};
		//int[] a1 = {1,2,3,4,5};
		//Point2[] point2Array = new Point[]{Point2 x = new Point2(1,1), (Point2) y, (Point2) z}
		this(new Point2[]{new Point2(1,1),new Point2(1,3), new Point2(3,1)});
	}
	
	Triangle2(Point2[] point2Array){
		this.point2Array = point2Array;
	}
	
	public void trianglePoint() {
		for(Point2 point : point2Array) {
			System.out.println("좌표 : " + point.x + ", " + point.y);
		}
	}
}




public class Ex02_1_inherit_Comosite2 {
	public static void main(String[] args) {
	
		Triangle2 tri = new Triangle2();
		tri.trianglePoint();
	}
}

/*
 is -a (상속: extends) : 원은 도형이다, 삼각형은 도형이다
 has -a (포함(내부변수) : 원은 점을 가지고 있다.삼각형은 점을 가지고 있다.
 			  : class 안에 instance variable ...
 			  : class circle { point p; }
 
 			 p 변수가 circle 내에서 new 발생(복합)
 			 p 변수가 외부에서 주소를 받아오면 (집합)
 			 Point point = new Point();
 			 circle.p = point;
*/