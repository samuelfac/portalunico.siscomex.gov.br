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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDocumentoCargaConsolidacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaConsolidacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/>
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/>
 *         &lt;/choice>
 *         &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}TConhecimentoCarga"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentoCargaConsolidacao", propOrder = {
    "numeroDUE",
    "numeroRUC",
    "conhecimento"
})
public class TDocumentoCargaConsolidacao {

    protected String numeroDUE;
    protected String numeroRUC;
    @XmlElement(required = true)
    protected TConhecimentoCarga conhecimento;

    /**
     * Obtém o valor da propriedade numeroDUE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDUE() {
        return numeroDUE;
    }

    /**
     * Define o valor da propriedade numeroDUE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDUE(String value) {
        this.numeroDUE = value;
    }

    /**
     * Obtém o valor da propriedade numeroRUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRUC() {
        return numeroRUC;
    }

    /**
     * Define o valor da propriedade numeroRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRUC(String value) {
        this.numeroRUC = value;
    }

    /**
     * Obtém o valor da propriedade conhecimento.
     * 
     * @return
     *     possible object is
     *     {@link TConhecimentoCarga }
     *     
     */
    public TConhecimentoCarga getConhecimento() {
        return conhecimento;
    }

    /**
     * Define o valor da propriedade conhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link TConhecimentoCarga }
     *     
     */
    public void setConhecimento(TConhecimentoCarga value) {
        this.conhecimento = value;
    }

}
