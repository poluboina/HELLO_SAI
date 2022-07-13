package Rough;

public class Shoe extends Footweer{
		int size;
		public Shoe(String color,String brandName,int size) {
			super(color,brandName);
			this.size=size;
			
		}
			public void open() {
				System.out.println("wearing..........");
			}

}
