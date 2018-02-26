
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalEletronica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalEletronica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chaveAcesso" type="{http://www.pucomex.serpro.gov.br/cct}ChaveNFE"/>
 *         &lt;element name="conteineres" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}TConteiner" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaFiscalEletronica", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "chaveAcesso",
    "conteineres"
})
public class NotaFiscalEletronica {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String chaveAcesso;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected NotaFiscalEletronica.Conteineres conteineres;

    /**
     * Gets the value of the chaveAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * Sets the value of the chaveAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaveAcesso(String value) {
        this.chaveAcesso = value;
    }

    /**
     * Gets the value of the conteineres property.
     * 
     * @return
     *     possible object is
     *     {@link NotaFiscalEletronica.Conteineres }
     *     
     */
    public NotaFiscalEletronica.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Sets the value of the conteineres property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaFiscalEletronica.Conteineres }
     *     
     */
    public void setConteineres(NotaFiscalEletronica.Conteineres value) {
        this.conteineres = value;
    }


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
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}TConteiner" maxOccurs="unbounded"/>
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
        "conteiner"
    })
    public static class Conteineres {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<TConteiner> conteiner;

        /**
         * Gets the value of the conteiner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conteiner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConteiner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TConteiner }
         * 
         * 
         */
        public List<TConteiner> getConteiner() {
            if (conteiner == null) {
                conteiner = new ArrayList<TConteiner>();
            }
            return this.conteiner;
        }

    }

}
