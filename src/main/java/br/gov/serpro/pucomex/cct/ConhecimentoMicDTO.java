
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConhecimentoMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConhecimentoMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConhecimentoMIC"/>
 *         &lt;element name="dataEmissao" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *         &lt;element name="frete" type="{http://www.pucomex.serpro.gov.br/cct}FreteMicDTO"/>
 *         &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}CargaMicDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConhecimentoMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numero",
    "dataEmissao",
    "frete",
    "carga"
})
public class ConhecimentoMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numero;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dataEmissao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected FreteMicDTO frete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected CargaMicDTO carga;

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissao(String value) {
        this.dataEmissao = value;
    }

    /**
     * Obtém o valor da propriedade frete.
     * 
     * @return
     *     possible object is
     *     {@link FreteMicDTO }
     *     
     */
    public FreteMicDTO getFrete() {
        return frete;
    }

    /**
     * Define o valor da propriedade frete.
     * 
     * @param value
     *     allowed object is
     *     {@link FreteMicDTO }
     *     
     */
    public void setFrete(FreteMicDTO value) {
        this.frete = value;
    }

    /**
     * Obtém o valor da propriedade carga.
     * 
     * @return
     *     possible object is
     *     {@link CargaMicDTO }
     *     
     */
    public CargaMicDTO getCarga() {
        return carga;
    }

    /**
     * Define o valor da propriedade carga.
     * 
     * @param value
     *     allowed object is
     *     {@link CargaMicDTO }
     *     
     */
    public void setCarga(CargaMicDTO value) {
        this.carga = value;
    }

}
