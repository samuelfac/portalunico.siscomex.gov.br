
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="frete" type="{http://www.pucomex.serpro.gov.br/cct}Frete" minOccurs="0"/>
 *         &lt;element name="cargas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="999"/>
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
@XmlType(name = "Conhecimento", propOrder = {
    "numeroConhecimento",
    "dataEmissaoConhecimento",
    "frete",
    "cargas"
})
public class Conhecimento {

    @XmlElement(required = true)
    protected String numeroConhecimento;
    @XmlElement(required = true)
    protected String dataEmissaoConhecimento;
    protected Frete frete;
    @XmlElement(required = true)
    protected Conhecimento.Cargas cargas;

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
     * Obtém o valor da propriedade cargas.
     * 
     * @return
     *     possible object is
     *     {@link Conhecimento.Cargas }
     *     
     */
    public Conhecimento.Cargas getCargas() {
        return cargas;
    }

    /**
     * Define o valor da propriedade cargas.
     * 
     * @param value
     *     allowed object is
     *     {@link Conhecimento.Cargas }
     *     
     */
    public void setCargas(Conhecimento.Cargas value) {
        this.cargas = value;
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
     *         &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="999"/>
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
        "dadosCarga"
    })
    public static class Cargas {

        @XmlElement(required = true)
        protected List<DadosCarga> dadosCarga;

        /**
         * Gets the value of the dadosCarga property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosCarga property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosCarga().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DadosCarga }
         * 
         * 
         */
        public List<DadosCarga> getDadosCarga() {
            if (dadosCarga == null) {
                dadosCarga = new ArrayList<DadosCarga>();
            }
            return this.dadosCarga;
        }

    }

}
