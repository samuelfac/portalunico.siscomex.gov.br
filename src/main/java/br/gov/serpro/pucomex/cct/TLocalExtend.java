//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.09.27 �s 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TLocalExtend complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
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
@XmlType(name = "TLocalExtend", propOrder = {
    "codigoURF",
    "coordenadas",
    "cnpjRespEstoqueCarga",
    "codigoRA"
})
public class TLocalExtend {

    protected String codigoURF;
    protected Coordenadas coordenadas;
    protected String cnpjRespEstoqueCarga;
    protected String codigoRA;

    /**
     * Obt�m o valor da propriedade codigoURF.
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
     * Obt�m o valor da propriedade coordenadas.
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
     * Obt�m o valor da propriedade cnpjRespEstoqueCarga.
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
     * Obt�m o valor da propriedade codigoRA.
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
