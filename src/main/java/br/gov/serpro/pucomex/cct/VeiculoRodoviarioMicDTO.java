
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VeiculoRodoviarioMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VeiculoRodoviarioMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chassi" type="{http://www.pucomex.serpro.gov.br/cct}ChassiVeiculo"/>
 *         &lt;element name="anoFabricacao" type="{http://www.pucomex.serpro.gov.br/cct}Ano"/>
 *         &lt;element name="marca" type="{http://www.pucomex.serpro.gov.br/cct}MarcaVeiculo"/>
 *         &lt;element name="capacidadeTracao" type="{http://www.pucomex.serpro.gov.br/cct}Dec_2v1"/>
 *         &lt;choice>
 *           &lt;element name="truck" type="{http://www.pucomex.serpro.gov.br/cct}TruckMicDTO"/>
 *           &lt;element name="cavaloComReboque" type="{http://www.pucomex.serpro.gov.br/cct}CavaloComReboqueMicDTO"/>
 *         &lt;/choice>
 *         &lt;element name="condutor" type="{http://www.pucomex.serpro.gov.br/cct}CondutorVeiculoMicDTO"/>
 *         &lt;element name="proprietario" type="{http://www.pucomex.serpro.gov.br/cct}ProprietarioVeiculoMicDTO" minOccurs="0"/>
 *         &lt;element name="observacoes" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica200" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiculoRodoviarioMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "chassi",
    "anoFabricacao",
    "marca",
    "capacidadeTracao",
    "truck",
    "cavaloComReboque",
    "condutor",
    "proprietario",
    "observacoes"
})
public class VeiculoRodoviarioMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String chassi;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger anoFabricacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String marca;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal capacidadeTracao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TruckMicDTO truck;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected CavaloComReboqueMicDTO cavaloComReboque;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected CondutorVeiculoMicDTO condutor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ProprietarioVeiculoMicDTO proprietario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String observacoes;

    /**
     * Obtém o valor da propriedade chassi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Define o valor da propriedade chassi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassi(String value) {
        this.chassi = value;
    }

    /**
     * Obtém o valor da propriedade anoFabricacao.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * Define o valor da propriedade anoFabricacao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnoFabricacao(BigInteger value) {
        this.anoFabricacao = value;
    }

    /**
     * Obtém o valor da propriedade marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define o valor da propriedade marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtém o valor da propriedade capacidadeTracao.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapacidadeTracao() {
        return capacidadeTracao;
    }

    /**
     * Define o valor da propriedade capacidadeTracao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapacidadeTracao(BigDecimal value) {
        this.capacidadeTracao = value;
    }

    /**
     * Obtém o valor da propriedade truck.
     * 
     * @return
     *     possible object is
     *     {@link TruckMicDTO }
     *     
     */
    public TruckMicDTO getTruck() {
        return truck;
    }

    /**
     * Define o valor da propriedade truck.
     * 
     * @param value
     *     allowed object is
     *     {@link TruckMicDTO }
     *     
     */
    public void setTruck(TruckMicDTO value) {
        this.truck = value;
    }

    /**
     * Obtém o valor da propriedade cavaloComReboque.
     * 
     * @return
     *     possible object is
     *     {@link CavaloComReboqueMicDTO }
     *     
     */
    public CavaloComReboqueMicDTO getCavaloComReboque() {
        return cavaloComReboque;
    }

    /**
     * Define o valor da propriedade cavaloComReboque.
     * 
     * @param value
     *     allowed object is
     *     {@link CavaloComReboqueMicDTO }
     *     
     */
    public void setCavaloComReboque(CavaloComReboqueMicDTO value) {
        this.cavaloComReboque = value;
    }

    /**
     * Obtém o valor da propriedade condutor.
     * 
     * @return
     *     possible object is
     *     {@link CondutorVeiculoMicDTO }
     *     
     */
    public CondutorVeiculoMicDTO getCondutor() {
        return condutor;
    }

    /**
     * Define o valor da propriedade condutor.
     * 
     * @param value
     *     allowed object is
     *     {@link CondutorVeiculoMicDTO }
     *     
     */
    public void setCondutor(CondutorVeiculoMicDTO value) {
        this.condutor = value;
    }

    /**
     * Obtém o valor da propriedade proprietario.
     * 
     * @return
     *     possible object is
     *     {@link ProprietarioVeiculoMicDTO }
     *     
     */
    public ProprietarioVeiculoMicDTO getProprietario() {
        return proprietario;
    }

    /**
     * Define o valor da propriedade proprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietarioVeiculoMicDTO }
     *     
     */
    public void setProprietario(ProprietarioVeiculoMicDTO value) {
        this.proprietario = value;
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
