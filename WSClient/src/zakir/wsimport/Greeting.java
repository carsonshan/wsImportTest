
package zakir.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Greeting", targetNamespace = "http://WSimport.zakir/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Greeting {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SayHello")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SayHello", targetNamespace = "http://WSimport.zakir/", className = "zakir.wsimport.SayHello")
    @ResponseWrapper(localName = "SayHelloResponse", targetNamespace = "http://WSimport.zakir/", className = "zakir.wsimport.SayHelloResponse")
    @Action(input = "http://WSimport.zakir/Greeting/SayHelloRequest", output = "http://WSimport.zakir/Greeting/SayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
