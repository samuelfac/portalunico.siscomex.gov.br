
package br.gov.serpro.pucomex.cct;

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
@XmlRootElement(name = "ManifestacoesExportacao")
public class ManifestacoesExportacao {

    @XmlElement(required = true)
    protected ManifestacaoExportacao manifestacao;

    /**
     * Obtém o valor da propriedade manifestacao.
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
     * Define o valor da propriedade manifestacao.
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
