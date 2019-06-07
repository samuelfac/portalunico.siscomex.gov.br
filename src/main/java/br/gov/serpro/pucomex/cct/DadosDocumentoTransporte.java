
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosDocumentoTransporte complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosDocumentoTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localSaida" type="{http://www.pucomex.serpro.gov.br/cct}LocalCompleto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDocumentoTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "localSaida"
})
public class DadosDocumentoTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected LocalCompleto localSaida;

    /**
     * Obtém o valor da propriedade localSaida.
     * 
     * @return
     *     possible object is
     *     {@link LocalCompleto }
     *     
     */
    public LocalCompleto getLocalSaida() {
        return localSaida;
    }

    /**
     * Define o valor da propriedade localSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalCompleto }
     *     
     */
    public void setLocalSaida(LocalCompleto value) {
        this.localSaida = value;
    }

}
