
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecepcaoConteiner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecepcaoConteiner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="cnpjResp" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocal"/>
 *         &lt;element name="referenciaLocalRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}entregador"/>
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
 *         &lt;element name="localArmazenamento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element name="codigoIdentCarga" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="transitoSimplificado" type="{http://www.pucomex.serpro.gov.br/cct}TransitoSimplificadoRecepcao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoConteiner", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoRecepcao",
    "cnpjResp",
    "local",
    "referenciaLocalRecepcao",
    "entregador",
    "conteineres",
    "localArmazenamento",
    "codigoIdentCarga",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais",
    "transitoSimplificado"
})
public class RecepcaoConteiner {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoRecepcao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String cnpjResp;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TLocal local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String referenciaLocalRecepcao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Entregador entregador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoConteiner.Conteineres conteineres;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String localArmazenamento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoIdentCarga;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String avariasIdentificadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String divergenciasIdentificadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String observacoesGerais;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransitoSimplificadoRecepcao transitoSimplificado;

    /**
     * Gets the value of the identificacaoRecepcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoRecepcao() {
        return identificacaoRecepcao;
    }

    /**
     * Sets the value of the identificacaoRecepcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoRecepcao(String value) {
        this.identificacaoRecepcao = value;
    }

    /**
     * Gets the value of the cnpjResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjResp() {
        return cnpjResp;
    }

    /**
     * Sets the value of the cnpjResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjResp(String value) {
        this.cnpjResp = value;
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
     * Gets the value of the referenciaLocalRecepcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaLocalRecepcao() {
        return referenciaLocalRecepcao;
    }

    /**
     * Sets the value of the referenciaLocalRecepcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaLocalRecepcao(String value) {
        this.referenciaLocalRecepcao = value;
    }

    /**
     * Gets the value of the entregador property.
     * 
     * @return
     *     possible object is
     *     {@link Entregador }
     *     
     */
    public Entregador getEntregador() {
        return entregador;
    }

    /**
     * Sets the value of the entregador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entregador }
     *     
     */
    public void setEntregador(Entregador value) {
        this.entregador = value;
    }

    /**
     * Gets the value of the conteineres property.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoConteiner.Conteineres }
     *     
     */
    public RecepcaoConteiner.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Sets the value of the conteineres property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoConteiner.Conteineres }
     *     
     */
    public void setConteineres(RecepcaoConteiner.Conteineres value) {
        this.conteineres = value;
    }

    /**
     * Gets the value of the localArmazenamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    /**
     * Sets the value of the localArmazenamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalArmazenamento(String value) {
        this.localArmazenamento = value;
    }

    /**
     * Gets the value of the codigoIdentCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdentCarga() {
        return codigoIdentCarga;
    }

    /**
     * Sets the value of the codigoIdentCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdentCarga(String value) {
        this.codigoIdentCarga = value;
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
     * Gets the value of the transitoSimplificado property.
     * 
     * @return
     *     possible object is
     *     {@link TransitoSimplificadoRecepcao }
     *     
     */
    public TransitoSimplificadoRecepcao getTransitoSimplificado() {
        return transitoSimplificado;
    }

    /**
     * Sets the value of the transitoSimplificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitoSimplificadoRecepcao }
     *     
     */
    public void setTransitoSimplificado(TransitoSimplificadoRecepcao value) {
        this.transitoSimplificado = value;
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
