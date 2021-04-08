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
 @XmlType(name = "IncluirLpcoRequest", propOrder =
    { "codigoModelo", "dataReferencia", "declarante", "importadorExportador", "informacaoAdicional", "listaCamposFormulario", "listaNcm", "unidadeMedidaComercializada", "unidadeMedidaEstatistica"
})

@XmlRootElement(name="IncluirLpcoRequest")
/**
  * Dados de um LPCO a ser cadastrado
 **/
@ApiModel(description="Dados de um LPCO a ser cadastrado")
public class IncluirLpcoRequest  {
  
  @XmlElement(name="codigoModelo", required = true)
  @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de LPCO utilizado para o pedido<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano")
 /**
   * Código do modelo de LPCO utilizado para o pedido<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano
  **/
  private String codigoModelo = null;

  @XmlElement(name="dataReferencia")
  @ApiModelProperty(example = "2019-08-27T13:28", value = "Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataReferencia = null;

  @XmlElement(name="declarante")
  @ApiModelProperty(value = "")
  private String declarante = null;

  @XmlElement(name="importadorExportador")
  @ApiModelProperty(value = "")
  private String importadorExportador = null;

  @XmlElement(name="informacaoAdicional")
  @ApiModelProperty(example = "Texto livre", value = "Informações adicionais prestadas pelo importador/exportador")
 /**
   * Informações adicionais prestadas pelo importador/exportador
  **/
  private String informacaoAdicional = null;

  @XmlElement(name="listaCamposFormulario", required = true)
  @ApiModelProperty(required = true, value = "Lista dos campos do pedido LPCO que fazem parte dos Dados Gerais do LPCO (ou seja, que não são declarados por NCM).")
  @Valid
 /**
   * Lista dos campos do pedido LPCO que fazem parte dos Dados Gerais do LPCO (ou seja, que não são declarados por NCM).
  **/
  private List<CampoLpcoRequest> listaCamposFormulario = new ArrayList<>();

  @XmlElement(name="listaNcm")
  @ApiModelProperty(value = "Lista dos itens NCM declarados no pedido LPCO.")
  @Valid
 /**
   * Lista dos itens NCM declarados no pedido LPCO.
  **/
  private List<ItemNcmLpcoRequest> listaNcm = null;

  @XmlElement(name="unidadeMedidaComercializada")
  @ApiModelProperty(value = "DESCONTINUADO. Utilize o campo unidade do campo QTD_COMERCIALIZADA")
 /**
   * DESCONTINUADO. Utilize o campo unidade do campo QTD_COMERCIALIZADA
  **/
  private String unidadeMedidaComercializada = null;

  @XmlElement(name="unidadeMedidaEstatistica")
  @ApiModelProperty(value = "")
  private String unidadeMedidaEstatistica = null;
 /**
   * Código do modelo de LPCO utilizado para o pedido&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: ONNNNN&lt;br&gt;Lei de formação: O número do modelo de LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* NNNNN &#x3D; Número sequencial do LPCO no ano
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

  public IncluirLpcoRequest codigoModelo(String codigoModelo) {
    this.codigoModelo = codigoModelo;
    return this;
  }

 /**
   * Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
   * @return dataReferencia
  **/
  @JsonProperty("dataReferencia")
  public String getDataReferencia() {
    return dataReferencia;
  }

  public void setDataReferencia(String dataReferencia) {
    this.dataReferencia = dataReferencia;
  }

  public IncluirLpcoRequest dataReferencia(String dataReferencia) {
    this.dataReferencia = dataReferencia;
    return this;
  }

 /**
   * Get declarante
   * @return declarante
  **/
  @JsonProperty("declarante")
  public String getDeclarante() {
    return declarante;
  }

  public void setDeclarante(String declarante) {
    this.declarante = declarante;
  }

  public IncluirLpcoRequest declarante(String declarante) {
    this.declarante = declarante;
    return this;
  }

 /**
   * Get importadorExportador
   * @return importadorExportador
  **/
  @JsonProperty("importadorExportador")
  public String getImportadorExportador() {
    return importadorExportador;
  }

  public void setImportadorExportador(String importadorExportador) {
    this.importadorExportador = importadorExportador;
  }

  public IncluirLpcoRequest importadorExportador(String importadorExportador) {
    this.importadorExportador = importadorExportador;
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

  public IncluirLpcoRequest informacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
    return this;
  }

 /**
   * Lista dos campos do pedido LPCO que fazem parte dos Dados Gerais do LPCO (ou seja, que não são declarados por NCM).
   * @return listaCamposFormulario
  **/
  @JsonProperty("listaCamposFormulario")
  @NotNull
  public List<CampoLpcoRequest> getListaCamposFormulario() {
    return listaCamposFormulario;
  }

  public void setListaCamposFormulario(List<CampoLpcoRequest> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
  }

  public IncluirLpcoRequest listaCamposFormulario(List<CampoLpcoRequest> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
    return this;
  }

  public IncluirLpcoRequest addListaCamposFormularioItem(CampoLpcoRequest listaCamposFormularioItem) {
    this.listaCamposFormulario.add(listaCamposFormularioItem);
    return this;
  }

 /**
   * Lista dos itens NCM declarados no pedido LPCO.
   * @return listaNcm
  **/
  @JsonProperty("listaNcm")
  public List<ItemNcmLpcoRequest> getListaNcm() {
    return listaNcm;
  }

  public void setListaNcm(List<ItemNcmLpcoRequest> listaNcm) {
    this.listaNcm = listaNcm;
  }

  public IncluirLpcoRequest listaNcm(List<ItemNcmLpcoRequest> listaNcm) {
    this.listaNcm = listaNcm;
    return this;
  }

  public IncluirLpcoRequest addListaNcmItem(ItemNcmLpcoRequest listaNcmItem) {
    this.listaNcm.add(listaNcmItem);
    return this;
  }

 /**
   * DESCONTINUADO. Utilize o campo unidade do campo QTD_COMERCIALIZADA
   * @return unidadeMedidaComercializada
  **/
  @JsonProperty("unidadeMedidaComercializada")
  public String getUnidadeMedidaComercializada() {
    return unidadeMedidaComercializada;
  }

  public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
    this.unidadeMedidaComercializada = unidadeMedidaComercializada;
  }

  public IncluirLpcoRequest unidadeMedidaComercializada(String unidadeMedidaComercializada) {
    this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    return this;
  }

 /**
   * Get unidadeMedidaEstatistica
   * @return unidadeMedidaEstatistica
  **/
  @JsonProperty("unidadeMedidaEstatistica")
  public String getUnidadeMedidaEstatistica() {
    return unidadeMedidaEstatistica;
  }

  public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
  }

  public IncluirLpcoRequest unidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncluirLpcoRequest {\n");
    
    sb.append("    codigoModelo: ").append(toIndentedString(codigoModelo)).append("\n");
    sb.append("    dataReferencia: ").append(toIndentedString(dataReferencia)).append("\n");
    sb.append("    declarante: ").append(toIndentedString(declarante)).append("\n");
    sb.append("    importadorExportador: ").append(toIndentedString(importadorExportador)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
    sb.append("    listaCamposFormulario: ").append(toIndentedString(listaCamposFormulario)).append("\n");
    sb.append("    listaNcm: ").append(toIndentedString(listaNcm)).append("\n");
    sb.append("    unidadeMedidaComercializada: ").append(toIndentedString(unidadeMedidaComercializada)).append("\n");
    sb.append("    unidadeMedidaEstatistica: ").append(toIndentedString(unidadeMedidaEstatistica)).append("\n");
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

