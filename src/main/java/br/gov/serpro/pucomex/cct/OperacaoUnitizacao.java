
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperacaoUnitizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperacaoUnitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoResponsavelUnitizacao" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocalExtend"/>
 *         &lt;element name="unitizacoes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unitizacao" type="{http://www.pucomex.serpro.gov.br/cct}TUnitizacao"/>
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
@XmlType(name = "OperacaoUnitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoResponsavelUnitizacao",
    "local",
    "unitizacoes"
})
public class OperacaoUnitizacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoResponsavelUnitizacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TLocalExtend local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected OperacaoUnitizacao.Unitizacoes unitizacoes;

    /**
     * Gets the value of the identificacaoResponsavelUnitizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoResponsavelUnitizacao() {
        return identificacaoResponsavelUnitizacao;
    }

    /**
     * Sets the value of the identificacaoResponsavelUnitizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoResponsavelUnitizacao(String value) {
        this.identificacaoResponsavelUnitizacao = value;
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
     * Gets the value of the unitizacoes property.
     * 
     * @return
     *     possible object is
     *     {@link OperacaoUnitizacao.Unitizacoes }
     *     
     */
    public OperacaoUnitizacao.Unitizacoes getUnitizacoes() {
        return unitizacoes;
    }

    /**
     * Sets the value of the unitizacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacaoUnitizacao.Unitizacoes }
     *     
     */
    public void setUnitizacoes(OperacaoUnitizacao.Unitizacoes value) {
        this.unitizacoes = value;
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
     *         &lt;element name="unitizacao" type="{http://www.pucomex.serpro.gov.br/cct}TUnitizacao"/>
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
        "unitizacao"
    })
    public static class Unitizacoes {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected TUnitizacao unitizacao;

        /**
         * Gets the value of the unitizacao property.
         * 
         * @return
         *     possible object is
         *     {@link TUnitizacao }
         *     
         */
        public TUnitizacao getUnitizacao() {
            return unitizacao;
        }

        /**
         * Sets the value of the unitizacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link TUnitizacao }
         *     
         */
        public void setUnitizacao(TUnitizacao value) {
            this.unitizacao = value;
        }

    }

}
