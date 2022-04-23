package generatePass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAlice {

	AlicePasswords password = new AlicePasswords();
	
	
	//TEST THE LINE VALUE, TEST THE METHOD GETTING THE LINE FROM THE RIGHT RANDOM PAGE AND PARAGRAPH
	//it will test if the line is really coming from the random page, paragraph and line
	@Test
	public void randomLine() {
		

		//TEST LINE VALUE
		//this is the method from my class, it gets a random line from the book 
		password.randomNumbers();
		String lineFromClass = password.randomLine();
		
		//we get a line from the book using the
		//same page, paragraph and line number that my randomLine() method
		int pageNumber = password.getPageNumber();//get the page random number
		int paragraphs = password.getParagraphs();//get the paragraph random number
		int lineNumber = password.getLine();//the the line random number

		String lineFromPage = password.book[pageNumber][paragraphs][0]; //stores the paragraph from the random page in line variable
        String[] allLines = lineFromPage.split("\n"); //it will store one line in each array element
        lineFromPage = allLines[lineNumber];
        
        
        	
		assertEquals(lineFromPage, lineFromClass);
		
	}
	
	
	//TEST WORD VALUE, TEST THE METHOD GETTING THE WORD FROM THE RIGHT RANDOM PAGE, RANDOM PARAGRAPH AND RANDOM LINE
	//it will if the word is actually coming from my random page, paragraph and line. It wil see if we are really getting the right word value from the book
	@Test
	public void randomWords() {
		
		//here we use my method in the class
		password.randomNumbers();
		String randLine = password.randomLine();
		String wordFromClass = password.randomWord();
		
		//here we call the same values that the method is using to verify if is it really getting the right result
		int pageNumber = password.getPageNumber();
		int paragraphs = password.getParagraphs();
		int lineNumber = password.getLine();
		
		String[] words = password.randomLine().split(" ");

        int wordPosition = password.getWordPosition();
        
        String wordFromPage = words[wordPosition];

       
        assertEquals(wordFromClass, wordFromPage);
		
		
	}
	
	
	//TEST MY METHOD THAT TAKES CARE TO SEE IF WE HAVE THE RIGHT LENGTH of the selected random word(password)
	@Test 
	public void rightLength() {
		
		boolean length = false;
		
		password.randomNumbers();//initiate random numbers
		password.randomLine();////initiate random line	
		String pass = password.setFinalPassword();//initiate the process of selection the final passoword, this method will select the right word from all the random words
		boolean lengthFromClass = password.getLength();//now the boolean length variable in my class should be true, since we have selected the right word
		
		
		  //CHECK LENGTH of the same random word my class is also checking the length
        if (pass.length() > 7 && pass.length() < 16 && !pass.equalsIgnoreCase("")) {// between 8 and 15 characters           
            length = true;
        }
        
        assertEquals(lengthFromClass, length);
        
	}
	
	
	
	//CHECK IF MY METHOD IS ACTUALLY CHECKING THE UPPERCASE RIGHT
	@Test
	public void rightUpperCase() {
		password.randomNumbers();//initiate random numbers
		password.randomLine();////initiate random line	
		String pass = password.setFinalPassword();//initiate the process of selecting the final passoword word, this method will select the right word from all the random words
		boolean upperFromClass = password.getUpperCase();//now the boolean uppercase variable in my class should be true, since we have selected the right word
		
		
		boolean checkUpper = false;
		
		//NOW WE CHECK IF THE SELECTED WORD HAS AN UPPERCASE, MY CLASS SAY YES SO WE WILL CHECK HERE
		for (int i = 0; i < pass.length(); i++) {//we check every character of the word

			if (pass.charAt(i) == pass.toUpperCase().charAt(i)) { //one uppercase character, problem is when i have a " or any special character

				//this makes sure the character is a letter, because we can still have special characters
				if (i == pass.length() - 1) {//if we are at the before last character of the word
					if (pass.substring(i).matches(".*[A-za-z]+.*")) {
						checkUpper = true;
						break;                 
					}
				}

				else {
					if (pass.substring(i, i + 1).matches(".*[A-za-z]+.*")) {
						checkUpper = true;
						break;//this will get us out of this for loop and continue below with the next code
					}
				}

			}
		}

		assertEquals(upperFromClass, checkUpper);
	}
	
	
	
	//CHECK IF MY CLASS METHOD IS PERFORMING WELL IN CHECKING FOR A LOWER CASE
	@Test
	public void rightLowerCase() {
		
		password.randomNumbers();//initiate random numbers
		password.randomLine();//initiate random line	
		String pass = password.setFinalPassword();//initiate the process of selecting the final password word, this method will select the right word from all the random words
		boolean lowerFromClass = password.getLowerCase();//now the boolean LOWER variable in my class should be true, since we have selected the right word
		
		
		//now we check the password my class is retrieving, to make sure it has a lowecase like my class is saying it has.
		boolean checkLower = false;
		
		  for (int j = 0; j < pass.length(); j++) {//check for lower case
              if (pass.charAt(j) == pass.toLowerCase().charAt(j)) {//one lower case, problem is when i have a " or any special character


                  //this makes sure the character is a letter, because we can still have special characters
                  if (j == pass.length() - 1) {//if we are at the before last character of the word
                      if (pass.substring(j).matches(".*[A-za-z]+.*")) {
                    	  checkLower = true;
                          break;
                      }
                      

                  } else {
                      if (pass.substring(j, j + 1).matches(".*[A-za-z]+.*")) {
                    	  checkLower = true;
                          break;//this will get us out of the for loop an continue below with the next code
                      }
                     

                  }
              }
          }
		  assertEquals(lowerFromClass, checkLower);		
	}
	
	
	//CHECK IF THE SELECTED PASSOWORD ACTUALLY HAS A SPECIAL CHARACTER AND IF MY METHOD IN MY CLASS IS CHECKING THIS RIGHT
	@Test
	public void rightSpecialChar() {
		
		password.randomNumbers();//initiate random numbers
		password.randomLine();//initiate random line	
		String pass = password.setFinalPassword();//initiate the process of selecting the final password, this method will select the right word from all the random words
		boolean specialFromClass = password.getSpecialChar();//now the boolean specialChar variable in my class should be true, since we have selected the right word
		
		
		boolean checkSpecialChar = false;
		for (int z = 0; z < pass.length(); z++) {//check for special characters
            if (z == pass.length() - 1) {//if we are at the last character of the word
                if (pass.substring(z).matches("[\"!,;:@#$%&*()_+=|<>?{}\\[\\]~-]+") &&  !pass.equalsIgnoreCase("")) {
                	checkSpecialChar = true;
                }
                
            }
            else {//if we are at not the last character of the word
                if (pass.substring(z, z + 1).matches("[\"!,;:@#$%&*()_+=|<>?{}\\[\\]~-]+") && !pass.equalsIgnoreCase("")) {
                	checkSpecialChar = true;	
                }

            }
        }
		assertEquals(specialFromClass, checkSpecialChar);	
		
	}
	
	
	
}


