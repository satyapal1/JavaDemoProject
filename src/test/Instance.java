package test;

public class Instance {
	
	int a=10;
	int b=20;
   
	void m() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		Instance in = new Instance();
		System.out.println(in.a+in.b);
		System.out.println();
        in.m();
	}

}
