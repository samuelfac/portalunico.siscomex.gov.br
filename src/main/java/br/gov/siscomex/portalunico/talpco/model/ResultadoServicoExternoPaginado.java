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
 @XmlType(name = "ResultadoServicoExternoPaginado", propOrder =
    { "itens", "lastPage", "offset", "pageSize", "totalItens"
})

@XmlRootElement(name="ResultadoServicoExternoPaginado")
/**
  * Dados de um página retoranda pela consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de um página retoranda pela consulta detalhada de LPCOs")
public class ResultadoServicoExternoPaginado  {
  
  @XmlElement(name="itens", required = true)
  @ApiModelProperty(required = true, value = "Lista de registros que fazem parte da pagina atual contida nesta resposta da consulta paginada.<br>")
  @Valid
 /**
   * Lista de registros que fazem parte da pagina atual contida nesta resposta da consulta paginada.<br>
  **/
  private List<ConsultaDetalhadaLpco> itens = new ArrayList<>();

  @XmlElement(name="lastPage")
  @ApiModelProperty(value = "")
  private Boolean lastPage = false;

  @XmlElement(name="offset", required = true)
  @ApiModelProperty(required = true, value = "Índice do primeiro registro contido nesta resposta.<br>")
 /**
   * Índice do primeiro registro contido nesta resposta.<br>
  **/
  private Integer offset = null;

  @XmlElement(name="pageSize", required = true)
  @ApiModelProperty(required = true, value = "Quantidade de registros exibidos por página nesta resposta.<br>")
 /**
   * Quantidade de registros exibidos por página nesta resposta.<br>
  **/
  private Integer pageSize = null;

  @XmlElement(name="totalItens", required = true)
  @ApiModelProperty(required = true, value = "Quantidade total de registros encontrados na resposta desta consulta, incluindo os que não estão sendo exibidos na página atual.<br>")
 /**
   * Quantidade total de registros encontrados na resposta desta consulta, incluindo os que não estão sendo exibidos na página atual.<br>
  **/
  private Integer totalItens = null;
 /**
   * Lista de registros que fazem parte da pagina atual contida nesta resposta da consulta paginada.&lt;br&gt;
   * @return itens
  **/
  @JsonProperty("itens")
  @NotNull
  public List<ConsultaDetalhadaLpco> getItens() {
    return itens;
  }

  public void setItens(List<ConsultaDetalhadaLpco> itens) {
    this.itens = itens;
  }

  public ResultadoServicoExternoPaginado itens(List<ConsultaDetalhadaLpco> itens) {
    this.itens = itens;
    return this;
  }

  public ResultadoServicoExternoPaginado addItensItem(ConsultaDetalhadaLpco itensItem) {
    this.itens.add(itensItem);
    return this;
  }

 /**
   * Get lastPage
   * @return lastPage
  **/
  @JsonProperty("lastPage")
  public Boolean isLastPage() {
    return lastPage;
  }

  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }

  public ResultadoServicoExternoPaginado lastPage(Boolean lastPage) {
    this.lastPage = lastPage;
    return this;
  }

 /**
   * Índice do primeiro registro contido nesta resposta.&lt;br&gt;
   * @return offset
  **/
  @JsonProperty("offset")
  @NotNull
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ResultadoServicoExternoPaginado offset(Integer offset) {
    this.offset = offset;
    return this;
  }

 /**
   * Quantidade de registros exibidos por página nesta resposta.&lt;br&gt;
   * @return pageSize
  **/
  @JsonProperty("pageSize")
  @NotNull
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ResultadoServicoExternoPaginado pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

 /**
   * Quantidade total de registros encontrados na resposta desta consulta, incluindo os que não estão sendo exibidos na página atual.&lt;br&gt;
   * @return totalItens
  **/
  @JsonProperty("totalItens")
  @NotNull
  public Integer getTotalItens() {
    return totalItens;
  }

  public void setTotalItens(Integer totalItens) {
    this.totalItens = totalItens;
  }

  public ResultadoServicoExternoPaginado totalItens(Integer totalItens) {
    this.totalItens = totalItens;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoServicoExternoPaginado {\n");
    
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalItens: ").append(toIndentedString(totalItens)).append("\n");
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

