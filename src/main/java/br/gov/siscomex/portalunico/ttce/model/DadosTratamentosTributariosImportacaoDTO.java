package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosTratamentosTributariosImportacaoDTO", propOrder =
    { "dataGeracao", "tratamentosTributariosImportacao"
})

@XmlRootElement(name="DadosTratamentosTributariosImportacaoDTO")
/**
  * Informações sobre os Tratamentos Tributários de Importação.
 **/
@ApiModel(description="Informações sobre os Tratamentos Tributários de Importação.")
public class DadosTratamentosTributariosImportacaoDTO  {
  
  @XmlElement(name="dataGeracao", required = true)
  @ApiModelProperty(example = "13/09/2021", required = true, value = "Data da geração destes dados.<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data da geração destes dados.<br>Formato: 'yyyy-MM-dd'
  **/
  private String dataGeracao = null;

  @XmlElement(name="tratamentosTributariosImportacao", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo os Tratamentos Tributários de Importação.<br/>São apresentados todos os Tratamentos Tributários com Fundamento Legal do tipo Normal, que necessitam de atributos, <br/>bem como todos os Tratamentos Tributários com Fundamento Legal do tipo Opcional, independente de necessitar ou não de atributos. NÃO estão nesta lista os Tratamentos Tributários do tipo Normal que NÃO necessitam de atributos.")
  @Valid
 /**
   * Lista contendo os Tratamentos Tributários de Importação.<br/>São apresentados todos os Tratamentos Tributários com Fundamento Legal do tipo Normal, que necessitam de atributos, <br/>bem como todos os Tratamentos Tributários com Fundamento Legal do tipo Opcional, independente de necessitar ou não de atributos. NÃO estão nesta lista os Tratamentos Tributários do tipo Normal que NÃO necessitam de atributos.
  **/
  private List<TratamentosTributariosAgrupadosDTO> tratamentosTributariosImportacao = new ArrayList<>();
 /**
   * Data da geração destes dados.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataGeracao
  **/
  @JsonProperty("dataGeracao")
  @NotNull
  public String getDataGeracao() {
    return dataGeracao;
  }

  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  public DadosTratamentosTributariosImportacaoDTO dataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }

 /**
   * Lista contendo os Tratamentos Tributários de Importação.&lt;br/&gt;São apresentados todos os Tratamentos Tributários com Fundamento Legal do tipo Normal, que necessitam de atributos, &lt;br/&gt;bem como todos os Tratamentos Tributários com Fundamento Legal do tipo Opcional, independente de necessitar ou não de atributos. NÃO estão nesta lista os Tratamentos Tributários do tipo Normal que NÃO necessitam de atributos.
   * @return tratamentosTributariosImportacao
  **/
  @JsonProperty("tratamentosTributariosImportacao")
  @NotNull
  public List<TratamentosTributariosAgrupadosDTO> getTratamentosTributariosImportacao() {
    return tratamentosTributariosImportacao;
  }

  public void setTratamentosTributariosImportacao(List<TratamentosTributariosAgrupadosDTO> tratamentosTributariosImportacao) {
    this.tratamentosTributariosImportacao = tratamentosTributariosImportacao;
  }

  public DadosTratamentosTributariosImportacaoDTO tratamentosTributariosImportacao(List<TratamentosTributariosAgrupadosDTO> tratamentosTributariosImportacao) {
    this.tratamentosTributariosImportacao = tratamentosTributariosImportacao;
    return this;
  }

  public DadosTratamentosTributariosImportacaoDTO addTratamentosTributariosImportacaoItem(TratamentosTributariosAgrupadosDTO tratamentosTributariosImportacaoItem) {
    this.tratamentosTributariosImportacao.add(tratamentosTributariosImportacaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosTratamentosTributariosImportacaoDTO {\n");
    
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    tratamentosTributariosImportacao: ").append(toIndentedString(tratamentosTributariosImportacao)).append("\n");
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

