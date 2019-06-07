
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CondutorVeiculoMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CondutorVeiculoMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroCpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *           &lt;sequence>
 *             &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *             &lt;element name="numeroDocumento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica20"/>
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
@XmlType(name = "CondutorVeiculoMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroCpf",
    "nome",
    "numeroDocumento"
})
public class CondutorVeiculoMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroCpf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nome;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroDocumento;

    /**
     * Obtém o valor da propriedade numeroCpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCpf() {
        return numeroCpf;
    }

    /**
     * Define o valor da propriedade numeroCpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCpf(String value) {
        this.numeroCpf = value;
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
     * Obtém o valor da propriedade numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define o valor da propriedade numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

}
