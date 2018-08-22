
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperacaoDesunitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade identificacaoResponsavelDesunitizacao.
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
     * Define o valor da propriedade identificacaoResponsavelDesunitizacao.
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
     * Obtém o valor da propriedade local.
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
     * Define o valor da propriedade local.
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
     * Obtém o valor da propriedade desunitizacoes.
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
     * Define o valor da propriedade desunitizacoes.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * Obtém o valor da propriedade desunitizacao.
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
         * Define o valor da propriedade desunitizacao.
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
