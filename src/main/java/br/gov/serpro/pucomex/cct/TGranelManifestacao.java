
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TGranelManifestacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TGranelManifestacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}TGranelPesoBrutoExtend" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGranelManifestacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "carga"
})
public class TGranelManifestacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected List<TGranelPesoBrutoExtend> carga;

    /**
     * Gets the value of the carga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGranelPesoBrutoExtend }
     * 
     * 
     */
    public List<TGranelPesoBrutoExtend> getCarga() {
        if (carga == null) {
            carga = new ArrayList<TGranelPesoBrutoExtend>();
        }
        return this.carga;
    }

}
