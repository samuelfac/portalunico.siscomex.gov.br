
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entregaDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}EntregaDocumentoTransporte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entregaDocumentoTransporte"
})
@XmlRootElement(name = "entregasDocumentoTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class EntregasDocumentoTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaDocumentoTransporte entregaDocumentoTransporte;

    /**
     * Gets the value of the entregaDocumentoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaDocumentoTransporte }
     *     
     */
    public EntregaDocumentoTransporte getEntregaDocumentoTransporte() {
        return entregaDocumentoTransporte;
    }

    /**
     * Sets the value of the entregaDocumentoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaDocumentoTransporte }
     *     
     */
    public void setEntregaDocumentoTransporte(EntregaDocumentoTransporte value) {
        this.entregaDocumentoTransporte = value;
    }

}
