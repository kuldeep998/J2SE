package com.j2se.variable;

public class VariableExample {

	static String name = "kuldeep"; // class variable

	String s = "kp"; // instance variable

	static {
		System.out.println(" I am invoke");
	}

	public static void main(String args[]) {

		String s = "kuldeep"; // local variable

		System.out.println(s + " & " + s.hashCode());
		// System.out.println(s);

		s = s + " Argal";
		System.out.println(s + " & " + s.hashCode());

		final String middleName = "Singh";
		System.out.println(middleName);
		
		//The final local variable middleName cannot be assigned. It must be blank and not using a compound assignment
		//middleName = "kuldeep  " + middleName;
		System.out.println(middleName);

	}

}
