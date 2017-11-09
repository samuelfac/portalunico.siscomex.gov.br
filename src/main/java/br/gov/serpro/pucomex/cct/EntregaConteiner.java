
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntregaConteiner complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntregaConteiner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoEntrega" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="identificacaoPessoaJuridica" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocal"/>
 *         &lt;element name="conteineres">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}recebedor"/>
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntregaConteiner", propOrder = {
    "identificacaoEntrega",
    "identificacaoPessoaJuridica",
    "local",
    "conteineres",
    "recebedor",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais"
})
public class EntregaConteiner {

    @XmlElement(required = true)
    protected String identificacaoEntrega;
    @XmlElement(required = true)
    protected String identificacaoPessoaJuridica;
    @XmlElement(required = true)
    protected TLocal local;
    @XmlElement(required = true)
    protected EntregaConteiner.Conteineres conteineres;
    @XmlElement(required = true)
    protected Recebedor recebedor;
    protected String avariasIdentificadas;
    protected String divergenciasIdentificadas;
    protected String observacoesGerais;

    /**
     * Obtém o valor da propriedade identificacaoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoEntrega() {
        return identificacaoEntrega;
    }

    /**
     * Define o valor da propriedade identificacaoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoEntrega(String value) {
        this.identificacaoEntrega = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoPessoaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoPessoaJuridica() {
        return identificacaoPessoaJuridica;
    }

    /**
     * Define o valor da propriedade identificacaoPessoaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoPessoaJuridica(String value) {
        this.identificacaoPessoaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link TLocal }
     *     
     */
    public TLocal getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link TLocal }
     *     
     */
    public void setLocal(TLocal value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade conteineres.
     * 
     * @return
     *     possible object is
     *     {@link EntregaConteiner.Conteineres }
     *     
     */
    public EntregaConteiner.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Define o valor da propriedade conteineres.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaConteiner.Conteineres }
     *     
     */
    public void setConteineres(EntregaConteiner.Conteineres value) {
        this.conteineres = value;
    }

    /**
     * Obtém o valor da propriedade recebedor.
     * 
     * @return
     *     possible object is
     *     {@link Recebedor }
     *     
     */
    public Recebedor getRecebedor() {
        return recebedor;
    }

    /**
     * Define o valor da propriedade recebedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Recebedor }
     *     
     */
    public void setRecebedor(Recebedor value) {
        this.recebedor = value;
    }

    /**
     * Obtém o valor da propriedade avariasIdentificadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvariasIdentificadas() {
        return avariasIdentificadas;
    }

    /**
     * Define o valor da propriedade avariasIdentificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvariasIdentificadas(String value) {
        this.avariasIdentificadas = value;
    }

    /**
     * Obtém o valor da propriedade divergenciasIdentificadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivergenciasIdentificadas() {
        return divergenciasIdentificadas;
    }

    /**
     * Define o valor da propriedade divergenciasIdentificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivergenciasIdentificadas(String value) {
        this.divergenciasIdentificadas = value;
    }

    /**
     * Obtém o valor da propriedade observacoesGerais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Define o valor da propriedade observacoesGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
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
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/>
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
        "conteiner"
    })
    public static class Conteineres {

        @XmlElement(required = true)
        protected List<ConteinerExtend> conteiner;

        /**
         * Gets the value of the conteiner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conteiner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConteiner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConteinerExtend }
         * 
         * 
         */
        public List<ConteinerExtend> getConteiner() {
            if (conteiner == null) {
                conteiner = new ArrayList<ConteinerExtend>();
            }
            return this.conteiner;
        }

    }

}
