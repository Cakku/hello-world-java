

/** 
 * The HelloWorldApp class implements an application that simply prints "Hello World" to standard output.
 */
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World");
	Hello helloer = new Hello();
	helloer.greet();
	
  }
  
  public class Hello {
	  public void greet() {
		  System.out.println("Greetings");
	  }
  }
}