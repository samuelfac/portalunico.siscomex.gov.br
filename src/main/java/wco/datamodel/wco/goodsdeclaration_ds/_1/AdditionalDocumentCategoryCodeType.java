
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDocumentCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDocumentCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DSG"/>
 *     &lt;enumeration value="DSI"/>
 *     &lt;enumeration value="DSIG"/>
 *     &lt;enumeration value="LPCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDocumentCategoryCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum AdditionalDocumentCategoryCodeType {


    /**
     * Drawback Suspensão Comum
     * 
     */
    AC,

    /**
     * Drawback Suspensão Genérico
     * 
     */
    DSG,

    /**
     * Drawback Suspensão Intermediário
     * 
     */
    DSI,

    /**
     * Drawback Suspensão Intermediário genérico
     * 
     */
    DSIG,

    /**
     * LPCO
     * 
     */
    LPCO;

    public String value() {
        return name();
    }

    public static AdditionalDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
