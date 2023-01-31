package bank.test;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array- collection of elements with similar data type
	int[] marks;
	marks = new int [4];
	
	/*
	marks[0] = 10;
	marks[1] = 20;
	marks[2] = 30;
	marks[3] = 40;
	*/
	
	Scanner s1 = new Scanner(System.in);
	
	for(int j=0; j<marks.length; j++)
	{
		System.out.println("Enter the value of "+ j + " element");
		marks[j] = s1.nextInt();
				
	}
	
	for(int i =0; i<marks.length; i++)
	{
		
		System.out.println("Value of element " + i + " is: "+ marks[i]);
		
	}

	
	//MD Array
	
	int [] [] numbers = {{10,20,30,40}, 
						 {50,60,70,80,90},
						 {100,110,120}};
	
	System.out.println(numbers.length);
	for(int k=0; k<numbers.length ; k++)
		{
			System.out.println("value of k" + k);
			for(int l = 0; l<numbers[k].length; l++)
			{
				System.out.println("value of l" + l);
				System.out.println("Array value is :" + numbers[k][l]);
				
			}
}
}
}