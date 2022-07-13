package NonPrimitivetypeCasting;

public class userlogic {
	public static void main(String[] args) {
		A obj=new B();
	         System.out.println(obj.i);	
	         System.out.println(obj.j);
	    B obj1=((B)obj);
	         System.out.println(obj1.k);
	         System.out.println(obj1.c);
	         System.out.println(obj1.j);
	         System.out.println(obj1.d);
	         System.out.println(obj1.l);
	}
	

}
