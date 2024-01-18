package k_Chapter10;

interface Fruit {
	String color(); // public abstract
	
	// 디폴트 메서드
	default void describe() {
		System.out.println("This is a fruit of color: " + color());
	}
	
	// 정적 메서드
	static void printType() {
		System.out.println("This is a type olf fruit");
	}
}

class Apple implements Fruit{
	@Override
	public String color() {
		return "red";
	}
	
	// 디폴트 메서드가 재정의 되지 않았끼 때문에
	// , Fruit 에 있는 디폴트 메서드가 생략된 형태
}

class Orange implements Fruit{
	@Override
	public String color() {
		return "orange";
	}
}

public class Z_Pratice02 {
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.describe();
		orange.describe();
		Fruit.printType();
	}
}
