package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosCargaContiner", propOrder =
    { "cnpjCliente", "cnpjTransportador", "codigoRecintoDestino", "idElemento", "listaLacres", "listaManifestos", "numeroConteiner"
})

@XmlRootElement(name="DadosCargaContiner")
public class DadosCargaContiner  {
  
  @XmlElement(name="cnpjCliente")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do importador ou do exportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do importador ou do exportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjCliente = null;

  @XmlElement(name="cnpjTransportador")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do transportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do transportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjTransportador = null;

  @XmlElement(name="codigoRecintoDestino")
  @ApiModelProperty(example = "1111111", value = "Código Siscomex do recinto de destino.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto de destino.<br/>Tamanho: 15
  **/
  private String codigoRecintoDestino = null;

  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="listaLacres")
  @ApiModelProperty(value = "Lista de lacres")
  @Valid
 /**
   * Lista de lacres
  **/
  private List<DadosDoLacre> listaLacres = null;

  @XmlElement(name="listaManifestos")
  @ApiModelProperty(value = "Lista de manifestos.")
  @Valid
 /**
   * Lista de manifestos.
  **/
  private List<DadosDoManisfestoDaCargaSimplificado> listaManifestos = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Número do contêiner a ser removido<br/>Tamanho: 200")
 /**
   * Número do contêiner a ser removido<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;
 /**
   * CNPJ do importador ou do exportador&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjCliente
  **/
  @JsonProperty("cnpjCliente")
  public String getCnpjCliente() {
    return cnpjCliente;
  }

  public void setCnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
  }

  public DadosCargaContiner cnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
    return this;
  }

 /**
   * CNPJ do transportador&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjTransportador
  **/
  @JsonProperty("cnpjTransportador")
  public String getCnpjTransportador() {
    return cnpjTransportador;
  }

  public void setCnpjTransportador(String cnpjTransportador) {
    this.cnpjTransportador = cnpjTransportador;
  }

  public DadosCargaContiner cnpjTransportador(String cnpjTransportador) {
    this.cnpjTransportador = cnpjTransportador;
    return this;
  }

 /**
   * Código Siscomex do recinto de destino.&lt;br/&gt;Tamanho: 15
   * @return codigoRecintoDestino
  **/
  @JsonProperty("codigoRecintoDestino")
  public String getCodigoRecintoDestino() {
    return codigoRecintoDestino;
  }

  public void setCodigoRecintoDestino(String codigoRecintoDestino) {
    this.codigoRecintoDestino = codigoRecintoDestino;
  }

  public DadosCargaContiner codigoRecintoDestino(String codigoRecintoDestino) {
    this.codigoRecintoDestino = codigoRecintoDestino;
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

  public DadosCargaContiner idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Lista de lacres
   * @return listaLacres
  **/
  @JsonProperty("listaLacres")
  public List<DadosDoLacre> getListaLacres() {
    return listaLacres;
  }

  public void setListaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
  }

  public DadosCargaContiner listaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
    return this;
  }

  public DadosCargaContiner addListaLacresItem(DadosDoLacre listaLacresItem) {
    this.listaLacres.add(listaLacresItem);
    return this;
  }

 /**
   * Lista de manifestos.
   * @return listaManifestos
  **/
  @JsonProperty("listaManifestos")
  public List<DadosDoManisfestoDaCargaSimplificado> getListaManifestos() {
    return listaManifestos;
  }

  public void setListaManifestos(List<DadosDoManisfestoDaCargaSimplificado> listaManifestos) {
    this.listaManifestos = listaManifestos;
  }

  public DadosCargaContiner listaManifestos(List<DadosDoManisfestoDaCargaSimplificado> listaManifestos) {
    this.listaManifestos = listaManifestos;
    return this;
  }

  public DadosCargaContiner addListaManifestosItem(DadosDoManisfestoDaCargaSimplificado listaManifestosItem) {
    this.listaManifestos.add(listaManifestosItem);
    return this;
  }

 /**
   * Número do contêiner a ser removido&lt;br/&gt;Tamanho: 200
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public DadosCargaContiner numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCargaContiner {\n");
    
    sb.append("    cnpjCliente: ").append(toIndentedString(cnpjCliente)).append("\n");
    sb.append("    cnpjTransportador: ").append(toIndentedString(cnpjTransportador)).append("\n");
    sb.append("    codigoRecintoDestino: ").append(toIndentedString(codigoRecintoDestino)).append("\n");
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    listaLacres: ").append(toIndentedString(listaLacres)).append("\n");
    sb.append("    listaManifestos: ").append(toIndentedString(listaManifestos)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
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

