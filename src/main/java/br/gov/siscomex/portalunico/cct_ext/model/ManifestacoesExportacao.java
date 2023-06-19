package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ManifestacoesExportacao", propOrder =
    { "manifestacao"
})

@XmlRootElement(name="ManifestacoesExportacao")
/**
  * Manifestos de Dados de Embarque para Exportação<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Manifestos de Dados de Embarque para Exportação<br>Máximo de ocorrências: 1")
public class ManifestacoesExportacao  {
  
  @XmlElement(name="manifestacao", required = true)
  @ApiModelProperty(required = true, value = "Manifesto de Dados de Embarque para Exportação")
  @Valid
 /**
   * Manifesto de Dados de Embarque para Exportação
  **/
  private List<Manifestacao> manifestacao = new ArrayList<>();
 /**
   * Manifesto de Dados de Embarque para Exportação
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

  public ManifestacoesExportacao manifestacao(List<Manifestacao> manifestacao) {
    this.manifestacao = manifestacao;
    return this;
  }

  public ManifestacoesExportacao addManifestacaoItem(Manifestacao manifestacaoItem) {
    this.manifestacao.add(manifestacaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestacoesExportacao {\n");
    
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

