
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
 *         &lt;element name="recepcaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}RecepcaoDocumentoTransporte"/>
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
    "recepcaoDocumentoTransporte"
})
@XmlRootElement(name = "recepcoesDocumentoTransporte")
public class RecepcoesDocumentoTransporte {

    @XmlElement(required = true)
    protected RecepcaoDocumentoTransporte recepcaoDocumentoTransporte;

    /**
     * Obtém o valor da propriedade recepcaoDocumentoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoDocumentoTransporte }
     *     
     */
    public RecepcaoDocumentoTransporte getRecepcaoDocumentoTransporte() {
        return recepcaoDocumentoTransporte;
    }

    /**
     * Define o valor da propriedade recepcaoDocumentoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoDocumentoTransporte }
     *     
     */
    public void setRecepcaoDocumentoTransporte(RecepcaoDocumentoTransporte value) {
        this.recepcaoDocumentoTransporte = value;
    }

}
