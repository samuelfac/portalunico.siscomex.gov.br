package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.AdicaoValoresCalculadosDuimpCover;
import br.gov.siscomex.portalunico.duimp_api.model.CargaValoresCalculadosDuimpCover;
import br.gov.siscomex.portalunico.duimp_api.model.IdentificadorDuimpCover;
import br.gov.siscomex.portalunico.duimp_api.model.MercadoriaLocalEmbarqueCover;
import br.gov.siscomex.portalunico.duimp_api.model.TributoCalculadoDuimpCover;
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
 @XmlType(name = "ValoresCalculadosDuimpCover", propOrder =
    { "identificacao", "carga", "adicoes", "mercadoriaLocalEmbarque", "tributosCalculados"
})

@XmlRootElement(name="ValoresCalculadosDuimpCover")
public class ValoresCalculadosDuimpCover  {
  
  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificadorDuimpCover identificacao = null;

  @XmlElement(name="carga")
  @ApiModelProperty(value = "")
  @Valid
  private CargaValoresCalculadosDuimpCover carga = null;

  @XmlElement(name="adicoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<AdicaoValoresCalculadosDuimpCover> adicoes = null;

  @XmlElement(name="mercadoriaLocalEmbarque")
  @ApiModelProperty(value = "")
  @Valid
  private MercadoriaLocalEmbarqueCover mercadoriaLocalEmbarque = null;

  @XmlElement(name="tributosCalculados")
  @ApiModelProperty(value = "")
  @Valid
  private List<TributoCalculadoDuimpCover> tributosCalculados = null;
 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public IdentificadorDuimpCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificadorDuimpCover identificacao) {
    this.identificacao = identificacao;
  }

  public ValoresCalculadosDuimpCover identificacao(IdentificadorDuimpCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get carga
   * @return carga
  **/
  @JsonProperty("carga")
  public CargaValoresCalculadosDuimpCover getCarga() {
    return carga;
  }

  public void setCarga(CargaValoresCalculadosDuimpCover carga) {
    this.carga = carga;
  }

  public ValoresCalculadosDuimpCover carga(CargaValoresCalculadosDuimpCover carga) {
    this.carga = carga;
    return this;
  }

 /**
   * Get adicoes
   * @return adicoes
  **/
  @JsonProperty("adicoes")
  public List<AdicaoValoresCalculadosDuimpCover> getAdicoes() {
    return adicoes;
  }

  public void setAdicoes(List<AdicaoValoresCalculadosDuimpCover> adicoes) {
    this.adicoes = adicoes;
  }

  public ValoresCalculadosDuimpCover adicoes(List<AdicaoValoresCalculadosDuimpCover> adicoes) {
    this.adicoes = adicoes;
    return this;
  }

  public ValoresCalculadosDuimpCover addAdicoesItem(AdicaoValoresCalculadosDuimpCover adicoesItem) {
    this.adicoes.add(adicoesItem);
    return this;
  }

 /**
   * Get mercadoriaLocalEmbarque
   * @return mercadoriaLocalEmbarque
  **/
  @JsonProperty("mercadoriaLocalEmbarque")
  public MercadoriaLocalEmbarqueCover getMercadoriaLocalEmbarque() {
    return mercadoriaLocalEmbarque;
  }

  public void setMercadoriaLocalEmbarque(MercadoriaLocalEmbarqueCover mercadoriaLocalEmbarque) {
    this.mercadoriaLocalEmbarque = mercadoriaLocalEmbarque;
  }

  public ValoresCalculadosDuimpCover mercadoriaLocalEmbarque(MercadoriaLocalEmbarqueCover mercadoriaLocalEmbarque) {
    this.mercadoriaLocalEmbarque = mercadoriaLocalEmbarque;
    return this;
  }

 /**
   * Get tributosCalculados
   * @return tributosCalculados
  **/
  @JsonProperty("tributosCalculados")
  public List<TributoCalculadoDuimpCover> getTributosCalculados() {
    return tributosCalculados;
  }

  public void setTributosCalculados(List<TributoCalculadoDuimpCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
  }

  public ValoresCalculadosDuimpCover tributosCalculados(List<TributoCalculadoDuimpCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
    return this;
  }

  public ValoresCalculadosDuimpCover addTributosCalculadosItem(TributoCalculadoDuimpCover tributosCalculadosItem) {
    this.tributosCalculados.add(tributosCalculadosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValoresCalculadosDuimpCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    carga: ").append(toIndentedString(carga)).append("\n");
    sb.append("    adicoes: ").append(toIndentedString(adicoes)).append("\n");
    sb.append("    mercadoriaLocalEmbarque: ").append(toIndentedString(mercadoriaLocalEmbarque)).append("\n");
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

