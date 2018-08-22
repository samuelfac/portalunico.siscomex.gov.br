
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TConteiner complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConteiner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroConteiner" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConteiner"/>
 *         &lt;element name="tara" type="{http://www.pucomex.serpro.gov.br/cct}Dec_6v3"/>
 *         &lt;element name="lacres" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lacre" type="{http://www.pucomex.serpro.gov.br/cct}Lacre" maxOccurs="4"/>
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
@XmlType(name = "TConteiner", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroConteiner",
    "tara",
    "lacres"
})
@XmlSeeAlso({
    ConteinerPesoBrutoExtend.class,
    ConteinerExtend.class
})
public class TConteiner {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroConteiner;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal tara;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TConteiner.Lacres lacres;

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
     * Obtém o valor da propriedade tara.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTara() {
        return tara;
    }

    /**
     * Define o valor da propriedade tara.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTara(BigDecimal value) {
        this.tara = value;
    }

    /**
     * Obtém o valor da propriedade lacres.
     * 
     * @return
     *     possible object is
     *     {@link TConteiner.Lacres }
     *     
     */
    public TConteiner.Lacres getLacres() {
        return lacres;
    }

    /**
     * Define o valor da propriedade lacres.
     * 
     * @param value
     *     allowed object is
     *     {@link TConteiner.Lacres }
     *     
     */
    public void setLacres(TConteiner.Lacres value) {
        this.lacres = value;
    }


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
     *         &lt;element name="lacre" type="{http://www.pucomex.serpro.gov.br/cct}Lacre" maxOccurs="4"/>
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
        "lacre"
    })
    public static class Lacres {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<String> lacre;

        /**
         * Gets the value of the lacre property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lacre property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLacre().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLacre() {
            if (lacre == null) {
                lacre = new ArrayList<String>();
            }
            return this.lacre;
        }

    }

}
