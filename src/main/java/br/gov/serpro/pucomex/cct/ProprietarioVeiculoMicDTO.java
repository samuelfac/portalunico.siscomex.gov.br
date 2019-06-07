
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProprietarioVeiculoMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProprietarioVeiculoMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;element name="numeroCpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *               &lt;element name="numeroCnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="idFiscal" type="{http://www.pucomex.serpro.gov.br/cct}IdFiscalEstrangeiro"/>
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
@XmlType(name = "ProprietarioVeiculoMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroCpf",
    "numeroCnpj",
    "idFiscal",
    "nome",
    "endereco"
})
public class ProprietarioVeiculoMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroCpf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroCnpj;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String idFiscal;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nome;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String endereco;

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
     * Obtém o valor da propriedade idFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscal() {
        return idFiscal;
    }

    /**
     * Define o valor da propriedade idFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscal(String value) {
        this.idFiscal = value;
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
