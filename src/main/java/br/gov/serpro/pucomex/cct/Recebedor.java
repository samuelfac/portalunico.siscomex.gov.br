
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element name="cnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *           &lt;element name="cpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *           &lt;element name="nomeEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *         &lt;/choice>
 *         &lt;element name="viaTransporte" type="{http://www.pucomex.serpro.gov.br/cct}ViaTransporte" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="baldeacaoOuTransbordo" type="{http://www.pucomex.serpro.gov.br/cct}SimNao" minOccurs="0"/>
 *           &lt;element name="transitoSimplificado" type="{http://www.pucomex.serpro.gov.br/cct}TransitoSimplificadoEntrega" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "cnpj",
    "cpf",
    "nomeEstrangeiro",
    "viaTransporte",
    "baldeacaoOuTransbordo",
    "transitoSimplificado"
})
@XmlRootElement(name = "recebedor", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class Recebedor {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpj;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cpf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nomeEstrangeiro;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigInteger viaTransporte;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String baldeacaoOuTransbordo;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransitoSimplificadoEntrega transitoSimplificado;

    /**
     * Gets the value of the cnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Sets the value of the cnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the nomeEstrangeiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEstrangeiro() {
        return nomeEstrangeiro;
    }

    /**
     * Sets the value of the nomeEstrangeiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEstrangeiro(String value) {
        this.nomeEstrangeiro = value;
    }

    /**
     * Gets the value of the viaTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViaTransporte() {
        return viaTransporte;
    }

    /**
     * Sets the value of the viaTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViaTransporte(BigInteger value) {
        this.viaTransporte = value;
    }

    /**
     * Gets the value of the baldeacaoOuTransbordo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaldeacaoOuTransbordo() {
        return baldeacaoOuTransbordo;
    }

    /**
     * Sets the value of the baldeacaoOuTransbordo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaldeacaoOuTransbordo(String value) {
        this.baldeacaoOuTransbordo = value;
    }

    /**
     * Gets the value of the transitoSimplificado property.
     * 
     * @return
     *     possible object is
     *     {@link TransitoSimplificadoEntrega }
     *     
     */
    public TransitoSimplificadoEntrega getTransitoSimplificado() {
        return transitoSimplificado;
    }

    /**
     * Sets the value of the transitoSimplificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitoSimplificadoEntrega }
     *     
     */
    public void setTransitoSimplificado(TransitoSimplificadoEntrega value) {
        this.transitoSimplificado = value;
    }

}
