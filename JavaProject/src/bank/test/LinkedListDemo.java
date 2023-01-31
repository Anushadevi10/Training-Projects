package bank.test;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] List = new String[5];
		List[0] = "Hundai";
		List[1] = "Benz";
		List[2]= "Ford";
		List[3]= "Toyota";
		List[4]= "Audi";
	/*	
		List[5]= "A";
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		at bank.test.LinkedListDemo.main(LinkedListDemo.java:13)
		*/
		
		for (String i : List)
		{
			System.out.println(i);
		}
	}

}
