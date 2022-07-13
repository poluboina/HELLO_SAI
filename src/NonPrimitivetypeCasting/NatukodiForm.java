package NonPrimitivetypeCasting;

public class NatukodiForm {

	public static void main(String[] args) {
		Animal animal=new chicken();
		System.out.println(animal.color);
		System.out.println(animal.nooflegs );
		animal.sleep();
		animal.talk(); 
		Animal animal1=new Animal();
		System.out.println(animal.color);
		System.out.println(animal.nooflegs);
		animal1.sleep();
		animal1.talk();
		
		

	}

}
