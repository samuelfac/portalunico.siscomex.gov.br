
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
     * Obtém o valor da propriedade cnpj.
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
     * Define o valor da propriedade cnpj.
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
     * Obtém o valor da propriedade cpf.
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
     * Define o valor da propriedade cpf.
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
     * Obtém o valor da propriedade nomeEstrangeiro.
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
     * Define o valor da propriedade nomeEstrangeiro.
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
     * Obtém o valor da propriedade viaTransporte.
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
     * Define o valor da propriedade viaTransporte.
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
     * Obtém o valor da propriedade baldeacaoOuTransbordo.
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
     * Define o valor da propriedade baldeacaoOuTransbordo.
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
     * Obtém o valor da propriedade transitoSimplificado.
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
     * Define o valor da propriedade transitoSimplificado.
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
