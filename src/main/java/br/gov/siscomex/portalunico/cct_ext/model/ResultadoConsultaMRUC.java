package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ResultadoConsultaMRUC", propOrder =
    { "listaRetorno", "listaMensagem"
})

@XmlRootElement(name="ResultadoConsultaMRUC")
/**
  * Resultado da consulta da RUC
 **/
@ApiModel(description="Resultado da consulta da RUC")
public class ResultadoConsultaMRUC  {
  
  @XmlElement(name="listaRetorno")
  @ApiModelProperty(value = "")
  @Valid
  private List<DadosConsulta> listaRetorno = null;

  @XmlElement(name="listaMensagem")
  @ApiModelProperty(value = "")
  @Valid
  private List<Mensagem> listaMensagem = null;
 /**
   * Get listaRetorno
   * @return listaRetorno
  **/
  @JsonProperty("listaRetorno")
  public List<DadosConsulta> getListaRetorno() {
    return listaRetorno;
  }

  public void setListaRetorno(List<DadosConsulta> listaRetorno) {
    this.listaRetorno = listaRetorno;
  }

  public ResultadoConsultaMRUC listaRetorno(List<DadosConsulta> listaRetorno) {
    this.listaRetorno = listaRetorno;
    return this;
  }

  public ResultadoConsultaMRUC addListaRetornoItem(DadosConsulta listaRetornoItem) {
    this.listaRetorno.add(listaRetornoItem);
    return this;
  }

 /**
   * Get listaMensagem
   * @return listaMensagem
  **/
  @JsonProperty("listaMensagem")
  public List<Mensagem> getListaMensagem() {
    return listaMensagem;
  }

  public void setListaMensagem(List<Mensagem> listaMensagem) {
    this.listaMensagem = listaMensagem;
  }

  public ResultadoConsultaMRUC listaMensagem(List<Mensagem> listaMensagem) {
    this.listaMensagem = listaMensagem;
    return this;
  }

  public ResultadoConsultaMRUC addListaMensagemItem(Mensagem listaMensagemItem) {
    this.listaMensagem.add(listaMensagemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoConsultaMRUC {\n");
    
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

