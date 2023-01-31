package bank.test;

public class StringDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		String b = Integer.toString(a); //converting integer to Wrap class
		String c = "Welcome";
		String d = " This is the First Session on Strings";
		String e = c + d;
		//Escape char is backslash \
		String text = "Thor and Loki are \"Norse\" gods";
		// - \t is for tab space
		String text1 = "Thor and Loki are \tNorse\t gods";
		//Carrage returs - in new line [Like Enter Key]
		String text2 = "Thor and Loki are \rNorse\r gods";
		
		
		String greeting = "Welcome Everyone";
		System.out.println(greeting.length());
		System.out.println(greeting.charAt(5));
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.toLowerCase());
		
		// Compare two strings and returns boolean values
		//System.out.println(greeting.equalsIgnoreCase("Hello"));
		System.out.println(greeting.equalsIgnoreCase(c));
		// String is not Primitive datatype , It's a class 
		System.out.println("Concat two strings: "+greeting + "  " +d); //Concat 
		System.out.println(greeting.concat(d));//Concat single variable
		System.out.println(e);
		System.out.println(text);
		System.out.println(text2);
		
	}
}
