//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:25:53 AM BRT 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TradeTermsConditionCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTermsConditionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
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
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TradeTermsConditionCodeType")
@XmlEnum
public enum TradeTermsConditionCodeType {

    CFR,
    CIF,
    CIP,
    CPT,
    DAP,
    DAT,
    DDP,
    EXW,
    FAS,
    FCA,
    FOB;

    public String value() {
        return name();
    }

    public static TradeTermsConditionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
