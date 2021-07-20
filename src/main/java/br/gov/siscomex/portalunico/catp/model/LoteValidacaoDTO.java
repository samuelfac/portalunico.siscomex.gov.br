package br.gov.siscomex.portalunico.catp.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "LoteValidacaoDTO", propOrder =
    { "seq", "codigo", "erros", "sucesso"
})

@XmlRootElement(name="LoteValidacaoDTO")
public class LoteValidacaoDTO  {
  
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

  public LoteValidacaoDTO seq(Integer seq) {
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

  public LoteValidacaoDTO codigo(String codigo) {
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

  public LoteValidacaoDTO erros(List<String> erros) {
    this.erros = erros;
    return this;
  }

  public LoteValidacaoDTO addErrosItem(String errosItem) {
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

  public LoteValidacaoDTO sucesso(Boolean sucesso) {
    this.sucesso = sucesso;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteValidacaoDTO {\n");
    
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    erros: ").append(toIndentedString(erros)).append("\n");
    sb.append("    sucesso: ").append(toIndentedString(sucesso)).append("\n");
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

