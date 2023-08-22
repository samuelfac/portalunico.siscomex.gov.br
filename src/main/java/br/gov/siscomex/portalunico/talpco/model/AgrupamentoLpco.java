package br.gov.siscomex.portalunico.talpco.model;

import br.gov.siscomex.portalunico.talpco.model.ItemAgrupamentoLpco;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "AgrupamentoLpco", propOrder =
    { "chave", "itens"
})

@XmlRootElement(name="AgrupamentoLpco")
/**
  * Dados do agrupamento de LPCOs (apenas LPCOs com LI vinculada)
 **/
@ApiModel(description="Dados do agrupamento de LPCOs (apenas LPCOs com LI vinculada)")
public class AgrupamentoLpco  {
  
  @XmlElement(name="chave", required = true)
  @ApiModelProperty(example = "0123456789abcdef0123456789abcdef", required = true, value = "Chave de identificação do agrupamento.<br>Tamanho: 32<br>Formato: caracteres hexadecimais")
 /**
   * Chave de identificação do agrupamento.<br>Tamanho: 32<br>Formato: caracteres hexadecimais
  **/
  private String chave = null;

  @XmlElement(name="itens", required = true)
  @ApiModelProperty(required = true, value = "Itens que identificam os LPCOs que fazem parte do agrupamento.")
  @Valid
 /**
   * Itens que identificam os LPCOs que fazem parte do agrupamento.
  **/
  private List<ItemAgrupamentoLpco> itens = new ArrayList<>();
 /**
   * Chave de identificação do agrupamento.&lt;br&gt;Tamanho: 32&lt;br&gt;Formato: caracteres hexadecimais
   * @return chave
  **/
  @JsonProperty("chave")
  @NotNull
  public String getChave() {
    return chave;
  }

  public void setChave(String chave) {
    this.chave = chave;
  }

  public AgrupamentoLpco chave(String chave) {
    this.chave = chave;
    return this;
  }

 /**
   * Itens que identificam os LPCOs que fazem parte do agrupamento.
   * @return itens
  **/
  @JsonProperty("itens")
  @NotNull
  public List<ItemAgrupamentoLpco> getItens() {
    return itens;
  }

  public void setItens(List<ItemAgrupamentoLpco> itens) {
    this.itens = itens;
  }

  public AgrupamentoLpco itens(List<ItemAgrupamentoLpco> itens) {
    this.itens = itens;
    return this;
  }

  public AgrupamentoLpco addItensItem(ItemAgrupamentoLpco itensItem) {
    this.itens.add(itensItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgrupamentoLpco {\n");
    
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
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

