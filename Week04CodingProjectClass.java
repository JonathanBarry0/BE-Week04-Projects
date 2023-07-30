package Week04CodingProjectPackage;

public class Week04CodingProjectClass {

	public static void main(String[] args) {
		
		// Problem number one
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// Part A.
		// Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		// (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println("Problem number one, part A: " + (ages[ages.length - 1] - ages[0]));
		// Part B.
		// Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic 
		// (works for arrays of different lengths).
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 103};
		System.out.println("Problem number one, part B: " + (ages2[ages2.length - 1] - ages2[0]));
		// Part C.
		// Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int age : ages2) {
			sum += age;
		}
		System.out.println("Problem number one, part C: " + (sum / ages2.length));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number two
		// Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// Part A.
		// Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double sum2 = 0;
		for (String name : names) {
			sum2 += name.length();
		}
		System.out.println("Problem number two, part A: " + sum2 / names.length);
		// Part B.
		// Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and 
		// print the result to the console.
		String nameSum = "";
		for (String name : names) {
			nameSum += (name + " ");
		}
		System.out.println("Problem number two, part B: " + nameSum);
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number three
		// How do you access the last element of any array?
		System.out.println("Problem number three: " + "To access the last element in an array, use 'exampleArray[exampleArray.length -1]'");
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number four
		// How do you access the first element of any array?
		System.out.println("Problem number four: " + "To access the first element in an array, use 'exampleArray[0]'");
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number five
		// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
		// the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		// Problem number six
		// Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		// Print the result to the console.
		int pbm6Sum = 0;
		for (int nameLength : nameLengths) {
			pbm6Sum += nameLength;
		}
		System.out.println("Problem number six: " + pbm6Sum);
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number seven
		// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
		// itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("Problem number seven: " + multiplyWord("Hello", 3));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number eight
		// Write a method that takes two Strings, firstName and lastName, and returns a full name 
		// (the full name should be the first and the last name as a String separated by a space).
		System.out.println("Problem number eight: " + makeFName("Jonathan", "Barry"));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number nine
		// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("Problem number nine: " + isSum100(ages));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number 10
		// Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] nums = {3, 9, 23, 64, 2, 8, 28, 93, 103};
		System.out.println("Problem number 10: " + averageOfArray(nums));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number 11
		// Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
		// is greater than the average of the elements in the second array.
		double[] nums2 = {3, 9, 23, 64, 2, 8, 28, 93, 1203};
		System.out.println("Problem number 11: " + compareArrayAverage(nums2, nums));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number 12
		// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
		// if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHot = true;
		double money = 1.50;
		System.out.println("Problem number 12: " + willBuyDrink(isHot, money));
		System.out.println("---------------------------------------------------------------------");
		
		
		// Problem number 13
		// Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		boolean isFreezing = false;
		boolean didSnow = false;
		System.out.println("Problem number 13: " + saltTheRoad(isFreezing, didSnow));
		System.out.println("---------------------------------------------------------------------");

	}
	// Problem 13 method
	// This method uses an if conditional to return a string if two boolean values are true.
	public static String saltTheRoad(boolean isFreezingOutside, boolean didItSnow) {
		if (isFreezingOutside == true && didItSnow == true) {
			return "Yes, they should salt the road.";
		} else {
			return "No, they don't need to salt the road.";
		}
	}
	
	
	// Problem 12 method
	// This method uses an if conditional to return a boolean if a boolean equals true and if a double is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Problem 11 method
	// This method uses two for loops to add every element in two arrays of double to two sum integers,
	// and an if conditional to compare the averages of two arrays of double. The conditional will return true if the first array average
	// is more than the second array average.
	public static boolean compareArrayAverage(double[] x, double[] y) {
		double sum1 = 0;
		double sum2 = 0;
		for (double dbl1 : x) {
			sum1 += dbl1;
		}
		for (double dbl2 : y) {
			sum2 += dbl2;
		}
		if ((sum1 / x.length) > (sum2 / y.length)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Problem 10 method
	// This method uses a for loop to add every element in an array of double together; then it will return the average.
	public static double averageOfArray(double[] x) {
		double sum = 0;
		for (double dbl : x) {
			sum += dbl;
		}
		return sum / x.length;
	}
	
	
	// Problem nine method
	// This method uses a for loop to add every element in an array of int together, and an if conditional to return true if the sum is
	// greater than 100.
	public static boolean isSum100(int[] x) {
		int sum = 0;
		for (int element : x) {
			sum += element;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Problem eight method
	// This method takes two strings, first and last name, and concatenates them together to form a string, full name, separated
	// by a space.
	public static String makeFName(String firstName, String lastName) {
		String fullName = "";
		fullName += firstName + " " + lastName;
		return fullName;
	}
	
	
	// Problem seven method
	// This method uses a for loop to multiply a string by an integer; this method returns the multiplied string.
	public static String multiplyWord(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}

}
