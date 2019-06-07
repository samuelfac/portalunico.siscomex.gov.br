
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsignatarioCargaMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsignatarioCargaMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indConsignadoAOrdem" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignatarioCargaMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "indConsignadoAOrdem",
    "pais",
    "nome",
    "endereco"
})
public class ConsignatarioCargaMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String indConsignadoAOrdem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String pais;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nome;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String endereco;

    /**
     * Obtém o valor da propriedade indConsignadoAOrdem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndConsignadoAOrdem() {
        return indConsignadoAOrdem;
    }

    /**
     * Define o valor da propriedade indConsignadoAOrdem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndConsignadoAOrdem(String value) {
        this.indConsignadoAOrdem = value;
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
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
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

}
