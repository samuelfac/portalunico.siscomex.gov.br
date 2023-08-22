package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Mensagem;
import br.gov.siscomex.portalunico.cct_ext.model.RetornoConsulta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ResultadoConsulta", propOrder =
    { "listaRetorno", "listaMensagem"
})

@XmlRootElement(name="ResultadoConsulta")
/**
  * Resultado Consulta
 **/
@ApiModel(description="Resultado Consulta")
public class ResultadoConsulta  {
  
  @XmlElement(name="listaRetorno")
  @ApiModelProperty(value = "")
  @Valid
  private List<RetornoConsulta> listaRetorno = null;

  @XmlElement(name="listaMensagem")
  @ApiModelProperty(value = "")
  @Valid
  private List<Mensagem> listaMensagem = null;
 /**
   * Get listaRetorno
   * @return listaRetorno
  **/
  @JsonProperty("listaRetorno")
  public List<RetornoConsulta> getListaRetorno() {
    return listaRetorno;
  }

  public void setListaRetorno(List<RetornoConsulta> listaRetorno) {
    this.listaRetorno = listaRetorno;
  }

  public ResultadoConsulta listaRetorno(List<RetornoConsulta> listaRetorno) {
    this.listaRetorno = listaRetorno;
    return this;
  }

  public ResultadoConsulta addListaRetornoItem(RetornoConsulta listaRetornoItem) {
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

  public ResultadoConsulta listaMensagem(List<Mensagem> listaMensagem) {
    this.listaMensagem = listaMensagem;
    return this;
  }

  public ResultadoConsulta addListaMensagemItem(Mensagem listaMensagemItem) {
    this.listaMensagem.add(listaMensagemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoConsulta {\n");
    
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

