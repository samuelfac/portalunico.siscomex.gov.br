package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IncluirLpcoRequest", propOrder =
    { "codigoModelo", "informacaoAdicional", "dataReferencia", "listaCamposFormulario", "listaNcm", "numeroLI"
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

  @XmlElement(name="informacaoAdicional")
  @ApiModelProperty(example = "Texto livre", value = "Informações adicionais prestadas pelo importador/exportador")
 /**
   * Informações adicionais prestadas pelo importador/exportador
  **/
  private String informacaoAdicional = null;

  @XmlElement(name="dataReferencia")
  @ApiModelProperty(example = "2019-08-27T13:28", value = "Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataReferencia = null;

  @XmlElement(name="listaCamposFormulario", required = true)
  @ApiModelProperty(required = true, value = "Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.")
  @Valid
 /**
   * Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.
  **/
  private List<CampoLpcoRequest> listaCamposFormulario = new ArrayList<>();

  @XmlElement(name="listaNcm")
  @ApiModelProperty(value = "Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.")
  @Valid
 /**
   * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
  **/
  private List<ItemLpcoInserirRequest> listaNcm = null;

  @XmlElement(name="numeroLI")
  @ApiModelProperty(example = "2200002094", value = "Número da LI")
 /**
   * Número da LI
  **/
  private Long numeroLI = null;
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
   * Lista de campos do pedido que fazem parte dos \&quot;Dados Gerais\&quot; do LPCO, ou seja, aqueles que não são informados por item.
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
   * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
   * @return listaNcm
  **/
  @JsonProperty("listaNcm")
  public List<ItemLpcoInserirRequest> getListaNcm() {
    return listaNcm;
  }

  public void setListaNcm(List<ItemLpcoInserirRequest> listaNcm) {
    this.listaNcm = listaNcm;
  }

  public IncluirLpcoRequest listaNcm(List<ItemLpcoInserirRequest> listaNcm) {
    this.listaNcm = listaNcm;
    return this;
  }

  public IncluirLpcoRequest addListaNcmItem(ItemLpcoInserirRequest listaNcmItem) {
    this.listaNcm.add(listaNcmItem);
    return this;
  }

 /**
   * Número da LI
   * @return numeroLI
  **/
  @JsonProperty("numeroLI")
  public Long getNumeroLI() {
    return numeroLI;
  }

  public void setNumeroLI(Long numeroLI) {
    this.numeroLI = numeroLI;
  }

  public IncluirLpcoRequest numeroLI(Long numeroLI) {
    this.numeroLI = numeroLI;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncluirLpcoRequest {\n");
    
    sb.append("    codigoModelo: ").append(toIndentedString(codigoModelo)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
    sb.append("    dataReferencia: ").append(toIndentedString(dataReferencia)).append("\n");
    sb.append("    listaCamposFormulario: ").append(toIndentedString(listaCamposFormulario)).append("\n");
    sb.append("    listaNcm: ").append(toIndentedString(listaNcm)).append("\n");
    sb.append("    numeroLI: ").append(toIndentedString(numeroLI)).append("\n");
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

