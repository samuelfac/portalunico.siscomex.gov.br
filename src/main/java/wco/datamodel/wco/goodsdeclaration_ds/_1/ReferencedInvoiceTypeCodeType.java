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
 * <p>Classe Java de ReferencedInvoiceTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlType(name = "ReferencedInvoiceTypeCodeType")
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
