package com.ExceptionHandling;

public class TryCatchEg {

	public static void main(String[] args) {
		String str[]= {null, "abc", "pqr", null, null};
		for (int i = 0; i < str.length+1; i++) {
			try {
				String s=str[i].toLowerCase()+Integer.parseInt(str[i]);
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("NullPointerException handled"+e);
				
			}catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("NumberFormatException"+e);
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("ArrayIndexOutOfBoundsException"+e);
			}
		}
	}
}
