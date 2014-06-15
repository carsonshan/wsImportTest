
package zakir.WSimport;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Greeting {

	@WebMethod 
	public String SayHello(String name);
	
}
