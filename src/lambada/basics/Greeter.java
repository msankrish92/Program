package lambada.basics;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello World");
//		greeter.greet(helloWorldGreeting);
		
		Greeting innerClass = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World");
				
			}
		};
		innerClass.perform();
		lambdaGreeting.perform();
		
		
	}
	
	
}
