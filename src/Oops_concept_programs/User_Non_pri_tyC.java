package Oops_concept_programs;

public class User_Non_pri_tyC {
	public static void main(String[] args) {
		Non_Pri_TypeCasting obj = new Primitive2();
		
		Primitive2 obj2 = ((Primitive2)obj);
		
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		System.out.println(obj2.k);
		
		System.out.println(Non_Pri_TypeCasting.i);
		System.out.println(Primitive2.k);
		
		
		
	}
}
