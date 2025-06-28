package returntypeexamples;

public class B {
	int i=100;
	int j;
	int k=30;
	
	public B m2() {
		B b=new B();
		System.out.println(b.i+" "+b.j+" "+b.k);
		
		B b1=new B();
		b1.i=10;
		b1.j=20;
		System.out.println(b1.i+" "+b1.j+" "+b1.k);		
		
		B b2=new B();
		int i=300;
		int j=400;
		int k=500;
		System.out.println(b2.i+" "+j+" "+b2.k);
		
		B b3=new B();
		b3.i=b2.i;
		b3.j=700;
		System.out.println(b3.i+" "+j+" "+k);
		
		return b3;
	}
	public static void main(String[] args) {
		B b5=new B();
		System.out.println(b5.i+" "+b5.j+" "+b5.k);
		B b6=b5.m2();
		System.out.println(b6.i+" "+b6.j+" "+b6.k);
	}

}
