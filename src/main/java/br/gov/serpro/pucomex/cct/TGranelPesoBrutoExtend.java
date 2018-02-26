
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TGranelPesoBrutoExtend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TGranelPesoBrutoExtend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pucomex.serpro.gov.br/cct}TGranel">
 *       &lt;choice>
 *         &lt;element name="pesoBruto" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGranelPesoBrutoExtend", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class TGranelPesoBrutoExtend
    extends TGranel
{


}
