package Rough;

public class DoubleArray {
	public static void main(String[] args) {
		double[] d=new double[5];
		d[0]=34.5;
		d[1]=45.4;
		d[2]=23.8;
		d[3]=56.54;
		d[4]=33.43;
		for(double p:d) {
			System.out.println(p);
		}
		d=new double[5];
		System.out.println(d);
	}

}
