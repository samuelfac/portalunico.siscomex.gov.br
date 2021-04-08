package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ManifestacoesExportacaoPreACDMicDTO", propOrder =
    { "manifestacao"
})

@XmlRootElement(name="ManifestacoesExportacaoPreACDMicDTO")
/**
  * Manifestos de Dados de Embarque para Exportação de Carga Pré ACD<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Manifestos de Dados de Embarque para Exportação de Carga Pré ACD<br>Máximo de ocorrências: 1")
public class ManifestacoesExportacaoPreACDMicDTO  {
  
  @XmlElement(name="manifestacao", required = true)
  @ApiModelProperty(required = true, value = "Manifesto de Dados de Embarque para Exportação de Carga Pré ACD")
  @Valid
 /**
   * Manifesto de Dados de Embarque para Exportação de Carga Pré ACD
  **/
  private List<Manifestacao> manifestacao = new ArrayList<>();
 /**
   * Manifesto de Dados de Embarque para Exportação de Carga Pré ACD
   * @return manifestacao
  **/
  @JsonProperty("manifestacao")
  @NotNull
  public List<Manifestacao> getManifestacao() {
    return manifestacao;
  }

  public void setManifestacao(List<Manifestacao> manifestacao) {
    this.manifestacao = manifestacao;
  }

  public ManifestacoesExportacaoPreACDMicDTO manifestacao(List<Manifestacao> manifestacao) {
    this.manifestacao = manifestacao;
    return this;
  }

  public ManifestacoesExportacaoPreACDMicDTO addManifestacaoItem(Manifestacao manifestacaoItem) {
    this.manifestacao.add(manifestacaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestacoesExportacaoPreACDMicDTO {\n");
    
    sb.append("    manifestacao: ").append(toIndentedString(manifestacao)).append("\n");
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

