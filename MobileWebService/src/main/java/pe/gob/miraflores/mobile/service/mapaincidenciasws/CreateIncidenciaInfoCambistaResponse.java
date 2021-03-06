
package pe.gob.miraflores.mobile.service.mapaincidenciasws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createIncidenciaInfoCambistaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createIncidenciaInfoCambistaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://mapaincidenciasws.service.mobile.miraflores.gob.pe/}messageResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createIncidenciaInfoCambistaResponse", propOrder = {
    "_return"
})
public class CreateIncidenciaInfoCambistaResponse {

    @XmlElement(name = "return")
    protected MessageResult _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link MessageResult }
     *     
     */
    public MessageResult getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResult }
     *     
     */
    public void setReturn(MessageResult value) {
        this._return = value;
    }

}
