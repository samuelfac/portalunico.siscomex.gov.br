
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Acondicionamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acondicionamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}embalagens" minOccurs="0"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}cargasSoltasVeiculos" minOccurs="0"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}graneis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acondicionamento", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "conteineres",
    "embalagens",
    "cargasSoltasVeiculos",
    "graneis"
})
public class Acondicionamento {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Acondicionamento.Conteineres conteineres;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Embalagens embalagens;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected CargasSoltasVeiculos cargasSoltasVeiculos;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Graneis graneis;

    /**
     * Gets the value of the conteineres property.
     * 
     * @return
     *     possible object is
     *     {@link Acondicionamento.Conteineres }
     *     
     */
    public Acondicionamento.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Sets the value of the conteineres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acondicionamento.Conteineres }
     *     
     */
    public void setConteineres(Acondicionamento.Conteineres value) {
        this.conteineres = value;
    }

    /**
     * Gets the value of the embalagens property.
     * 
     * @return
     *     possible object is
     *     {@link Embalagens }
     *     
     */
    public Embalagens getEmbalagens() {
        return embalagens;
    }

    /**
     * Sets the value of the embalagens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Embalagens }
     *     
     */
    public void setEmbalagens(Embalagens value) {
        this.embalagens = value;
    }

    /**
     * Gets the value of the cargasSoltasVeiculos property.
     * 
     * @return
     *     possible object is
     *     {@link CargasSoltasVeiculos }
     *     
     */
    public CargasSoltasVeiculos getCargasSoltasVeiculos() {
        return cargasSoltasVeiculos;
    }

    /**
     * Sets the value of the cargasSoltasVeiculos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargasSoltasVeiculos }
     *     
     */
    public void setCargasSoltasVeiculos(CargasSoltasVeiculos value) {
        this.cargasSoltasVeiculos = value;
    }

    /**
     * Gets the value of the graneis property.
     * 
     * @return
     *     possible object is
     *     {@link Graneis }
     *     
     */
    public Graneis getGraneis() {
        return graneis;
    }

    /**
     * Sets the value of the graneis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Graneis }
     *     
     */
    public void setGraneis(Graneis value) {
        this.graneis = value;
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
