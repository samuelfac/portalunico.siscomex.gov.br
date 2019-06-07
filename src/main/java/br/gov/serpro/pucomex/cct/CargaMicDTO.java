
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CargaMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CargaMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignatario" type="{http://www.pucomex.serpro.gov.br/cct}ConsignatarioCargaMicDTO"/>
 *         &lt;element name="remetente" type="{http://www.pucomex.serpro.gov.br/cct}RemetenteCargaMicDTO"/>
 *         &lt;element name="destinatario" type="{http://www.pucomex.serpro.gov.br/cct}DestinatarioCargaMicDTO"/>
 *         &lt;element name="codigoAduanaDestino" type="{http://www.pucomex.serpro.gov.br/cct}CodigoAduanaDestino" minOccurs="0"/>
 *         &lt;element name="nomeAduanaDestino" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *         &lt;element name="paisOrigemMercadorias" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/>
 *         &lt;element name="valorFOTMercadorias" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/>
 *         &lt;element name="moedaValorFOT" type="{http://www.pucomex.serpro.gov.br/cct}Moeda"/>
 *         &lt;element name="valorSeguro" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202" minOccurs="0"/>
 *         &lt;element name="moedaValorSeguro" type="{http://www.pucomex.serpro.gov.br/cct}MoedaDolarDosEUA" minOccurs="0"/>
 *         &lt;element name="codigoTiposVolumes" type="{http://www.pucomex.serpro.gov.br/cct}CodigoTiposVolumes" minOccurs="0"/>
 *         &lt;element name="nomeTiposVolumes" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/>
 *         &lt;element name="qtdeVolumes" type="{http://www.pucomex.serpro.gov.br/cct}QuantidadeVolumes" minOccurs="0"/>
 *         &lt;element name="pesoBruto" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *         &lt;element name="descricaoMercadorias" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica500"/>
 *         &lt;element name="documentosAnexos" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica400"/>
 *         &lt;element name="nfes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nfe" type="{http://www.pucomex.serpro.gov.br/cct}NFeCargaMicDTO" maxOccurs="50"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "consignatario",
    "remetente",
    "destinatario",
    "codigoAduanaDestino",
    "nomeAduanaDestino",
    "paisOrigemMercadorias",
    "valorFOTMercadorias",
    "moedaValorFOT",
    "valorSeguro",
    "moedaValorSeguro",
    "codigoTiposVolumes",
    "nomeTiposVolumes",
    "qtdeVolumes",
    "pesoBruto",
    "descricaoMercadorias",
    "documentosAnexos",
    "nfes"
})
public class CargaMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected ConsignatarioCargaMicDTO consignatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RemetenteCargaMicDTO remetente;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected DestinatarioCargaMicDTO destinatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigInteger codigoAduanaDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String nomeAduanaDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String paisOrigemMercadorias;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal valorFOTMercadorias;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String moedaValorFOT;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigDecimal valorSeguro;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String moedaValorSeguro;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigInteger codigoTiposVolumes;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String nomeTiposVolumes;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    @XmlSchemaType(name = "integer")
    protected Integer qtdeVolumes;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal pesoBruto;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String descricaoMercadorias;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String documentosAnexos;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected CargaMicDTO.Nfes nfes;

    /**
     * Obtém o valor da propriedade consignatario.
     * 
     * @return
     *     possible object is
     *     {@link ConsignatarioCargaMicDTO }
     *     
     */
    public ConsignatarioCargaMicDTO getConsignatario() {
        return consignatario;
    }

    /**
     * Define o valor da propriedade consignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignatarioCargaMicDTO }
     *     
     */
    public void setConsignatario(ConsignatarioCargaMicDTO value) {
        this.consignatario = value;
    }

    /**
     * Obtém o valor da propriedade remetente.
     * 
     * @return
     *     possible object is
     *     {@link RemetenteCargaMicDTO }
     *     
     */
    public RemetenteCargaMicDTO getRemetente() {
        return remetente;
    }

    /**
     * Define o valor da propriedade remetente.
     * 
     * @param value
     *     allowed object is
     *     {@link RemetenteCargaMicDTO }
     *     
     */
    public void setRemetente(RemetenteCargaMicDTO value) {
        this.remetente = value;
    }

    /**
     * Obtém o valor da propriedade destinatario.
     * 
     * @return
     *     possible object is
     *     {@link DestinatarioCargaMicDTO }
     *     
     */
    public DestinatarioCargaMicDTO getDestinatario() {
        return destinatario;
    }

    /**
     * Define o valor da propriedade destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinatarioCargaMicDTO }
     *     
     */
    public void setDestinatario(DestinatarioCargaMicDTO value) {
        this.destinatario = value;
    }

    /**
     * Obtém o valor da propriedade codigoAduanaDestino.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoAduanaDestino() {
        return codigoAduanaDestino;
    }

    /**
     * Define o valor da propriedade codigoAduanaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoAduanaDestino(BigInteger value) {
        this.codigoAduanaDestino = value;
    }

    /**
     * Obtém o valor da propriedade nomeAduanaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAduanaDestino() {
        return nomeAduanaDestino;
    }

    /**
     * Define o valor da propriedade nomeAduanaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAduanaDestino(String value) {
        this.nomeAduanaDestino = value;
    }

    /**
     * Obtém o valor da propriedade paisOrigemMercadorias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigemMercadorias() {
        return paisOrigemMercadorias;
    }

    /**
     * Define o valor da propriedade paisOrigemMercadorias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigemMercadorias(String value) {
        this.paisOrigemMercadorias = value;
    }

    /**
     * Obtém o valor da propriedade valorFOTMercadorias.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFOTMercadorias() {
        return valorFOTMercadorias;
    }

    /**
     * Define o valor da propriedade valorFOTMercadorias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFOTMercadorias(BigDecimal value) {
        this.valorFOTMercadorias = value;
    }

    /**
     * Obtém o valor da propriedade moedaValorFOT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoedaValorFOT() {
        return moedaValorFOT;
    }

    /**
     * Define o valor da propriedade moedaValorFOT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoedaValorFOT(String value) {
        this.moedaValorFOT = value;
    }

    /**
     * Obtém o valor da propriedade valorSeguro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    /**
     * Define o valor da propriedade valorSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorSeguro(BigDecimal value) {
        this.valorSeguro = value;
    }

    /**
     * Obtém o valor da propriedade moedaValorSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoedaValorSeguro() {
        return moedaValorSeguro;
    }

    /**
     * Define o valor da propriedade moedaValorSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoedaValorSeguro(String value) {
        this.moedaValorSeguro = value;
    }

    /**
     * Obtém o valor da propriedade codigoTiposVolumes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoTiposVolumes() {
        return codigoTiposVolumes;
    }

    /**
     * Define o valor da propriedade codigoTiposVolumes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoTiposVolumes(BigInteger value) {
        this.codigoTiposVolumes = value;
    }

    /**
     * Obtém o valor da propriedade nomeTiposVolumes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTiposVolumes() {
        return nomeTiposVolumes;
    }

    /**
     * Define o valor da propriedade nomeTiposVolumes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTiposVolumes(String value) {
        this.nomeTiposVolumes = value;
    }

    /**
     * Obtém o valor da propriedade qtdeVolumes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdeVolumes() {
        return qtdeVolumes;
    }

    /**
     * Define o valor da propriedade qtdeVolumes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdeVolumes(Integer value) {
        this.qtdeVolumes = value;
    }

    /**
     * Obtém o valor da propriedade pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define o valor da propriedade pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoBruto(BigDecimal value) {
        this.pesoBruto = value;
    }

    /**
     * Obtém o valor da propriedade descricaoMercadorias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoMercadorias() {
        return descricaoMercadorias;
    }

    /**
     * Define o valor da propriedade descricaoMercadorias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoMercadorias(String value) {
        this.descricaoMercadorias = value;
    }

    /**
     * Obtém o valor da propriedade documentosAnexos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentosAnexos() {
        return documentosAnexos;
    }

    /**
     * Define o valor da propriedade documentosAnexos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentosAnexos(String value) {
        this.documentosAnexos = value;
    }

    /**
     * Obtém o valor da propriedade nfes.
     * 
     * @return
     *     possible object is
     *     {@link CargaMicDTO.Nfes }
     *     
     */
    public CargaMicDTO.Nfes getNfes() {
        return nfes;
    }

    /**
     * Define o valor da propriedade nfes.
     * 
     * @param value
     *     allowed object is
     *     {@link CargaMicDTO.Nfes }
     *     
     */
    public void setNfes(CargaMicDTO.Nfes value) {
        this.nfes = value;
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
     *         &lt;element name="nfe" type="{http://www.pucomex.serpro.gov.br/cct}NFeCargaMicDTO" maxOccurs="50"/>
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
        "nfe"
    })
    public static class Nfes {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<NFeCargaMicDTO> nfe;

        /**
         * Gets the value of the nfe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nfe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNfe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NFeCargaMicDTO }
         * 
         * 
         */
        public List<NFeCargaMicDTO> getNfe() {
            if (nfe == null) {
                nfe = new ArrayList<NFeCargaMicDTO>();
            }
            return this.nfe;
        }

    }

}
