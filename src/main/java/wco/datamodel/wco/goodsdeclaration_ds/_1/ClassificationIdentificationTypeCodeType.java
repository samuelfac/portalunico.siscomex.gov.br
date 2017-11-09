
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ClassificationIdentificationTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassificationIdentificationTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassificationIdentificationTypeCodeType")
@XmlEnum
public enum ClassificationIdentificationTypeCodeType {

    HS;

    public String value() {
        return name();
    }

    public static ClassificationIdentificationTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
