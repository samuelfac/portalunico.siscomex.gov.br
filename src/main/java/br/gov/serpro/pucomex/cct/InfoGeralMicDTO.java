
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InfoGeralMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InfoGeralMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="cpfManifestador" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *           &lt;element name="cnpjManifestador" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;/choice>
 *         &lt;element name="paisDestino" type="{http://www.pucomex.serpro.gov.br/cct}PaisDestinoMIC"/>
 *         &lt;element name="cidadeDestino" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *         &lt;element name="indTransitoAduaneiroInternacional" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="docTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DocTransporteMicDTO"/>
 *         &lt;element name="localSaida" type="{http://www.pucomex.serpro.gov.br/cct}LocalMicDTO"/>
 *         &lt;element name="observacoes" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoGeralMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "cpfManifestador",
    "cnpjManifestador",
    "paisDestino",
    "cidadeDestino",
    "indTransitoAduaneiroInternacional",
    "docTransporte",
    "localSaida",
    "observacoes"
})
public class InfoGeralMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cpfManifestador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjManifestador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    @XmlSchemaType(name = "string")
    protected PaisDestinoMIC paisDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String cidadeDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String indTransitoAduaneiroInternacional;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected DocTransporteMicDTO docTransporte;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected LocalMicDTO localSaida;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String observacoes;

    /**
     * Obtém o valor da propriedade cpfManifestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfManifestador() {
        return cpfManifestador;
    }

    /**
     * Define o valor da propriedade cpfManifestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfManifestador(String value) {
        this.cpfManifestador = value;
    }

    /**
     * Obtém o valor da propriedade cnpjManifestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjManifestador() {
        return cnpjManifestador;
    }

    /**
     * Define o valor da propriedade cnpjManifestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjManifestador(String value) {
        this.cnpjManifestador = value;
    }

    /**
     * Obtém o valor da propriedade paisDestino.
     * 
     * @return
     *     possible object is
     *     {@link PaisDestinoMIC }
     *     
     */
    public PaisDestinoMIC getPaisDestino() {
        return paisDestino;
    }

    /**
     * Define o valor da propriedade paisDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link PaisDestinoMIC }
     *     
     */
    public void setPaisDestino(PaisDestinoMIC value) {
        this.paisDestino = value;
    }

    /**
     * Obtém o valor da propriedade cidadeDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDestino() {
        return cidadeDestino;
    }

    /**
     * Define o valor da propriedade cidadeDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDestino(String value) {
        this.cidadeDestino = value;
    }

    /**
     * Obtém o valor da propriedade indTransitoAduaneiroInternacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTransitoAduaneiroInternacional() {
        return indTransitoAduaneiroInternacional;
    }

    /**
     * Define o valor da propriedade indTransitoAduaneiroInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTransitoAduaneiroInternacional(String value) {
        this.indTransitoAduaneiroInternacional = value;
    }

    /**
     * Obtém o valor da propriedade docTransporte.
     * 
     * @return
     *     possible object is
     *     {@link DocTransporteMicDTO }
     *     
     */
    public DocTransporteMicDTO getDocTransporte() {
        return docTransporte;
    }

    /**
     * Define o valor da propriedade docTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTransporteMicDTO }
     *     
     */
    public void setDocTransporte(DocTransporteMicDTO value) {
        this.docTransporte = value;
    }

    /**
     * Obtém o valor da propriedade localSaida.
     * 
     * @return
     *     possible object is
     *     {@link LocalMicDTO }
     *     
     */
    public LocalMicDTO getLocalSaida() {
        return localSaida;
    }

    /**
     * Define o valor da propriedade localSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMicDTO }
     *     
     */
    public void setLocalSaida(LocalMicDTO value) {
        this.localSaida = value;
    }

    /**
     * Obtém o valor da propriedade observacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * Define o valor da propriedade observacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoes(String value) {
        this.observacoes = value;
    }

}
