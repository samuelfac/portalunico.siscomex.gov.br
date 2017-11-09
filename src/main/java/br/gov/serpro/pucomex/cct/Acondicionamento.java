
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Acondicionamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlType(name = "Acondicionamento", propOrder = {
    "conteineres",
    "embalagens",
    "cargasSoltasVeiculos",
    "graneis"
})
public class Acondicionamento {

    protected Acondicionamento.Conteineres conteineres;
    protected Embalagens embalagens;
    protected CargasSoltasVeiculos cargasSoltasVeiculos;
    protected Graneis graneis;

    /**
     * Obtém o valor da propriedade conteineres.
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
     * Define o valor da propriedade conteineres.
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
     * Obtém o valor da propriedade embalagens.
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
     * Define o valor da propriedade embalagens.
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
     * Obtém o valor da propriedade cargasSoltasVeiculos.
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
     * Define o valor da propriedade cargasSoltasVeiculos.
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
     * Obtém o valor da propriedade graneis.
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
     * Define o valor da propriedade graneis.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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

        @XmlElement(required = true)
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
