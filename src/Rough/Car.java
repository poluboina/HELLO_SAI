package Rough;

public class Car {
		String brandName;
		double topSpeed;
		double mileage;
		public Car(String brandName,double topSpeed,double mileage) {
			super();
			this.brandName=brandName;
			this.topSpeed=topSpeed;
			this.mileage=mileage;
		}
		public 	boolean equals(Object obj) {
		 Car obj1=(Car)obj;
			
			return this.brandName==obj1.brandName&&this.topSpeed==obj1.topSpeed&&this.mileage==obj1.mileage;
			
		
		}
}
