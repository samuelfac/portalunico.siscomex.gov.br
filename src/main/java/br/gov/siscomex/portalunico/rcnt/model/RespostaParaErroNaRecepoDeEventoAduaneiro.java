package br.gov.siscomex.portalunico.rcnt.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RespostaParaErroNaRecepoDeEventoAduaneiro", propOrder =
    { "errosValidacao"
})

@XmlRootElement(name="RespostaParaErroNaRecepoDeEventoAduaneiro")
public class RespostaParaErroNaRecepoDeEventoAduaneiro  {
  
  @XmlElement(name="errosValidacao")
  @ApiModelProperty(value = "")
  @Valid
  private List<DadosErroValidaoAtributo> errosValidacao = null;
 /**
   * Get errosValidacao
   * @return errosValidacao
  **/
  @JsonProperty("errosValidacao")
  public List<DadosErroValidaoAtributo> getErrosValidacao() {
    return errosValidacao;
  }

  public void setErrosValidacao(List<DadosErroValidaoAtributo> errosValidacao) {
    this.errosValidacao = errosValidacao;
  }

  public RespostaParaErroNaRecepoDeEventoAduaneiro errosValidacao(List<DadosErroValidaoAtributo> errosValidacao) {
    this.errosValidacao = errosValidacao;
    return this;
  }

  public RespostaParaErroNaRecepoDeEventoAduaneiro addErrosValidacaoItem(DadosErroValidaoAtributo errosValidacaoItem) {
    this.errosValidacao.add(errosValidacaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaParaErroNaRecepoDeEventoAduaneiro {\n");
    
    sb.append("    errosValidacao: ").append(toIndentedString(errosValidacao)).append("\n");
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

