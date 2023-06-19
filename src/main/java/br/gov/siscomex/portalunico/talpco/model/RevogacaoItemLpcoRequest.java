package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RevogacaoItemLpcoRequest", propOrder =
    { "justificativa", "itens"
})

@XmlRootElement(name="RevogacaoItemLpcoRequest")
/**
  * Dados para revogação de itens de LPCO
 **/
@ApiModel(description="Dados para revogação de itens de LPCO")
public class RevogacaoItemLpcoRequest  {
  
  @XmlElement(name="justificativa", required = true)
  @ApiModelProperty(example = "Texto livre", required = true, value = "Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="itens", required = true)
  @ApiModelProperty(example = "[\"1\", \"2\"]", required = true, value = "Lista dos itens que devem ser revogados de ofício.<br>")
 /**
   * Lista dos itens que devem ser revogados de ofício.<br>
  **/
  private List<Integer> itens = new ArrayList<>();
 /**
   * Justificativa para a operação. Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  @NotNull
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public RevogacaoItemLpcoRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Lista dos itens que devem ser revogados de ofício.&lt;br&gt;
   * @return itens
  **/
  @JsonProperty("itens")
  @NotNull
  public List<Integer> getItens() {
    return itens;
  }

  public void setItens(List<Integer> itens) {
    this.itens = itens;
  }

  public RevogacaoItemLpcoRequest itens(List<Integer> itens) {
    this.itens = itens;
    return this;
  }

  public RevogacaoItemLpcoRequest addItensItem(Integer itensItem) {
    this.itens.add(itensItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevogacaoItemLpcoRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
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

