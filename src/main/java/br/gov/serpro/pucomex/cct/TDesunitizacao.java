
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDesunitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDesunitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="numeroConteiner" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConteiner"/>
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}notasFiscais" minOccurs="0"/>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}itensDUE" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;sequence>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}notasFiscais"/>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}itensDUE" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;sequence>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}itensDUE"/>
 *             &lt;/sequence>
 *             &lt;sequence>
 *               &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}duimps"/>
 *             &lt;/sequence>
 *           &lt;/choice>
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
@XmlType(name = "TDesunitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "content"
})
public class TDesunitizacao {

    @XmlElementRefs({
        @XmlElementRef(name = "duimps", namespace = "http://www.pucomex.serpro.gov.br/cct", type = Duimps.class, required = false),
        @XmlElementRef(name = "notasFiscais", namespace = "http://www.pucomex.serpro.gov.br/cct", type = NotasFiscais.class, required = false),
        @XmlElementRef(name = "numeroConteiner", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "documentos", namespace = "http://www.pucomex.serpro.gov.br/cct", type = Documentos.class, required = false),
        @XmlElementRef(name = "itensDUE", namespace = "http://www.pucomex.serpro.gov.br/cct", type = ItensDUE.class, required = false)
    })
    protected List<Object> content;

    /**
     * Obtém o restante do modelo do conteúdo. 
     * 
     * <p>
     * Você está obtendo esta propriedade "catch-all" pelo seguinte motivo: 
     * O nome do campo "NotasFiscais" é usado por duas partes diferentes de um esquema. Consulte: 
     * linha 46 de file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd/unitizacao/Desunitizacao.xsd
     * linha 42 de file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd/unitizacao/Desunitizacao.xsd
     * <p>
     * Para eliminar esta propriedade, aplique uma personalização de propriedade a uma 
     * das seguintes declarações, a fim de alterar seus nomes: 
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
     * {@link NotasFiscais }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Duimps }
     * {@link Documentos }
     * {@link ItensDUE }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
