package zakir.wsClient;

import zakir.wsimport.Greeting;
import zakir.wsimport.GreetingImplService;

public class Client {

	public static void main(String[] args) {
		GreetingImplService service = new GreetingImplService();
		Greeting greeting = service.getGreetingImplPort();
		
		System.out.println("---> Service started");
		System.out.println(greeting.sayHello("Zakir"));
		System.out.println("END of service---> ");
		

	}

}
