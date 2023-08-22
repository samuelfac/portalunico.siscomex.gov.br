package br.gov.siscomex.portalunico.edocex.model;

import br.gov.siscomex.portalunico.edocex.model.PalavraChave;
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
 @XmlType(name = "RetornoConsultarPalavrasChave", propOrder =
    { "idTipoDocumento", "nomeTipoDocumento", "palavrasChave"
})

@XmlRootElement(name="RetornoConsultarPalavrasChave")
/**
  * Retorno das palavras-chave que se aplicam ao tipo de documento.
 **/
@ApiModel(description="Retorno das palavras-chave que se aplicam ao tipo de documento.")
public class RetornoConsultarPalavrasChave  {
  
  @XmlElement(name="idTipoDocumento", required = true)
  @ApiModelProperty(example = "87453", required = true, value = "Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idTipoDocumento = null;

  @XmlElement(name="nomeTipoDocumento", required = true)
  @ApiModelProperty(example = "Fatura Comercial", required = true, value = "Nome do tipo de documento.<br/>Tamanho máximo: 255")
 /**
   * Nome do tipo de documento.<br/>Tamanho máximo: 255
  **/
  private String nomeTipoDocumento = null;

  @XmlElement(name="palavrasChave")
  @ApiModelProperty(value = "")
  @Valid
  private List<PalavraChave> palavrasChave = null;
 /**
   * Id do tipo de documento.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idTipoDocumento
  **/
  @JsonProperty("idTipoDocumento")
  @NotNull
  public Integer getIdTipoDocumento() {
    return idTipoDocumento;
  }

  public void setIdTipoDocumento(Integer idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  public RetornoConsultarPalavrasChave idTipoDocumento(Integer idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }

 /**
   * Nome do tipo de documento.&lt;br/&gt;Tamanho máximo: 255
   * @return nomeTipoDocumento
  **/
  @JsonProperty("nomeTipoDocumento")
  @NotNull
  public String getNomeTipoDocumento() {
    return nomeTipoDocumento;
  }

  public void setNomeTipoDocumento(String nomeTipoDocumento) {
    this.nomeTipoDocumento = nomeTipoDocumento;
  }

  public RetornoConsultarPalavrasChave nomeTipoDocumento(String nomeTipoDocumento) {
    this.nomeTipoDocumento = nomeTipoDocumento;
    return this;
  }

 /**
   * Get palavrasChave
   * @return palavrasChave
  **/
  @JsonProperty("palavrasChave")
  public List<PalavraChave> getPalavrasChave() {
    return palavrasChave;
  }

  public void setPalavrasChave(List<PalavraChave> palavrasChave) {
    this.palavrasChave = palavrasChave;
  }

  public RetornoConsultarPalavrasChave palavrasChave(List<PalavraChave> palavrasChave) {
    this.palavrasChave = palavrasChave;
    return this;
  }

  public RetornoConsultarPalavrasChave addPalavrasChaveItem(PalavraChave palavrasChaveItem) {
    this.palavrasChave.add(palavrasChaveItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsultarPalavrasChave {\n");
    
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    nomeTipoDocumento: ").append(toIndentedString(nomeTipoDocumento)).append("\n");
    sb.append("    palavrasChave: ").append(toIndentedString(palavrasChave)).append("\n");
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

