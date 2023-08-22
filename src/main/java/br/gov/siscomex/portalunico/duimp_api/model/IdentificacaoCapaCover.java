package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.ImportadorCover;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "IdentificacaoCapaCover", propOrder =
    { "importador", "informacaoComplementar"
})

@XmlRootElement(name="IdentificacaoCapaCover")
/**
  * Dados da identificação da declaração única de importação.
 **/
@ApiModel(description="Dados da identificação da declaração única de importação.")
public class IdentificacaoCapaCover  {
  
  @XmlElement(name="importador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ImportadorCover importador = null;

  @XmlElement(name="informacaoComplementar")
  @ApiModelProperty(example = "Texto complementando informações sobre a Duimp.", value = "Descrição complementar da Duimp.<br>Tamanho mínimo: 0<br>Tamanho máximo: 7800")
 /**
   * Descrição complementar da Duimp.<br>Tamanho mínimo: 0<br>Tamanho máximo: 7800
  **/
  private String informacaoComplementar = null;
 /**
   * Get importador
   * @return importador
  **/
  @JsonProperty("importador")
  @NotNull
  public ImportadorCover getImportador() {
    return importador;
  }

  public void setImportador(ImportadorCover importador) {
    this.importador = importador;
  }

  public IdentificacaoCapaCover importador(ImportadorCover importador) {
    this.importador = importador;
    return this;
  }

 /**
   * Descrição complementar da Duimp.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 7800
   * @return informacaoComplementar
  **/
  @JsonProperty("informacaoComplementar")
  public String getInformacaoComplementar() {
    return informacaoComplementar;
  }

  public void setInformacaoComplementar(String informacaoComplementar) {
    this.informacaoComplementar = informacaoComplementar;
  }

  public IdentificacaoCapaCover informacaoComplementar(String informacaoComplementar) {
    this.informacaoComplementar = informacaoComplementar;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoCapaCover {\n");
    
    sb.append("    importador: ").append(toIndentedString(importador)).append("\n");
    sb.append("    informacaoComplementar: ").append(toIndentedString(informacaoComplementar)).append("\n");
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

