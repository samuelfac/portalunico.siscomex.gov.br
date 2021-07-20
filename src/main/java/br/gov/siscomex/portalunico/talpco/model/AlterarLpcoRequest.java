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
 @XmlType(name = "AlterarLpcoRequest", propOrder =
    { "justificativa", "informacaoAdicional", "listaCamposFormulario", "listaNcm"
})

@XmlRootElement(name="AlterarLpcoRequest")
/**
  * Dados a serem informados para a alteração de um LPCO
 **/
@ApiModel(description="Dados a serem informados para a alteração de um LPCO")
public class AlterarLpcoRequest  {
  
  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Complemento de informações", value = "Justificativa da solicitação de retificação. Este campo é ignorado no caso de uma alteração de um pedido de LPCO ainda não deferido.<br>Tamanho mínimo: 0<br>Tamanho máximo: 3900")
 /**
   * Justificativa da solicitação de retificação. Este campo é ignorado no caso de uma alteração de um pedido de LPCO ainda não deferido.<br>Tamanho mínimo: 0<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="informacaoAdicional")
  @ApiModelProperty(example = "Texto livre", value = "Informações adicionais prestadas pelo importador/exportador.<br>Tamanho mínimo: 0<br><br>Tamanho máximo: 4000")
 /**
   * Informações adicionais prestadas pelo importador/exportador.<br>Tamanho mínimo: 0<br><br>Tamanho máximo: 4000
  **/
  private String informacaoAdicional = null;

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
  private List<ItemLpcoRequest> listaNcm = null;
 /**
   * Justificativa da solicitação de retificação. Este campo é ignorado no caso de uma alteração de um pedido de LPCO ainda não deferido.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public AlterarLpcoRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Informações adicionais prestadas pelo importador/exportador.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;&lt;br&gt;Tamanho máximo: 4000
   * @return informacaoAdicional
  **/
  @JsonProperty("informacaoAdicional")
  public String getInformacaoAdicional() {
    return informacaoAdicional;
  }

  public void setInformacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
  }

  public AlterarLpcoRequest informacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
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

  public AlterarLpcoRequest listaCamposFormulario(List<CampoLpcoRequest> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
    return this;
  }

  public AlterarLpcoRequest addListaCamposFormularioItem(CampoLpcoRequest listaCamposFormularioItem) {
    this.listaCamposFormulario.add(listaCamposFormularioItem);
    return this;
  }

 /**
   * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
   * @return listaNcm
  **/
  @JsonProperty("listaNcm")
  public List<ItemLpcoRequest> getListaNcm() {
    return listaNcm;
  }

  public void setListaNcm(List<ItemLpcoRequest> listaNcm) {
    this.listaNcm = listaNcm;
  }

  public AlterarLpcoRequest listaNcm(List<ItemLpcoRequest> listaNcm) {
    this.listaNcm = listaNcm;
    return this;
  }

  public AlterarLpcoRequest addListaNcmItem(ItemLpcoRequest listaNcmItem) {
    this.listaNcm.add(listaNcmItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarLpcoRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
    sb.append("    listaCamposFormulario: ").append(toIndentedString(listaCamposFormulario)).append("\n");
    sb.append("    listaNcm: ").append(toIndentedString(listaNcm)).append("\n");
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

