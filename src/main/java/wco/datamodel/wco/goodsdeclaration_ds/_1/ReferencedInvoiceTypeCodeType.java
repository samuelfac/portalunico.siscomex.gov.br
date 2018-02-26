
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencedInvoiceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferencedInvoiceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="REM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferencedInvoiceTypeCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum ReferencedInvoiceTypeCodeType {


    /**
     * Nota Fiscal Complementar
     * 
     */
    COM,

    /**
     * Nota Fiscal de Remessa
     * 
     */
    REM;

    public String value() {
        return name();
    }

    public static ReferencedInvoiceTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
