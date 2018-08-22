
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Transportador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Transportador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="cnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *           &lt;element name="cpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *           &lt;element name="nomeEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="cpfCondutor" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *           &lt;element name="nomeCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
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
@XmlType(name = "Transportador", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "cnpj",
    "cpf",
    "nomeEstrangeiro",
    "cpfCondutor",
    "nomeCondutorEstrangeiro"
})
public class Transportador {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpj;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cpf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nomeEstrangeiro;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cpfCondutor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nomeCondutorEstrangeiro;

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
     * Obtém o valor da propriedade cpfCondutor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCondutor() {
        return cpfCondutor;
    }

    /**
     * Define o valor da propriedade cpfCondutor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCondutor(String value) {
        this.cpfCondutor = value;
    }

    /**
     * Obtém o valor da propriedade nomeCondutorEstrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCondutorEstrangeiro() {
        return nomeCondutorEstrangeiro;
    }

    /**
     * Define o valor da propriedade nomeCondutorEstrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCondutorEstrangeiro(String value) {
        this.nomeCondutorEstrangeiro = value;
    }

}
