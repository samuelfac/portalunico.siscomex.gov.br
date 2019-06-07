
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CavaloComReboqueMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CavaloComReboqueMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cavalo" type="{http://www.pucomex.serpro.gov.br/cct}CavaloMicDTO"/>
 *         &lt;element name="reboques">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reboque" type="{http://www.pucomex.serpro.gov.br/cct}ReboqueMicDTO" maxOccurs="3"/>
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
@XmlType(name = "CavaloComReboqueMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "cavalo",
    "reboques"
})
public class CavaloComReboqueMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected CavaloMicDTO cavalo;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected CavaloComReboqueMicDTO.Reboques reboques;

    /**
     * Obtém o valor da propriedade cavalo.
     * 
     * @return
     *     possible object is
     *     {@link CavaloMicDTO }
     *     
     */
    public CavaloMicDTO getCavalo() {
        return cavalo;
    }

    /**
     * Define o valor da propriedade cavalo.
     * 
     * @param value
     *     allowed object is
     *     {@link CavaloMicDTO }
     *     
     */
    public void setCavalo(CavaloMicDTO value) {
        this.cavalo = value;
    }

    /**
     * Obtém o valor da propriedade reboques.
     * 
     * @return
     *     possible object is
     *     {@link CavaloComReboqueMicDTO.Reboques }
     *     
     */
    public CavaloComReboqueMicDTO.Reboques getReboques() {
        return reboques;
    }

    /**
     * Define o valor da propriedade reboques.
     * 
     * @param value
     *     allowed object is
     *     {@link CavaloComReboqueMicDTO.Reboques }
     *     
     */
    public void setReboques(CavaloComReboqueMicDTO.Reboques value) {
        this.reboques = value;
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
     *         &lt;element name="reboque" type="{http://www.pucomex.serpro.gov.br/cct}ReboqueMicDTO" maxOccurs="3"/>
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
        "reboque"
    })
    public static class Reboques {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<ReboqueMicDTO> reboque;

        /**
         * Gets the value of the reboque property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reboque property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReboque().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReboqueMicDTO }
         * 
         * 
         */
        public List<ReboqueMicDTO> getReboque() {
            if (reboque == null) {
                reboque = new ArrayList<ReboqueMicDTO>();
            }
            return this.reboque;
        }

    }

}
