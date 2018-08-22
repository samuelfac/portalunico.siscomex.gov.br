
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TLocalExtend complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TLocalExtend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="codigoURF" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/>
 *           &lt;element name="coordenadas" type="{http://www.pucomex.serpro.gov.br/cct}Coordenadas"/>
 *           &lt;element name="cnpjRespEstoqueCarga" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="codigoRA" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLocalExtend", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "codigoURF",
    "coordenadas",
    "cnpjRespEstoqueCarga",
    "codigoRA"
})
public class TLocalExtend {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoURF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Coordenadas coordenadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjRespEstoqueCarga;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoRA;

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

    /**
     * Obtém o valor da propriedade cnpjRespEstoqueCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjRespEstoqueCarga() {
        return cnpjRespEstoqueCarga;
    }

    /**
     * Define o valor da propriedade cnpjRespEstoqueCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjRespEstoqueCarga(String value) {
        this.cnpjRespEstoqueCarga = value;
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

}
