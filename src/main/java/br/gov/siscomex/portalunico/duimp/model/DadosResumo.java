package br.gov.siscomex.portalunico.duimp.model;

import br.gov.siscomex.portalunico.duimp.model.InformaesSobreOsTributos;
import br.gov.siscomex.portalunico.duimp.model.PagamentoCover;
import br.gov.siscomex.portalunico.duimp.model.ValoresDaMercadoriaNosLocais;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosResumo", propOrder =
    { "valorTotalMercadoriaLocalEmbarque", "dadosTributos", "pagamentosDebitoConta"
})

@XmlRootElement(name="DadosResumo")
public class DadosResumo  {
  
  @XmlElement(name="valorTotalMercadoriaLocalEmbarque")
  @ApiModelProperty(value = "")
  @Valid
  private ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarque = null;

  @XmlElement(name="dadosTributos")
  @ApiModelProperty(value = "")
  @Valid
  private InformaesSobreOsTributos dadosTributos = null;

  @XmlElement(name="pagamentosDebitoConta")
  @ApiModelProperty(value = "Lista de pagamentos realizados")
  @Valid
 /**
   * Lista de pagamentos realizados
  **/
  private List<PagamentoCover> pagamentosDebitoConta = null;
 /**
   * Get valorTotalMercadoriaLocalEmbarque
   * @return valorTotalMercadoriaLocalEmbarque
  **/
  @JsonProperty("valorTotalMercadoriaLocalEmbarque")
  public ValoresDaMercadoriaNosLocais getValorTotalMercadoriaLocalEmbarque() {
    return valorTotalMercadoriaLocalEmbarque;
  }

  public void setValorTotalMercadoriaLocalEmbarque(ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarque) {
    this.valorTotalMercadoriaLocalEmbarque = valorTotalMercadoriaLocalEmbarque;
  }

  public DadosResumo valorTotalMercadoriaLocalEmbarque(ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarque) {
    this.valorTotalMercadoriaLocalEmbarque = valorTotalMercadoriaLocalEmbarque;
    return this;
  }

 /**
   * Get dadosTributos
   * @return dadosTributos
  **/
  @JsonProperty("dadosTributos")
  public InformaesSobreOsTributos getDadosTributos() {
    return dadosTributos;
  }

  public void setDadosTributos(InformaesSobreOsTributos dadosTributos) {
    this.dadosTributos = dadosTributos;
  }

  public DadosResumo dadosTributos(InformaesSobreOsTributos dadosTributos) {
    this.dadosTributos = dadosTributos;
    return this;
  }

 /**
   * Lista de pagamentos realizados
   * @return pagamentosDebitoConta
  **/
  @JsonProperty("pagamentosDebitoConta")
  public List<PagamentoCover> getPagamentosDebitoConta() {
    return pagamentosDebitoConta;
  }

  public void setPagamentosDebitoConta(List<PagamentoCover> pagamentosDebitoConta) {
    this.pagamentosDebitoConta = pagamentosDebitoConta;
  }

  public DadosResumo pagamentosDebitoConta(List<PagamentoCover> pagamentosDebitoConta) {
    this.pagamentosDebitoConta = pagamentosDebitoConta;
    return this;
  }

  public DadosResumo addPagamentosDebitoContaItem(PagamentoCover pagamentosDebitoContaItem) {
    this.pagamentosDebitoConta.add(pagamentosDebitoContaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosResumo {\n");
    
    sb.append("    valorTotalMercadoriaLocalEmbarque: ").append(toIndentedString(valorTotalMercadoriaLocalEmbarque)).append("\n");
    sb.append("    dadosTributos: ").append(toIndentedString(dadosTributos)).append("\n");
    sb.append("    pagamentosDebitoConta: ").append(toIndentedString(pagamentosDebitoConta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

