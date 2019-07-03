
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperacaoConsolidacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperacaoConsolidacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoConsolidacao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="numeroMRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroMRUC" minOccurs="0"/>
 *         &lt;element name="cnpjConsolidador" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="acondicionamento" type="{http://www.pucomex.serpro.gov.br/cct}Acondicionamento"/>
 *         &lt;element name="documentosConsolidacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documento" type="{http://www.pucomex.serpro.gov.br/cct}TDocumentoCargaConsolidacao" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OperacaoConsolidacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoConsolidacao",
    "numeroMRUC",
    "cnpjConsolidador",
    "acondicionamento",
    "documentosConsolidacao"
})
public class OperacaoConsolidacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoConsolidacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroMRUC;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String cnpjConsolidador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Acondicionamento acondicionamento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected OperacaoConsolidacao.DocumentosConsolidacao documentosConsolidacao;

    /**
     * Obtém o valor da propriedade identificacaoConsolidacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoConsolidacao() {
        return identificacaoConsolidacao;
    }

    /**
     * Define o valor da propriedade identificacaoConsolidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoConsolidacao(String value) {
        this.identificacaoConsolidacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroMRUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMRUC() {
        return numeroMRUC;
    }

    /**
     * Define o valor da propriedade numeroMRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMRUC(String value) {
        this.numeroMRUC = value;
    }

    /**
     * Obtém o valor da propriedade cnpjConsolidador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjConsolidador() {
        return cnpjConsolidador;
    }

    /**
     * Define o valor da propriedade cnpjConsolidador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjConsolidador(String value) {
        this.cnpjConsolidador = value;
    }

    /**
     * Obtém o valor da propriedade acondicionamento.
     * 
     * @return
     *     possible object is
     *     {@link Acondicionamento }
     *     
     */
    public Acondicionamento getAcondicionamento() {
        return acondicionamento;
    }

    /**
     * Define o valor da propriedade acondicionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Acondicionamento }
     *     
     */
    public void setAcondicionamento(Acondicionamento value) {
        this.acondicionamento = value;
    }

    /**
     * Obtém o valor da propriedade documentosConsolidacao.
     * 
     * @return
     *     possible object is
     *     {@link OperacaoConsolidacao.DocumentosConsolidacao }
     *     
     */
    public OperacaoConsolidacao.DocumentosConsolidacao getDocumentosConsolidacao() {
        return documentosConsolidacao;
    }

    /**
     * Define o valor da propriedade documentosConsolidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacaoConsolidacao.DocumentosConsolidacao }
     *     
     */
    public void setDocumentosConsolidacao(OperacaoConsolidacao.DocumentosConsolidacao value) {
        this.documentosConsolidacao = value;
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
     *         &lt;element name="documento" type="{http://www.pucomex.serpro.gov.br/cct}TDocumentoCargaConsolidacao" maxOccurs="unbounded" minOccurs="0"/>
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
        "documento"
    })
    public static class DocumentosConsolidacao {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
        protected List<TDocumentoCargaConsolidacao> documento;

        /**
         * Gets the value of the documento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDocumentoCargaConsolidacao }
         * 
         * 
         */
        public List<TDocumentoCargaConsolidacao> getDocumento() {
            if (documento == null) {
                documento = new ArrayList<TDocumentoCargaConsolidacao>();
            }
            return this.documento;
        }

    }

}
