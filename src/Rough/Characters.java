package Rough;

public class Characters {
	public static void main(String[] args) {
		char[] ch=new char[5];
		ch[0]='a';
		ch[1]='e';
		ch[2]='i';
		ch[3]='o';
		ch[4]='u';
		for(char c:ch) {
			if(c>='a'&&c<='u') {
				System.out.println(c);
			}
		}
		
	}
}
