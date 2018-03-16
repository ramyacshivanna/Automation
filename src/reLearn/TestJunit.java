package reLearn;
import org.junit.*;
public class TestJunit {

	private String message;

	   //Constructor
	   //@param message to be printed
	   public TestJunit(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	}

}
