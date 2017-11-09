
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GoodsMeasureTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlType(name = "GoodsMeasureTypeCodeType")
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
