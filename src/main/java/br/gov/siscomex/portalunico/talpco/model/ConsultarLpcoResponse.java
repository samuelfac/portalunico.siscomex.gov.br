package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "ConsultarLpcoResponse", propOrder =
    { "numero", "dataRegistro", "situacao", "codigoModelo", "dataInicioVigenciaModelo", "nome", "dataFimVigencia", "dueVinculada", "prorrogacaoPendente", "retificacaoPendente", "dataSituacaoAtual"
})

@XmlRootElement(name="ConsultarLpcoResponse")
/**
  * Informações resumidas de um LPCO retornadas pela consulta
 **/
@ApiModel(description="Informações resumidas de um LPCO retornadas pela consulta")
public class ConsultarLpcoResponse  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "E1900000123", required = true, value = "Número do LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Número do LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String numero = null;

  @XmlElement(name="dataRegistro", required = true)
  @ApiModelProperty(example = "02/09/2019", required = true, value = "Data em que o pedido do LPCO foi realizado<br>Formato: dd/MM/yyyy")
 /**
   * Data em que o pedido do LPCO foi realizado<br>Formato: dd/MM/yyyy
  **/
  private String dataRegistro = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(example = "Para análise", required = true, value = "Descrição da situação atual do LPCO")
 /**
   * Descrição da situação atual do LPCO
  **/
  private String situacao = null;

  @XmlElement(name="codigoModelo", required = true)
  @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de formulário do LPCO<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano")
 /**
   * Código do modelo de formulário do LPCO<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano
  **/
  private String codigoModelo = null;

  @XmlElement(name="dataInicioVigenciaModelo", required = true)
  @ApiModelProperty(example = "2019-08-29T13:50Z", required = true, value = "Data em que a versão do modelo do LPCO entrou em vigência<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data em que a versão do modelo do LPCO entrou em vigência<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataInicioVigenciaModelo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Certificação para Produtos de Origem Vegetal - Embarque Antecipado", required = true, value = "Nome do modelo do formulário do LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Nome do modelo do formulário do LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String nome = null;

  @XmlElement(name="dataFimVigencia")
  @ApiModelProperty(example = "25/11/2020", value = "Data de fim da vigência do LPCO<br>Formato: dd/MM/yyyy")
 /**
   * Data de fim da vigência do LPCO<br>Formato: dd/MM/yyyy
  **/
  private String dataFimVigencia = null;

  @XmlElement(name="dueVinculada")
  @ApiModelProperty(example = "18BR0000001000,19BR0000002000", value = "Números das DU-Es às quais o LPCO já está vinculado, separados por vírgula ( , )")
 /**
   * Números das DU-Es às quais o LPCO já está vinculado, separados por vírgula ( , )
  **/
  private String dueVinculada = null;

  @XmlElement(name="prorrogacaoPendente", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se existe uma solicitação de prorrogação deste LPCO que ainda não foi analisada pelo órgão anuente.")
 /**
   * Indica se existe uma solicitação de prorrogação deste LPCO que ainda não foi analisada pelo órgão anuente.
  **/
  private Boolean prorrogacaoPendente = false;

  @XmlElement(name="retificacaoPendente", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indica se existe uma solicitação de retificação deste LPCO que ainda não foi analisada pelo órgão anuente.")
 /**
   * Indica se existe uma solicitação de retificação deste LPCO que ainda não foi analisada pelo órgão anuente.
  **/
  private Boolean retificacaoPendente = false;

  @XmlElement(name="dataSituacaoAtual", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data em que o LPCO passou para sua situação atual<br> Formato: Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que o LPCO passou para sua situação atual<br> Formato: Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataSituacaoAtual = null;
 /**
   * Número do LPCO&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: OAANNNNNNNN&lt;br&gt;Lei de formação: O número do LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* AA &#x3D; Ano do registro do LPCO&lt;br&gt;* NNNNNNNN &#x3D; Número sequencial do LPCO no ano
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ConsultarLpcoResponse numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Data em que o pedido do LPCO foi realizado&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  @NotNull
  public String getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public ConsultarLpcoResponse dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Descrição da situação atual do LPCO
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public ConsultarLpcoResponse situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Código do modelo de formulário do LPCO&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: ONNNNN&lt;br&gt;Lei de formação: O número do modelo de LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* NNNNN &#x3D; Número sequencial do LPCO no ano
   * @return codigoModelo
  **/
  @JsonProperty("codigoModelo")
  @NotNull
  public String getCodigoModelo() {
    return codigoModelo;
  }

  public void setCodigoModelo(String codigoModelo) {
    this.codigoModelo = codigoModelo;
  }

  public ConsultarLpcoResponse codigoModelo(String codigoModelo) {
    this.codigoModelo = codigoModelo;
    return this;
  }

 /**
   * Data em que a versão do modelo do LPCO entrou em vigência&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
   * @return dataInicioVigenciaModelo
  **/
  @JsonProperty("dataInicioVigenciaModelo")
  @NotNull
  public String getDataInicioVigenciaModelo() {
    return dataInicioVigenciaModelo;
  }

  public void setDataInicioVigenciaModelo(String dataInicioVigenciaModelo) {
    this.dataInicioVigenciaModelo = dataInicioVigenciaModelo;
  }

  public ConsultarLpcoResponse dataInicioVigenciaModelo(String dataInicioVigenciaModelo) {
    this.dataInicioVigenciaModelo = dataInicioVigenciaModelo;
    return this;
  }

 /**
   * Nome do modelo do formulário do LPCO&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ConsultarLpcoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Data de fim da vigência do LPCO&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataFimVigencia
  **/
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  public ConsultarLpcoResponse dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

 /**
   * Números das DU-Es às quais o LPCO já está vinculado, separados por vírgula ( , )
   * @return dueVinculada
  **/
  @JsonProperty("dueVinculada")
  public String getDueVinculada() {
    return dueVinculada;
  }

  public void setDueVinculada(String dueVinculada) {
    this.dueVinculada = dueVinculada;
  }

  public ConsultarLpcoResponse dueVinculada(String dueVinculada) {
    this.dueVinculada = dueVinculada;
    return this;
  }

 /**
   * Indica se existe uma solicitação de prorrogação deste LPCO que ainda não foi analisada pelo órgão anuente.
   * @return prorrogacaoPendente
  **/
  @JsonProperty("prorrogacaoPendente")
  @NotNull
  public Boolean isProrrogacaoPendente() {
    return prorrogacaoPendente;
  }

  public void setProrrogacaoPendente(Boolean prorrogacaoPendente) {
    this.prorrogacaoPendente = prorrogacaoPendente;
  }

  public ConsultarLpcoResponse prorrogacaoPendente(Boolean prorrogacaoPendente) {
    this.prorrogacaoPendente = prorrogacaoPendente;
    return this;
  }

 /**
   * Indica se existe uma solicitação de retificação deste LPCO que ainda não foi analisada pelo órgão anuente.
   * @return retificacaoPendente
  **/
  @JsonProperty("retificacaoPendente")
  @NotNull
  public Boolean isRetificacaoPendente() {
    return retificacaoPendente;
  }

  public void setRetificacaoPendente(Boolean retificacaoPendente) {
    this.retificacaoPendente = retificacaoPendente;
  }

  public ConsultarLpcoResponse retificacaoPendente(Boolean retificacaoPendente) {
    this.retificacaoPendente = retificacaoPendente;
    return this;
  }

 /**
   * Data em que o LPCO passou para sua situação atual&lt;br&gt; Formato: Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataSituacaoAtual
  **/
  @JsonProperty("dataSituacaoAtual")
  @NotNull
  public String getDataSituacaoAtual() {
    return dataSituacaoAtual;
  }

  public void setDataSituacaoAtual(String dataSituacaoAtual) {
    this.dataSituacaoAtual = dataSituacaoAtual;
  }

  public ConsultarLpcoResponse dataSituacaoAtual(String dataSituacaoAtual) {
    this.dataSituacaoAtual = dataSituacaoAtual;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarLpcoResponse {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    codigoModelo: ").append(toIndentedString(codigoModelo)).append("\n");
    sb.append("    dataInicioVigenciaModelo: ").append(toIndentedString(dataInicioVigenciaModelo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    dueVinculada: ").append(toIndentedString(dueVinculada)).append("\n");
    sb.append("    prorrogacaoPendente: ").append(toIndentedString(prorrogacaoPendente)).append("\n");
    sb.append("    retificacaoPendente: ").append(toIndentedString(retificacaoPendente)).append("\n");
    sb.append("    dataSituacaoAtual: ").append(toIndentedString(dataSituacaoAtual)).append("\n");
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

