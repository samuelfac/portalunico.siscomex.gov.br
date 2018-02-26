
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentoTransporte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}IdDocumentoTransporte"/>
 *         &lt;element name="tipoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}TipoDocumentoTransporte"/>
 *         &lt;element name="dataEmissaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *         &lt;element name="dadosVeiculoConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/>
 *         &lt;element name="dadosUnidadeTransporteConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/>
 *         &lt;element name="dadosConteinerConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/>
 *         &lt;element name="dadosEmbalagemConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/>
 *         &lt;choice>
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoDocumentoTransporte",
    "tipoDocumentoTransporte",
    "dataEmissaoDocumentoTransporte",
    "dadosVeiculoConferem",
    "dadosUnidadeTransporteConferem",
    "dadosConteinerConferem",
    "dadosEmbalagemConferem",
    "pesoAferido",
    "motivoNaoPesagem"
})
public class DocumentoTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoDocumentoTransporte;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String tipoDocumentoTransporte;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dataEmissaoDocumentoTransporte;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dadosVeiculoConferem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dadosUnidadeTransporteConferem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dadosConteinerConferem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dadosEmbalagemConferem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigDecimal pesoAferido;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String motivoNaoPesagem;

    /**
     * Gets the value of the identificacaoDocumentoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoDocumentoTransporte() {
        return identificacaoDocumentoTransporte;
    }

    /**
     * Sets the value of the identificacaoDocumentoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoDocumentoTransporte(String value) {
        this.identificacaoDocumentoTransporte = value;
    }

    /**
     * Gets the value of the tipoDocumentoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoTransporte() {
        return tipoDocumentoTransporte;
    }

    /**
     * Sets the value of the tipoDocumentoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoTransporte(String value) {
        this.tipoDocumentoTransporte = value;
    }

    /**
     * Gets the value of the dataEmissaoDocumentoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoDocumentoTransporte() {
        return dataEmissaoDocumentoTransporte;
    }

    /**
     * Sets the value of the dataEmissaoDocumentoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoDocumentoTransporte(String value) {
        this.dataEmissaoDocumentoTransporte = value;
    }

    /**
     * Gets the value of the dadosVeiculoConferem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosVeiculoConferem() {
        return dadosVeiculoConferem;
    }

    /**
     * Sets the value of the dadosVeiculoConferem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosVeiculoConferem(String value) {
        this.dadosVeiculoConferem = value;
    }

    /**
     * Gets the value of the dadosUnidadeTransporteConferem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosUnidadeTransporteConferem() {
        return dadosUnidadeTransporteConferem;
    }

    /**
     * Sets the value of the dadosUnidadeTransporteConferem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosUnidadeTransporteConferem(String value) {
        this.dadosUnidadeTransporteConferem = value;
    }

    /**
     * Gets the value of the dadosConteinerConferem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosConteinerConferem() {
        return dadosConteinerConferem;
    }

    /**
     * Sets the value of the dadosConteinerConferem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosConteinerConferem(String value) {
        this.dadosConteinerConferem = value;
    }

    /**
     * Gets the value of the dadosEmbalagemConferem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadosEmbalagemConferem() {
        return dadosEmbalagemConferem;
    }

    /**
     * Sets the value of the dadosEmbalagemConferem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadosEmbalagemConferem(String value) {
        this.dadosEmbalagemConferem = value;
    }

    /**
     * Gets the value of the pesoAferido property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    /**
     * Sets the value of the pesoAferido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoAferido(BigDecimal value) {
        this.pesoAferido = value;
    }

    /**
     * Gets the value of the motivoNaoPesagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    /**
     * Sets the value of the motivoNaoPesagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNaoPesagem(String value) {
        this.motivoNaoPesagem = value;
    }

}
