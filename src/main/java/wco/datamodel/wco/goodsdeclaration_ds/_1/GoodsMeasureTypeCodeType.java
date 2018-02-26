
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodsMeasureTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodsMeasureTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AAF"/>
 *     &lt;enumeration value="ABW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GoodsMeasureTypeCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum GoodsMeasureTypeCodeType {


    /**
     * Unidade de medida estatística
     * 
     */
    AAF,

    /**
     * Unidade comercial
     * 
     */
    ABW;

    public String value() {
        return name();
    }

    public static GoodsMeasureTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
