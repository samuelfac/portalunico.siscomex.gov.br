package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosContinerUldAcessoVeculo", propOrder =
    { "idElemento", "numeroConteiner", "identificacaoUld", "tipo", "ocrNumero", "vazio", "numeroBooking", "listaLacres", "avaria", "listaPortoDescarregamento", "listaPaisDestinoFinalCarga", "listaNavio", "listaCliente", "cnpjEstabelecimentoEstufagem", "nomeEstabelecimentoEstufagem"
})

@XmlRootElement(name="DadosContinerUldAcessoVeculo")
public class DadosContinerUldAcessoVeculo  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10")
 /**
   * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "12U0", value = " Conforme tabela de domínio Tipo de Conteiner disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a><br/> É obrigatório informar os atributos 'tipo', 'ocrNumero' e 'vazio' quando o atributo 'operacao' for informado com valor 'C' e o atributo 'numeroConteiner' for informado.")
 /**
   *  Conforme tabela de domínio Tipo de Conteiner disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a><br/> É obrigatório informar os atributos 'tipo', 'ocrNumero' e 'vazio' quando o atributo 'operacao' for informado com valor 'C' e o atributo 'numeroConteiner' for informado.
  **/
  private String tipo = null;

  @XmlElement(name="ocrNumero")
  @ApiModelProperty(example = "false", value = "Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).<br/>Domínio:<br/>true - Sim<br/>false - Não<br/> É obrigatório informar os atributos 'tipo', 'ocrNumero' e 'vazio' quando o atributo 'operacao' for informado com valor 'C' e o atributo 'numeroConteiner' for informado.")
 /**
   * Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).<br/>Domínio:<br/>true - Sim<br/>false - Não<br/> É obrigatório informar os atributos 'tipo', 'ocrNumero' e 'vazio' quando o atributo 'operacao' for informado com valor 'C' e o atributo 'numeroConteiner' for informado.
  **/
  private Boolean ocrNumero = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Contêiner vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não<br/> É obrigatório informar os atributos 'tipo', 'ocrNumero' e 'vazio' quando o atributo 'operacao' for informado com valor 'C' e o atributo 'numeroConteiner' for informado.")
 /**
   * Contêiner vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não<br/> É obrigatório informar os atributos 'tipo', 'ocrNumero' e 'vazio' quando o atributo 'operacao' for informado com valor 'C' e o atributo 'numeroConteiner' for informado.
  **/
  private Boolean vazio = null;

  @XmlElement(name="numeroBooking")
  @ApiModelProperty(value = "Número Booking<br/>Tamanho: 100")
 /**
   * Número Booking<br/>Tamanho: 100
  **/
  private String numeroBooking = null;

  @XmlElement(name="listaLacres")
  @ApiModelProperty(value = "Lista de Lacres.")
  @Valid
 /**
   * Lista de Lacres.
  **/
  private List<DadosDoLacre> listaLacres = null;

  @XmlElement(name="avaria")
  @ApiModelProperty(example = "false", value = "Avaria.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Avaria.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean avaria = null;

  @XmlElement(name="listaPortoDescarregamento")
  @ApiModelProperty(value = "Lista de portos.")
  @Valid
 /**
   * Lista de portos.
  **/
  private List<DadosDoPorto> listaPortoDescarregamento = null;

  @XmlElement(name="listaPaisDestinoFinalCarga")
  @ApiModelProperty(value = "Lista de países.")
  @Valid
 /**
   * Lista de países.
  **/
  private List<DadosDoPais> listaPaisDestinoFinalCarga = null;

  @XmlElement(name="listaNavio")
  @ApiModelProperty(value = "Lista de navios.")
  @Valid
 /**
   * Lista de navios.
  **/
  private List<DadosListaNavio> listaNavio = null;

  @XmlElement(name="listaCliente")
  @ApiModelProperty(value = "Lista de clientes.")
  @Valid
 /**
   * Lista de clientes.
  **/
  private List<DadosCliente> listaCliente = null;

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
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
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
   * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e Código do proprietário da ULD (2 caracteres - PP).&lt;br/&gt;Tamanho: 10
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
   *  Conforme tabela de domínio Tipo de Conteiner disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;&lt;br/&gt; É obrigatório informar os atributos &#39;tipo&#39;, &#39;ocrNumero&#39; e &#39;vazio&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39; e o atributo &#39;numeroConteiner&#39; for informado.
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
   * Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não&lt;br/&gt; É obrigatório informar os atributos &#39;tipo&#39;, &#39;ocrNumero&#39; e &#39;vazio&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39; e o atributo &#39;numeroConteiner&#39; for informado.
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
   * Contêiner vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não&lt;br/&gt; É obrigatório informar os atributos &#39;tipo&#39;, &#39;ocrNumero&#39; e &#39;vazio&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39; e o atributo &#39;numeroConteiner&#39; for informado.
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

  public DadosContinerUldAcessoVeculo listaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
    return this;
  }

  public DadosContinerUldAcessoVeculo addListaLacresItem(DadosDoLacre listaLacresItem) {
    this.listaLacres.add(listaLacresItem);
    return this;
  }

 /**
   * Avaria.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
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
   * Lista de portos.
   * @return listaPortoDescarregamento
  **/
  @JsonProperty("listaPortoDescarregamento")
  public List<DadosDoPorto> getListaPortoDescarregamento() {
    return listaPortoDescarregamento;
  }

  public void setListaPortoDescarregamento(List<DadosDoPorto> listaPortoDescarregamento) {
    this.listaPortoDescarregamento = listaPortoDescarregamento;
  }

  public DadosContinerUldAcessoVeculo listaPortoDescarregamento(List<DadosDoPorto> listaPortoDescarregamento) {
    this.listaPortoDescarregamento = listaPortoDescarregamento;
    return this;
  }

  public DadosContinerUldAcessoVeculo addListaPortoDescarregamentoItem(DadosDoPorto listaPortoDescarregamentoItem) {
    this.listaPortoDescarregamento.add(listaPortoDescarregamentoItem);
    return this;
  }

 /**
   * Lista de países.
   * @return listaPaisDestinoFinalCarga
  **/
  @JsonProperty("listaPaisDestinoFinalCarga")
  public List<DadosDoPais> getListaPaisDestinoFinalCarga() {
    return listaPaisDestinoFinalCarga;
  }

  public void setListaPaisDestinoFinalCarga(List<DadosDoPais> listaPaisDestinoFinalCarga) {
    this.listaPaisDestinoFinalCarga = listaPaisDestinoFinalCarga;
  }

  public DadosContinerUldAcessoVeculo listaPaisDestinoFinalCarga(List<DadosDoPais> listaPaisDestinoFinalCarga) {
    this.listaPaisDestinoFinalCarga = listaPaisDestinoFinalCarga;
    return this;
  }

  public DadosContinerUldAcessoVeculo addListaPaisDestinoFinalCargaItem(DadosDoPais listaPaisDestinoFinalCargaItem) {
    this.listaPaisDestinoFinalCarga.add(listaPaisDestinoFinalCargaItem);
    return this;
  }

 /**
   * Lista de navios.
   * @return listaNavio
  **/
  @JsonProperty("listaNavio")
  public List<DadosListaNavio> getListaNavio() {
    return listaNavio;
  }

  public void setListaNavio(List<DadosListaNavio> listaNavio) {
    this.listaNavio = listaNavio;
  }

  public DadosContinerUldAcessoVeculo listaNavio(List<DadosListaNavio> listaNavio) {
    this.listaNavio = listaNavio;
    return this;
  }

  public DadosContinerUldAcessoVeculo addListaNavioItem(DadosListaNavio listaNavioItem) {
    this.listaNavio.add(listaNavioItem);
    return this;
  }

 /**
   * Lista de clientes.
   * @return listaCliente
  **/
  @JsonProperty("listaCliente")
  public List<DadosCliente> getListaCliente() {
    return listaCliente;
  }

  public void setListaCliente(List<DadosCliente> listaCliente) {
    this.listaCliente = listaCliente;
  }

  public DadosContinerUldAcessoVeculo listaCliente(List<DadosCliente> listaCliente) {
    this.listaCliente = listaCliente;
    return this;
  }

  public DadosContinerUldAcessoVeculo addListaClienteItem(DadosCliente listaClienteItem) {
    this.listaCliente.add(listaClienteItem);
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
    sb.append("    listaPortoDescarregamento: ").append(toIndentedString(listaPortoDescarregamento)).append("\n");
    sb.append("    listaPaisDestinoFinalCarga: ").append(toIndentedString(listaPaisDestinoFinalCarga)).append("\n");
    sb.append("    listaNavio: ").append(toIndentedString(listaNavio)).append("\n");
    sb.append("    listaCliente: ").append(toIndentedString(listaCliente)).append("\n");
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

