
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDocumentoCargaManifestacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaManifestacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/>
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="cargaSoltaVeiculo">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}TCargaSoltaVeiculoPesoBrutoExtend" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="granel" type="{http://www.pucomex.serpro.gov.br/cct}TGranelManifestacao" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="granel" type="{http://www.pucomex.serpro.gov.br/cct}TGranelManifestacao"/>
 *           &lt;/sequence>
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
@XmlType(name = "TDocumentoCargaManifestacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "content"
})
public class TDocumentoCargaManifestacao {

    @XmlElementRefs({
        @XmlElementRef(name = "cargaSoltaVeiculo", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "granel", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numeroRUC", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numeroDUE", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Granel" is used by two different parts of a schema. See: 
     * line 202 of file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd-cct/manifesto/ManifestacaoExportacao.xsd
     * line 194 of file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd-cct/manifesto/ManifestacaoExportacao.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TDocumentoCargaManifestacao.CargaSoltaVeiculo }{@code >}
     * {@link JAXBElement }{@code <}{@link TGranelManifestacao }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}TCargaSoltaVeiculoPesoBrutoExtend" maxOccurs="unbounded"/>
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
        "carga"
    })
    public static class CargaSoltaVeiculo {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<TCargaSoltaVeiculoPesoBrutoExtend> carga;

        /**
         * Gets the value of the carga property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carga property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarga().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCargaSoltaVeiculoPesoBrutoExtend }
         * 
         * 
         */
        public List<TCargaSoltaVeiculoPesoBrutoExtend> getCarga() {
            if (carga == null) {
                carga = new ArrayList<TCargaSoltaVeiculoPesoBrutoExtend>();
            }
            return this.carga;
        }

    }

}
