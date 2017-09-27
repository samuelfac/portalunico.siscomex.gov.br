//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TUnitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TUnitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentosUnitizacao"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}conteineres"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUnitizacao", propOrder = {
    "documentosUnitizacao",
    "conteineres"
})
public class TUnitizacao {

    @XmlElement(required = true)
    protected DocumentosUnitizacao documentosUnitizacao;
    @XmlElement(required = true)
    protected Conteineres conteineres;

    /**
     * Obtém o valor da propriedade documentosUnitizacao.
     * 
     * @return
     *     possible object is
     *     {@link DocumentosUnitizacao }
     *     
     */
    public DocumentosUnitizacao getDocumentosUnitizacao() {
        return documentosUnitizacao;
    }

    /**
     * Define o valor da propriedade documentosUnitizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentosUnitizacao }
     *     
     */
    public void setDocumentosUnitizacao(DocumentosUnitizacao value) {
        this.documentosUnitizacao = value;
    }

    /**
     * Obtém o valor da propriedade conteineres.
     * 
     * @return
     *     possible object is
     *     {@link Conteineres }
     *     
     */
    public Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Define o valor da propriedade conteineres.
     * 
     * @param value
     *     allowed object is
     *     {@link Conteineres }
     *     
     */
    public void setConteineres(Conteineres value) {
        this.conteineres = value;
    }

}
