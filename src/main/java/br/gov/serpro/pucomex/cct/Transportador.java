
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transportador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cpfCondutor property.
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
     * Sets the value of the cpfCondutor property.
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
     * Gets the value of the nomeCondutorEstrangeiro property.
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
     * Sets the value of the nomeCondutorEstrangeiro property.
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
