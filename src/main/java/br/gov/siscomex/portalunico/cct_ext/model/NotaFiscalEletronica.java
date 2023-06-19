package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "NotaFiscalEletronica", propOrder =
    { "chaveAcesso", "conteineres"
})

@XmlRootElement(name="NotaFiscalEletronica")
/**
  * Nota Fiscal Eletrônica
 **/
@ApiModel(description="Nota Fiscal Eletrônica")
public class NotaFiscalEletronica  {
  
  @XmlElement(name="chaveAcesso", required = true)
  @ApiModelProperty(example = "20161016175341723460934170526686662814689781", required = true, value = "Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN<br>Não será permitida a inclusão de notas fiscais duplicadas (mesma chave de acesso).")
 /**
   * Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN<br>Não será permitida a inclusão de notas fiscais duplicadas (mesma chave de acesso).
  **/
  private String chaveAcesso = null;

  @XmlElement(name="conteineres")
  @ApiModelProperty(value = "")
  @Valid
  private Conteineres conteineres = null;
 /**
   * Chave de Acesso da Nota Fiscal Eletrônica&lt;br&gt;Tamanho: 44&lt;br&gt;Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&lt;br&gt;Não será permitida a inclusão de notas fiscais duplicadas (mesma chave de acesso).
   * @return chaveAcesso
  **/
  @JsonProperty("chaveAcesso")
  @NotNull
  public String getChaveAcesso() {
    return chaveAcesso;
  }

  public void setChaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
  }

  public NotaFiscalEletronica chaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
    return this;
  }

 /**
   * Get conteineres
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  public Conteineres getConteineres() {
    return conteineres;
  }

  public void setConteineres(Conteineres conteineres) {
    this.conteineres = conteineres;
  }

  public NotaFiscalEletronica conteineres(Conteineres conteineres) {
    this.conteineres = conteineres;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaFiscalEletronica {\n");
    
    sb.append("    chaveAcesso: ").append(toIndentedString(chaveAcesso)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
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

