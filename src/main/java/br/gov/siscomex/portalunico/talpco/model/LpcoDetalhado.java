package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "LpcoDetalhado", propOrder =
    { "numero", "codigoModelo", "dataInicioVigenciaModelo", "orgao", "situacao", "dataSituacaoAtual", "informacaoAdicional", "chaveAcesso", "prorrogacaoPendente", "retificacaoPendente", "dataRegistro", "listaCamposFormulario", "listaNcm", "listaVinculos", "saldos"
})

@XmlRootElement(name="LpcoDetalhado")
/**
  * Dados detalhados de um LPCO
 **/
@ApiModel(description="Dados detalhados de um LPCO")
public class LpcoDetalhado  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "E1900000001", required = true, value = "Número do LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Número do LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String numero = null;

  @XmlElement(name="codigoModelo", required = true)
  @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Código do modelo de LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String codigoModelo = null;

  @XmlElement(name="dataInicioVigenciaModelo", required = true)
  @ApiModelProperty(example = "2019-08-29T13:50Z", required = true, value = "Data em que a versão do modelo do LPCO entrou em vigência<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data em que a versão do modelo do LPCO entrou em vigência<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataInicioVigenciaModelo = null;

  @XmlElement(name="orgao", required = true)
  @ApiModelProperty(example = "MAPA", required = true, value = "Código do órgão anuente do documento LPCO.")
 /**
   * Código do órgão anuente do documento LPCO.
  **/
  private String orgao = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IdDescricao situacao = null;

  @XmlElement(name="dataSituacaoAtual", required = true)
  @ApiModelProperty(example = "2019-08-29T14:03:52.123Z", required = true, value = "Momento no qual o LPCO entrou na sua situação atual<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Momento no qual o LPCO entrou na sua situação atual<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataSituacaoAtual = null;

  @XmlElement(name="informacaoAdicional")
  @ApiModelProperty(example = "Texto Livre", value = "Informações adicionais prestadas pelo importador/exportador")
 /**
   * Informações adicionais prestadas pelo importador/exportador
  **/
  private String informacaoAdicional = null;

  @XmlElement(name="chaveAcesso", required = true)
  @ApiModelProperty(example = "7ae071d708d04808b5d7624fafae57d4", required = true, value = "Chave de acesso do LPCO para Acesso Público<br>Tamanho mínimo: 32<br>Tamanho máximo:32<br>Formato: valor hexadecimal")
 /**
   * Chave de acesso do LPCO para Acesso Público<br>Tamanho mínimo: 32<br>Tamanho máximo:32<br>Formato: valor hexadecimal
  **/
  private String chaveAcesso = null;

  @XmlElement(name="prorrogacaoPendente", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se há um pedido de prorrogação do LPCO ainda pendente")
 /**
   * Indica se há um pedido de prorrogação do LPCO ainda pendente
  **/
  private Boolean prorrogacaoPendente = false;

  @XmlElement(name="retificacaoPendente", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se há um pedido de retificação do LPCO ainda pendente")
 /**
   * Indica se há um pedido de retificação do LPCO ainda pendente
  **/
  private Boolean retificacaoPendente = false;

  @XmlElement(name="dataRegistro", required = true)
  @ApiModelProperty(example = "2019-08-29T14:03:52.123Z", required = true, value = "Momento no qual o LPCO foi registrado<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Momento no qual o LPCO foi registrado<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataRegistro = null;

  @XmlElement(name="listaCamposFormulario", required = true)
  @ApiModelProperty(required = true, value = "Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.")
  @Valid
 /**
   * Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.
  **/
  private List<CampoLpcoResponse> listaCamposFormulario = new ArrayList<>();

  @XmlElement(name="listaNcm")
  @ApiModelProperty(value = "Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.")
  @Valid
 /**
   * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
  **/
  private List<ItemLpcoResponse> listaNcm = null;

  @XmlElement(name="listaVinculos")
  @ApiModelProperty(value = "Lista de documentos \"DU-E\" ou \"Duimp\" que estão vinculados ao LPCO.")
  @Valid
 /**
   * Lista de documentos \"DU-E\" ou \"Duimp\" que estão vinculados ao LPCO.
  **/
  private List<VinculoDocLpco> listaVinculos = null;

  @XmlElement(name="saldos")
  @ApiModelProperty(value = "Saldos restantes do LPCO, caso o LPCO tenha cotas.")
  @Valid
 /**
   * Saldos restantes do LPCO, caso o LPCO tenha cotas.
  **/
  private List<Cotas> saldos = null;
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

  public LpcoDetalhado numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Código do modelo de LPCO&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: OAANNNNNNNN&lt;br&gt;Lei de formação: O número do LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* AA &#x3D; Ano do registro do LPCO&lt;br&gt;* NNNNNNNN &#x3D; Número sequencial do LPCO no ano
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

  public LpcoDetalhado codigoModelo(String codigoModelo) {
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

  public LpcoDetalhado dataInicioVigenciaModelo(String dataInicioVigenciaModelo) {
    this.dataInicioVigenciaModelo = dataInicioVigenciaModelo;
    return this;
  }

 /**
   * Código do órgão anuente do documento LPCO.
   * @return orgao
  **/
  @JsonProperty("orgao")
  @NotNull
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public LpcoDetalhado orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }

 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public IdDescricao getSituacao() {
    return situacao;
  }

  public void setSituacao(IdDescricao situacao) {
    this.situacao = situacao;
  }

  public LpcoDetalhado situacao(IdDescricao situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Momento no qual o LPCO entrou na sua situação atual&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
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

  public LpcoDetalhado dataSituacaoAtual(String dataSituacaoAtual) {
    this.dataSituacaoAtual = dataSituacaoAtual;
    return this;
  }

 /**
   * Informações adicionais prestadas pelo importador/exportador
   * @return informacaoAdicional
  **/
  @JsonProperty("informacaoAdicional")
  public String getInformacaoAdicional() {
    return informacaoAdicional;
  }

  public void setInformacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
  }

  public LpcoDetalhado informacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
    return this;
  }

 /**
   * Chave de acesso do LPCO para Acesso Público&lt;br&gt;Tamanho mínimo: 32&lt;br&gt;Tamanho máximo:32&lt;br&gt;Formato: valor hexadecimal
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

  public LpcoDetalhado chaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
    return this;
  }

 /**
   * Indica se há um pedido de prorrogação do LPCO ainda pendente
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

  public LpcoDetalhado prorrogacaoPendente(Boolean prorrogacaoPendente) {
    this.prorrogacaoPendente = prorrogacaoPendente;
    return this;
  }

 /**
   * Indica se há um pedido de retificação do LPCO ainda pendente
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

  public LpcoDetalhado retificacaoPendente(Boolean retificacaoPendente) {
    this.retificacaoPendente = retificacaoPendente;
    return this;
  }

 /**
   * Momento no qual o LPCO foi registrado&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
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

  public LpcoDetalhado dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Lista de campos do pedido que fazem parte dos \&quot;Dados Gerais\&quot; do LPCO, ou seja, aqueles que não são informados por item.
   * @return listaCamposFormulario
  **/
  @JsonProperty("listaCamposFormulario")
  @NotNull
  public List<CampoLpcoResponse> getListaCamposFormulario() {
    return listaCamposFormulario;
  }

  public void setListaCamposFormulario(List<CampoLpcoResponse> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
  }

  public LpcoDetalhado listaCamposFormulario(List<CampoLpcoResponse> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
    return this;
  }

  public LpcoDetalhado addListaCamposFormularioItem(CampoLpcoResponse listaCamposFormularioItem) {
    this.listaCamposFormulario.add(listaCamposFormularioItem);
    return this;
  }

 /**
   * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
   * @return listaNcm
  **/
  @JsonProperty("listaNcm")
  public List<ItemLpcoResponse> getListaNcm() {
    return listaNcm;
  }

  public void setListaNcm(List<ItemLpcoResponse> listaNcm) {
    this.listaNcm = listaNcm;
  }

  public LpcoDetalhado listaNcm(List<ItemLpcoResponse> listaNcm) {
    this.listaNcm = listaNcm;
    return this;
  }

  public LpcoDetalhado addListaNcmItem(ItemLpcoResponse listaNcmItem) {
    this.listaNcm.add(listaNcmItem);
    return this;
  }

 /**
   * Lista de documentos \&quot;DU-E\&quot; ou \&quot;Duimp\&quot; que estão vinculados ao LPCO.
   * @return listaVinculos
  **/
  @JsonProperty("listaVinculos")
  public List<VinculoDocLpco> getListaVinculos() {
    return listaVinculos;
  }

  public void setListaVinculos(List<VinculoDocLpco> listaVinculos) {
    this.listaVinculos = listaVinculos;
  }

  public LpcoDetalhado listaVinculos(List<VinculoDocLpco> listaVinculos) {
    this.listaVinculos = listaVinculos;
    return this;
  }

  public LpcoDetalhado addListaVinculosItem(VinculoDocLpco listaVinculosItem) {
    this.listaVinculos.add(listaVinculosItem);
    return this;
  }

 /**
   * Saldos restantes do LPCO, caso o LPCO tenha cotas.
   * @return saldos
  **/
  @JsonProperty("saldos")
  public List<Cotas> getSaldos() {
    return saldos;
  }

  public void setSaldos(List<Cotas> saldos) {
    this.saldos = saldos;
  }

  public LpcoDetalhado saldos(List<Cotas> saldos) {
    this.saldos = saldos;
    return this;
  }

  public LpcoDetalhado addSaldosItem(Cotas saldosItem) {
    this.saldos.add(saldosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LpcoDetalhado {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    codigoModelo: ").append(toIndentedString(codigoModelo)).append("\n");
    sb.append("    dataInicioVigenciaModelo: ").append(toIndentedString(dataInicioVigenciaModelo)).append("\n");
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    dataSituacaoAtual: ").append(toIndentedString(dataSituacaoAtual)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
    sb.append("    chaveAcesso: ").append(toIndentedString(chaveAcesso)).append("\n");
    sb.append("    prorrogacaoPendente: ").append(toIndentedString(prorrogacaoPendente)).append("\n");
    sb.append("    retificacaoPendente: ").append(toIndentedString(retificacaoPendente)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    listaCamposFormulario: ").append(toIndentedString(listaCamposFormulario)).append("\n");
    sb.append("    listaNcm: ").append(toIndentedString(listaNcm)).append("\n");
    sb.append("    listaVinculos: ").append(toIndentedString(listaVinculos)).append("\n");
    sb.append("    saldos: ").append(toIndentedString(saldos)).append("\n");
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

