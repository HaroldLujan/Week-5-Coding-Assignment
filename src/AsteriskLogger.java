/*
 * Question 3 a. created a class AsteriskLogger that implements the Logger interface
 * 
 * Question 4 Created a Log method that receives a String
 * Printed out the String between 3 asterisks on both sides by calling log 
 * 
 * Question 5  Created a Error method that receives a String
 * Printed out the String inside a box of asterisks.
 * The String preceded the word Error:
 *
 *  Created a String method of asterisks to create the box 
 *  and help eliminate duplicate code.
 */

public class AsteriskLogger implements Logger{

  @Override
  public void Log(String log) {
    System.out.println("***" + log + "***");
  
    
  }//end of method

  @Override
  public void Error(String error) {
    System.err.println(asterisks(error)+ "\n");
    System.err.println("***Error: " + error + "***\n");
    System.err.println(asterisks(error)+ "\n");
    
  }//end of method
  
    public String asterisks(String error) {
      String asteriskAdd = "";
      
      int asterisk = 13 + error.length();
      
      for(int i=1; i<=asterisk; i++) {
        asteriskAdd += "*"; 
        
      }//end of for loop
      return asteriskAdd; 
      
    }//end of method
}//end of class
