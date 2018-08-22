
package wco.datamodel.wco.goodsdeclaration._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DeclarationNFe" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationNFe"/>
 *         &lt;element name="DeclarationNoNF" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationNoNF"/>
 *         &lt;element name="DeclarationDrawbackIsencao" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationDrawbackIsencao"/>
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
    "declarationNoNF",
    "declarationDrawbackIsencao"
})
@XmlRootElement(name = "Declaration", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
public class Declaration {

    @XmlElement(name = "DeclarationNFe", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
    protected DeclarationNFe declarationNFe;
    @XmlElement(name = "DeclarationNoNF", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
    protected DeclarationNoNF declarationNoNF;
    @XmlElement(name = "DeclarationDrawbackIsencao", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
    protected DeclarationDrawbackIsencao declarationDrawbackIsencao;

    /**
     * Obtém o valor da propriedade declarationNFe.
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
     * Define o valor da propriedade declarationNFe.
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
     * Obtém o valor da propriedade declarationNoNF.
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
     * Define o valor da propriedade declarationNoNF.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF }
     *     
     */
    public void setDeclarationNoNF(DeclarationNoNF value) {
        this.declarationNoNF = value;
    }

    /**
     * Obtém o valor da propriedade declarationDrawbackIsencao.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationDrawbackIsencao }
     *     
     */
    public DeclarationDrawbackIsencao getDeclarationDrawbackIsencao() {
        return declarationDrawbackIsencao;
    }

    /**
     * Define o valor da propriedade declarationDrawbackIsencao.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationDrawbackIsencao }
     *     
     */
    public void setDeclarationDrawbackIsencao(DeclarationDrawbackIsencao value) {
        this.declarationDrawbackIsencao = value;
    }

}
