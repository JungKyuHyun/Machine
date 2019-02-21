class Product{ //전자제품
	int price;
	int bonuspoint;
	
	//Product(){}
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product {
	KtTv(){
		super(5000);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}
class Audio extends Product {
	Audio(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}
class Notebook extends Product {
	Notebook(){
		super(3000);
	}

	@Override
	public String toString() {
		return "Notebook";
	}	
}

class Buyer{
	int money=10000;
	int bonuspoint =0;
	
	void toBuy(Product product) {
		this.money = this.money - product.price;
		this.bonuspoint += product.bonuspoint;
	}
/* 1차코드!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	void kttyBuy(KtTv n) {
		if(this.money < n.price) {
			System.out.println("고갱님잔액부족");
			return;
		}
		//실구매행위
		this.money -= n.price;
		this.bonuspoint +=bonuspoint;
		System.out.println("구매한물건은 " + n.toString());
	}
	
	
	 구매행위
	 구매행위(잔액 - 제품의 가격, 포인트 정보 갱신)
	 구매자는 매장에 있는 모든 제품을 구매할 수 있따.
	 구매하는 함수 구현
	 KtTv, Audio, Notebook
	 
	 매장에 제품이 1000개 다른 제품이 추가(POS 등록 자동화)
	 물건이 오면 매장에 자동 배치
	 세일 >> 고객 >> 핸드폰 구매
	 KtTv, Audio, Notebook 제외한 997개의 제품이 구매행위 불가
	 ** 제품이 추가 될때마다 구매함수를 구현 해야만....
	 *
	 * 요구사항 : 제품이 추가 되더라도 하와이에서 휴가 ...
	 */
	
	
	/*
	//2차개선 : 함수명 통일
	//method overloading 사용
	void Buy(KtTv n) {
		if(this.money < n.price) {
			System.out.println("고갱님잔액부족");
			return;
		}
		//실구매행위
		this.money -= n.price;
		this.bonuspoint +=bonuspoint;
		System.out.println("구매한물건은 " + n.toString());
	}
	 */
	
	//3차개선 : 다형성
	void Buy(Product n) {
		if(this.money < n.price) {
			System.out.println("고갱님잔액부족");
			return;
		}
		//실구매행위
		this.money -= n.price;
		this.bonuspoint +=bonuspoint;
		System.out.println("구매한물건은 " + n.toString());
	}
}



public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
//		KtTv tv = new KtTv();
//		System.out.println(tv.toString());
//		System.out.println(tv.price);
//		System.out.println(tv.bonuspoint);
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		Notebook notebook = new Notebook();
		
		Buyer b1 = new Buyer();
		b1.toBuy(tv);
		System.out.println(b1.money);
		System.out.println(b1.bonuspoint);
	}
}
