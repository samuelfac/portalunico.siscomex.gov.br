
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transportador de nacionalidade estrangeira e tipo de transporte regular
 * 
 * <p>Classe Java de TransportadorMicEstrangeiroRegularDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransportadorMicEstrangeiroRegularDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFiscal" type="{http://www.pucomex.serpro.gov.br/cct}IdFiscalEstrangeiro"/>
 *         &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/>
 *         &lt;element name="licencaOriginaria" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica20" minOccurs="0"/>
 *         &lt;element name="dataVencimentoLicencaOriginaria" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120"/>
 *         &lt;element name="licencaComplementarTETI" type="{http://www.pucomex.serpro.gov.br/cct}LicencaTransportador"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorMicEstrangeiroRegularDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "idFiscal",
    "pais",
    "licencaOriginaria",
    "dataVencimentoLicencaOriginaria",
    "endereco",
    "licencaComplementarTETI"
})
public class TransportadorMicEstrangeiroRegularDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String idFiscal;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String pais;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String licencaOriginaria;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String dataVencimentoLicencaOriginaria;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String endereco;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String licencaComplementarTETI;

    /**
     * Obtém o valor da propriedade idFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscal() {
        return idFiscal;
    }

    /**
     * Define o valor da propriedade idFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscal(String value) {
        this.idFiscal = value;
    }

    /**
     * Obtém o valor da propriedade pais.
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
     * Define o valor da propriedade pais.
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
     * Obtém o valor da propriedade licencaOriginaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencaOriginaria() {
        return licencaOriginaria;
    }

    /**
     * Define o valor da propriedade licencaOriginaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencaOriginaria(String value) {
        this.licencaOriginaria = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimentoLicencaOriginaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVencimentoLicencaOriginaria() {
        return dataVencimentoLicencaOriginaria;
    }

    /**
     * Define o valor da propriedade dataVencimentoLicencaOriginaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVencimentoLicencaOriginaria(String value) {
        this.dataVencimentoLicencaOriginaria = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade licencaComplementarTETI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencaComplementarTETI() {
        return licencaComplementarTETI;
    }

    /**
     * Define o valor da propriedade licencaComplementarTETI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencaComplementarTETI(String value) {
        this.licencaComplementarTETI = value;
    }

}
