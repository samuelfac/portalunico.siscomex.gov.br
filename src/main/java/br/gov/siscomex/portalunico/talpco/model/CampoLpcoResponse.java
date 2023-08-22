package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CampoLpcoResponse", propOrder =
    { "codigo", "codigoAtributoPai", "listaValor", "valorComposto", "unidadeMedida", "intervenientes"
})

@XmlRootElement(name="CampoLpcoResponse")
/**
  * Dados de um campo de um LPCO
 **/
@ApiModel(description="Dados de um campo de um LPCO")
public class CampoLpcoResponse  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "CPF_CNPJ_EXPORTADOR", required = true, value = "Código do campo ou do atributo do NCM<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL")
 /**
   * Código do campo ou do atributo do NCM<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL
  **/
  private String codigo = null;

  @XmlElement(name="codigoAtributoPai")
  @ApiModelProperty(example = "ATT_1", value = "Código do atributo condicionante<BR>Tamanho máximo: 40<br>Formato: Código de atributo no formato ATT_NNNNNNNNN<br>")
 /**
   * Código do atributo condicionante<BR>Tamanho máximo: 40<br>Formato: Código de atributo no formato ATT_NNNNNNNNN<br>
  **/
  private String codigoAtributoPai = null;

  @XmlElement(name="listaValor", required = true)
  @ApiModelProperty(example = "{\"12345678901\", \"12345678901234\"}", required = true, value = "Lista dos valores declarados para o campo ou atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000")
 /**
   * Lista dos valores declarados para o campo ou atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000
  **/
  private List<String> listaValor = new ArrayList<>();

  @XmlElement(name="valorComposto")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaValorComposto valorComposto = null;

  @XmlElement(name="unidadeMedida")
  @ApiModelProperty(example = "UN", value = "Unidade de medida utilizada no campo. Informado apenas nos campos QTD_COMERCIALIZADA e QTD_ESTATISTICA<br>Tamanho mínimo: 1<br>Tamanho máximo: 60")
 /**
   * Unidade de medida utilizada no campo. Informado apenas nos campos QTD_COMERCIALIZADA e QTD_ESTATISTICA<br>Tamanho mínimo: 1<br>Tamanho máximo: 60
  **/
  private String unidadeMedida = null;

  @XmlElement(name="intervenientes")
  @ApiModelProperty(value = "Lista com detalhes dos exportadores/importadores. Informado apenas nos campos CPF_CNPJ_IMPORTADOR e CPF_CNPJ_EXPORTADOR")
  @Valid
 /**
   * Lista com detalhes dos exportadores/importadores. Informado apenas nos campos CPF_CNPJ_IMPORTADOR e CPF_CNPJ_EXPORTADOR
  **/
  private List<Pessoa> intervenientes = null;
 /**
   * Código do campo ou do atributo do NCM&lt;br&gt;Tamanho máximo: 40&lt;br&gt;Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN&lt;br&gt;Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos&lt;br&gt;Domínio: PAIS_DESTINO&lt;br&gt;PAIS_IMPORTADOR&lt;br&gt;SITUACAO_ESPECIAL&lt;br&gt;TRATAMENTO_PRIORITARIO&lt;br&gt;NCM&lt;br&gt;ENQUADRAMENTO_OPERACAO&lt;br&gt;URF_EMBARQUE&lt;br&gt;URF_DESPACHO&lt;br&gt;RECINTO_EMBARQUE&lt;br&gt;RECINTO_DESPACHO&lt;br&gt;CONDICAO_VENDA&lt;br&gt;VIA_ESPECIAL_TRANSPORTE&lt;br&gt;MOEDA&lt;br&gt;MOTIVO_DISPENSA_NF&lt;br&gt;IMPORTADOR&lt;br&gt;CHAVE_ACESSO_NFE&lt;br&gt;QTDE_COMERCIALIZADA&lt;br&gt;QTDE_ESTATISTICA&lt;br&gt;VMLE&lt;br&gt;CODIGO_PRODUTO&lt;br&gt;CPF_CNPJ_EXPORTADOR&lt;br&gt;CPF_CNPJ_DECLARANTE&lt;br&gt;ENDERECO_IMPORTADOR&lt;br&gt;PESO_LIQUIDO_TOTAL&lt;br&gt;NUMERO_CONTEINER&lt;br&gt;NUMERO_LACRE&lt;br&gt;CNPJ_TRANSPORTADOR&lt;br&gt;NOME_TRANSPORTADOR_ESTRANGEIRO&lt;br&gt;TIPOS_EMBALAGEM&lt;br&gt;NOME_CONSIGNATARIO&lt;br&gt;ENDERECO_CONSIGNATARIO&lt;br&gt;VALOR_FINANCIADO&lt;br&gt;VALOR_CONDICAO_VENDA&lt;br&gt;FORMA_EXPORTACAO&lt;br&gt;PAIS_ORIGEM&lt;br&gt;PAIS_AQUISICAO&lt;br&gt;PAIS_PROCEDENCIA&lt;br&gt;CPF_CNPJ_IMPORTADOR&lt;br&gt;CODIGO_NALADI&lt;br&gt;CODIGO_FUNDAMENTO&lt;br&gt;CONDICAO_MERCADORIA&lt;br&gt;EXPORTADOR_E_FABRICANTE_DO_PRODUTO&lt;br&gt;CRONOGRAMA_EMBARQUE&lt;br&gt;CRONOGRAMA_FATURAMENTO&lt;br&gt;RUC&lt;br&gt;NUMERO_CONHECIMENTO&lt;br&gt;PAIS_CONSIGNATARIO&lt;br&gt;TIPO_EMBALAGEM_LISTA&lt;br&gt;TIPO_IMPORTADOR_DUIMP&lt;br&gt;INDICACAO_IMPORTACAO_TERCEIROS&lt;br&gt;MOEDA_NEGOCIADA_DUIMP&lt;br&gt;FABRICANTE_PRODUTOR&lt;br&gt;EXPORTADOR_ESTRANGEIRO&lt;br&gt;UNIDADE_LOCALIZACAO_CARGA&lt;br&gt;UNIDADE_ENTRADA_DESCARGA&lt;br&gt;VIA_TRANSPORTE&lt;br&gt;TIPO_EMBALAGEM_ITEM_CARGA&lt;br&gt;VALOR_UNITARIO_CONDICAO_VENDA&lt;br&gt;LOCAL_EMBARQUE&lt;br&gt;FUNDAMENTO_LEGAL
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public CampoLpcoResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Código do atributo condicionante&lt;BR&gt;Tamanho máximo: 40&lt;br&gt;Formato: Código de atributo no formato ATT_NNNNNNNNN&lt;br&gt;
   * @return codigoAtributoPai
  **/
  @JsonProperty("codigoAtributoPai")
  public String getCodigoAtributoPai() {
    return codigoAtributoPai;
  }

  public void setCodigoAtributoPai(String codigoAtributoPai) {
    this.codigoAtributoPai = codigoAtributoPai;
  }

  public CampoLpcoResponse codigoAtributoPai(String codigoAtributoPai) {
    this.codigoAtributoPai = codigoAtributoPai;
    return this;
  }

 /**
   * Lista dos valores declarados para o campo ou atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10000
   * @return listaValor
  **/
  @JsonProperty("listaValor")
  @NotNull
  public List<String> getListaValor() {
    return listaValor;
  }

  public void setListaValor(List<String> listaValor) {
    this.listaValor = listaValor;
  }

  public CampoLpcoResponse listaValor(List<String> listaValor) {
    this.listaValor = listaValor;
    return this;
  }

  public CampoLpcoResponse addListaValorItem(String listaValorItem) {
    this.listaValor.add(listaValorItem);
    return this;
  }

 /**
   * Get valorComposto
   * @return valorComposto
  **/
  @JsonProperty("valorComposto")
  public ReferenciaValorComposto getValorComposto() {
    return valorComposto;
  }

  public void setValorComposto(ReferenciaValorComposto valorComposto) {
    this.valorComposto = valorComposto;
  }

  public CampoLpcoResponse valorComposto(ReferenciaValorComposto valorComposto) {
    this.valorComposto = valorComposto;
    return this;
  }

 /**
   * Unidade de medida utilizada no campo. Informado apenas nos campos QTD_COMERCIALIZADA e QTD_ESTATISTICA&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 60
   * @return unidadeMedida
  **/
  @JsonProperty("unidadeMedida")
  public String getUnidadeMedida() {
    return unidadeMedida;
  }

  public void setUnidadeMedida(String unidadeMedida) {
    this.unidadeMedida = unidadeMedida;
  }

  public CampoLpcoResponse unidadeMedida(String unidadeMedida) {
    this.unidadeMedida = unidadeMedida;
    return this;
  }

 /**
   * Lista com detalhes dos exportadores/importadores. Informado apenas nos campos CPF_CNPJ_IMPORTADOR e CPF_CNPJ_EXPORTADOR
   * @return intervenientes
  **/
  @JsonProperty("intervenientes")
  public List<Pessoa> getIntervenientes() {
    return intervenientes;
  }

  public void setIntervenientes(List<Pessoa> intervenientes) {
    this.intervenientes = intervenientes;
  }

  public CampoLpcoResponse intervenientes(List<Pessoa> intervenientes) {
    this.intervenientes = intervenientes;
    return this;
  }

  public CampoLpcoResponse addIntervenientesItem(Pessoa intervenientesItem) {
    this.intervenientes.add(intervenientesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoLpcoResponse {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    codigoAtributoPai: ").append(toIndentedString(codigoAtributoPai)).append("\n");
    sb.append("    listaValor: ").append(toIndentedString(listaValor)).append("\n");
    sb.append("    valorComposto: ").append(toIndentedString(valorComposto)).append("\n");
    sb.append("    unidadeMedida: ").append(toIndentedString(unidadeMedida)).append("\n");
    sb.append("    intervenientes: ").append(toIndentedString(intervenientes)).append("\n");
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

