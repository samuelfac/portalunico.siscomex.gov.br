
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transportador de nacionalidade brasileira e tipo de transporte regular
 * 
 * <p>Classe Java de TransportadorMicBrasileiroRegularDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransportadorMicBrasileiroRegularDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licencaTNTI" type="{http://www.pucomex.serpro.gov.br/cct}LicencaTransportador"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorMicBrasileiroRegularDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "licencaTNTI"
})
public class TransportadorMicBrasileiroRegularDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String licencaTNTI;

    /**
     * Obtém o valor da propriedade licencaTNTI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencaTNTI() {
        return licencaTNTI;
    }

    /**
     * Define o valor da propriedade licencaTNTI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencaTNTI(String value) {
        this.licencaTNTI = value;
    }

}
