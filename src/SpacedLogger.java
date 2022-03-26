/*
 * Question 3 b. created a class SpacedLogger that implements the Logger interface
 * 
 * Question 6 & 7 & 8 created a Log & Error method that adds spaces between each character of the String
 * that passes into the method. In the Error method the String preceded the ERROR:
 * 
 */

public class SpacedLogger implements Logger {

  @Override
  public void Log(String log) {
    
    for(int i=0; i < log.length(); i++) {
      
      System.out.print(log.charAt(i) + " ");
    }// end of for loop
        
  }// end of the Log method

  @Override
  public void Error(String error) {
    
    System.err.print("ERROR: ");
    
    for(int i=0; i < error.length(); i++) {
      
      System.err.print(error.charAt(i) + " ");
    
    }// end of for loop.
    
  }//end of the Error method.

  
}//end of class