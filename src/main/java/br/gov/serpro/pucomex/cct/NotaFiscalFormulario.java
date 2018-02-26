
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaFiscalFormulario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalFormulario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroNF" type="{http://www.pucomex.serpro.gov.br/cct}NumeroNF"/>
 *         &lt;element name="serieNF" type="{http://www.pucomex.serpro.gov.br/cct}SerieNF"/>
 *         &lt;element name="modeloNF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="01|04"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AAMM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ufEmissor" type="{http://www.pucomex.serpro.gov.br/cct}UF"/>
 *         &lt;element name="dataEmissao" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *         &lt;element name="identificacaoEmissor" type="{http://www.pucomex.serpro.gov.br/cct}IdentificacaoEmissor"/>
 *         &lt;element name="destinatario" type="{http://www.pucomex.serpro.gov.br/cct}Destinatario"/>
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
 *         &lt;element name="itensNFF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemNFF" type="{http://www.pucomex.serpro.gov.br/cct}ItemNFF" maxOccurs="999"/>
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
@XmlType(name = "NotaFiscalFormulario", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroNF",
    "serieNF",
    "modeloNF",
    "aamm",
    "ufEmissor",
    "dataEmissao",
    "identificacaoEmissor",
    "destinatario",
    "conteineres",
    "itensNFF"
})
public class NotaFiscalFormulario {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroNF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String serieNF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String modeloNF;
    @XmlElement(name = "AAMM", namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String aamm;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String ufEmissor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dataEmissao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected IdentificacaoEmissor identificacaoEmissor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Destinatario destinatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected NotaFiscalFormulario.Conteineres conteineres;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected NotaFiscalFormulario.ItensNFF itensNFF;

    /**
     * Gets the value of the numeroNF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNF() {
        return numeroNF;
    }

    /**
     * Sets the value of the numeroNF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNF(String value) {
        this.numeroNF = value;
    }

    /**
     * Gets the value of the serieNF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieNF() {
        return serieNF;
    }

    /**
     * Sets the value of the serieNF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieNF(String value) {
        this.serieNF = value;
    }

    /**
     * Gets the value of the modeloNF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloNF() {
        return modeloNF;
    }

    /**
     * Sets the value of the modeloNF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloNF(String value) {
        this.modeloNF = value;
    }

    /**
     * Gets the value of the aamm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAMM() {
        return aamm;
    }

    /**
     * Sets the value of the aamm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAMM(String value) {
        this.aamm = value;
    }

    /**
     * Gets the value of the ufEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfEmissor() {
        return ufEmissor;
    }

    /**
     * Sets the value of the ufEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfEmissor(String value) {
        this.ufEmissor = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissao(String value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the identificacaoEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoEmissor }
     *     
     */
    public IdentificacaoEmissor getIdentificacaoEmissor() {
        return identificacaoEmissor;
    }

    /**
     * Sets the value of the identificacaoEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoEmissor }
     *     
     */
    public void setIdentificacaoEmissor(IdentificacaoEmissor value) {
        this.identificacaoEmissor = value;
    }

    /**
     * Gets the value of the destinatario property.
     * 
     * @return
     *     possible object is
     *     {@link Destinatario }
     *     
     */
    public Destinatario getDestinatario() {
        return destinatario;
    }

    /**
     * Sets the value of the destinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destinatario }
     *     
     */
    public void setDestinatario(Destinatario value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the conteineres property.
     * 
     * @return
     *     possible object is
     *     {@link NotaFiscalFormulario.Conteineres }
     *     
     */
    public NotaFiscalFormulario.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Sets the value of the conteineres property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaFiscalFormulario.Conteineres }
     *     
     */
    public void setConteineres(NotaFiscalFormulario.Conteineres value) {
        this.conteineres = value;
    }

    /**
     * Gets the value of the itensNFF property.
     * 
     * @return
     *     possible object is
     *     {@link NotaFiscalFormulario.ItensNFF }
     *     
     */
    public NotaFiscalFormulario.ItensNFF getItensNFF() {
        return itensNFF;
    }

    /**
     * Sets the value of the itensNFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaFiscalFormulario.ItensNFF }
     *     
     */
    public void setItensNFF(NotaFiscalFormulario.ItensNFF value) {
        this.itensNFF = value;
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
     *         &lt;element name="itemNFF" type="{http://www.pucomex.serpro.gov.br/cct}ItemNFF" maxOccurs="999"/>
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
        "itemNFF"
    })
    public static class ItensNFF {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<ItemNFF> itemNFF;

        /**
         * Gets the value of the itemNFF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemNFF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemNFF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemNFF }
         * 
         * 
         */
        public List<ItemNFF> getItemNFF() {
            if (itemNFF == null) {
                itemNFF = new ArrayList<ItemNFF>();
            }
            return this.itemNFF;
        }

    }

}
