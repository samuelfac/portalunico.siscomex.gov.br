
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransitoSimplificadoEntregaDocTransporte complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransitoSimplificadoEntregaDocTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="codigoURFDestino" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/>
 *             &lt;element name="cnpjRespDestino" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="codigoRADestino" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/>
 *           &lt;/sequence>
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
@XmlType(name = "TransitoSimplificadoEntregaDocTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "codigoURFDestino",
    "cnpjRespDestino",
    "codigoRADestino"
})
public class TransitoSimplificadoEntregaDocTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoURFDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjRespDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoRADestino;

    /**
     * Obtém o valor da propriedade codigoURFDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoURFDestino() {
        return codigoURFDestino;
    }

    /**
     * Define o valor da propriedade codigoURFDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoURFDestino(String value) {
        this.codigoURFDestino = value;
    }

    /**
     * Obtém o valor da propriedade cnpjRespDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjRespDestino() {
        return cnpjRespDestino;
    }

    /**
     * Define o valor da propriedade cnpjRespDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjRespDestino(String value) {
        this.cnpjRespDestino = value;
    }

    /**
     * Obtém o valor da propriedade codigoRADestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRADestino() {
        return codigoRADestino;
    }

    /**
     * Define o valor da propriedade codigoRADestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRADestino(String value) {
        this.codigoRADestino = value;
    }

}
