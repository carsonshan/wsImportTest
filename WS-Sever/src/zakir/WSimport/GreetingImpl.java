package zakir.WSimport;

import javax.jws.WebService;

@WebService(endpointInterface = "zakir.WSimport.Greeting")
public class GreetingImpl implements Greeting{

	@Override
	public String SayHello(String name) {
		return "Welcome to JAX-WS " + name;
		
	}

	
}
