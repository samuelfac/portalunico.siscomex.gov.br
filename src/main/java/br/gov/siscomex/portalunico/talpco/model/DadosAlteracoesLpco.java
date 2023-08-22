package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosAlteracoesLpco", propOrder =
    { "codigoCampo", "origem", "nomeCampo", "valorOriginal", "valorAlterado"
})

@XmlRootElement(name="DadosAlteracoesLpco")
/**
  * Dados de uma alteração de um campo de um LPCO
 **/
@ApiModel(description="Dados de uma alteração de um campo de um LPCO")
public class DadosAlteracoesLpco  {
  
  @XmlElement(name="codigoCampo", required = true)
  @ApiModelProperty(example = "ENQUADRAMENTO_OPERACAO", required = true, value = "Código do campo ou atributo que foi alterado<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL")
 /**
   * Código do campo ou atributo que foi alterado<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL
  **/
  private String codigoCampo = null;

  @XmlElement(name="origem", required = true)
  @ApiModelProperty(example = "Item 1 - NCM 22011000", required = true, value = "Indica o a qual item de NCM ao qual o campo está vinculado, ou se campo está vinculado aos Dados Gerais do LPCO<br>Tamanho mínimo:1<br>Tamanho máximo:30")
 /**
   * Indica o a qual item de NCM ao qual o campo está vinculado, ou se campo está vinculado aos Dados Gerais do LPCO<br>Tamanho mínimo:1<br>Tamanho máximo:30
  **/
  private String origem = null;

  @XmlElement(name="nomeCampo", required = true)
  @ApiModelProperty(example = "Enquadramento da operação", required = true, value = "Nome do campo alterado<br>Tamanho mínimo:1<br>Tamanho máximo:40")
 /**
   * Nome do campo alterado<br>Tamanho mínimo:1<br>Tamanho máximo:40
  **/
  private String nomeCampo = null;

  @XmlElement(name="valorOriginal")
  @ApiModelProperty(example = "80000", value = "Valor original do campo antes da solicitação de retificação<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000")
 /**
   * Valor original do campo antes da solicitação de retificação<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000
  **/
  private String valorOriginal = null;

  @XmlElement(name="valorAlterado")
  @ApiModelProperty(example = "85000", value = "Valor do campo após da solicitação de retificação<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000")
 /**
   * Valor do campo após da solicitação de retificação<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000
  **/
  private String valorAlterado = null;
 /**
   * Código do campo ou atributo que foi alterado&lt;br&gt;Tamanho máximo: 40&lt;br&gt;Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN&lt;br&gt;Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos&lt;br&gt;Domínio: PAIS_DESTINO&lt;br&gt;PAIS_IMPORTADOR&lt;br&gt;SITUACAO_ESPECIAL&lt;br&gt;TRATAMENTO_PRIORITARIO&lt;br&gt;NCM&lt;br&gt;ENQUADRAMENTO_OPERACAO&lt;br&gt;URF_EMBARQUE&lt;br&gt;URF_DESPACHO&lt;br&gt;RECINTO_EMBARQUE&lt;br&gt;RECINTO_DESPACHO&lt;br&gt;CONDICAO_VENDA&lt;br&gt;VIA_ESPECIAL_TRANSPORTE&lt;br&gt;MOEDA&lt;br&gt;MOTIVO_DISPENSA_NF&lt;br&gt;IMPORTADOR&lt;br&gt;CHAVE_ACESSO_NFE&lt;br&gt;QTDE_COMERCIALIZADA&lt;br&gt;QTDE_ESTATISTICA&lt;br&gt;VMLE&lt;br&gt;CODIGO_PRODUTO&lt;br&gt;CPF_CNPJ_EXPORTADOR&lt;br&gt;CPF_CNPJ_DECLARANTE&lt;br&gt;ENDERECO_IMPORTADOR&lt;br&gt;PESO_LIQUIDO_TOTAL&lt;br&gt;NUMERO_CONTEINER&lt;br&gt;NUMERO_LACRE&lt;br&gt;CNPJ_TRANSPORTADOR&lt;br&gt;NOME_TRANSPORTADOR_ESTRANGEIRO&lt;br&gt;TIPOS_EMBALAGEM&lt;br&gt;NOME_CONSIGNATARIO&lt;br&gt;ENDERECO_CONSIGNATARIO&lt;br&gt;VALOR_FINANCIADO&lt;br&gt;VALOR_CONDICAO_VENDA&lt;br&gt;FORMA_EXPORTACAO&lt;br&gt;PAIS_ORIGEM&lt;br&gt;PAIS_AQUISICAO&lt;br&gt;PAIS_PROCEDENCIA&lt;br&gt;CPF_CNPJ_IMPORTADOR&lt;br&gt;CODIGO_NALADI&lt;br&gt;CODIGO_FUNDAMENTO&lt;br&gt;CONDICAO_MERCADORIA&lt;br&gt;EXPORTADOR_E_FABRICANTE_DO_PRODUTO&lt;br&gt;CRONOGRAMA_EMBARQUE&lt;br&gt;CRONOGRAMA_FATURAMENTO&lt;br&gt;RUC&lt;br&gt;NUMERO_CONHECIMENTO&lt;br&gt;PAIS_CONSIGNATARIO&lt;br&gt;TIPO_EMBALAGEM_LISTA&lt;br&gt;TIPO_IMPORTADOR_DUIMP&lt;br&gt;INDICACAO_IMPORTACAO_TERCEIROS&lt;br&gt;MOEDA_NEGOCIADA_DUIMP&lt;br&gt;FABRICANTE_PRODUTOR&lt;br&gt;EXPORTADOR_ESTRANGEIRO&lt;br&gt;UNIDADE_LOCALIZACAO_CARGA&lt;br&gt;UNIDADE_ENTRADA_DESCARGA&lt;br&gt;VIA_TRANSPORTE&lt;br&gt;TIPO_EMBALAGEM_ITEM_CARGA&lt;br&gt;VALOR_UNITARIO_CONDICAO_VENDA&lt;br&gt;LOCAL_EMBARQUE&lt;br&gt;FUNDAMENTO_LEGAL
   * @return codigoCampo
  **/
  @JsonProperty("codigoCampo")
  @NotNull
  public String getCodigoCampo() {
    return codigoCampo;
  }

  public void setCodigoCampo(String codigoCampo) {
    this.codigoCampo = codigoCampo;
  }

  public DadosAlteracoesLpco codigoCampo(String codigoCampo) {
    this.codigoCampo = codigoCampo;
    return this;
  }

 /**
   * Indica o a qual item de NCM ao qual o campo está vinculado, ou se campo está vinculado aos Dados Gerais do LPCO&lt;br&gt;Tamanho mínimo:1&lt;br&gt;Tamanho máximo:30
   * @return origem
  **/
  @JsonProperty("origem")
  @NotNull
  public String getOrigem() {
    return origem;
  }

  public void setOrigem(String origem) {
    this.origem = origem;
  }

  public DadosAlteracoesLpco origem(String origem) {
    this.origem = origem;
    return this;
  }

 /**
   * Nome do campo alterado&lt;br&gt;Tamanho mínimo:1&lt;br&gt;Tamanho máximo:40
   * @return nomeCampo
  **/
  @JsonProperty("nomeCampo")
  @NotNull
  public String getNomeCampo() {
    return nomeCampo;
  }

  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  public DadosAlteracoesLpco nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }

 /**
   * Valor original do campo antes da solicitação de retificação&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10000
   * @return valorOriginal
  **/
  @JsonProperty("valorOriginal")
  public String getValorOriginal() {
    return valorOriginal;
  }

  public void setValorOriginal(String valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  public DadosAlteracoesLpco valorOriginal(String valorOriginal) {
    this.valorOriginal = valorOriginal;
    return this;
  }

 /**
   * Valor do campo após da solicitação de retificação&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10000
   * @return valorAlterado
  **/
  @JsonProperty("valorAlterado")
  public String getValorAlterado() {
    return valorAlterado;
  }

  public void setValorAlterado(String valorAlterado) {
    this.valorAlterado = valorAlterado;
  }

  public DadosAlteracoesLpco valorAlterado(String valorAlterado) {
    this.valorAlterado = valorAlterado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosAlteracoesLpco {\n");
    
    sb.append("    codigoCampo: ").append(toIndentedString(codigoCampo)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    nomeCampo: ").append(toIndentedString(nomeCampo)).append("\n");
    sb.append("    valorOriginal: ").append(toIndentedString(valorOriginal)).append("\n");
    sb.append("    valorAlterado: ").append(toIndentedString(valorAlterado)).append("\n");
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

