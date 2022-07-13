package Rough;

public class Sandal extends Footweer {
	String model;
	public Sandal(String color,String brandName,String model) {
		super(color,brandName);
		this.model=model;
		
	}
	public void style() {
		System.out.println("Styleing............"+model+" "+color+" "+brandName);
	}

}
