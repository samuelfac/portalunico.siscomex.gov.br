
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntregaDocumentoCarga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntregaDocumentoCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoEntrega" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="identificacaoPessoaJuridica" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}recebedor"/>
 *         &lt;choice>
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntregaDocumentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoEntrega",
    "identificacaoPessoaJuridica",
    "local",
    "documentos",
    "recebedor",
    "pesoAferido",
    "motivoNaoPesagem"
})
public class EntregaDocumentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoEntrega;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoPessoaJuridica;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Local local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Documentos documentos;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Recebedor recebedor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigDecimal pesoAferido;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String motivoNaoPesagem;

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
     * Gets the value of the documentos property.
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
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
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
     * Gets the value of the pesoAferido property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    /**
     * Sets the value of the pesoAferido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoAferido(BigDecimal value) {
        this.pesoAferido = value;
    }

    /**
     * Gets the value of the motivoNaoPesagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    /**
     * Sets the value of the motivoNaoPesagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNaoPesagem(String value) {
        this.motivoNaoPesagem = value;
    }

}
