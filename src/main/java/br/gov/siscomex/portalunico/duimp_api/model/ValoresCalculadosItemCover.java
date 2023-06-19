package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ValoresCalculadosItemCover", propOrder =
    { "identificacao", "condicaoVenda", "mercadoria", "tributosCalculados"
})

@XmlRootElement(name="ValoresCalculadosItemCover")
public class ValoresCalculadosItemCover  {
  
  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificadorItemDuimpCover identificacao = null;

  @XmlElement(name="condicaoVenda")
  @ApiModelProperty(value = "")
  @Valid
  private CondicaoVendaValoresCalculadosCover condicaoVenda = null;

  @XmlElement(name="mercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private MercadoriaValoresCalculadosItemCover mercadoria = null;

  @XmlElement(name="tributosCalculados")
  @ApiModelProperty(value = "")
  @Valid
  private List<TributoCalculadoItemCover> tributosCalculados = null;
 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public IdentificadorItemDuimpCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificadorItemDuimpCover identificacao) {
    this.identificacao = identificacao;
  }

  public ValoresCalculadosItemCover identificacao(IdentificadorItemDuimpCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get condicaoVenda
   * @return condicaoVenda
  **/
  @JsonProperty("condicaoVenda")
  public CondicaoVendaValoresCalculadosCover getCondicaoVenda() {
    return condicaoVenda;
  }

  public void setCondicaoVenda(CondicaoVendaValoresCalculadosCover condicaoVenda) {
    this.condicaoVenda = condicaoVenda;
  }

  public ValoresCalculadosItemCover condicaoVenda(CondicaoVendaValoresCalculadosCover condicaoVenda) {
    this.condicaoVenda = condicaoVenda;
    return this;
  }

 /**
   * Get mercadoria
   * @return mercadoria
  **/
  @JsonProperty("mercadoria")
  public MercadoriaValoresCalculadosItemCover getMercadoria() {
    return mercadoria;
  }

  public void setMercadoria(MercadoriaValoresCalculadosItemCover mercadoria) {
    this.mercadoria = mercadoria;
  }

  public ValoresCalculadosItemCover mercadoria(MercadoriaValoresCalculadosItemCover mercadoria) {
    this.mercadoria = mercadoria;
    return this;
  }

 /**
   * Get tributosCalculados
   * @return tributosCalculados
  **/
  @JsonProperty("tributosCalculados")
  public List<TributoCalculadoItemCover> getTributosCalculados() {
    return tributosCalculados;
  }

  public void setTributosCalculados(List<TributoCalculadoItemCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
  }

  public ValoresCalculadosItemCover tributosCalculados(List<TributoCalculadoItemCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
    return this;
  }

  public ValoresCalculadosItemCover addTributosCalculadosItem(TributoCalculadoItemCover tributosCalculadosItem) {
    this.tributosCalculados.add(tributosCalculadosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValoresCalculadosItemCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    condicaoVenda: ").append(toIndentedString(condicaoVenda)).append("\n");
    sb.append("    mercadoria: ").append(toIndentedString(mercadoria)).append("\n");
    sb.append("    tributosCalculados: ").append(toIndentedString(tributosCalculados)).append("\n");
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

