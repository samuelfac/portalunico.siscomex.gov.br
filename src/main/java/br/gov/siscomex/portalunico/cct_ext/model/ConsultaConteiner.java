package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConsultaConteiner", propOrder =
    { "listaRetorno", "listaMensagem"
})

@XmlRootElement(name="ConsultaConteiner")
/**
  * Dados da consulta
 **/
@ApiModel(description="Dados da consulta")
public class ConsultaConteiner  {
  
  @XmlElement(name="listaRetorno")
  @ApiModelProperty(value = "Lista de conteineres")
  @Valid
 /**
   * Lista de conteineres
  **/
  private List<ResultadoConsultaConteiner> listaRetorno = null;

  @XmlElement(name="listaMensagem")
  @ApiModelProperty(value = "Mensagens de alerta ou erro da consulta")
  @Valid
 /**
   * Mensagens de alerta ou erro da consulta
  **/
  private List<Mensagem> listaMensagem = null;
 /**
   * Lista de conteineres
   * @return listaRetorno
  **/
  @JsonProperty("listaRetorno")
  public List<ResultadoConsultaConteiner> getListaRetorno() {
    return listaRetorno;
  }

  public void setListaRetorno(List<ResultadoConsultaConteiner> listaRetorno) {
    this.listaRetorno = listaRetorno;
  }

  public ConsultaConteiner listaRetorno(List<ResultadoConsultaConteiner> listaRetorno) {
    this.listaRetorno = listaRetorno;
    return this;
  }

  public ConsultaConteiner addListaRetornoItem(ResultadoConsultaConteiner listaRetornoItem) {
    this.listaRetorno.add(listaRetornoItem);
    return this;
  }

 /**
   * Mensagens de alerta ou erro da consulta
   * @return listaMensagem
  **/
  @JsonProperty("listaMensagem")
  public List<Mensagem> getListaMensagem() {
    return listaMensagem;
  }

  public void setListaMensagem(List<Mensagem> listaMensagem) {
    this.listaMensagem = listaMensagem;
  }

  public ConsultaConteiner listaMensagem(List<Mensagem> listaMensagem) {
    this.listaMensagem = listaMensagem;
    return this;
  }

  public ConsultaConteiner addListaMensagemItem(Mensagem listaMensagemItem) {
    this.listaMensagem.add(listaMensagemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaConteiner {\n");
    
    sb.append("    listaRetorno: ").append(toIndentedString(listaRetorno)).append("\n");
    sb.append("    listaMensagem: ").append(toIndentedString(listaMensagem)).append("\n");
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

