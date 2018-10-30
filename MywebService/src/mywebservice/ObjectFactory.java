package mywebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mywebservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHellow_QNAME = new QName("http://MyWebService/", "sayHellow");
    private final static QName _SayHellowResponse_QNAME = new QName("http://MyWebService/", "sayHellowResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mywebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHellow }
     * 
     */
    public SayHellow createSayHellow() {
        return new SayHellow();
    }

    /**
     * Create an instance of {@link SayHellowResponse }
     * 
     */
    public SayHellowResponse createSayHellowResponse() {
        return new SayHellowResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHellow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWebService/", name = "sayHellow")
    public JAXBElement<SayHellow> createSayHellow(SayHellow value) {
        return new JAXBElement<SayHellow>(_SayHellow_QNAME, SayHellow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHellowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyWebService/", name = "sayHellowResponse")
    public JAXBElement<SayHellowResponse> createSayHellowResponse(SayHellowResponse value) {
        return new JAXBElement<SayHellowResponse>(_SayHellowResponse_QNAME, SayHellowResponse.class, null, value);
    }

}
