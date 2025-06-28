package com.test;

public class StringTestMain {

	public static void main(String[] args) {

		String s = "Hi welcome to String session";
		System.out.println(s);

		String s1 = new String("LMN");// new -- heap
		System.out.println(s1);

		System.out.println(s.length());

		String upperString = s.toUpperCase();
		System.out.println("String in Upper Case: " + upperString);
		System.out.println("String in Lower Case: " + s.toLowerCase());

		// equals --
		int a = 10, b = 20;
		if (a == b) {
			System.out.println("a & b are same--");
		}

		String oldclgName = "MIT";

		String newClgName = "Mit";
		String s2 = newClgName.toUpperCase();// MIT //
		System.out.println("s2: " + s2);
		if (oldclgName.equals(newClgName)) {
			System.out.println("both string are same");
		} else {
			System.out.println("not same---");
		}

		if (oldclgName.equalsIgnoreCase(newClgName)) {
			System.out.println("both string are same");
		} else {
			System.out.println("not same---");
		}

		
		char ch = oldclgName.charAt(0);
		System.out.println(ch);

		char ch1 = oldclgName.charAt(1);
		System.out.println(ch1);

		char[] arrayChar = oldclgName.toCharArray();
		

		for (char c : arrayChar) {
			System.out.println(c);
		}

		
		String uName = " abc123 ";
		uName = uName.trim();
		if (uName.equals("abc123"))
			System.out.println("SuccessFull Login---");
		else {
			System.out.println("Invalid User name");
		}

		String s5 = "Hi to welcome to String split to method";
		String s6 = s5.substring(5); 
		System.out.println(s6);
		System.out.println(s5.substring(3, 10));

		
		System.out.println("By Using split method---");
		String[] array1 = s5.split("to");
		for (String string : array1) {
			System.out.println(string);
		}
		System.out.println(array1.length);//
		System.out.println(s5.length());
		System.out.println("Space:" + s5.charAt(2));

		

		System.out.println(s5.startsWith("Hi"));
		
		System.out.println(s5.endsWith("e"));
		String s7="Hi_ to_ welcome _to_ String _split _to _method";
		String[] array2=s7.split("_", 8);
		for(String i: array2) {
			System.out.println(i);
		}
		
		
	}

}