//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.09.27 �s 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recepcaoNFE" type="{http://www.pucomex.serpro.gov.br/cct}recepcaoNFE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recepcaoNFE"
})
@XmlRootElement(name = "recepcoesNFE")
public class RecepcoesNFE {

    @XmlElement(required = true)
    protected RecepcaoNFE recepcaoNFE;

    /**
     * Obt�m o valor da propriedade recepcaoNFE.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoNFE }
     *     
     */
    public RecepcaoNFE getRecepcaoNFE() {
        return recepcaoNFE;
    }

    /**
     * Define o valor da propriedade recepcaoNFE.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoNFE }
     *     
     */
    public void setRecepcaoNFE(RecepcaoNFE value) {
        this.recepcaoNFE = value;
    }

}
