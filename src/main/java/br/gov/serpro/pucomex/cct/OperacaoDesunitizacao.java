
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperacaoDesunitizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperacaoDesunitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoResponsavelDesunitizacao" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocalExtend"/>
 *         &lt;element name="desunitizacoes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="desunitizacao" type="{http://www.pucomex.serpro.gov.br/cct}TDesunitizacao"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacaoDesunitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoResponsavelDesunitizacao",
    "local",
    "desunitizacoes"
})
public class OperacaoDesunitizacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoResponsavelDesunitizacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TLocalExtend local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected OperacaoDesunitizacao.Desunitizacoes desunitizacoes;

    /**
     * Gets the value of the identificacaoResponsavelDesunitizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoResponsavelDesunitizacao() {
        return identificacaoResponsavelDesunitizacao;
    }

    /**
     * Sets the value of the identificacaoResponsavelDesunitizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoResponsavelDesunitizacao(String value) {
        this.identificacaoResponsavelDesunitizacao = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link TLocalExtend }
     *     
     */
    public TLocalExtend getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLocalExtend }
     *     
     */
    public void setLocal(TLocalExtend value) {
        this.local = value;
    }

    /**
     * Gets the value of the desunitizacoes property.
     * 
     * @return
     *     possible object is
     *     {@link OperacaoDesunitizacao.Desunitizacoes }
     *     
     */
    public OperacaoDesunitizacao.Desunitizacoes getDesunitizacoes() {
        return desunitizacoes;
    }

    /**
     * Sets the value of the desunitizacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacaoDesunitizacao.Desunitizacoes }
     *     
     */
    public void setDesunitizacoes(OperacaoDesunitizacao.Desunitizacoes value) {
        this.desunitizacoes = value;
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
     *         &lt;element name="desunitizacao" type="{http://www.pucomex.serpro.gov.br/cct}TDesunitizacao"/>
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
        "desunitizacao"
    })
    public static class Desunitizacoes {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected TDesunitizacao desunitizacao;

        /**
         * Gets the value of the desunitizacao property.
         * 
         * @return
         *     possible object is
         *     {@link TDesunitizacao }
         *     
         */
        public TDesunitizacao getDesunitizacao() {
            return desunitizacao;
        }

        /**
         * Sets the value of the desunitizacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDesunitizacao }
         *     
         */
        public void setDesunitizacao(TDesunitizacao value) {
            this.desunitizacao = value;
        }

    }

}
