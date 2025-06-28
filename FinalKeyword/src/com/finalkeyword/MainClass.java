package com.finalkeyword;

public class MainClass //extends FinalKeywordExample1
{
	/*
	 * public void m1() {
	 *  System.out.println("Overrided method"); }
	 */
	
	public static void main(String[] args) {
		FinalKeywordExample1 fe=new FinalKeywordExample1();
		//fe.id=574;
		//fe.name="Pqr";
		System.out.println(fe.id+" "+fe.name);
		MainClass m=new MainClass();
		fe.m1();
	}

}
