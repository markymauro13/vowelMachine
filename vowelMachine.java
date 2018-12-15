// Author: Mark Mauro
// Instagram: @markymauro

import java.util.Scanner;

public class vowelMachine {
	
	static int i, c;
	public static int vowelCount(String sentence)
	{
		 for(i = 0, c = 0; i <sentence.length(); i++)
	        {
	            char vowel = sentence.charAt(i);
	            
	            if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
	            {
	            	c++;
	            }
	        }
	        return c ;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);	// putting the scanner class into the main 
		
		System.out.print("Type in a sentence: ");
		
		String sentence = scanner.nextLine();
		
		/*
		int count = 0;
		int countA = 0;	// count of vowels in a sentence
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		*/
		
		System.out.println("You said: " + sentence);	// the given statement
		
		System.out.println("-----------------------"); // skip line
		
		System.out.println("Location of vowel a: " + sentence.indexOf('a'));	// finding location of all the vowels: a, e, i, o, u
		System.out.println("Location of vowel e: " + sentence.indexOf('e'));	// returns -1 if the vowel is not their
		System.out.println("Location of vowel i: " + sentence.indexOf('i'));
		System.out.println("Location of vowel o: " + sentence.indexOf('o'));
		System.out.println("Location of vowel u: " + sentence.indexOf('u'));

		System.out.println("-----------------------"); // skip line
		
        
		System.out.println(vowelMachine.vowelCount(sentence));
        /*
        
		if(sentence.indexOf('a') >= 0)	// use the >= 0 because the statement will return false if their is no vowel of the specified type
		{
			countA++;
			
		}
		else if (sentence.indexOf('e') >= 0)
		{
			countE++;
		}
		else if (sentence.indexOf('i') >= 0)
		{
			countI++;
		}
		else if (sentence.indexOf('o') >= 0)
		{
			countO++;
		}
		else if ( sentence.indexOf('u') >= 0)
		{
			countU++;
		}
		System.out.println(countA + countE + countI + countO + countU);
*/
        }
	
	

}
