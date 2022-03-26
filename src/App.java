/*
 * Question 9 Created a class names App with a main method.
 * 
 * Question 10 Instantiated both AsteriskLogger & SpacedLogger that implemented Logger interface.
 * 
 * Question 11 Tested both methods with String Hello.
 */
public class App {

  public static void main(String[] args) {
    
    Logger asteriskLogger = new AsteriskLogger();
    
    asteriskLogger.Log("Hello");
    System.out.println();
    
    asteriskLogger.Error("Hello");
    System.out.println();
    
    Logger spacedLogger = new SpacedLogger();
    
    spacedLogger.Log("Hello");
    System.out.println("\n");
    
    spacedLogger.Error("Hello");
    System.out.println();
    
  }// end of the method
  
   
    
}//end of the class
