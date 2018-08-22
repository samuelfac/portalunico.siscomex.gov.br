
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DocumentoTransporte complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade identificacaoDocumentoTransporte.
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
     * Define o valor da propriedade identificacaoDocumentoTransporte.
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
     * Obtém o valor da propriedade tipoDocumentoTransporte.
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
     * Define o valor da propriedade tipoDocumentoTransporte.
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
     * Obtém o valor da propriedade dataEmissaoDocumentoTransporte.
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
     * Define o valor da propriedade dataEmissaoDocumentoTransporte.
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
     * Obtém o valor da propriedade dadosVeiculoConferem.
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
     * Define o valor da propriedade dadosVeiculoConferem.
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
     * Obtém o valor da propriedade dadosUnidadeTransporteConferem.
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
     * Define o valor da propriedade dadosUnidadeTransporteConferem.
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
     * Obtém o valor da propriedade dadosConteinerConferem.
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
     * Define o valor da propriedade dadosConteinerConferem.
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
     * Obtém o valor da propriedade dadosEmbalagemConferem.
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
     * Define o valor da propriedade dadosEmbalagemConferem.
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
     * Obtém o valor da propriedade pesoAferido.
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
     * Define o valor da propriedade pesoAferido.
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
     * Obtém o valor da propriedade motivoNaoPesagem.
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
     * Define o valor da propriedade motivoNaoPesagem.
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
