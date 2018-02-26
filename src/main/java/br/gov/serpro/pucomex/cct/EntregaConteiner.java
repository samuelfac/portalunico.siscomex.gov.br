
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntregaConteiner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntregaConteiner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoEntrega" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="identificacaoPessoaJuridica" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocal"/>
 *         &lt;element name="conteineres">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}recebedor"/>
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntregaConteiner", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoEntrega",
    "identificacaoPessoaJuridica",
    "local",
    "conteineres",
    "recebedor",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais"
})
public class EntregaConteiner {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoEntrega;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoPessoaJuridica;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TLocal local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaConteiner.Conteineres conteineres;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Recebedor recebedor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String avariasIdentificadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String divergenciasIdentificadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String observacoesGerais;

    /**
     * Gets the value of the identificacaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoEntrega() {
        return identificacaoEntrega;
    }

    /**
     * Sets the value of the identificacaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoEntrega(String value) {
        this.identificacaoEntrega = value;
    }

    /**
     * Gets the value of the identificacaoPessoaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoPessoaJuridica() {
        return identificacaoPessoaJuridica;
    }

    /**
     * Sets the value of the identificacaoPessoaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoPessoaJuridica(String value) {
        this.identificacaoPessoaJuridica = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link TLocal }
     *     
     */
    public TLocal getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLocal }
     *     
     */
    public void setLocal(TLocal value) {
        this.local = value;
    }

    /**
     * Gets the value of the conteineres property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaConteiner.Conteineres }
     *     
     */
    public EntregaConteiner.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Sets the value of the conteineres property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaConteiner.Conteineres }
     *     
     */
    public void setConteineres(EntregaConteiner.Conteineres value) {
        this.conteineres = value;
    }

    /**
     * Gets the value of the recebedor property.
     * 
     * @return
     *     possible object is
     *     {@link Recebedor }
     *     
     */
    public Recebedor getRecebedor() {
        return recebedor;
    }

    /**
     * Sets the value of the recebedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recebedor }
     *     
     */
    public void setRecebedor(Recebedor value) {
        this.recebedor = value;
    }

    /**
     * Gets the value of the avariasIdentificadas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvariasIdentificadas() {
        return avariasIdentificadas;
    }

    /**
     * Sets the value of the avariasIdentificadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvariasIdentificadas(String value) {
        this.avariasIdentificadas = value;
    }

    /**
     * Gets the value of the divergenciasIdentificadas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivergenciasIdentificadas() {
        return divergenciasIdentificadas;
    }

    /**
     * Sets the value of the divergenciasIdentificadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivergenciasIdentificadas(String value) {
        this.divergenciasIdentificadas = value;
    }

    /**
     * Gets the value of the observacoesGerais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Sets the value of the observacoesGerais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
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
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/>
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
        protected List<ConteinerExtend> conteiner;

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
         * {@link ConteinerExtend }
         * 
         * 
         */
        public List<ConteinerExtend> getConteiner() {
            if (conteiner == null) {
                conteiner = new ArrayList<ConteinerExtend>();
            }
            return this.conteiner;
        }

    }

}
