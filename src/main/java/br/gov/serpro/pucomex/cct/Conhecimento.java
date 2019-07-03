
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Conhecimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Conhecimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConhecimento"/>
 *         &lt;element name="dataEmissaoConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *         &lt;element name="frete" type="{http://www.pucomex.serpro.gov.br/cct}Frete"/>
 *         &lt;sequence>
 *           &lt;element name="consignatario" type="{http://www.pucomex.serpro.gov.br/cct}Consignatario"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conhecimento", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroConhecimento",
    "dataEmissaoConhecimento",
    "frete",
    "consignatario"
})
public class Conhecimento {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroConhecimento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dataEmissaoConhecimento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Frete frete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Consignatario consignatario;

    /**
     * Obtém o valor da propriedade numeroConhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    /**
     * Define o valor da propriedade numeroConhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConhecimento(String value) {
        this.numeroConhecimento = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissaoConhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoConhecimento() {
        return dataEmissaoConhecimento;
    }

    /**
     * Define o valor da propriedade dataEmissaoConhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoConhecimento(String value) {
        this.dataEmissaoConhecimento = value;
    }

    /**
     * Obtém o valor da propriedade frete.
     * 
     * @return
     *     possible object is
     *     {@link Frete }
     *     
     */
    public Frete getFrete() {
        return frete;
    }

    /**
     * Define o valor da propriedade frete.
     * 
     * @param value
     *     allowed object is
     *     {@link Frete }
     *     
     */
    public void setFrete(Frete value) {
        this.frete = value;
    }

    /**
     * Obtém o valor da propriedade consignatario.
     * 
     * @return
     *     possible object is
     *     {@link Consignatario }
     *     
     */
    public Consignatario getConsignatario() {
        return consignatario;
    }

    /**
     * Define o valor da propriedade consignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link Consignatario }
     *     
     */
    public void setConsignatario(Consignatario value) {
        this.consignatario = value;
    }

}
