
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entregaDocumentoCarga" type="{http://www.pucomex.serpro.gov.br/cct}EntregaDocumentoCarga"/>
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
    "entregaDocumentoCarga"
})
@XmlRootElement(name = "entregasDocumentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class EntregasDocumentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaDocumentoCarga entregaDocumentoCarga;

    /**
     * Obtém o valor da propriedade entregaDocumentoCarga.
     * 
     * @return
     *     possible object is
     *     {@link EntregaDocumentoCarga }
     *     
     */
    public EntregaDocumentoCarga getEntregaDocumentoCarga() {
        return entregaDocumentoCarga;
    }

    /**
     * Define o valor da propriedade entregaDocumentoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaDocumentoCarga }
     *     
     */
    public void setEntregaDocumentoCarga(EntregaDocumentoCarga value) {
        this.entregaDocumentoCarga = value;
    }

}
