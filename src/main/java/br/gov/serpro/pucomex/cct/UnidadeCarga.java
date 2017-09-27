//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnidadeCarga.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnidadeCarga">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="veiculo"/>
 *     &lt;enumeration value="vagao"/>
 *     &lt;enumeration value="conteiner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnidadeCarga")
@XmlEnum
public enum UnidadeCarga {

    @XmlEnumValue("veiculo")
    VEICULO("veiculo"),
    @XmlEnumValue("vagao")
    VAGAO("vagao"),
    @XmlEnumValue("conteiner")
    CONTEINER("conteiner");
    private final String value;

    UnidadeCarga(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnidadeCarga fromValue(String v) {
        for (UnidadeCarga c: UnidadeCarga.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
