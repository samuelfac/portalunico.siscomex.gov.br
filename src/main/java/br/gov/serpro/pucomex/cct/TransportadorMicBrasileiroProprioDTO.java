
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transportador de nacionalidade brasileira e tipo de transporte próprio
 * 
 * <p>Classe Java de TransportadorMicBrasileiroProprioDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransportadorMicBrasileiroProprioDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licencaTNTI" type="{http://www.pucomex.serpro.gov.br/cct}LicencaTransportador"/>
 *         &lt;element name="dataVencimentoLicenca" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorMicBrasileiroProprioDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "licencaTNTI",
    "dataVencimentoLicenca"
})
public class TransportadorMicBrasileiroProprioDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String licencaTNTI;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String dataVencimentoLicenca;

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

    /**
     * Obtém o valor da propriedade dataVencimentoLicenca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVencimentoLicenca() {
        return dataVencimentoLicenca;
    }

    /**
     * Define o valor da propriedade dataVencimentoLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVencimentoLicenca(String value) {
        this.dataVencimentoLicenca = value;
    }

}
