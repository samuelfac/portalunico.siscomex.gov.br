
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
 * <p>Java class for DadosCarga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignadoAOrdem" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="nomeConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60" minOccurs="0"/>
 *         &lt;element name="enderecoConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120" minOccurs="0"/>
 *         &lt;element name="paisDestino" type="{http://www.pucomex.serpro.gov.br/cct}Pais" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}conteiner"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="documentos">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="documento" type="{http://www.pucomex.serpro.gov.br/cct}TDocumentoCargaManifestacao" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}conteiner" minOccurs="0"/>
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
@XmlType(name = "DadosCarga", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "content"
})
public class DadosCarga {

    @XmlElementRefs({
        @XmlElementRef(name = "documentos", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nomeConsignatario", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "conteiner", namespace = "http://www.pucomex.serpro.gov.br/cct", type = Conteiner.class, required = false),
        @XmlElementRef(name = "enderecoConsignatario", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paisDestino", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consignadoAOrdem", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false)
    })
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Conteiner" is used by two different parts of a schema. See: 
     * line 154 of file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd-cct/manifesto/ManifestacaoExportacao.xsd
     * line 135 of file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd-cct/manifesto/ManifestacaoExportacao.xsd
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DadosCarga.Documentos }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Conteiner }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
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
     *         &lt;element name="documento" type="{http://www.pucomex.serpro.gov.br/cct}TDocumentoCargaManifestacao" maxOccurs="unbounded"/>
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
        "documento"
    })
    public static class Documentos {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<TDocumentoCargaManifestacao> documento;

        /**
         * Gets the value of the documento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TDocumentoCargaManifestacao }
         * 
         * 
         */
        public List<TDocumentoCargaManifestacao> getDocumento() {
            if (documento == null) {
                documento = new ArrayList<TDocumentoCargaManifestacao>();
            }
            return this.documento;
        }

    }

}
