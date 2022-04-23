package generatePass;





public class Main {

    public static void main(String[] args) {
    	
    	//note that in special characters Im also including ", !, : , , . , besides all the rest


        AlicePasswords password = new AlicePasswords();

//		password.PrintArray();
        System.out.println("______________________________________________________________________________________________");
        System.out.println("Password             | Length | Same Word | Single | Upper |  Lower  | New line | Special Char ");
        System.out.println("----------------------------------------------------------------------------------------------");
       
        
        int total = 10000;
        
        for(int i=0; i<total; i++){
            String pass = password.setFinalPassword();
            if(!pass.equalsIgnoreCase("") ||!pass.equalsIgnoreCase(null) ){

            	
                System.out.printf("%-16s%10d%10d%10d%10d%10d%10d%10d%n", pass, password.getLengthProblem(),password.getSameWord(),password.getSingleChar(),password.getNoUpperCase(),password.getNoLowerCase(),password.getNewLine(),password.getNoSpecialChar());
                if(i%10==0){

                	System.out.println("_______________________________________________________________________________________________");
                    System.out.println("Password             | Length | Same Word | Single | Upper |  Lower  | New line | Special Char ");
                    System.out.println("-----------------------------------------------------------------------------------------------");

                }

            }

        }

        System.out.println();
        System.out.println("Total passwords generated: " + total);
        System.out.println("Thank you for using my program password generator!");
        System.out.println("Made by Cesar Paredes - 0723035");
//        System.out.println("Length Problems: " + password.getLengthProblem());
//        System.out.println("Same Word: " + password.getSameWord());
//        System.out.println("Single Character: " + password.getSingleChar());
//        System.out.println("No Upper case: " + password.getNoUpperCase());
//        System.out.println("No Lower case: " + password.getNoLowerCase());
//        System.out.println("New line problem: " + password.getNewLine());
//        System.out.println("No special characters: " + password.getNoSpecialChar());
//        System.out.println();


    }
}
