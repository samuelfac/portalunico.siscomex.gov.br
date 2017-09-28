//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
@XmlType(name = "OperacaoDesunitizacao", propOrder = {
    "identificacaoResponsavelDesunitizacao",
    "local",
    "desunitizacoes"
})
@XmlRootElement(name = "OperacaoDesunitizacao")
public class OperacaoDesunitizacao {

    @XmlElement(required = true)
    protected String identificacaoResponsavelDesunitizacao;
    @XmlElement(required = true)
    protected TLocalExtend local;
    @XmlElement(required = true)
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

        @XmlElement(required = true)
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
