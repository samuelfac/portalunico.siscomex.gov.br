
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TradeTermsConditionCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTermsConditionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="C+F"/>
 *     &lt;enumeration value="C+I"/>
 *     &lt;enumeration value="CFR"/>
 *     &lt;enumeration value="CIF"/>
 *     &lt;enumeration value="CIP"/>
 *     &lt;enumeration value="CPT"/>
 *     &lt;enumeration value="DAP"/>
 *     &lt;enumeration value="DAT"/>
 *     &lt;enumeration value="DDP"/>
 *     &lt;enumeration value="EXW"/>
 *     &lt;enumeration value="FAS"/>
 *     &lt;enumeration value="FCA"/>
 *     &lt;enumeration value="FOB"/>
 *     &lt;enumeration value="OCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TradeTermsConditionCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum TradeTermsConditionCodeType {

    @XmlEnumValue("C+F")
    C_F("C+F"),
    @XmlEnumValue("C+I")
    C_I("C+I"),
    CFR("CFR"),
    CIF("CIF"),
    CIP("CIP"),
    CPT("CPT"),
    DAP("DAP"),
    DAT("DAT"),
    DDP("DDP"),
    EXW("EXW"),
    FAS("FAS"),
    FCA("FCA"),
    FOB("FOB"),
    OCV("OCV");
    private final String value;

    TradeTermsConditionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeTermsConditionCodeType fromValue(String v) {
        for (TradeTermsConditionCodeType c: TradeTermsConditionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
