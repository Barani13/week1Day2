package mavenproject;

public class CharOccurance {
	
		
		public static void main(String[] args) {
			// Check number of occurrences of a char (eg 'e') in a String
			
				String str = "welcome to chennai";

				// declare and initialize a variable count to store the number of occurrences
				
				// convert the string into char array
					
				//get the length of the array
					
				// traverse from 0 till the array length 
					
					// Check the char array has the particular char in it 
				
					// if is has increment the count
						 
					
					// print the count out of the loop
				int count=0;
				char[] arr=str.toCharArray();
				int length=str.length();
				for(int i=0;i<length; i++) {
					if(arr[i]=='e') {	
						count++;

					}
					
				}
				System.out.println("The Char e is Repated"+" "+count+" "+"times");
						
		}

	}

