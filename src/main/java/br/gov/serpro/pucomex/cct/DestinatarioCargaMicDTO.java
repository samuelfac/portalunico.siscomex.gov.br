
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DestinatarioCargaMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DestinatarioCargaMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroCnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *           &lt;sequence>
 *             &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *             &lt;element name="endereco" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120"/>
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
@XmlType(name = "DestinatarioCargaMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroCnpj",
    "nome",
    "endereco"
})
public class DestinatarioCargaMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroCnpj;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nome;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String endereco;

    /**
     * Obtém o valor da propriedade numeroCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCnpj() {
        return numeroCnpj;
    }

    /**
     * Define o valor da propriedade numeroCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCnpj(String value) {
        this.numeroCnpj = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

}
