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
 @XmlType(name = "RecepcaoConteiner", propOrder =
    { "identificacaoRecepcao", "cnpjResp", "cpfResp", "local", "referenciaLocalRecepcao", "entregador", "conteineres", "localArmazenamento", "codigoIdentCarga", "avariasIdentificadas", "divergenciasIdentificadas", "observacoesGerais", "transitoSimplificado"
})

@XmlRootElement(name="RecepcaoConteiner")
/**
  * Recepção por Contêiner
 **/
@ApiModel(description="Recepção por Contêiner")
public class RecepcaoConteiner  {
  
  @XmlElement(name="identificacaoRecepcao", required = true)
  @ApiModelProperty(example = "613314937", required = true, value = "Identificação da recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoRecepcao = null;

  @XmlElement(name="cnpjResp")
  @ApiModelProperty(example = "07396865000168", value = "CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResp = null;

  @XmlElement(name="cpfResp")
  @ApiModelProperty(example = "07396865168", value = "CPF do responsável pela recepção<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
 /**
   * CPF do responsável pela recepção<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
  **/
  private String cpfResp = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="referenciaLocalRecepcao")
  @ApiModelProperty(example = "Referência do Local de recepção", value = "Referência do Local de recepção")
 /**
   * Referência do Local de recepção
  **/
  private String referenciaLocalRecepcao = null;

  @XmlElement(name="entregador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Entregador entregador = null;

  @XmlElement(name="conteineres", required = true)
  @ApiModelProperty(required = true, value = "Lista dos contêineres a serem recepcionados")
  @Valid
 /**
   * Lista dos contêineres a serem recepcionados
  **/
  private List<Conteiner> conteineres = new ArrayList<>();

  @XmlElement(name="localArmazenamento")
  @ApiModelProperty(example = "Local de armazenamento da carga", value = "Local de armazenamento da carga<br>Tamanho> 150")
 /**
   * Local de armazenamento da carga<br>Tamanho> 150
  **/
  private String localArmazenamento = null;

  @XmlElement(name="codigoIdentCarga")
  @ApiModelProperty(example = "45411454544", value = "Código de identificação da carga<br>Tamanho mínimo: 13<br>Tamanho máximo: 35")
 /**
   * Código de identificação da carga<br>Tamanho mínimo: 13<br>Tamanho máximo: 35
  **/
  private String codigoIdentCarga = null;

  @XmlElement(name="avariasIdentificadas")
  @ApiModelProperty(example = "Avarias identificadas", value = "Avarias identificadas<br>Tamanho> 250")
 /**
   * Avarias identificadas<br>Tamanho> 250
  **/
  private String avariasIdentificadas = null;

  @XmlElement(name="divergenciasIdentificadas")
  @ApiModelProperty(example = "Divergências identificadas", value = "Divergências identificadas<br>Tamanho> 250")
 /**
   * Divergências identificadas<br>Tamanho> 250
  **/
  private String divergenciasIdentificadas = null;

  @XmlElement(name="observacoesGerais")
  @ApiModelProperty(example = "Observações adicionais", value = "Observações adicionais<br>Tamanho> 250")
 /**
   * Observações adicionais<br>Tamanho> 250
  **/
  private String observacoesGerais = null;

  @XmlElement(name="transitoSimplificado")
  @ApiModelProperty(value = "")
  @Valid
  private TransitoSimplificado transitoSimplificado = null;
 /**
   * Identificação da recepção&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
   * @return identificacaoRecepcao
  **/
  @JsonProperty("identificacaoRecepcao")
  @NotNull
  public String getIdentificacaoRecepcao() {
    return identificacaoRecepcao;
  }

  public void setIdentificacaoRecepcao(String identificacaoRecepcao) {
    this.identificacaoRecepcao = identificacaoRecepcao;
  }

  public RecepcaoConteiner identificacaoRecepcao(String identificacaoRecepcao) {
    this.identificacaoRecepcao = identificacaoRecepcao;
    return this;
  }

 /**
   * CNPJ do responsável pela recepção&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResp
  **/
  @JsonProperty("cnpjResp")
  public String getCnpjResp() {
    return cnpjResp;
  }

  public void setCnpjResp(String cnpjResp) {
    this.cnpjResp = cnpjResp;
  }

  public RecepcaoConteiner cnpjResp(String cnpjResp) {
    this.cnpjResp = cnpjResp;
    return this;
  }

 /**
   * CPF do responsável pela recepção&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
   * @return cpfResp
  **/
  @JsonProperty("cpfResp")
  public String getCpfResp() {
    return cpfResp;
  }

  public void setCpfResp(String cpfResp) {
    this.cpfResp = cpfResp;
  }

  public RecepcaoConteiner cpfResp(String cpfResp) {
    this.cpfResp = cpfResp;
    return this;
  }

 /**
   * Get local
   * @return local
  **/
  @JsonProperty("local")
  @NotNull
  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public RecepcaoConteiner local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Referência do Local de recepção
   * @return referenciaLocalRecepcao
  **/
  @JsonProperty("referenciaLocalRecepcao")
  public String getReferenciaLocalRecepcao() {
    return referenciaLocalRecepcao;
  }

  public void setReferenciaLocalRecepcao(String referenciaLocalRecepcao) {
    this.referenciaLocalRecepcao = referenciaLocalRecepcao;
  }

  public RecepcaoConteiner referenciaLocalRecepcao(String referenciaLocalRecepcao) {
    this.referenciaLocalRecepcao = referenciaLocalRecepcao;
    return this;
  }

 /**
   * Get entregador
   * @return entregador
  **/
  @JsonProperty("entregador")
  @NotNull
  public Entregador getEntregador() {
    return entregador;
  }

  public void setEntregador(Entregador entregador) {
    this.entregador = entregador;
  }

  public RecepcaoConteiner entregador(Entregador entregador) {
    this.entregador = entregador;
    return this;
  }

 /**
   * Lista dos contêineres a serem recepcionados
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  @NotNull
  public List<Conteiner> getConteineres() {
    return conteineres;
  }

  public void setConteineres(List<Conteiner> conteineres) {
    this.conteineres = conteineres;
  }

  public RecepcaoConteiner conteineres(List<Conteiner> conteineres) {
    this.conteineres = conteineres;
    return this;
  }

  public RecepcaoConteiner addConteineresItem(Conteiner conteineresItem) {
    this.conteineres.add(conteineresItem);
    return this;
  }

 /**
   * Local de armazenamento da carga&lt;br&gt;Tamanho&gt; 150
   * @return localArmazenamento
  **/
  @JsonProperty("localArmazenamento")
  public String getLocalArmazenamento() {
    return localArmazenamento;
  }

  public void setLocalArmazenamento(String localArmazenamento) {
    this.localArmazenamento = localArmazenamento;
  }

  public RecepcaoConteiner localArmazenamento(String localArmazenamento) {
    this.localArmazenamento = localArmazenamento;
    return this;
  }

 /**
   * Código de identificação da carga&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35
   * @return codigoIdentCarga
  **/
  @JsonProperty("codigoIdentCarga")
  public String getCodigoIdentCarga() {
    return codigoIdentCarga;
  }

  public void setCodigoIdentCarga(String codigoIdentCarga) {
    this.codigoIdentCarga = codigoIdentCarga;
  }

  public RecepcaoConteiner codigoIdentCarga(String codigoIdentCarga) {
    this.codigoIdentCarga = codigoIdentCarga;
    return this;
  }

 /**
   * Avarias identificadas&lt;br&gt;Tamanho&gt; 250
   * @return avariasIdentificadas
  **/
  @JsonProperty("avariasIdentificadas")
  public String getAvariasIdentificadas() {
    return avariasIdentificadas;
  }

  public void setAvariasIdentificadas(String avariasIdentificadas) {
    this.avariasIdentificadas = avariasIdentificadas;
  }

  public RecepcaoConteiner avariasIdentificadas(String avariasIdentificadas) {
    this.avariasIdentificadas = avariasIdentificadas;
    return this;
  }

 /**
   * Divergências identificadas&lt;br&gt;Tamanho&gt; 250
   * @return divergenciasIdentificadas
  **/
  @JsonProperty("divergenciasIdentificadas")
  public String getDivergenciasIdentificadas() {
    return divergenciasIdentificadas;
  }

  public void setDivergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
  }

  public RecepcaoConteiner divergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
    return this;
  }

 /**
   * Observações adicionais&lt;br&gt;Tamanho&gt; 250
   * @return observacoesGerais
  **/
  @JsonProperty("observacoesGerais")
  public String getObservacoesGerais() {
    return observacoesGerais;
  }

  public void setObservacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
  }

  public RecepcaoConteiner observacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
    return this;
  }

 /**
   * Get transitoSimplificado
   * @return transitoSimplificado
  **/
  @JsonProperty("transitoSimplificado")
  public TransitoSimplificado getTransitoSimplificado() {
    return transitoSimplificado;
  }

  public void setTransitoSimplificado(TransitoSimplificado transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
  }

  public RecepcaoConteiner transitoSimplificado(TransitoSimplificado transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcaoConteiner {\n");
    
    sb.append("    identificacaoRecepcao: ").append(toIndentedString(identificacaoRecepcao)).append("\n");
    sb.append("    cnpjResp: ").append(toIndentedString(cnpjResp)).append("\n");
    sb.append("    cpfResp: ").append(toIndentedString(cpfResp)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    referenciaLocalRecepcao: ").append(toIndentedString(referenciaLocalRecepcao)).append("\n");
    sb.append("    entregador: ").append(toIndentedString(entregador)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
    sb.append("    localArmazenamento: ").append(toIndentedString(localArmazenamento)).append("\n");
    sb.append("    codigoIdentCarga: ").append(toIndentedString(codigoIdentCarga)).append("\n");
    sb.append("    avariasIdentificadas: ").append(toIndentedString(avariasIdentificadas)).append("\n");
    sb.append("    divergenciasIdentificadas: ").append(toIndentedString(divergenciasIdentificadas)).append("\n");
    sb.append("    observacoesGerais: ").append(toIndentedString(observacoesGerais)).append("\n");
    sb.append("    transitoSimplificado: ").append(toIndentedString(transitoSimplificado)).append("\n");
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

