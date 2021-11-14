package week3Code;

public class CodingProjectWeek3 {

	public static void main(String[] args) {
	
		//1. 	Create an array of int called ages that contains the following 
//				values: 3,9,23,64,2,8,28,93.
				
				int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				
		//a.	Programmatically subtract the value of the first element in the 
//				array from the value in the last element of the array 
//				(i.e. do not use ages[7] in your code). Print the result to the console.
				
				int answer = ages[ages.length - 1] - ages [0];
				System.out.println("First element subtracted from last element = " + answer);
						
		//b.	Add a new age to your array and repeat the step above to ensure it is 
//				dynamic (works for arrays of different lengths).
				
				int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 107};
				
				int answer2 = ages2[ages2.length - 1] - ages [0];
				System.out.println("First element subtracted from last element in second array = " + answer2);
				
		//c.	Use a loop to iterate through the array and calculate the average age.
//				Print the result to the console.
				
				int sum1 = 0;
				for (int age : ages2) {
					sum1 += age;
				}System.out.println("The average age in this array = " + sum1 / ages2.length);
				
		//2.	Create an array of String called names that contains the following values: 
//				“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				
				String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck","Bob"};
				
		//a.	Use a loop to iterate through the array and calculate the average number 
//				of letters per name. Print the result to the console.
				
				int sum2 = 0; 
				int average = 0;
				for (String name : names) {
					average = (sum2 += name.length()) / names.length;
					}System.out.println("The total number of letters in this array is: " + sum2);
					System.out.println("The average number of letters per name in this array = " + average);
					
		//b.	Use a loop to iterate through the array again and concatenate all the 
//				names together, separated by spaces, and print the result to the console.
					String result = "";
					for (String name : names){
						result += name + " ";
						}
					System.out.println("The names in this array are: " + result + " ");
					
		//3.	How do you access the last element of any array?
					
//		 			To access the last element of an array, you can use the method .length and subtract 1 or 
//					you can take the second to last element number in the array and + 1. 
					
		//4.	How do you access the first element of any array?
					
//					To access the first element of any array, you can type the name of the array and enter 
//					0 inside the square brackets. For example, array[0].

		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length 
//		 		of each name to the nameLengths array.
					
					int[] nameLengths = new int[names.length];
					
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] += names[i].length();
					}
					for(String name :names) {
						System.out.println(name + " ");
					}
					for (int len : nameLengths) {
						System.out.println(len);
					}
			
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
//				Print the result to the console	
			
			int nameLengthsSum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				nameLengthsSum += nameLengths[i]; 
			}System.out.println(nameLengthsSum);
			
			
//				Method test for question #7:
			
			System.out.println(repeatWord("Hello", 3));
			
//				Method test for question #8:
			
			
			System.out.println(makeFullName("Bob", "Smith"));
			
//				Method test for question #9:
			
			int[] anArray = {1,3,4,6,7,8,9,10};
			System.out.println(isArrayLongerThanNumber(anArray));
			
//				Method test for question #10:
			
			double[] doubleArray = {1.1, 2.2, 2.30, 50.25};
			System.out.println(getAverage(doubleArray));
			
//				Method test for question #11:
			double[] one = {1.1,2.1,3.5,4.6,5.8};
			double[] two = {6.3,7.5,8.2,9.8,10.5};
			
			System.out.println("The average of array 1 is greater than the average of array two: " + twoArrays(one,two));
			
//				Method test for question #12:
			
			boolean isHotOutSide = true;
			double moneyInPocket = 100.00;
			System.out.println(willBuyDrink(true, 100.00));
			

//				Method test for question #13:
			
			myMethod(null);
					
			}
			
//			7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
//				itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).	
			
			
			public static String repeatWord(String string, int n) {
				return "Repeating Word: " + string.repeat(n);
			}
			
//			8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the 
//				first and the last name as a String separated by a space).
			
			
				public static String makeFullName(String firstname, String lastname) {
					return ("Full Name is: " + firstname + " " + lastname);
				}
				
//			9.	Write a method that takes an array of int and returns true if 
//				the sum of all the ints in the array is greater than 100.
				
				public static boolean isArrayLongerThanNumber(int[] array) {
					int arraySum = 0;
					for (int i = 0; i < array.length; i++) {
						arraySum += array.length; 
						if (arraySum > 100) { 
							return true;
						}
					}
					return false;
				}
				
		//10.	Write a method that takes an array of double and returns the 
//				average of all the elements in the array.
					
			public static double getAverage(double[] array) {
				double sum = 0;
				for (double number : array) {
					sum += number;
				}return sum / array.length;
			}
				
					

//			11.	Write a method that takes two arrays of double and returns true 
//				if the average of the elements in the first array is greater than the 
//				average of the elements in the second array.
				
			public static boolean twoArrays(double[] array1, double[] array2) {
				double array1Sum = 0.0;
				for (double num : array1) {
					array1Sum += num / array1.length;
				}
				
				double array2Sum = 0.0;
				for (double num : array2) {
					array2Sum += num / array2.length;
				}
				
				if (array1Sum > array2Sum){
					return true;
				}
				return false;
				}
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
//				and a double moneyInPocket, and returns true if it is hot outside and if 
//				moneyInPocket is greater than 10.50.
					
					public static boolean willBuyDrink(boolean x, double y) {
						if( x = true && y > 10.50) {
							return true;
						}else {
							return false;
						}
					}

			
		//13.	Create a method of your own that solves a problem. In comments, write 
//				what the method does and why you created it.
		 
			 //This is a method that when called, prints out text.
			 //I created it to express that I am having some trouble with this assignment.
					
					static String myMethod(String string) {
						System.out.println("I think I need some more help on methods and arrays...");
						return string;
					}
			
			
			


				
				
				
				

			
			
				

				
		}




	


