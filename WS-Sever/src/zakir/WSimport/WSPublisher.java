package zakir.WSimport;

import javax.xml.ws.Endpoint;
import zakir.WSimport.GreetingImpl;

public class WSPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/Greeting", new GreetingImpl());
		
	}
}
