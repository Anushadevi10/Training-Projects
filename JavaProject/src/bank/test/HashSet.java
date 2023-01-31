package bank.test;


public class HashSet {
	
//Index will not work in Hashset, get the elements randomly
//print only unique values, duplicate values will be ignored
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> myNames = new HashSet<String>();
		myNames.add("Anusha");
		myNames.add("Aparna");
		myNames.add("Ashwathi");
		myNames.add("Bhavya");
		myNames.add("Santhosh");
		myNames.add("Harini");
		System.out.println(myNames);
		
		myNames.add("Jaya");
		System.out.println(myNames);
		
		myNames.add("Neha");
		System.out.println(myNames);
		
		myNames.remove("Aparna");
		System.out.println(myNames);
		//Get Size of set
		System.out.println(myNames.size());
		//Contains
		System.out.println(myNames.contains("Anu"));
		
		for (String i : myNames);
		{
			System.out.println(i);
		}
	}

}
