
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Consignatario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Consignatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignadoAOrdem" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="nomeConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60" minOccurs="0"/>
 *         &lt;element name="enderecoConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120" minOccurs="0"/>
 *         &lt;element name="paisDestino" type="{http://www.pucomex.serpro.gov.br/cct}Pais" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="999"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignatario", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "consignadoAOrdem",
    "nomeConsignatario",
    "enderecoConsignatario",
    "paisDestino",
    "dadosCarga"
})
public class Consignatario {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String consignadoAOrdem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nomeConsignatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String enderecoConsignatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String paisDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected List<DadosCarga> dadosCarga;

    /**
     * Obtém o valor da propriedade consignadoAOrdem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignadoAOrdem() {
        return consignadoAOrdem;
    }

    /**
     * Define o valor da propriedade consignadoAOrdem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignadoAOrdem(String value) {
        this.consignadoAOrdem = value;
    }

    /**
     * Obtém o valor da propriedade nomeConsignatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    /**
     * Define o valor da propriedade nomeConsignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsignatario(String value) {
        this.nomeConsignatario = value;
    }

    /**
     * Obtém o valor da propriedade enderecoConsignatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoConsignatario() {
        return enderecoConsignatario;
    }

    /**
     * Define o valor da propriedade enderecoConsignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoConsignatario(String value) {
        this.enderecoConsignatario = value;
    }

    /**
     * Obtém o valor da propriedade paisDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Define o valor da propriedade paisDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

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
