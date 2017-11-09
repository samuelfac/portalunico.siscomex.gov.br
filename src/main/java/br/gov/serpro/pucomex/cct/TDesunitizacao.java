
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDesunitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDesunitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="numeroConteiner" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConteiner"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDesunitizacao", propOrder = {
    "numeroConteiner",
    "documentos"
})
public class TDesunitizacao {

    @XmlElement(required = true)
    protected String numeroConteiner;
    @XmlElement(required = true)
    protected Documentos documentos;

    /**
     * Obtém o valor da propriedade numeroConteiner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    /**
     * Define o valor da propriedade numeroConteiner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConteiner(String value) {
        this.numeroConteiner = value;
    }

    /**
     * Obtém o valor da propriedade documentos.
     * 
     * @return
     *     possible object is
     *     {@link Documentos }
     *     
     */
    public Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define o valor da propriedade documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
    }

}
