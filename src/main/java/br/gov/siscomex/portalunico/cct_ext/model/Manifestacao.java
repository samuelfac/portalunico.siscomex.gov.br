package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "Manifestacao", propOrder =
    { "identificacaoManifestacao", "infoGeral", "veiculo", "transportador", "conhecimentos", "carga"
})

@XmlRootElement(name="Manifestacao")
/**
  * Manifesto de Dados de Embarque para Exportação de Carga Pré ACD
 **/
@ApiModel(description="Manifesto de Dados de Embarque para Exportação de Carga Pré ACD")
public class Manifestacao  {
  
  @XmlElement(name="identificacaoManifestacao", required = true)
  @ApiModelProperty(example = "MAN001", required = true, value = "Identificação da Manifestação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.<br>Tamanho: 13<br>Formato: AAAAAAAAAAAAA")
 /**
   * Identificação da Manifestação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.<br>Tamanho: 13<br>Formato: AAAAAAAAAAAAA
  **/
  private String identificacaoManifestacao = null;

  @XmlElement(name="infoGeral", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private InfoGeral infoGeral = null;

  @XmlElement(name="veiculo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Veiculo veiculo = null;

  @XmlElement(name="transportador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Transportador transportador = null;

  @XmlElement(name="conhecimentos", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ConhecimentosCarga conhecimentos = null;

  @XmlElement(name="carga", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Carga carga = null;
 /**
   * Identificação da Manifestação&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.&lt;br&gt;Tamanho: 13&lt;br&gt;Formato: AAAAAAAAAAAAA
   * @return identificacaoManifestacao
  **/
  @JsonProperty("identificacaoManifestacao")
  @NotNull
  public String getIdentificacaoManifestacao() {
    return identificacaoManifestacao;
  }

  public void setIdentificacaoManifestacao(String identificacaoManifestacao) {
    this.identificacaoManifestacao = identificacaoManifestacao;
  }

  public Manifestacao identificacaoManifestacao(String identificacaoManifestacao) {
    this.identificacaoManifestacao = identificacaoManifestacao;
    return this;
  }

 /**
   * Get infoGeral
   * @return infoGeral
  **/
  @JsonProperty("infoGeral")
  @NotNull
  public InfoGeral getInfoGeral() {
    return infoGeral;
  }

  public void setInfoGeral(InfoGeral infoGeral) {
    this.infoGeral = infoGeral;
  }

  public Manifestacao infoGeral(InfoGeral infoGeral) {
    this.infoGeral = infoGeral;
    return this;
  }

 /**
   * Get veiculo
   * @return veiculo
  **/
  @JsonProperty("veiculo")
  @NotNull
  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public Manifestacao veiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
    return this;
  }

 /**
   * Get transportador
   * @return transportador
  **/
  @JsonProperty("transportador")
  @NotNull
  public Transportador getTransportador() {
    return transportador;
  }

  public void setTransportador(Transportador transportador) {
    this.transportador = transportador;
  }

  public Manifestacao transportador(Transportador transportador) {
    this.transportador = transportador;
    return this;
  }

 /**
   * Get conhecimentos
   * @return conhecimentos
  **/
  @JsonProperty("conhecimentos")
  @NotNull
  public ConhecimentosCarga getConhecimentos() {
    return conhecimentos;
  }

  public void setConhecimentos(ConhecimentosCarga conhecimentos) {
    this.conhecimentos = conhecimentos;
  }

  public Manifestacao conhecimentos(ConhecimentosCarga conhecimentos) {
    this.conhecimentos = conhecimentos;
    return this;
  }

 /**
   * Get carga
   * @return carga
  **/
  @JsonProperty("carga")
  @NotNull
  public Carga getCarga() {
    return carga;
  }

  public void setCarga(Carga carga) {
    this.carga = carga;
  }

  public Manifestacao carga(Carga carga) {
    this.carga = carga;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manifestacao {\n");
    
    sb.append("    identificacaoManifestacao: ").append(toIndentedString(identificacaoManifestacao)).append("\n");
    sb.append("    infoGeral: ").append(toIndentedString(infoGeral)).append("\n");
    sb.append("    veiculo: ").append(toIndentedString(veiculo)).append("\n");
    sb.append("    transportador: ").append(toIndentedString(transportador)).append("\n");
    sb.append("    conhecimentos: ").append(toIndentedString(conhecimentos)).append("\n");
    sb.append("    carga: ").append(toIndentedString(carga)).append("\n");
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

