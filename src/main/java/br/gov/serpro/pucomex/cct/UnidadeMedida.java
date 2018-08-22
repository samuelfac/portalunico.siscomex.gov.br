
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnidadeMedida.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnidadeMedida">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="m3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnidadeMedida", namespace = "http://www.pucomex.serpro.gov.br/cct")
@XmlEnum
public enum UnidadeMedida {

    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("m3")
    M_3("m3");
    private final String value;

    UnidadeMedida(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnidadeMedida fromValue(String v) {
        for (UnidadeMedida c: UnidadeMedida.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
