package Week4;

import java.util.Arrays;

public class AgeArrayProject {
	public static void main(String[] args) {
		int[]ages = {3,9,23,64,2,8,28,93};
		int resultAge = ages[ages.length - 1] - ages[0];
		// establishes array for integer defined as age, line 6 preforms operation to subtract first array index
		//from last index in array age and sets it equal to a new integer defiend as resultAge
		System.out.println("Subtraction Result" + resultAge);
		
		int[] age2 = {3,9,23,64,2,8,28,93,45};
		int newAgeResult = age2[age2.length - 1] - age2[0];
		//This establishes a new array and adds a extra element to the array, next line preforms same action as first array operation
		
		int sum = 0;
		//Starting value for sum array
		
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
	 System.out.println(sum);
}    // This is averaging the sum of both arrays and itterating through them to print the sum of those arrays to the console 
		
		
		public static void main1 (String[] args) {
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			//This establishes the array as a String data type
			int totalLetters = 0;
			//This sets the loop iteration to start at 0
			int totalNames = names.length;
			//This sets the total number of names equal to the length of the String array names
			for (String name : names) {
				totalNames+=name.length();
			} //This is a enhanced for loop, taking the name variable and using elements from the names array
			int averageLetters = totalLetters / totalNames;
			//This is the computation for average letters per name
			System.out.println("Average letters per name" + averageLetters);
			
			int[] namesLength = new int[names.length];
			for (int i = 0; i < names.length - 1; i++) {
				nameLengths[i] = names[i].length();
				totalLetters += name.lengths[i];
			}
			for (int length : namelen;gths) {
				System.out.println(length + "");
				sumOfNameLengths += lengths;
			} System.out.println("/nsumOfNameLengths" + sumOfNameLength);
		
		}
}//This is the concatenation for average letters per name

	
				
			
				
			
	

	
			
		


//We access the last index of an array by accessing the length of the array - 1, this is the last element of the array
//We access the first index of an array by stating the name of the array and using an index value of 0

	
