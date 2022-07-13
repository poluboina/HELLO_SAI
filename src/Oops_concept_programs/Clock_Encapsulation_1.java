package Oops_concept_programs;

public class Clock_Encapsulation_1 {
	private int hr;
	private int min;
	private int sec;
	public Clock_Encapsulation_1(int hr,int min, int sec) {
		if((hr>=1&&hr<=12)&&(min>=1&&min<=60)&&(sec>=1&&sec<=60)) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		}
		else {
			System.out.println("Enter the Right time");
		}
		}
	
	public void setHr(int hr) {
		if(hr>=1&&hr<=12) {
			this.hr=hr;
		}
		else {
			System.out.println("enter the right hour time");
		}
		
	}
	
	public int getHr() {
		return this.hr;
		
	}

	public void setMin(int min) {
		if(min>=1&&min<=60) {
			this.min=min;
		}
		else {
			System.out.println("enter the right minute time");
		}
		
	}
	
	public int getMin() {
		return this.min;
	}
	
	
	public void setSec(int sec) {
		if(sec>=1&&sec<=60) {
			this.sec=sec;
		}
		else {
			System.out.println("enter the right second time");
		}
		
	}
	
	public int getSec() {
		return this.sec;
		
	}
	
	public void display() {
		System.out.println(this.hr+":"+this.min+":"+this.sec);
	}
	
}
