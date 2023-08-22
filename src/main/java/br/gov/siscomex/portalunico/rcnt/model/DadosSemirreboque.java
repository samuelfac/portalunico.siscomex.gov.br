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
 @XmlType(name = "DadosSemirreboque", propOrder =
    { "listaLacres", "placa", "idElemento", "ocrPlaca", "vazio", "avaria", "listaPortoDescarregamento", "listaPaisDestinoFinalCarga", "listaNavio", "listaCliente", "cnpjEstabelecimentoEstufagem", "nomeEstabelecimentoEstufagem"
})

@XmlRootElement(name="DadosSemirreboque")
public class DadosSemirreboque  {
  
  @XmlElement(name="listaLacres")
  @ApiModelProperty(value = "Lista de Lacres.")
  @Valid
 /**
   * Lista de Lacres.
  **/
  private List<DadosDoLacre> listaLacres = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa<br/>Tamanho: 50")
 /**
   * Placa<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

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

  public DadosSemirreboque idElemento(String idElemento) {
    this.idElemento = idElemento;
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

  public DadosSemirreboque avaria(Boolean avaria) {
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

  public DadosSemirreboque listaPortoDescarregamento(List<DadosDoPorto> listaPortoDescarregamento) {
    this.listaPortoDescarregamento = listaPortoDescarregamento;
    return this;
  }

  public DadosSemirreboque addListaPortoDescarregamentoItem(DadosDoPorto listaPortoDescarregamentoItem) {
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

  public DadosSemirreboque listaPaisDestinoFinalCarga(List<DadosDoPais> listaPaisDestinoFinalCarga) {
    this.listaPaisDestinoFinalCarga = listaPaisDestinoFinalCarga;
    return this;
  }

  public DadosSemirreboque addListaPaisDestinoFinalCargaItem(DadosDoPais listaPaisDestinoFinalCargaItem) {
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

  public DadosSemirreboque listaNavio(List<DadosListaNavio> listaNavio) {
    this.listaNavio = listaNavio;
    return this;
  }

  public DadosSemirreboque addListaNavioItem(DadosListaNavio listaNavioItem) {
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

  public DadosSemirreboque listaCliente(List<DadosCliente> listaCliente) {
    this.listaCliente = listaCliente;
    return this;
  }

  public DadosSemirreboque addListaClienteItem(DadosCliente listaClienteItem) {
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
    
    sb.append("    listaLacres: ").append(toIndentedString(listaLacres)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    ocrPlaca: ").append(toIndentedString(ocrPlaca)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
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

