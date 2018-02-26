
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Destinatario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Destinatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="cnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="cpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *         &lt;element name="identificacaoEstrangeiro">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/>
 *                   &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destinatario", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "cnpj",
    "cpf",
    "identificacaoEstrangeiro"
})
public class Destinatario {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpj;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cpf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Destinatario.IdentificacaoEstrangeiro identificacaoEstrangeiro;

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
     * Gets the value of the identificacaoEstrangeiro property.
     * 
     * @return
     *     possible object is
     *     {@link Destinatario.IdentificacaoEstrangeiro }
     *     
     */
    public Destinatario.IdentificacaoEstrangeiro getIdentificacaoEstrangeiro() {
        return identificacaoEstrangeiro;
    }

    /**
     * Sets the value of the identificacaoEstrangeiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destinatario.IdentificacaoEstrangeiro }
     *     
     */
    public void setIdentificacaoEstrangeiro(Destinatario.IdentificacaoEstrangeiro value) {
        this.identificacaoEstrangeiro = value;
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
     *         &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/>
     *         &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
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
        "pais",
        "nome"
    })
    public static class IdentificacaoEstrangeiro {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String pais;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String nome;

        /**
         * Gets the value of the pais property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPais() {
            return pais;
        }

        /**
         * Sets the value of the pais property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPais(String value) {
            this.pais = value;
        }

        /**
         * Gets the value of the nome property.
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
         * Sets the value of the nome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

    }

}
