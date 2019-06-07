
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PaisDestinoMIC.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PaisDestinoMIC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="UY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaisDestinoMIC", namespace = "http://www.pucomex.serpro.gov.br/cct")
@XmlEnum
public enum PaisDestinoMIC {


    /**
     * Argentina
     * 
     */
    AR,

    /**
     * Bolívia
     * 
     */
    BO,

    /**
     * Chile
     * 
     */
    CL,

    /**
     * Paraguai
     * 
     */
    PY,

    /**
     * Peru
     * 
     */
    PE,

    /**
     * Uruguai
     * 
     */
    UY;

    public String value() {
        return name();
    }

    public static PaisDestinoMIC fromValue(String v) {
        return valueOf(v);
    }

}
