package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoDTO", propOrder =
    { "codigo", "descricaoCodigo", "tipoCodigo", "valor", "descricaoValor"
})

@XmlRootElement(name="AtributoDTO")
/**
  * Dados de um Atributo de uma Mercadoria.<br/>No caso de um atributo cujo campo valor esteja em branco, é preciso verificar a decrição informada no campo 'tipoCodigo', para identificar a forma de preenchimento do valor para a DUIMP.
 **/
@ApiModel(description="Dados de um Atributo de uma Mercadoria.<br/>No caso de um atributo cujo campo valor esteja em branco, é preciso verificar a decrição informada no campo 'tipoCodigo', para identificar a forma de preenchimento do valor para a DUIMP.")
public class AtributoDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "ATT_4600", required = true, value = "Código do atributo (conforme Cadastro de Atributos).<br/><br/>Tamanho mínimo: 1<br/>Tamanho máximo: 14")
 /**
   * Código do atributo (conforme Cadastro de Atributos).<br/><br/>Tamanho mínimo: 1<br/>Tamanho máximo: 14
  **/
  private String codigo = null;

  @XmlElement(name="descricaoCodigo", required = true)
  @ApiModelProperty(example = "Exceção da PIS e COFINS", required = true, value = "Descrição do atributo.")
 /**
   * Descrição do atributo.
  **/
  private String descricaoCodigo = null;

  @XmlElement(name="tipoCodigo", required = true)
  @ApiModelProperty(example = "Lista Dinâmica", required = true, value = "Forma de preenchimento do atributo. Serve para o importador saber como preencher o atributo.")
 /**
   * Forma de preenchimento do atributo. Serve para o importador saber como preencher o atributo.
  **/
  private String tipoCodigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "0001", value = "Valor atribuido ao atributo.")
 /**
   * Valor atribuido ao atributo.
  **/
  private String valor = null;

  @XmlElement(name="descricaoValor")
  @ApiModelProperty(example = "EX 0001 - Coletor descartável para perfurocortantes.", value = "Descrição do valor do atributo.")
 /**
   * Descrição do valor do atributo.
  **/
  private String descricaoValor = null;
 /**
   * Código do atributo (conforme Cadastro de Atributos).&lt;br/&gt;&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 14
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public AtributoDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do atributo.
   * @return descricaoCodigo
  **/
  @JsonProperty("descricaoCodigo")
  @NotNull
  public String getDescricaoCodigo() {
    return descricaoCodigo;
  }

  public void setDescricaoCodigo(String descricaoCodigo) {
    this.descricaoCodigo = descricaoCodigo;
  }

  public AtributoDTO descricaoCodigo(String descricaoCodigo) {
    this.descricaoCodigo = descricaoCodigo;
    return this;
  }

 /**
   * Forma de preenchimento do atributo. Serve para o importador saber como preencher o atributo.
   * @return tipoCodigo
  **/
  @JsonProperty("tipoCodigo")
  @NotNull
  public String getTipoCodigo() {
    return tipoCodigo;
  }

  public void setTipoCodigo(String tipoCodigo) {
    this.tipoCodigo = tipoCodigo;
  }

  public AtributoDTO tipoCodigo(String tipoCodigo) {
    this.tipoCodigo = tipoCodigo;
    return this;
  }

 /**
   * Valor atribuido ao atributo.
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public AtributoDTO valor(String valor) {
    this.valor = valor;
    return this;
  }

 /**
   * Descrição do valor do atributo.
   * @return descricaoValor
  **/
  @JsonProperty("descricaoValor")
  public String getDescricaoValor() {
    return descricaoValor;
  }

  public void setDescricaoValor(String descricaoValor) {
    this.descricaoValor = descricaoValor;
  }

  public AtributoDTO descricaoValor(String descricaoValor) {
    this.descricaoValor = descricaoValor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricaoCodigo: ").append(toIndentedString(descricaoCodigo)).append("\n");
    sb.append("    tipoCodigo: ").append(toIndentedString(tipoCodigo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    descricaoValor: ").append(toIndentedString(descricaoValor)).append("\n");
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

