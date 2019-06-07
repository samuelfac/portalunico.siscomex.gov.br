
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LocalCompleto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocalCompleto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoURF" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/>
 *         &lt;choice>
 *           &lt;element name="codigoRA" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/>
 *           &lt;sequence>
 *             &lt;element name="cnpjResponsavel" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *             &lt;element name="coordenadas" type="{http://www.pucomex.serpro.gov.br/cct}Coordenadas" minOccurs="0"/>
 *           &lt;/sequence>
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
@XmlType(name = "LocalCompleto", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "codigoURF",
    "codigoRA",
    "cnpjResponsavel",
    "coordenadas"
})
@XmlSeeAlso({
    LocalPartida.class
})
public class LocalCompleto {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String codigoURF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoRA;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjResponsavel;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Coordenadas coordenadas;

    /**
     * Obtém o valor da propriedade codigoURF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoURF() {
        return codigoURF;
    }

    /**
     * Define o valor da propriedade codigoURF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoURF(String value) {
        this.codigoURF = value;
    }

    /**
     * Obtém o valor da propriedade codigoRA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRA() {
        return codigoRA;
    }

    /**
     * Define o valor da propriedade codigoRA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRA(String value) {
        this.codigoRA = value;
    }

    /**
     * Obtém o valor da propriedade cnpjResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjResponsavel() {
        return cnpjResponsavel;
    }

    /**
     * Define o valor da propriedade cnpjResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjResponsavel(String value) {
        this.cnpjResponsavel = value;
    }

    /**
     * Obtém o valor da propriedade coordenadas.
     * 
     * @return
     *     possible object is
     *     {@link Coordenadas }
     *     
     */
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    /**
     * Define o valor da propriedade coordenadas.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordenadas }
     *     
     */
    public void setCoordenadas(Coordenadas value) {
        this.coordenadas = value;
    }

}
