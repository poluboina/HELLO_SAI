package Rough;

public class user {
	public static void main(String[] args) {
		Shoe shoe=new Shoe("black","bata",9);
		shoe.open();
		System.out.println(shoe.brandName);
		System.out.println(shoe.color);
		System.out.println(shoe.size);
		System.out.println();
		Sandal s=new Sandal("Gray", "Puma", "High Hills");
		s.style();
		System.out.println(s.brandName);
		System.out.println(s.color);
		System.out.println(s.model);
		
		
		
	}

}
