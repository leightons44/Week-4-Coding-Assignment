package Week4;

import java.util.Arrays;

public class AgeArrayProject {
	public static void main(String[] args) {
		int[]ages = {3,9,23,64,2,8,28,93};
		int resultAge = ages[ages.length - 1] - ages[0];
		
		System.out.println("Subtraction Result" + resultAge);
		
		int[] age2 = {3,9,23,64,2,8,28,93,45};
		int newAgeResult = age2[age2.length - 1] - age2[0];
		
		
		int sum = 0;
		
		
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
	 System.out.println(sum);
}    // This is averaging the sum of both arrays and itterating through them to print the sum of those arrays to the console 
	// establishes array for integer defined as age, line 6 preforms operation to subtract first array index
			//from last index in array age and sets it equal to a new integer defined as resultAge
	//Starting value for sum array
	//This establishes a new array and adds a extra element to the array, next line preforms same action as first array operation
	//This establishes a new array and adds a extra element to the array, next line preforms same action as first array operation
		
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			//This establishes the array as a String data type
			int totalLetters = 0; {
			//This sets the total number of names equal to the length of the String array names
			for (String name : names) {
				totalLetters += name.length();
			} //This is a enhanced for loop, taking the name variable and using elements from the names array
			int averageLetters = totalLetters/names.length;
			//This is the computation for average letters per name
			System.out.println("Average letters per name" + averageLetters);
			
		StringBuilder SB = new StringBuilder();
			String space = "";
			for (String name : names) {
				SB.append(name);
				SB.append(space);
				} String concatNames = SB.toString(); 
				System.out.println(concatNames);
			int[] nameLength = new int[names.length];
			for (int i = 0; i < names.length; i++) {
			nameLength[i] += names[i].length();
			System.out.println(Arrays.toString(nameLength));
				
			int sumOfNameLengths = 0;
			for (int length : nameLength) {
				System.out.println(length + "");
				sumOfNameLengths += length;
			} System.out.println("/nsumOfNameLengths" + sumOfNameLengths);
		
		}
}
}

	
				
			
				
			
	

	
			
		

	
