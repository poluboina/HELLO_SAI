package Rough;

public class CarDriver {
	public static void main(String[] args) {
		Car car=new Car("tata",80.56,34.57);
		Car car1=new Car("tata",80.56,34.57);
		System.out.println(car.equals(car1));
		System.out.println(car1.equals(car));
	}

}
