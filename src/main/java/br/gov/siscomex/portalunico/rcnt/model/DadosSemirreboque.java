package br.gov.siscomex.portalunico.rcnt.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosSemirreboque", propOrder =
    { "idElemento", "placa", "ocrPlaca", "vazio", "listaLacres", "avaria", "portoDescarregamento", "paisDestinoFinalCarga", "navio", "cnpjCliente", "nomeCliente", "cnpjEstabelecimentoEstufagem", "nomeEstabelecimentoEstufagem"
})

@XmlRootElement(name="DadosSemirreboque")
public class DadosSemirreboque  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa<br/>Tamanho: 50")
 /**
   * Placa<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="ocrPlaca")
  @ApiModelProperty(example = "false", value = "Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition).<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition).<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean ocrPlaca = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Veículo vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Veículo vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;

  @XmlElement(name="listaLacres")
  @ApiModelProperty(value = "Lista de Lacres.")
  @Valid
 /**
   * Lista de Lacres.
  **/
  private List<DadosDoLacre> listaLacres = null;

  @XmlElement(name="avaria")
  @ApiModelProperty(example = "false", value = "Avarias<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Avarias<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean avaria = null;

  @XmlElement(name="portoDescarregamento")
  @ApiModelProperty(value = "Porto em que a carga vai descarregar.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Porto.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Porto.pdf </a>")
 /**
   * Porto em que a carga vai descarregar.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Porto.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Porto.pdf </a>
  **/
  private String portoDescarregamento = null;

  @XmlElement(name="paisDestinoFinalCarga")
  @ApiModelProperty(example = "23", value = "País de destino final da carga conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Pais.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Pais.pdf </a>")
 /**
   * País de destino final da carga conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Pais.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Pais.pdf </a>
  **/
  private String paisDestinoFinalCarga = null;

  @XmlElement(name="navio")
  @ApiModelProperty(value = "")
  @Valid
  private DadosNavio navio = null;

  @XmlElement(name="cnpjCliente")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do cliente da estadia. <br/>Cliente que contratou o serviço de estadia do recinto para o qual será emitida a fatura.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do cliente da estadia. <br/>Cliente que contratou o serviço de estadia do recinto para o qual será emitida a fatura.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjCliente = null;

  @XmlElement(name="nomeCliente")
  @ApiModelProperty(value = "Nome do cliente da estadia. <br/>Cliente que contratou o serviço de estadia do recinto para o qual será emitida a fatura.<br/>Tamanho: 200")
 /**
   * Nome do cliente da estadia. <br/>Cliente que contratou o serviço de estadia do recinto para o qual será emitida a fatura.<br/>Tamanho: 200
  **/
  private String nomeCliente = null;

  @XmlElement(name="cnpjEstabelecimentoEstufagem")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do estabelecimento onde a carga foi estufada.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do estabelecimento onde a carga foi estufada.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjEstabelecimentoEstufagem = null;

  @XmlElement(name="nomeEstabelecimentoEstufagem")
  @ApiModelProperty(value = "Nome do estabelecimento onde a carga foi estufada.<br/>Tamanho: 200")
 /**
   * Nome do estabelecimento onde a carga foi estufada.<br/>Tamanho: 200
  **/
  private String nomeEstabelecimentoEstufagem = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosSemirreboque idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Placa&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosSemirreboque placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition).&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return ocrPlaca
  **/
  @JsonProperty("ocrPlaca")
  public Boolean isOcrPlaca() {
    return ocrPlaca;
  }

  public void setOcrPlaca(Boolean ocrPlaca) {
    this.ocrPlaca = ocrPlaca;
  }

  public DadosSemirreboque ocrPlaca(Boolean ocrPlaca) {
    this.ocrPlaca = ocrPlaca;
    return this;
  }

 /**
   * Veículo vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosSemirreboque vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }

 /**
   * Lista de Lacres.
   * @return listaLacres
  **/
  @JsonProperty("listaLacres")
  public List<DadosDoLacre> getListaLacres() {
    return listaLacres;
  }

  public void setListaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
  }

  public DadosSemirreboque listaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
    return this;
  }

  public DadosSemirreboque addListaLacresItem(DadosDoLacre listaLacresItem) {
    this.listaLacres.add(listaLacresItem);
    return this;
  }

 /**
   * Avarias&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return avaria
  **/
  @JsonProperty("avaria")
  public Boolean isAvaria() {
    return avaria;
  }

  public void setAvaria(Boolean avaria) {
    this.avaria = avaria;
  }

  public DadosSemirreboque avaria(Boolean avaria) {
    this.avaria = avaria;
    return this;
  }

 /**
   * Porto em que a carga vai descarregar.&lt;br/&gt;Domínio: conforme &lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Porto.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Porto.pdf &lt;/a&gt;
   * @return portoDescarregamento
  **/
  @JsonProperty("portoDescarregamento")
  public String getPortoDescarregamento() {
    return portoDescarregamento;
  }

  public void setPortoDescarregamento(String portoDescarregamento) {
    this.portoDescarregamento = portoDescarregamento;
  }

  public DadosSemirreboque portoDescarregamento(String portoDescarregamento) {
    this.portoDescarregamento = portoDescarregamento;
    return this;
  }

 /**
   * País de destino final da carga conforme tabela de domínio.&lt;br/&gt;Domínio: conforme &lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Pais.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Pais.pdf &lt;/a&gt;
   * @return paisDestinoFinalCarga
  **/
  @JsonProperty("paisDestinoFinalCarga")
  public String getPaisDestinoFinalCarga() {
    return paisDestinoFinalCarga;
  }

  public void setPaisDestinoFinalCarga(String paisDestinoFinalCarga) {
    this.paisDestinoFinalCarga = paisDestinoFinalCarga;
  }

  public DadosSemirreboque paisDestinoFinalCarga(String paisDestinoFinalCarga) {
    this.paisDestinoFinalCarga = paisDestinoFinalCarga;
    return this;
  }

 /**
   * Get navio
   * @return navio
  **/
  @JsonProperty("navio")
  public DadosNavio getNavio() {
    return navio;
  }

  public void setNavio(DadosNavio navio) {
    this.navio = navio;
  }

  public DadosSemirreboque navio(DadosNavio navio) {
    this.navio = navio;
    return this;
  }

 /**
   * CNPJ do cliente da estadia. &lt;br/&gt;Cliente que contratou o serviço de estadia do recinto para o qual será emitida a fatura.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjCliente
  **/
  @JsonProperty("cnpjCliente")
  public String getCnpjCliente() {
    return cnpjCliente;
  }

  public void setCnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
  }

  public DadosSemirreboque cnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
    return this;
  }

 /**
   * Nome do cliente da estadia. &lt;br/&gt;Cliente que contratou o serviço de estadia do recinto para o qual será emitida a fatura.&lt;br/&gt;Tamanho: 200
   * @return nomeCliente
  **/
  @JsonProperty("nomeCliente")
  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public DadosSemirreboque nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

 /**
   * CNPJ do estabelecimento onde a carga foi estufada.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjEstabelecimentoEstufagem
  **/
  @JsonProperty("cnpjEstabelecimentoEstufagem")
  public String getCnpjEstabelecimentoEstufagem() {
    return cnpjEstabelecimentoEstufagem;
  }

  public void setCnpjEstabelecimentoEstufagem(String cnpjEstabelecimentoEstufagem) {
    this.cnpjEstabelecimentoEstufagem = cnpjEstabelecimentoEstufagem;
  }

  public DadosSemirreboque cnpjEstabelecimentoEstufagem(String cnpjEstabelecimentoEstufagem) {
    this.cnpjEstabelecimentoEstufagem = cnpjEstabelecimentoEstufagem;
    return this;
  }

 /**
   * Nome do estabelecimento onde a carga foi estufada.&lt;br/&gt;Tamanho: 200
   * @return nomeEstabelecimentoEstufagem
  **/
  @JsonProperty("nomeEstabelecimentoEstufagem")
  public String getNomeEstabelecimentoEstufagem() {
    return nomeEstabelecimentoEstufagem;
  }

  public void setNomeEstabelecimentoEstufagem(String nomeEstabelecimentoEstufagem) {
    this.nomeEstabelecimentoEstufagem = nomeEstabelecimentoEstufagem;
  }

  public DadosSemirreboque nomeEstabelecimentoEstufagem(String nomeEstabelecimentoEstufagem) {
    this.nomeEstabelecimentoEstufagem = nomeEstabelecimentoEstufagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosSemirreboque {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    ocrPlaca: ").append(toIndentedString(ocrPlaca)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
    sb.append("    listaLacres: ").append(toIndentedString(listaLacres)).append("\n");
    sb.append("    avaria: ").append(toIndentedString(avaria)).append("\n");
    sb.append("    portoDescarregamento: ").append(toIndentedString(portoDescarregamento)).append("\n");
    sb.append("    paisDestinoFinalCarga: ").append(toIndentedString(paisDestinoFinalCarga)).append("\n");
    sb.append("    navio: ").append(toIndentedString(navio)).append("\n");
    sb.append("    cnpjCliente: ").append(toIndentedString(cnpjCliente)).append("\n");
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
    sb.append("    cnpjEstabelecimentoEstufagem: ").append(toIndentedString(cnpjEstabelecimentoEstufagem)).append("\n");
    sb.append("    nomeEstabelecimentoEstufagem: ").append(toIndentedString(nomeEstabelecimentoEstufagem)).append("\n");
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

