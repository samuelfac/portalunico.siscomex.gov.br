
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TGranel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TGranel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoGranel" type="{http://www.pucomex.serpro.gov.br/cct}TipoGranel"/>
 *         &lt;element name="unidademedida" type="{http://www.pucomex.serpro.gov.br/cct}UnidadeMedida"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="total" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *             &lt;element name="quantidade" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="quantidade" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
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
@XmlType(name = "TGranel", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "content"
})
@XmlSeeAlso({
    TGranelPesoBrutoExtend.class
})
public class TGranel {

    @XmlElementRefs({
        @XmlElementRef(name = "unidademedida", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tipoGranel", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "total", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quantidade", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Quantidade" is used by two different parts of a schema. See: 
     * line 100 of file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd-cct/TipoComplexo.xsd
     * line 97 of file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd-cct/TipoComplexo.xsd
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
     * {@link JAXBElement }{@code <}{@link UnidadeMedida }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
