package br.gov.siscomex.portalunico.cadatributos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ArquivoDiarioCondicionadoDTO", propOrder =
    { "obrigatorio", "multivalorado", "dataInicioVigencia", "dataFimVigencia", "descricaoCondicao", "condicao", "atributo"
})

@XmlRootElement(name="ArquivoDiarioCondicionadoDTO")
public class ArquivoDiarioCondicionadoDTO  {
  
  @XmlElement(name="obrigatorio", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Preenchimento obrigatório.<br>Domínio:<br>true<br>false")
 /**
   * Preenchimento obrigatório.<br>Domínio:<br>true<br>false
  **/
  private Boolean obrigatorio = false;

  @XmlElement(name="multivalorado", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Preenchimento multivalorado.<br>Domínio:<br>true<br>false")
 /**
   * Preenchimento multivalorado.<br>Domínio:<br>true<br>false
  **/
  private Boolean multivalorado = false;

  @XmlElement(name="dataInicioVigencia", required = true)
  @ApiModelProperty(example = "2019-01-01", required = true, value = "Data de início de vigência<br>Formato: yyyy-MM-dd")
 /**
   * Data de início de vigência<br>Formato: yyyy-MM-dd
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="dataFimVigencia")
  @ApiModelProperty(example = "2019-12-31", value = "Data de fim de vigência<br>Formato: yyyy-MM-dd")
 /**
   * Data de fim de vigência<br>Formato: yyyy-MM-dd
  **/
  private String dataFimVigencia = null;

  @XmlElement(name="descricaoCondicao")
  @ApiModelProperty(example = "'ATT_4747' Igual '02' OU 'ATT_4747' Igual '07' OU 'ATT_4747' Igual '09'", value = "Descrição da condição do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 1000")
 /**
   * Descrição da condição do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 1000
  **/
  private String descricaoCondicao = null;

  @XmlElement(name="condicao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ExpressaoCondicionanteConsultaDTO condicao = null;

  @XmlElement(name="atributo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ArquivoDiarioAtributoDTO atributo = null;
 /**
   * Preenchimento obrigatório.&lt;br&gt;Domínio:&lt;br&gt;true&lt;br&gt;false
   * @return obrigatorio
  **/
  @JsonProperty("obrigatorio")
  @NotNull
  public Boolean isObrigatorio() {
    return obrigatorio;
  }

  public void setObrigatorio(Boolean obrigatorio) {
    this.obrigatorio = obrigatorio;
  }

  public ArquivoDiarioCondicionadoDTO obrigatorio(Boolean obrigatorio) {
    this.obrigatorio = obrigatorio;
    return this;
  }

 /**
   * Preenchimento multivalorado.&lt;br&gt;Domínio:&lt;br&gt;true&lt;br&gt;false
   * @return multivalorado
  **/
  @JsonProperty("multivalorado")
  @NotNull
  public Boolean isMultivalorado() {
    return multivalorado;
  }

  public void setMultivalorado(Boolean multivalorado) {
    this.multivalorado = multivalorado;
  }

  public ArquivoDiarioCondicionadoDTO multivalorado(Boolean multivalorado) {
    this.multivalorado = multivalorado;
    return this;
  }

 /**
   * Data de início de vigência&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataInicioVigencia
  **/
  @JsonProperty("dataInicioVigencia")
  @NotNull
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public ArquivoDiarioCondicionadoDTO dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

 /**
   * Data de fim de vigência&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataFimVigencia
  **/
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  public ArquivoDiarioCondicionadoDTO dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

 /**
   * Descrição da condição do atributo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 1000
   * @return descricaoCondicao
  **/
  @JsonProperty("descricaoCondicao")
  public String getDescricaoCondicao() {
    return descricaoCondicao;
  }

  public void setDescricaoCondicao(String descricaoCondicao) {
    this.descricaoCondicao = descricaoCondicao;
  }

  public ArquivoDiarioCondicionadoDTO descricaoCondicao(String descricaoCondicao) {
    this.descricaoCondicao = descricaoCondicao;
    return this;
  }

 /**
   * Get condicao
   * @return condicao
  **/
  @JsonProperty("condicao")
  @NotNull
  public ExpressaoCondicionanteConsultaDTO getCondicao() {
    return condicao;
  }

  public void setCondicao(ExpressaoCondicionanteConsultaDTO condicao) {
    this.condicao = condicao;
  }

  public ArquivoDiarioCondicionadoDTO condicao(ExpressaoCondicionanteConsultaDTO condicao) {
    this.condicao = condicao;
    return this;
  }

 /**
   * Get atributo
   * @return atributo
  **/
  @JsonProperty("atributo")
  @NotNull
  public ArquivoDiarioAtributoDTO getAtributo() {
    return atributo;
  }

  public void setAtributo(ArquivoDiarioAtributoDTO atributo) {
    this.atributo = atributo;
  }

  public ArquivoDiarioCondicionadoDTO atributo(ArquivoDiarioAtributoDTO atributo) {
    this.atributo = atributo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDiarioCondicionadoDTO {\n");
    
    sb.append("    obrigatorio: ").append(toIndentedString(obrigatorio)).append("\n");
    sb.append("    multivalorado: ").append(toIndentedString(multivalorado)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    descricaoCondicao: ").append(toIndentedString(descricaoCondicao)).append("\n");
    sb.append("    condicao: ").append(toIndentedString(condicao)).append("\n");
    sb.append("    atributo: ").append(toIndentedString(atributo)).append("\n");
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

