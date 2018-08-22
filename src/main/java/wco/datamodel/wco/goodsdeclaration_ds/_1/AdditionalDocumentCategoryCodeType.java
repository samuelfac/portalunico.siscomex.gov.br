
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdditionalDocumentCategoryCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDocumentCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DSG"/>
 *     &lt;enumeration value="DBSI"/>
 *     &lt;enumeration value="DSIG"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="DSEG"/>
 *     &lt;enumeration value="DSMC"/>
 *     &lt;enumeration value="DSMG"/>
 *     &lt;enumeration value="DBI"/>
 *     &lt;enumeration value="DBII"/>
 *     &lt;enumeration value="LPCO"/>
 *     &lt;enumeration value="DSI"/>
 *     &lt;enumeration value="DSIF"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="EDBV"/>
 *     &lt;enumeration value="DDE"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DSE"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="DUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDocumentCategoryCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum AdditionalDocumentCategoryCodeType {


    /**
     * Drawback Suspensão Comum
     * 
     */
    AC,

    /**
     * Drawback Suspensão Genérico
     * 
     */
    DSG,

    /**
     * Drawback Suspensão Intermediário
     * 
     */
    DBSI,

    /**
     * Drawback Suspensão Intermediário genérico
     * 
     */
    DSIG,

    /**
     * Drawback Suspensão Embarcação Comum
     * 
     */
    DSEC,

    /**
     * Drawback Suspensão Embarcação Genérico
     * 
     */
    DSEG,

    /**
     * Drawback Suspensão Fornecimento no Mercado Interno Comum
     * 
     */
    DSMC,

    /**
     * Drawback Suspensão Fornecimento no Mercado Interno Genérico
     * 
     */
    DSMG,

    /**
     * Drawback Isenção
     * 
     */
    DBI,

    /**
     * Drawback Isenção Intermediário
     * 
     */
    DBII,

    /**
     * LPCO
     * 
     */
    LPCO,

    /**
     * Declaração Simplificada de Importação
     * 
     */
    DSI,

    /**
     * Declaração Simplificada de Importação - Formulário
     * 
     */
    DSIF,

    /**
     * Declaração de Importação
     * 
     */
    DI,

    /**
     * e-DBV
     * 
     */
    EDBV,

    /**
     * DDE
     * 
     */
    DDE,

    /**
     * DE
     * 
     */
    DE,

    /**
     * DSE
     * 
     */
    DSE,

    /**
     * RE
     * 
     */
    RE,

    /**
     * DU-E
     * 
     */
    DUE;

    public String value() {
        return name();
    }

    public static AdditionalDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
