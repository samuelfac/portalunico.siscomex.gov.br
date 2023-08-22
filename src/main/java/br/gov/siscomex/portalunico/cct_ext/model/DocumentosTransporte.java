package br.gov.siscomex.portalunico.cct_ext.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "DocumentosTransporte", propOrder =
    { "identificacaoDocumentoTransporte", "tipoDocumentoTransporte", "dataEmissaoDocumentoTransporte", "dadosVeiculoConferem", "dadosUnidadeTransporteConferem", "dadosConteinerConferem", "dadosEmbalagemConferem", "pesoAferido", "motivoNaoPesagem"
})

@XmlRootElement(name="DocumentosTransporte")
/**
  * Dados dos documentos de transporte
 **/
@ApiModel(description="Dados dos documentos de transporte")
public class DocumentosTransporte  {
  
  @XmlElement(name="identificacaoDocumentoTransporte", required = true)
  @ApiModelProperty(example = "16BR0008093", required = true, value = "Identificação do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA")
 /**
   * Identificação do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA
  **/
  private String identificacaoDocumentoTransporte = null;

  @XmlElement(name="tipoDocumentoTransporte", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Tipo do documento de transporte<br>Tamanho: 2<br>Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros")
 /**
   * Tipo do documento de transporte<br>Tamanho: 2<br>Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros
  **/
  private Integer tipoDocumentoTransporte = null;

  @XmlElement(name="dataEmissaoDocumentoTransporte", required = true)
  @ApiModelProperty(example = "2018-04-01", required = true, value = "Data de emissão do documento de transporte<br>Formato: AAAA-MM-DD")
 /**
   * Data de emissão do documento de transporte<br>Formato: AAAA-MM-DD
  **/
  private String dataEmissaoDocumentoTransporte = null;

  @XmlElement(name="dadosVeiculoConferem", required = true)
  @ApiModelProperty(example = "N", required = true, value = "Indicador de conferência dos dados do veículo com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
 /**
   * Indicador de conferência dos dados do veículo com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica
  **/
  private String dadosVeiculoConferem = null;

  @XmlElement(name="dadosUnidadeTransporteConferem", required = true)
  @ApiModelProperty(example = "N", required = true, value = "Indicador de conferência dos dados da unidade de transporte com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
 /**
   * Indicador de conferência dos dados da unidade de transporte com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica
  **/
  private String dadosUnidadeTransporteConferem = null;

  @XmlElement(name="dadosConteinerConferem", required = true)
  @ApiModelProperty(example = "N", required = true, value = "Indicador de conferência dos dados do contêiner com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
 /**
   * Indicador de conferência dos dados do contêiner com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica
  **/
  private String dadosConteinerConferem = null;

  @XmlElement(name="dadosEmbalagemConferem", required = true)
  @ApiModelProperty(example = "N", required = true, value = "Indicador de conferência dos dados das embalagens com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
 /**
   * Indicador de conferência dos dados das embalagens com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica
  **/
  private String dadosEmbalagemConferem = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(example = "100.0", value = "Peso aferido na balança do recinto em Kg.<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
  @Valid
 /**
   * Peso aferido na balança do recinto em Kg.<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
  **/
  private BigDecimal pesoAferido = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "Motivo da não realização da pesagem", value = "Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.")
 /**
   * Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.
  **/
  private String motivoNaoPesagem = null;
 /**
   * Identificação do documento de transporte&lt;br&gt;Tamanho mínimo: 5&lt;br&gt;Tamanho Máximo: 15&lt;br&gt;Formato: AAAAAAAAAAAAAAA
   * @return identificacaoDocumentoTransporte
  **/
  @JsonProperty("identificacaoDocumentoTransporte")
  @NotNull
  public String getIdentificacaoDocumentoTransporte() {
    return identificacaoDocumentoTransporte;
  }

  public void setIdentificacaoDocumentoTransporte(String identificacaoDocumentoTransporte) {
    this.identificacaoDocumentoTransporte = identificacaoDocumentoTransporte;
  }

  public DocumentosTransporte identificacaoDocumentoTransporte(String identificacaoDocumentoTransporte) {
    this.identificacaoDocumentoTransporte = identificacaoDocumentoTransporte;
    return this;
  }

 /**
   * Tipo do documento de transporte&lt;br&gt;Tamanho: 2&lt;br&gt;Domínio&lt;br&gt;01 - MIC/DTA&lt;br&gt;02 - TIF/DTA&lt;br&gt;03 - DTAI&lt;br&gt;04 - Outros
   * @return tipoDocumentoTransporte
  **/
  @JsonProperty("tipoDocumentoTransporte")
  @NotNull
  public Integer getTipoDocumentoTransporte() {
    return tipoDocumentoTransporte;
  }

  public void setTipoDocumentoTransporte(Integer tipoDocumentoTransporte) {
    this.tipoDocumentoTransporte = tipoDocumentoTransporte;
  }

  public DocumentosTransporte tipoDocumentoTransporte(Integer tipoDocumentoTransporte) {
    this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    return this;
  }

 /**
   * Data de emissão do documento de transporte&lt;br&gt;Formato: AAAA-MM-DD
   * @return dataEmissaoDocumentoTransporte
  **/
  @JsonProperty("dataEmissaoDocumentoTransporte")
  @NotNull
  public String getDataEmissaoDocumentoTransporte() {
    return dataEmissaoDocumentoTransporte;
  }

  public void setDataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
    this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
  }

  public DocumentosTransporte dataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
    this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
    return this;
  }

 /**
   * Indicador de conferência dos dados do veículo com os dados informados na entrega&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
   * @return dadosVeiculoConferem
  **/
  @JsonProperty("dadosVeiculoConferem")
  @NotNull
  public String getDadosVeiculoConferem() {
    return dadosVeiculoConferem;
  }

  public void setDadosVeiculoConferem(String dadosVeiculoConferem) {
    this.dadosVeiculoConferem = dadosVeiculoConferem;
  }

  public DocumentosTransporte dadosVeiculoConferem(String dadosVeiculoConferem) {
    this.dadosVeiculoConferem = dadosVeiculoConferem;
    return this;
  }

 /**
   * Indicador de conferência dos dados da unidade de transporte com os dados informados na entrega&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
   * @return dadosUnidadeTransporteConferem
  **/
  @JsonProperty("dadosUnidadeTransporteConferem")
  @NotNull
  public String getDadosUnidadeTransporteConferem() {
    return dadosUnidadeTransporteConferem;
  }

  public void setDadosUnidadeTransporteConferem(String dadosUnidadeTransporteConferem) {
    this.dadosUnidadeTransporteConferem = dadosUnidadeTransporteConferem;
  }

  public DocumentosTransporte dadosUnidadeTransporteConferem(String dadosUnidadeTransporteConferem) {
    this.dadosUnidadeTransporteConferem = dadosUnidadeTransporteConferem;
    return this;
  }

 /**
   * Indicador de conferência dos dados do contêiner com os dados informados na entrega&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
   * @return dadosConteinerConferem
  **/
  @JsonProperty("dadosConteinerConferem")
  @NotNull
  public String getDadosConteinerConferem() {
    return dadosConteinerConferem;
  }

  public void setDadosConteinerConferem(String dadosConteinerConferem) {
    this.dadosConteinerConferem = dadosConteinerConferem;
  }

  public DocumentosTransporte dadosConteinerConferem(String dadosConteinerConferem) {
    this.dadosConteinerConferem = dadosConteinerConferem;
    return this;
  }

 /**
   * Indicador de conferência dos dados das embalagens com os dados informados na entrega&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
   * @return dadosEmbalagemConferem
  **/
  @JsonProperty("dadosEmbalagemConferem")
  @NotNull
  public String getDadosEmbalagemConferem() {
    return dadosEmbalagemConferem;
  }

  public void setDadosEmbalagemConferem(String dadosEmbalagemConferem) {
    this.dadosEmbalagemConferem = dadosEmbalagemConferem;
  }

  public DocumentosTransporte dadosEmbalagemConferem(String dadosEmbalagemConferem) {
    this.dadosEmbalagemConferem = dadosEmbalagemConferem;
    return this;
  }

 /**
   * Peso aferido na balança do recinto em Kg.&lt;br&gt;Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public DocumentosTransporte pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Motivo da não realização da pesagem&lt;br&gt;Tamanho: 250&lt;br&gt;Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public DocumentosTransporte motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentosTransporte {\n");
    
    sb.append("    identificacaoDocumentoTransporte: ").append(toIndentedString(identificacaoDocumentoTransporte)).append("\n");
    sb.append("    tipoDocumentoTransporte: ").append(toIndentedString(tipoDocumentoTransporte)).append("\n");
    sb.append("    dataEmissaoDocumentoTransporte: ").append(toIndentedString(dataEmissaoDocumentoTransporte)).append("\n");
    sb.append("    dadosVeiculoConferem: ").append(toIndentedString(dadosVeiculoConferem)).append("\n");
    sb.append("    dadosUnidadeTransporteConferem: ").append(toIndentedString(dadosUnidadeTransporteConferem)).append("\n");
    sb.append("    dadosConteinerConferem: ").append(toIndentedString(dadosConteinerConferem)).append("\n");
    sb.append("    dadosEmbalagemConferem: ").append(toIndentedString(dadosEmbalagemConferem)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
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

