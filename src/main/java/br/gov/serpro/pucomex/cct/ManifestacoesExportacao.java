
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manifestacao" type="{http://www.pucomex.serpro.gov.br/cct}ManifestacaoExportacao"/>
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
@XmlRootElement(name = "ManifestacoesExportacao", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class ManifestacoesExportacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected ManifestacaoExportacao manifestacao;

    /**
     * Gets the value of the manifestacao property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacao }
     *     
     */
    public ManifestacaoExportacao getManifestacao() {
        return manifestacao;
    }

    /**
     * Sets the value of the manifestacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacao }
     *     
     */
    public void setManifestacao(ManifestacaoExportacao value) {
        this.manifestacao = value;
    }

}
