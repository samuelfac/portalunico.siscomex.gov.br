
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ManifestacaoExportacaoPreACDMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ManifestacaoExportacaoPreACDMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoManifestacao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="infoGeral" type="{http://www.pucomex.serpro.gov.br/cct}InfoGeralMicDTO"/>
 *         &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}VeiculoRodoviarioMicDTO"/>
 *         &lt;element name="transportador" type="{http://www.pucomex.serpro.gov.br/cct}TransportadorMicDTO"/>
 *         &lt;choice>
 *           &lt;element name="conhecimentos">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}ConhecimentoMicDTO" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}CargaMicDTO"/>
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
@XmlType(name = "ManifestacaoExportacaoPreACDMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoManifestacao",
    "infoGeral",
    "veiculo",
    "transportador",
    "conhecimentos",
    "carga"
})
public class ManifestacaoExportacaoPreACDMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoManifestacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected InfoGeralMicDTO infoGeral;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected VeiculoRodoviarioMicDTO veiculo;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TransportadorMicDTO transportador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ManifestacaoExportacaoPreACDMicDTO.Conhecimentos conhecimentos;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected CargaMicDTO carga;

    /**
     * Obtém o valor da propriedade identificacaoManifestacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoManifestacao() {
        return identificacaoManifestacao;
    }

    /**
     * Define o valor da propriedade identificacaoManifestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoManifestacao(String value) {
        this.identificacaoManifestacao = value;
    }

    /**
     * Obtém o valor da propriedade infoGeral.
     * 
     * @return
     *     possible object is
     *     {@link InfoGeralMicDTO }
     *     
     */
    public InfoGeralMicDTO getInfoGeral() {
        return infoGeral;
    }

    /**
     * Define o valor da propriedade infoGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoGeralMicDTO }
     *     
     */
    public void setInfoGeral(InfoGeralMicDTO value) {
        this.infoGeral = value;
    }

    /**
     * Obtém o valor da propriedade veiculo.
     * 
     * @return
     *     possible object is
     *     {@link VeiculoRodoviarioMicDTO }
     *     
     */
    public VeiculoRodoviarioMicDTO getVeiculo() {
        return veiculo;
    }

    /**
     * Define o valor da propriedade veiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link VeiculoRodoviarioMicDTO }
     *     
     */
    public void setVeiculo(VeiculoRodoviarioMicDTO value) {
        this.veiculo = value;
    }

    /**
     * Obtém o valor da propriedade transportador.
     * 
     * @return
     *     possible object is
     *     {@link TransportadorMicDTO }
     *     
     */
    public TransportadorMicDTO getTransportador() {
        return transportador;
    }

    /**
     * Define o valor da propriedade transportador.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportadorMicDTO }
     *     
     */
    public void setTransportador(TransportadorMicDTO value) {
        this.transportador = value;
    }

    /**
     * Obtém o valor da propriedade conhecimentos.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacaoPreACDMicDTO.Conhecimentos }
     *     
     */
    public ManifestacaoExportacaoPreACDMicDTO.Conhecimentos getConhecimentos() {
        return conhecimentos;
    }

    /**
     * Define o valor da propriedade conhecimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacaoPreACDMicDTO.Conhecimentos }
     *     
     */
    public void setConhecimentos(ManifestacaoExportacaoPreACDMicDTO.Conhecimentos value) {
        this.conhecimentos = value;
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
     *         &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}ConhecimentoMicDTO" maxOccurs="unbounded"/>
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
        "conhecimento"
    })
    public static class Conhecimentos {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<ConhecimentoMicDTO> conhecimento;

        /**
         * Gets the value of the conhecimento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conhecimento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConhecimento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConhecimentoMicDTO }
         * 
         * 
         */
        public List<ConhecimentoMicDTO> getConhecimento() {
            if (conhecimento == null) {
                conhecimento = new ArrayList<ConhecimentoMicDTO>();
            }
            return this.conhecimento;
        }

    }

}
