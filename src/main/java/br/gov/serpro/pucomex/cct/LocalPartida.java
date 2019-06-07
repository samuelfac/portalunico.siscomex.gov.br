
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LocalPartida complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocalPartida">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pucomex.serpro.gov.br/cct}LocalCompleto">
 *       &lt;sequence>
 *         &lt;element name="uf" type="{http://www.pucomex.serpro.gov.br/cct}UF2"/>
 *         &lt;element name="cidade" type="{http://www.pucomex.serpro.gov.br/cct}CodigoMunicipio"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalPartida", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "uf",
    "cidade"
})
public class LocalPartida
    extends LocalCompleto
{

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String uf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger cidade;

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCidade(BigInteger value) {
        this.cidade = value;
    }

}
