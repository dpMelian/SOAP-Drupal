package localhost.drupal.rs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2020-06-04T12:04:55.559+01:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://drupal.localhost/rs", name = "RandomService")
@XmlSeeAlso({ObjectFactory.class})
public interface RandomService {

    @WebMethod(action = "http://drupal.localhost/rs/NewOperation")
    @RequestWrapper(localName = "random", targetNamespace = "http://drupal.localhost/rs", className = "localhost.drupal.rs.Random")
    @ResponseWrapper(localName = "randomResponse", targetNamespace = "http://drupal.localhost/rs", className = "localhost.drupal.rs.RandomResponse")
    @WebResult(name = "out", targetNamespace = "")
    public int random(
        @WebParam(name = "i1", targetNamespace = "")
        int i1,
        @WebParam(name = "i2", targetNamespace = "")
        int i2
    );
}
