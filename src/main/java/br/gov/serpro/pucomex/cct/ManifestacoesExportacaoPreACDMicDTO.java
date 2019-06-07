
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="manifestacao" type="{http://www.pucomex.serpro.gov.br/cct}ManifestacaoExportacaoPreACDMicDTO" maxOccurs="unbounded"/>
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
    "manifestacao"
})
@XmlRootElement(name = "ManifestacoesExportacaoPreACDMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class ManifestacoesExportacaoPreACDMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected List<ManifestacaoExportacaoPreACDMicDTO> manifestacao;

    /**
     * Gets the value of the manifestacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manifestacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManifestacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifestacaoExportacaoPreACDMicDTO }
     * 
     * 
     */
    public List<ManifestacaoExportacaoPreACDMicDTO> getManifestacao() {
        if (manifestacao == null) {
            manifestacao = new ArrayList<ManifestacaoExportacaoPreACDMicDTO>();
        }
        return this.manifestacao;
    }

}
