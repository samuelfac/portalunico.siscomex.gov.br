
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCargaSoltaVeiculoPesoBrutoExtend complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCargaSoltaVeiculoPesoBrutoExtend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pucomex.serpro.gov.br/cct}TCargaSoltaVeiculo">
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
@XmlType(name = "TCargaSoltaVeiculoPesoBrutoExtend")
public class TCargaSoltaVeiculoPesoBrutoExtend
    extends TCargaSoltaVeiculo
{


}
