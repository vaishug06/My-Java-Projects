package com.typecasting;

public class Q extends P{
int j=300;
	
	public void m2() {
		System.out.println("m2 method of class Q");
	}
	@Override
		public P m1() {
			// TODO Auto-generated method stub
			//return super.m1();
			
			Q q=new Q();
			System.out.println("overrided method");
			return q;
		}

}
