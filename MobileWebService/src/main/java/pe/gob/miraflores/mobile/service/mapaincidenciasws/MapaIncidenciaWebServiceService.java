package pe.gob.miraflores.mobile.service.mapaincidenciasws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2016-08-19T14:49:06.717-05:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "MapaIncidenciaWebServiceService", 
                  wsdlLocation = "file:/E:/desarrollo/java/workspace/ws_cierre-calle-mapa/AppMobile/MobileWebService/src/main/resources/MapaIncidenciaWebService.wsdl",
                  targetNamespace = "http://mapaincidenciasws.service.mobile.miraflores.gob.pe/") 
public class MapaIncidenciaWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://mapaincidenciasws.service.mobile.miraflores.gob.pe/", "MapaIncidenciaWebServiceService");
    public final static QName MapaIncidenciaWebServicePort = new QName("http://mapaincidenciasws.service.mobile.miraflores.gob.pe/", "MapaIncidenciaWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/desarrollo/java/workspace/ws_cierre-calle-mapa/AppMobile/MobileWebService/src/main/resources/MapaIncidenciaWebService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MapaIncidenciaWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/desarrollo/java/workspace/ws_cierre-calle-mapa/AppMobile/MobileWebService/src/main/resources/MapaIncidenciaWebService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MapaIncidenciaWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MapaIncidenciaWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MapaIncidenciaWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MapaIncidenciaWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MapaIncidenciaWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MapaIncidenciaWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns MapaIncidenciaWebService
     */
    @WebEndpoint(name = "MapaIncidenciaWebServicePort")
    public MapaIncidenciaWebService getMapaIncidenciaWebServicePort() {
        return super.getPort(MapaIncidenciaWebServicePort, MapaIncidenciaWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MapaIncidenciaWebService
     */
    @WebEndpoint(name = "MapaIncidenciaWebServicePort")
    public MapaIncidenciaWebService getMapaIncidenciaWebServicePort(WebServiceFeature... features) {
        return super.getPort(MapaIncidenciaWebServicePort, MapaIncidenciaWebService.class, features);
    }

}
