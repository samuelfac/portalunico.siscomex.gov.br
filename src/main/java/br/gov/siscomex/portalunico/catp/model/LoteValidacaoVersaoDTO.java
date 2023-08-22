package br.gov.siscomex.portalunico.catp.model;

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
 @XmlType(name = "LoteValidacaoVersaoDTO", propOrder =
    { "seq", "codigo", "erros", "sucesso", "versao"
})

@XmlRootElement(name="LoteValidacaoVersaoDTO")
public class LoteValidacaoVersaoDTO  {
  
  @XmlElement(name="seq", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial utilizado para identificar registro no lote<br>Formato: Inteiro, com até 3 digitos")
 /**
   * Número sequencial utilizado para identificar registro no lote<br>Formato: Inteiro, com até 3 digitos
  **/
  private Integer seq = null;

  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(required = true, value = "Código utilizado na operação<br>Tamanho: 35")
 /**
   * Código utilizado na operação<br>Tamanho: 35
  **/
  private String codigo = null;

  @XmlElement(name="erros")
  @ApiModelProperty(value = "Lista de erros")
 /**
   * Lista de erros
  **/
  private List<String> erros = null;

  @XmlElement(name="sucesso", required = true)
  @ApiModelProperty(required = true, value = "True para sucesso na operação e False para erro <br>Formato: True/False")
 /**
   * True para sucesso na operação e False para erro <br>Formato: True/False
  **/
  private Boolean sucesso = false;

  @XmlElement(name="versao")
  @ApiModelProperty(value = "Versão do produto  <br>Tamanho máximo: 8")
 /**
   * Versão do produto  <br>Tamanho máximo: 8
  **/
  private String versao = null;
 /**
   * Número sequencial utilizado para identificar registro no lote&lt;br&gt;Formato: Inteiro, com até 3 digitos
   * @return seq
  **/
  @JsonProperty("seq")
  @NotNull
  public Integer getSeq() {
    return seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public LoteValidacaoVersaoDTO seq(Integer seq) {
    this.seq = seq;
    return this;
  }

 /**
   * Código utilizado na operação&lt;br&gt;Tamanho: 35
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

  public LoteValidacaoVersaoDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Lista de erros
   * @return erros
  **/
  @JsonProperty("erros")
  public List<String> getErros() {
    return erros;
  }

  public void setErros(List<String> erros) {
    this.erros = erros;
  }

  public LoteValidacaoVersaoDTO erros(List<String> erros) {
    this.erros = erros;
    return this;
  }

  public LoteValidacaoVersaoDTO addErrosItem(String errosItem) {
    this.erros.add(errosItem);
    return this;
  }

 /**
   * True para sucesso na operação e False para erro &lt;br&gt;Formato: True/False
   * @return sucesso
  **/
  @JsonProperty("sucesso")
  @NotNull
  public Boolean isSucesso() {
    return sucesso;
  }

  public void setSucesso(Boolean sucesso) {
    this.sucesso = sucesso;
  }

  public LoteValidacaoVersaoDTO sucesso(Boolean sucesso) {
    this.sucesso = sucesso;
    return this;
  }

 /**
   * Versão do produto  &lt;br&gt;Tamanho máximo: 8
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public LoteValidacaoVersaoDTO versao(String versao) {
    this.versao = versao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteValidacaoVersaoDTO {\n");
    
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    erros: ").append(toIndentedString(erros)).append("\n");
    sb.append("    sucesso: ").append(toIndentedString(sucesso)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
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

