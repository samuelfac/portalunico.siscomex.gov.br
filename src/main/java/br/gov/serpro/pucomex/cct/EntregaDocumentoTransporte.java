
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntregaDocumentoTransporte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntregaDocumentoTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoEntrega" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="identificacaoPessoaJuridica" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/>
 *         &lt;element name="documentosTransporte">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DocumentoTransporte" maxOccurs="100"/>
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
@XmlType(name = "EntregaDocumentoTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoEntrega",
    "identificacaoPessoaJuridica",
    "local",
    "documentosTransporte"
})
public class EntregaDocumentoTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoEntrega;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoPessoaJuridica;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Local local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaDocumentoTransporte.DocumentosTransporte documentosTransporte;

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
     *     {@link Local }
     *     
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link Local }
     *     
     */
    public void setLocal(Local value) {
        this.local = value;
    }

    /**
     * Gets the value of the documentosTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaDocumentoTransporte.DocumentosTransporte }
     *     
     */
    public EntregaDocumentoTransporte.DocumentosTransporte getDocumentosTransporte() {
        return documentosTransporte;
    }

    /**
     * Sets the value of the documentosTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaDocumentoTransporte.DocumentosTransporte }
     *     
     */
    public void setDocumentosTransporte(EntregaDocumentoTransporte.DocumentosTransporte value) {
        this.documentosTransporte = value;
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
     *         &lt;element name="documentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DocumentoTransporte" maxOccurs="100"/>
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
        "documentoTransporte"
    })
    public static class DocumentosTransporte {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<DocumentoTransporte> documentoTransporte;

        /**
         * Gets the value of the documentoTransporte property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentoTransporte property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentoTransporte().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentoTransporte }
         * 
         * 
         */
        public List<DocumentoTransporte> getDocumentoTransporte() {
            if (documentoTransporte == null) {
                documentoTransporte = new ArrayList<DocumentoTransporte>();
            }
            return this.documentoTransporte;
        }

    }

}
