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
 @XmlType(name = "DadosContinerUldAcessoVeculo", propOrder =
    { "idElemento", "numeroConteiner", "identificacaoUld", "tipo", "ocrNumero", "vazio", "numeroBooking", "listaLacres", "avaria", "portoDescarregamento", "paisDestinoFinalCarga", "navio", "cnpjCliente", "nomeCliente", "cnpjEstabelecimentoEstufagem", "nomeEstabelecimentoEstufagem"
})

@XmlRootElement(name="DadosContinerUldAcessoVeculo")
public class DadosContinerUldAcessoVeculo  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10")
 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "12U0", value = "Tipo de contêiner conforme tabela de domínio.<br/><a href=\"../pages/exemplos/rcnt/Tipo_Conteiner.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Tipo_Conteiner.pdf </a>")
 /**
   * Tipo de contêiner conforme tabela de domínio.<br/><a href=\"../pages/exemplos/rcnt/Tipo_Conteiner.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Tipo_Conteiner.pdf </a>
  **/
  private String tipo = null;

  @XmlElement(name="ocrNumero")
  @ApiModelProperty(example = "false", value = "Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean ocrNumero = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Contêiner vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Contêiner vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;

  @XmlElement(name="numeroBooking")
  @ApiModelProperty(value = "Número Booking<br/>Tamanho: 100")
 /**
   * Número Booking<br/>Tamanho: 100
  **/
  private String numeroBooking = null;

  @XmlElement(name="listaLacres")
  @ApiModelProperty(value = "Lista lacres")
  @Valid
 /**
   * Lista lacres
  **/
  private List<DadosDoLacre> listaLacres = null;

  @XmlElement(name="avaria")
  @ApiModelProperty(example = "false", value = "Avarias.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Avarias.<br/>Domínio:<br/>true - Sim<br/>false - Não
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
  @ApiModelProperty(example = "44444444444444", value = " CNPJ do cliente do armazenamento. <br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   *  CNPJ do cliente do armazenamento. <br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjCliente = null;

  @XmlElement(name="nomeCliente")
  @ApiModelProperty(value = " Nome do cliente do armazenamento. <br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 100")
 /**
   *  Nome do cliente do armazenamento. <br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 100
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

  public DadosContinerUldAcessoVeculo idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Identificação do número do contêiner.&lt;br/&gt;Tamanho: 200
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public DadosContinerUldAcessoVeculo numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.&lt;br/&gt;Tamanho: 10
   * @return identificacaoUld
  **/
  @JsonProperty("identificacaoUld")
  public String getIdentificacaoUld() {
    return identificacaoUld;
  }

  public void setIdentificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
  }

  public DadosContinerUldAcessoVeculo identificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
    return this;
  }

 /**
   * Tipo de contêiner conforme tabela de domínio.&lt;br/&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Tipo_Conteiner.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Tipo_Conteiner.pdf &lt;/a&gt;
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public DadosContinerUldAcessoVeculo tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return ocrNumero
  **/
  @JsonProperty("ocrNumero")
  public Boolean isOcrNumero() {
    return ocrNumero;
  }

  public void setOcrNumero(Boolean ocrNumero) {
    this.ocrNumero = ocrNumero;
  }

  public DadosContinerUldAcessoVeculo ocrNumero(Boolean ocrNumero) {
    this.ocrNumero = ocrNumero;
    return this;
  }

 /**
   * Contêiner vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosContinerUldAcessoVeculo vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }

 /**
   * Número Booking&lt;br/&gt;Tamanho: 100
   * @return numeroBooking
  **/
  @JsonProperty("numeroBooking")
  public String getNumeroBooking() {
    return numeroBooking;
  }

  public void setNumeroBooking(String numeroBooking) {
    this.numeroBooking = numeroBooking;
  }

  public DadosContinerUldAcessoVeculo numeroBooking(String numeroBooking) {
    this.numeroBooking = numeroBooking;
    return this;
  }

 /**
   * Lista lacres
   * @return listaLacres
  **/
  @JsonProperty("listaLacres")
  public List<DadosDoLacre> getListaLacres() {
    return listaLacres;
  }

  public void setListaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
  }

  public DadosContinerUldAcessoVeculo listaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
    return this;
  }

  public DadosContinerUldAcessoVeculo addListaLacresItem(DadosDoLacre listaLacresItem) {
    this.listaLacres.add(listaLacresItem);
    return this;
  }

 /**
   * Avarias.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return avaria
  **/
  @JsonProperty("avaria")
  public Boolean isAvaria() {
    return avaria;
  }

  public void setAvaria(Boolean avaria) {
    this.avaria = avaria;
  }

  public DadosContinerUldAcessoVeculo avaria(Boolean avaria) {
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

  public DadosContinerUldAcessoVeculo portoDescarregamento(String portoDescarregamento) {
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

  public DadosContinerUldAcessoVeculo paisDestinoFinalCarga(String paisDestinoFinalCarga) {
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

  public DadosContinerUldAcessoVeculo navio(DadosNavio navio) {
    this.navio = navio;
    return this;
  }

 /**
   *  CNPJ do cliente do armazenamento. &lt;br/&gt;Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjCliente
  **/
  @JsonProperty("cnpjCliente")
  public String getCnpjCliente() {
    return cnpjCliente;
  }

  public void setCnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
  }

  public DadosContinerUldAcessoVeculo cnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
    return this;
  }

 /**
   *  Nome do cliente do armazenamento. &lt;br/&gt;Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.&lt;br/&gt;Tamanho: 100
   * @return nomeCliente
  **/
  @JsonProperty("nomeCliente")
  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public DadosContinerUldAcessoVeculo nomeCliente(String nomeCliente) {
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

  public DadosContinerUldAcessoVeculo cnpjEstabelecimentoEstufagem(String cnpjEstabelecimentoEstufagem) {
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

  public DadosContinerUldAcessoVeculo nomeEstabelecimentoEstufagem(String nomeEstabelecimentoEstufagem) {
    this.nomeEstabelecimentoEstufagem = nomeEstabelecimentoEstufagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosContinerUldAcessoVeculo {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    identificacaoUld: ").append(toIndentedString(identificacaoUld)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    ocrNumero: ").append(toIndentedString(ocrNumero)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
    sb.append("    numeroBooking: ").append(toIndentedString(numeroBooking)).append("\n");
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

