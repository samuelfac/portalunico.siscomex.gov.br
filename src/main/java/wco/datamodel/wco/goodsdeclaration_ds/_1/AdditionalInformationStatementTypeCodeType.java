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
 * <p>Classe Java de AdditionalInformationStatementTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalInformationStatementTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AAI"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="AAZ"/>
 *     &lt;enumeration value="ACG"/>
 *     &lt;enumeration value="AHZ"/>
 *     &lt;enumeration value="CUS"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="TRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalInformationStatementTypeCodeType")
@XmlEnum
public enum AdditionalInformationStatementTypeCodeType {


    /**
     * Observações Gerais
     * 
     */
    AAI,

    /**
     * Comprot
     * 
     */
    ABC,

    /**
     * Motivo retificação
     * 
     */
    DEF,

    /**
     * Exportação Temporária - Escolhendo esta opção deve-se também preencher statementDescription e limit no level GovernmentAgencyGoodsItem/AdditionalInformation
     * 
     */
    AAZ,

    /**
     * Motivo Dispensa NF
     * 
     */
    ACG,

    /**
     * Situação Especial
     * 
     */
    AHZ,

    /**
     * Forma Exportação
     * 
     */
    CUS,

    /**
     * Prioridade Carga
     * 
     */
    PRI,

    /**
     * Caso Especial de Transporte
     * 
     */
    TRA;

    public String value() {
        return name();
    }

    public static AdditionalInformationStatementTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
