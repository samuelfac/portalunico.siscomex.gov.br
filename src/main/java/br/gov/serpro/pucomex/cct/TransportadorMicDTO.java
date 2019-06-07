
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransportadorMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransportadorMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroApoliceSeguro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica20" minOccurs="0"/>
 *         &lt;element name="dataVencimentoApolice" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="brasileiroRegular" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicBrasileiroRegularDTO"/>
 *           &lt;element name="brasileiroProprio" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicBrasileiroProprioDTO"/>
 *           &lt;element name="brasileiroOcasional" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicBrasileiroOcasionalDTO"/>
 *           &lt;element name="estrangeiroRegular" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicEstrangeiroRegularDTO"/>
 *           &lt;element name="estrangeiroProprio" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicEstrangeiroProprioDTO"/>
 *           &lt;element name="estrangeiroOcasional" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicEstrangeiroOcasionalDTO"/>
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
@XmlType(name = "TransportadorMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroApoliceSeguro",
    "dataVencimentoApolice",
    "brasileiroRegular",
    "brasileiroProprio",
    "brasileiroOcasional",
    "estrangeiroRegular",
    "estrangeiroProprio",
    "estrangeiroOcasional"
})
public class TransportadorMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroApoliceSeguro;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String dataVencimentoApolice;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransportadorMicBrasileiroRegularDTO brasileiroRegular;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransportadorMicBrasileiroProprioDTO brasileiroProprio;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransportadorMicBrasileiroOcasionalDTO brasileiroOcasional;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransportadorMicEstrangeiroRegularDTO estrangeiroRegular;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransportadorMicEstrangeiroProprioDTO estrangeiroProprio;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransportadorMicEstrangeiroOcasionalDTO estrangeiroOcasional;

    /**
     * Obtém o valor da propriedade numeroApoliceSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroApoliceSeguro() {
        return numeroApoliceSeguro;
    }

    /**
     * Define o valor da propriedade numeroApoliceSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroApoliceSeguro(String value) {
        this.numeroApoliceSeguro = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimentoApolice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVencimentoApolice() {
        return dataVencimentoApolice;
    }

    /**
     * Define o valor da propriedade dataVencimentoApolice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVencimentoApolice(String value) {
        this.dataVencimentoApolice = value;
    }

    /**
     * Obtém o valor da propriedade brasileiroRegular.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicBrasileiroRegularDTO }
     *     
     */
    public TransportadorMicBrasileiroRegularDTO getBrasileiroRegular() {
        return brasileiroRegular;
    }

    /**
     * Define o valor da propriedade brasileiroRegular.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicBrasileiroRegularDTO }
     *     
     */
    public void setBrasileiroRegular(TransportadorMicBrasileiroRegularDTO value) {
        this.brasileiroRegular = value;
    }

    /**
     * Obtém o valor da propriedade brasileiroProprio.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicBrasileiroProprioDTO }
     *     
     */
    public TransportadorMicBrasileiroProprioDTO getBrasileiroProprio() {
        return brasileiroProprio;
    }

    /**
     * Define o valor da propriedade brasileiroProprio.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicBrasileiroProprioDTO }
     *     
     */
    public void setBrasileiroProprio(TransportadorMicBrasileiroProprioDTO value) {
        this.brasileiroProprio = value;
    }

    /**
     * Obtém o valor da propriedade brasileiroOcasional.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicBrasileiroOcasionalDTO }
     *     
     */
    public TransportadorMicBrasileiroOcasionalDTO getBrasileiroOcasional() {
        return brasileiroOcasional;
    }

    /**
     * Define o valor da propriedade brasileiroOcasional.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicBrasileiroOcasionalDTO }
     *     
     */
    public void setBrasileiroOcasional(TransportadorMicBrasileiroOcasionalDTO value) {
        this.brasileiroOcasional = value;
    }

    /**
     * Obtém o valor da propriedade estrangeiroRegular.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicEstrangeiroRegularDTO }
     *     
     */
    public TransportadorMicEstrangeiroRegularDTO getEstrangeiroRegular() {
        return estrangeiroRegular;
    }

    /**
     * Define o valor da propriedade estrangeiroRegular.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicEstrangeiroRegularDTO }
     *     
     */
    public void setEstrangeiroRegular(TransportadorMicEstrangeiroRegularDTO value) {
        this.estrangeiroRegular = value;
    }

    /**
     * Obtém o valor da propriedade estrangeiroProprio.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicEstrangeiroProprioDTO }
     *     
     */
    public TransportadorMicEstrangeiroProprioDTO getEstrangeiroProprio() {
        return estrangeiroProprio;
    }

    /**
     * Define o valor da propriedade estrangeiroProprio.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicEstrangeiroProprioDTO }
     *     
     */
    public void setEstrangeiroProprio(TransportadorMicEstrangeiroProprioDTO value) {
        this.estrangeiroProprio = value;
    }

    /**
     * Obtém o valor da propriedade estrangeiroOcasional.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicEstrangeiroOcasionalDTO }
     *     
     */
    public TransportadorMicEstrangeiroOcasionalDTO getEstrangeiroOcasional() {
        return estrangeiroOcasional;
    }

    /**
     * Define o valor da propriedade estrangeiroOcasional.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicEstrangeiroOcasionalDTO }
     *     
     */
    public void setEstrangeiroOcasional(TransportadorMicEstrangeiroOcasionalDTO value) {
        this.estrangeiroOcasional = value;
    }

}
