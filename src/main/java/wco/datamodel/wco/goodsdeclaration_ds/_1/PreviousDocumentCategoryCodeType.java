
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PreviousDocumentCategoryCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PreviousDocumentCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DSI"/>
 *     &lt;enumeration value="DSIF"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="EDBV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreviousDocumentCategoryCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum PreviousDocumentCategoryCodeType {


    /**
     * Declaração Simplificada de Importação
     * 
     */
    DSI,

    /**
     * Declaração Simplificada de Importação - Formulário
     * 
     */
    DSIF,

    /**
     * Declaração de Importação
     * 
     */
    DI,

    /**
     * e-DBV
     * 
     */
    EDBV;

    public String value() {
        return name();
    }

    public static PreviousDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
