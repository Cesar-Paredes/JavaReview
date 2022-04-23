package generatePass;

import java.util.Random;

public class AlicePasswords {

    Random random = new Random();
    //these are our random numbers:
    private int pageNumber = 0;
    private int paragraphs = 0;
    private int lineNumber = 0;
    private int wordPosition = 0;


    //random line from the selected random page and random paragraph
    private String line;

    private String pass = "";

    //variables showing why didnt work
    private int newLine=0;
    private int singleChar=0;
    private int sameWord=0;
    private int lengthProblem=0;
    private int noUpperCase=0;
    private int noLowerCase = 0;
    private int noSpecialChar = 0;
    
    //CHECK THE PASSWORD HAS THE RIGHT REQUIEREMENTS
    private boolean uppercase = false;
    private boolean length = false;
    private boolean lowercase = false;
    private boolean specialChar = false;


    //the section would be the page, the rows would be the paragraphs in each page,
    //and the columns are the lines in each paragraph
    final String[][][] book = {
            //section 1 or page 1
            {
                    //rows or paragraphs
                    //row 1
                    {"Alice was beginning to get very tired of sitting by her sister on the\r\n"
                            + "bank, and of having nothing to do. Once or twice she had peeped into the\r\n"
                            + "book her sister was reading, but it had no pictures or conversations in\r\n"
                            + "it, \"and what is the use of a book,\" thought Alice, \"without pictures or\r\n"
                            + "conversations?\""},

                    //row 2
                    {"So she was considering in her own mind (as well as she could, for the\r\n"
                            + "day made her feel very sleepy and stupid), whether the pleasure of\r\n"
                            + "making a daisy-chain would be worth the trouble of getting up and\r\n"
                            + "picking the daisies, when suddenly a White Rabbit with pink eyes ran\r\n"
                            + "close by her." + "\n"},

                    //row 3
                    {"There was nothing so very remarkable in that, nor did Alice think it so\r\n"
                            + "very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\r\n"
                            + "dear! I shall be too late!\" But when the Rabbit actually took a watch\r\n"
                            + "out of its waistcoat-pocket and looked at it and then hurried on, Alice\r\n"
                            + "started to her feet, for it flashed across her mind that she had never\r\n"
                            + "before seen a rabbit with either a waistcoat-pocket, or a watch to take\r\n"
                            + "out of it, and, burning with curiosity, she ran across the field after\r\n"
                            + "it and was just in time to see it pop down a large rabbit-hole, under\r\n"
                            + "the hedge. In another moment, down went Alice after it!\r\n"
                            + "\n"
                    },

            },


            //section 2
            {
                    {"What a curious feeling! said Alice. I must be shutting up like a" + "\n" +
                            "telescope!"},

                    {"And so it was indeed! She was now only ten inches high, and her face\r\n"
                            + "brightened up at the thought that she was now the right size for going\r\n"
                            + "through the little door into that lovely garden."},

                    {"After awhile, finding that nothing more happened, she decided on going\r\n"
                            + "into the garden at once; but, alas for poor Alice! When she got to the\r\n"
                            + "door, she found she had forgotten the little golden key, and when she\r\n"
                            + "went back to the table for it, she found she could not possibly reach\r\n"
                            + "it: she could see it quite plainly through the glass and she tried her\r\n"
                            + "best to climb up one of the legs of the table, but it was too slippery,\r\n"
                            + "and when she had tired herself out with trying, the poor little thing\r\n"
                            + "sat down and cried." + "\n"},

                    {"\"Come, there's no use in crying like that!\" said Alice to herself rather\r\n"
                            + "sharply. \"I advise you to leave off this minute!\" She generally gave\r\n"
                            + "herself very good advice (though she very seldom followed it), and\r\n"
                            + "sometimes she scolded herself so severely as to bring tears into her\r\n"
                            + "eyes." + "\n"},

                    {"Soon her eye fell on a little glass box that was lying under the table:\r\n"
                            + "she opened it and found in it a very small cake, on which the words \"EAT\r\n"
                            + "ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\r\n"
                            + "Alice, \"and if it makes me grow larger, I can reach the key; and if it\r\n"
                            + "makes me grow smaller, I can creep under the door: so either way I'll\r\n"
                            + "get into the garden, and I don't care which happens!\"\r\n"
                            + "\n"},

                    {"She ate a little bit and said anxiously to herself, \"Which way? Which\r\n"
                            + "way?\" holding her hand on the top of her head to feel which way she was\r\n"
                            + "growing; and she was quite surprised to find that she remained the same\r\n"
                            + "size. So she set to work and very soon finished off the cake." + "\n"},

            },

            //section 3
            {
                    //row 0
                    {"The King and Queen of Hearts were seated on their throne when they\r\n"
                            + "arrived, with a great crowd assembled about them--all sorts of little\r\n"
                            + "birds and beasts, as well as the whole pack of cards: the Knave was\r\n"
                            + "standing before them, in chains, with a soldier on each side to guard\r\n"
                            + "him; and near the King was the White Rabbit, with a trumpet in one hand\r\n"
                            + "and a scroll of parchment in the other. In the very middle of the court\r\n"
                            + "was a table, with a large dish of tarts upon it. \"I wish they'd get the\r\n"
                            + "trial done,\" Alice thought, \"and hand 'round the refreshments!\"" + "\n"},

                    //row 1
                    {"The judge, by the way, was the King and he wore his crown over his great\r\n"
                            + "wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\r\n"
                            + "(some were animals and some were birds) I suppose they are the jurors.\"" + "\n"},

                    //row 2
                    {"Just then the White Rabbit cried out \"Silence in the court!\"" + "\n"},

                    //row 3
                    {"\"Herald, read the accusation!\" said the King.\r\n"
                            + "\n"},
            }


    };

    
    public boolean getSpecialChar() {
    	return specialChar;
    }
    
    public boolean getUpperCase() {
    	return uppercase;
    }
    
    public boolean getLowerCase() {
    	return lowercase;
    }
    
    public boolean getLength() {
    	return length;
    }

    
    public int getPageNumber() {
        return pageNumber;
    }

    public int getParagraphs() {
        return paragraphs;
    }

    public int getLine() {
        return lineNumber;
    }

    public int getWordPosition() {
        return wordPosition;
    }

    public String[][][] getBook() {
        return book;
    }

    public int getNewLine() {
        return newLine;
    }

    public int getSingleChar() {
        return singleChar;
    }

    public int getSameWord() {
        return sameWord;
    }

    public int getLengthProblem() {
        return lengthProblem;
    }

    public int getNoUpperCase() {
        return noUpperCase;
    }

    public int getNoLowerCase() {
        return noLowerCase;
    }

    public int getNoSpecialChar() {
        return noSpecialChar;
    }


    public void PrintArray() {
        for (int z = 0; z < book.length; z++) {//sets-pages
            System.out.println("page " + (z + 1));
            for (int i = 0; i < book[z].length; i++) {//rows - paragraphs
                System.out.println("paragraph: " + (i + 1));
                for (int j = 0; j < book[z][i].length; j++) {//only one colum
                    System.out.println(book[z][i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //this will set our random variables
    //we generate random numbers for pages, paragraphs and lines
    public void randomNumbers() {

        pageNumber = random.nextInt(3);//we have 3 sections, so 3 pages, so 0 to 2

        //section 1 - page 1
        //if our random page is one, then we will set a random paragraph inside that page
        //and a random line inside that paragraph
        if (pageNumber == 0) {

            paragraphs = random.nextInt(3);//this page has 3 paragraphs, rows, 0 to 2

            if (paragraphs == 0)
                lineNumber = random.nextInt(5);//5 lines

            else if (paragraphs == 1)
                lineNumber = random.nextInt(5);//5 lines

            else if (paragraphs == 2)
                lineNumber = random.nextInt(9);//9 lines
        }


        //section 2 - page 2
        else if (pageNumber == 1) {

            paragraphs = random.nextInt(6);//6 paragraphs, rows. So 0 to 5

            if (paragraphs == 0)
                lineNumber = random.nextInt(2);

            else if (paragraphs == 1)
                lineNumber = random.nextInt(3);

            else if (paragraphs == 2)
                lineNumber = random.nextInt(8);

            else if (paragraphs == 3)
                lineNumber = random.nextInt(5);

            else if (paragraphs == 4)
                lineNumber = random.nextInt(6);

            else if (paragraphs == 5)
                lineNumber = random.nextInt(4);
        }


        //section 3
        else if (pageNumber == 2) {

            paragraphs = random.nextInt(4); //4 paragraphs, rows

            if (paragraphs == 0)
                lineNumber = random.nextInt(8);

            else if (paragraphs == 1)
                lineNumber = random.nextInt(3);

            else if (paragraphs == 2)
                lineNumber = random.nextInt(1);

            else if (paragraphs == 3)
                lineNumber = random.nextInt(1);

        }
    }


    //this method will select the page, paragraph and line in the array, that we got from the random numbers
    public String randomLine() {


        line = book[pageNumber][paragraphs][0]; //stores the paragraph from the random page in line variable
        String[] allLines = line.split("\n"); //it will store one line in each array
        line = allLines[lineNumber];//this will store the choosen line of the paragraph into the line variable

        return line;

    }

    //generate a random word and makes sure the word is at least 2 characters
    public String randomWord() {

        String[] words = line.split(" ");

        wordPosition = random.nextInt(words.length);

        //this will make sure the word is not one character, like "a"
        while (words[wordPosition].length() == 1) {
        	this.singleChar++;
            wordPosition = random.nextInt(words.length);         
        }


        return words[wordPosition];//returns the chosen random word

    }


    //get 3 random words concatenate them together in one variable.
    //it will make sure each word is different from eachother
    //then make sure the final password has all requirements
    public String setFinalPassword() {
    	
    		lengthProblem =0;
            noUpperCase =0;
            noLowerCase =0;
            noSpecialChar=0;
            sameWord=0;
            newLine=0;
            singleChar=0;

    	

        boolean secure = false;
        String specialCharacters = "[\"!,;:@#$%&*()_+=|<>?{}\\[\\]~-]+";
        String letter = "[a-zA-Z]+";

        while (secure == false) {

            uppercase = false;
            length = false;
            lowercase = false;
            specialChar = false;


            pass = "";

            //get 3 random words concatenate them together in one variable.
            //it will make sure each word is different from eachother
            for (int i = 0; i < 3; i++) {

                randomNumbers();//this will set our random numbers
                randomLine();//this will return a random line from a random paragraph from a random page


                String added = randomWord();

//                System.out.println("added: "  + added);
//                System.out.println("pass: " + pass);
//                System.out.println();

                //CHECK IF SAME WORD and NEW LINE
                //if the new word "added" we are adding is not found in "pass", and its not the first loop cycle and no new line
                if (pass.indexOf(added, 0) < 0 && i > 0 && pass.indexOf("\n", 0) < 0 && pass.indexOf("\r") < 0) {
                    pass += added;//we added to the word "pass"
                    if(pass.length()==1){//makes sure the pass variable is not one character
                        pass = "";
                        singleChar++;
                    }

                }
                else if (pass.indexOf(added, 0) < 0 && i == 0 && pass.indexOf("\n", 0) < 0 && pass.indexOf("\r") < 0) {//in the first loop cycle. make sure there is no new line
                    pass += randomWord();//will store a random word from the line
                    if(pass.length()==1){//makes sure the pass variable is not one character
                        pass = "";
                        singleChar++;
                    }
                }
                else {
                    if(pass.indexOf("\n", 0) > 0 || pass.indexOf("\r") > 0 ){//if one of the reason is because it has a new line
                        newLine++;
                    }
                    i=0;//since we are going to next iteration we reduce one i. that way we still add 3 words
                    pass = "";//here is where i had a problem, because i didn't have this it was staying in a never ending loop. We need to reset the pass variable to null
                    sameWord++; //the problem is that we have the same word in the pass variable so we add 1 to sameWord.
                    continue;//we jump to the next iteration in the loop.
                }


//                System.out.println(pass);
//				System.out.println();
//
//				System.out.println("we have randomly chosen the following page, paragraph and line: ");
//				System.out.println("page: " + (getPageNumber()+1));
//				System.out.println("paragraph: " + (getParagraphs()+1));
//				System.out.println("line: " + (getLine()+1));
//				System.out.println("word: " + (getWordPosition()+1));
//
//				System.out.println("------------------------------------------------------------------");

            }


//            boolean uppercase = false;
//            boolean length = false;
//            boolean lowercase = false;
//            boolean specialChar = false;

            //CHECK LENGTH
            if (pass.length() > 7 && pass.length() < 16 && !pass.equalsIgnoreCase("")) {// between 8 and 15 characters
//                System.out.println("LENGTH");
                length = true;
            }
            else
                lengthProblem++;


            //UPPERCASE
            if (length == true) {
//                System.out.println("UPPERCASE");

                for (int i = 0; i < pass.length(); i++) {//we check every character of the word

                    if (pass.charAt(i) == pass.toUpperCase().charAt(i)) { //one uppercase character, problem is when i have a " or any special character

                        //this makes sure the character is a letter, because we can still have special characters
                        if (i == pass.length() - 1) {//if we are at the before last character of the word
                            if (pass.substring(i).matches(".*[A-za-z]+.*")) {
//                                System.out.println("Uppercase check!");
                                uppercase = true;
                                break;
                            }
                            else
                                noUpperCase++;
                        }
                        else {
                            if (pass.substring(i, i + 1).matches(".*[A-za-z]+.*")) {
//                                System.out.println("Uppercase check!");
                                uppercase = true;
                                break;//this will get us out of this for loop and continue below with the next code
                            }
                            else
                                noUpperCase++;
                        }
                    }
                }
            }


            //CHECK LOWERCASE
            if (length==true && uppercase==true) {
//                System.out.println("LOWERCASE");

                for (int j = 0; j < pass.length(); j++) {//check for lower case
                    if (pass.charAt(j) == pass.toLowerCase().charAt(j)) {//one lower case, problem is when i have a " or any special character


                        //this makes sure the character is a letter, because we can still have special characters
                        if (j == pass.length() - 1) {//if we are at the before last character of the word
                            if (pass.substring(j).matches(".*[A-za-z]+.*")) {
//                                System.out.println("lowercase check!");
                                lowercase = true;
                                break;
                            }
                            else
                                noLowerCase++;

                        } else {
                            if (pass.substring(j, j + 1).matches(".*[A-za-z]+.*")) {
//                                System.out.println("lowercase check!");
                                lowercase = true;
                                break;//this will get us out of the for loop an continue below with the next code
                            }
                            else
                                noLowerCase++;

                        }
                    }
                }
            }


            //SPECIAL CHARACTER
            if (length && uppercase && lowercase) {
//                System.out.println("especial character");

                for (int z = 0; z < pass.length(); z++) {//check for special characters
                    if (z == pass.length() - 1) {//if we are at the last character of the word
                        if (pass.substring(z).matches(specialCharacters) &&  !pass.equalsIgnoreCase("")) {
                        	specialChar = true;
                            return pass;
                        }
                        else
                            noSpecialChar++;

                    }
                    else {//if we are at not the last character of the word
                        if (pass.substring(z, z + 1).matches(specialCharacters) && !pass.equalsIgnoreCase("")) {
                        	specialChar = true;	
                            return pass;
                        }
                        else
                            noSpecialChar++;


                    }
                }
            }

        }
        return "password not ready!";//this will never reach, it will return something before
    }
}

	
	
	
	


