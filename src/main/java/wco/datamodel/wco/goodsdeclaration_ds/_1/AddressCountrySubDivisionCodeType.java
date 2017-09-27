//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:25:53 AM BRT 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AddressCountrySubDivisionCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressCountrySubDivisionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BR-AC"/>
 *     &lt;enumeration value="BR-AL"/>
 *     &lt;enumeration value="BR-AM"/>
 *     &lt;enumeration value="BR-AP"/>
 *     &lt;enumeration value="BR-BA"/>
 *     &lt;enumeration value="BR-CE"/>
 *     &lt;enumeration value="BR-DF"/>
 *     &lt;enumeration value="BR-ES"/>
 *     &lt;enumeration value="BR-GO"/>
 *     &lt;enumeration value="BR-MA"/>
 *     &lt;enumeration value="BR-MG"/>
 *     &lt;enumeration value="BR-MS"/>
 *     &lt;enumeration value="BR-MT"/>
 *     &lt;enumeration value="BR-PA"/>
 *     &lt;enumeration value="BR-PB"/>
 *     &lt;enumeration value="BR-PE"/>
 *     &lt;enumeration value="BR-PI"/>
 *     &lt;enumeration value="BR-PR"/>
 *     &lt;enumeration value="BR-RJ"/>
 *     &lt;enumeration value="BR-RN"/>
 *     &lt;enumeration value="BR-RO"/>
 *     &lt;enumeration value="BR-RR"/>
 *     &lt;enumeration value="BR-RS"/>
 *     &lt;enumeration value="BR-SC"/>
 *     &lt;enumeration value="BR-SE"/>
 *     &lt;enumeration value="BR-SP"/>
 *     &lt;enumeration value="BR-TO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressCountrySubDivisionCodeType")
@XmlEnum
public enum AddressCountrySubDivisionCodeType {

    @XmlEnumValue("BR-AC")
    BR_AC("BR-AC"),
    @XmlEnumValue("BR-AL")
    BR_AL("BR-AL"),
    @XmlEnumValue("BR-AM")
    BR_AM("BR-AM"),
    @XmlEnumValue("BR-AP")
    BR_AP("BR-AP"),
    @XmlEnumValue("BR-BA")
    BR_BA("BR-BA"),
    @XmlEnumValue("BR-CE")
    BR_CE("BR-CE"),
    @XmlEnumValue("BR-DF")
    BR_DF("BR-DF"),
    @XmlEnumValue("BR-ES")
    BR_ES("BR-ES"),
    @XmlEnumValue("BR-GO")
    BR_GO("BR-GO"),
    @XmlEnumValue("BR-MA")
    BR_MA("BR-MA"),
    @XmlEnumValue("BR-MG")
    BR_MG("BR-MG"),
    @XmlEnumValue("BR-MS")
    BR_MS("BR-MS"),
    @XmlEnumValue("BR-MT")
    BR_MT("BR-MT"),
    @XmlEnumValue("BR-PA")
    BR_PA("BR-PA"),
    @XmlEnumValue("BR-PB")
    BR_PB("BR-PB"),
    @XmlEnumValue("BR-PE")
    BR_PE("BR-PE"),
    @XmlEnumValue("BR-PI")
    BR_PI("BR-PI"),
    @XmlEnumValue("BR-PR")
    BR_PR("BR-PR"),
    @XmlEnumValue("BR-RJ")
    BR_RJ("BR-RJ"),
    @XmlEnumValue("BR-RN")
    BR_RN("BR-RN"),
    @XmlEnumValue("BR-RO")
    BR_RO("BR-RO"),
    @XmlEnumValue("BR-RR")
    BR_RR("BR-RR"),
    @XmlEnumValue("BR-RS")
    BR_RS("BR-RS"),
    @XmlEnumValue("BR-SC")
    BR_SC("BR-SC"),
    @XmlEnumValue("BR-SE")
    BR_SE("BR-SE"),
    @XmlEnumValue("BR-SP")
    BR_SP("BR-SP"),
    @XmlEnumValue("BR-TO")
    BR_TO("BR-TO");
    private final String value;

    AddressCountrySubDivisionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressCountrySubDivisionCodeType fromValue(String v) {
        for (AddressCountrySubDivisionCodeType c: AddressCountrySubDivisionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
