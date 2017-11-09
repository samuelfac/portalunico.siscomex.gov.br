
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CurrencyExchangeCurrencyTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyExchangeCurrencyTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="USD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyExchangeCurrencyTypeCodeType")
@XmlEnum
public enum CurrencyExchangeCurrencyTypeCodeType {

    AUD,
    BRL,
    CAD,
    CHF,
    DKK,
    EUR,
    GBP,
    JPY,
    NOK,
    SEK,
    USD;

    public String value() {
        return name();
    }

    public static CurrencyExchangeCurrencyTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
