
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NFeCargaMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NFeCargaMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chaveAcesso" type="{http://www.pucomex.serpro.gov.br/cct}ChaveNFE"/>
 *         &lt;element name="conteineres" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerMicDTO" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NFeCargaMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "chaveAcesso",
    "conteineres"
})
public class NFeCargaMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String chaveAcesso;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected NFeCargaMicDTO.Conteineres conteineres;

    /**
     * Obtém o valor da propriedade chaveAcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * Define o valor da propriedade chaveAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaveAcesso(String value) {
        this.chaveAcesso = value;
    }

    /**
     * Obtém o valor da propriedade conteineres.
     * 
     * @return
     *     possible object is
     *     {@link NFeCargaMicDTO.Conteineres }
     *     
     */
    public NFeCargaMicDTO.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Define o valor da propriedade conteineres.
     * 
     * @param value
     *     allowed object is
     *     {@link NFeCargaMicDTO.Conteineres }
     *     
     */
    public void setConteineres(NFeCargaMicDTO.Conteineres value) {
        this.conteineres = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerMicDTO" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conteiner"
    })
    public static class Conteineres {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<ConteinerMicDTO> conteiner;

        /**
         * Gets the value of the conteiner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conteiner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConteiner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConteinerMicDTO }
         * 
         * 
         */
        public List<ConteinerMicDTO> getConteiner() {
            if (conteiner == null) {
                conteiner = new ArrayList<ConteinerMicDTO>();
            }
            return this.conteiner;
        }

    }

}
