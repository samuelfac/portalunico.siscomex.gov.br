
package wco.datamodel.wco.goodsdeclaration._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DeclarationNFe" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationNFe"/>
 *         &lt;element name="DeclarationNoNF" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationNoNF"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "declarationNFe",
    "declarationNoNF"
})
@XmlRootElement(name = "Declaration", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
public class Declaration {

    @XmlElement(name = "DeclarationNFe", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
    protected DeclarationNFe declarationNFe;
    @XmlElement(name = "DeclarationNoNF", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
    protected DeclarationNoNF declarationNoNF;

    /**
     * Gets the value of the declarationNFe property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNFe }
     *     
     */
    public DeclarationNFe getDeclarationNFe() {
        return declarationNFe;
    }

    /**
     * Sets the value of the declarationNFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNFe }
     *     
     */
    public void setDeclarationNFe(DeclarationNFe value) {
        this.declarationNFe = value;
    }

    /**
     * Gets the value of the declarationNoNF property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNoNF }
     *     
     */
    public DeclarationNoNF getDeclarationNoNF() {
        return declarationNoNF;
    }

    /**
     * Sets the value of the declarationNoNF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF }
     *     
     */
    public void setDeclarationNoNF(DeclarationNoNF value) {
        this.declarationNoNF = value;
    }

}
