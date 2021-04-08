package br.gov.siscomex.portalunico.talpco.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConsultaDetalhadaCampo", propOrder =
    { "codigoAtributo", "codigoCampo", "nome", "nomeUnidadeMedida", "origem", "valores"
})

@XmlRootElement(name="ConsultaDetalhadaCampo")
/**
  * Dados de um campo de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de um campo de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaCampo  {
  
  @XmlElement(name="codigoAtributo", required = true)
  @ApiModelProperty(example = "ATT_123456", required = true, value = "Código do atributo do NCM<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL")
 /**
   * Código do atributo do NCM<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL
  **/
  private String codigoAtributo = null;

  @XmlElement(name="codigoCampo", required = true)
  @ApiModelProperty(example = "CPF_CNPJ_EXPORTADOR", required = true, value = "Código do campo<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL")
 /**
   * Código do campo<br>Tamanho máximo: 40<br>Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN<br>Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos<br>Domínio: PAIS_DESTINO<br>PAIS_IMPORTADOR<br>SITUACAO_ESPECIAL<br>TRATAMENTO_PRIORITARIO<br>NCM<br>ENQUADRAMENTO_OPERACAO<br>URF_EMBARQUE<br>URF_DESPACHO<br>RECINTO_EMBARQUE<br>RECINTO_DESPACHO<br>CONDICAO_VENDA<br>VIA_ESPECIAL_TRANSPORTE<br>MOEDA<br>MOTIVO_DISPENSA_NF<br>IMPORTADOR<br>CHAVE_ACESSO_NFE<br>QTDE_COMERCIALIZADA<br>QTDE_ESTATISTICA<br>VMLE<br>CODIGO_PRODUTO<br>CPF_CNPJ_EXPORTADOR<br>CPF_CNPJ_DECLARANTE<br>ENDERECO_IMPORTADOR<br>PESO_LIQUIDO_TOTAL<br>NUMERO_CONTEINER<br>NUMERO_LACRE<br>CNPJ_TRANSPORTADOR<br>NOME_TRANSPORTADOR_ESTRANGEIRO<br>TIPOS_EMBALAGEM<br>NOME_CONSIGNATARIO<br>ENDERECO_CONSIGNATARIO<br>VALOR_FINANCIADO<br>VALOR_CONDICAO_VENDA<br>FORMA_EXPORTACAO<br>PAIS_ORIGEM<br>PAIS_AQUISICAO<br>PAIS_PROCEDENCIA<br>CPF_CNPJ_IMPORTADOR<br>CODIGO_NALADI<br>CODIGO_FUNDAMENTO<br>CONDICAO_MERCADORIA<br>EXPORTADOR_E_FABRICANTE_DO_PRODUTO<br>CRONOGRAMA_EMBARQUE<br>CRONOGRAMA_FATURAMENTO<br>RUC<br>NUMERO_CONHECIMENTO<br>PAIS_CONSIGNATARIO<br>TIPO_EMBALAGEM_LISTA<br>TIPO_IMPORTADOR_DUIMP<br>INDICACAO_IMPORTACAO_TERCEIROS<br>MOEDA_NEGOCIADA_DUIMP<br>FABRICANTE_PRODUTOR<br>EXPORTADOR_ESTRANGEIRO<br>UNIDADE_LOCALIZACAO_CARGA<br>UNIDADE_ENTRADA_DESCARGA<br>VIA_TRANSPORTE<br>TIPO_EMBALAGEM_ITEM_CARGA<br>VALOR_UNITARIO_CONDICAO_VENDA<br>LOCAL_EMBARQUE<br>FUNDAMENTO_LEGAL
  **/
  private String codigoCampo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Pais de origem", required = true, value = "Nome do campo<br>Tamanho mínimo: 1<br>Tamanho máximo: 40")
 /**
   * Nome do campo<br>Tamanho mínimo: 1<br>Tamanho máximo: 40
  **/
  private String nome = null;

  @XmlElement(name="nomeUnidadeMedida")
  @ApiModelProperty(example = "UN", value = "Unidade de medida utilizada no campo. Informado apenas nos campos QTD_COMERCIALIZADA e QTD_ESTATISTICA<br>Tamanho mínimo: 1<br>Tamanho máximo: 60")
 /**
   * Unidade de medida utilizada no campo. Informado apenas nos campos QTD_COMERCIALIZADA e QTD_ESTATISTICA<br>Tamanho mínimo: 1<br>Tamanho máximo: 60
  **/
  private String nomeUnidadeMedida = null;


@XmlType(name="OrigemEnum")
@XmlEnum(String.class)
public enum OrigemEnum {

	@XmlEnumValue("DUE_DUIMP")
	@JsonProperty("DUE_DUIMP")
	DUE_DUIMP(String.valueOf("DUE_DUIMP")),
	
	@XmlEnumValue("CADATRIBUTOS")
	@JsonProperty("CADATRIBUTOS")
	CADATRIBUTOS(String.valueOf("CADATRIBUTOS")),
	
	@XmlEnumValue("TRATAMENTO_ADMINISTRATIVO")
	@JsonProperty("TRATAMENTO_ADMINISTRATIVO")
	TRATAMENTO_ADMINISTRATIVO(String.valueOf("TRATAMENTO_ADMINISTRATIVO")),
	
	@XmlEnumValue("CCT")
	@JsonProperty("CCT")
	CCT(String.valueOf("CCT")),
	
	@XmlEnumValue("CADATRIBUTOSPROD")
	@JsonProperty("CADATRIBUTOSPROD")
	CADATRIBUTOSPROD(String.valueOf("CADATRIBUTOSPROD")),
	
	@XmlEnumValue("COMPONENTE")
	@JsonProperty("COMPONENTE")
	COMPONENTE(String.valueOf("COMPONENTE"));


    private String value;

    OrigemEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrigemEnum fromValue(String v) {
        for (OrigemEnum b : OrigemEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to OrigemEnum");
    }
}

  @XmlElement(name="origem", required = true)
  @ApiModelProperty(example = "DUE-DUIMP", required = true, value = "Origem do campo: nova situação do LPCO<br>Tamanho mínimo: 0 <br>Tamanho máximo: 50")
 /**
   * Origem do campo: nova situação do LPCO<br>Tamanho mínimo: 0 <br>Tamanho máximo: 50
  **/
  private OrigemEnum origem = null;

  @XmlElement(name="valores")
  @ApiModelProperty(value = "")
  @Valid
  private List<ConsultaDetalhadaCampoValor> valores = null;
 /**
   * Código do atributo do NCM&lt;br&gt;Tamanho máximo: 40&lt;br&gt;Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN&lt;br&gt;Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos&lt;br&gt;Domínio: PAIS_DESTINO&lt;br&gt;PAIS_IMPORTADOR&lt;br&gt;SITUACAO_ESPECIAL&lt;br&gt;TRATAMENTO_PRIORITARIO&lt;br&gt;NCM&lt;br&gt;ENQUADRAMENTO_OPERACAO&lt;br&gt;URF_EMBARQUE&lt;br&gt;URF_DESPACHO&lt;br&gt;RECINTO_EMBARQUE&lt;br&gt;RECINTO_DESPACHO&lt;br&gt;CONDICAO_VENDA&lt;br&gt;VIA_ESPECIAL_TRANSPORTE&lt;br&gt;MOEDA&lt;br&gt;MOTIVO_DISPENSA_NF&lt;br&gt;IMPORTADOR&lt;br&gt;CHAVE_ACESSO_NFE&lt;br&gt;QTDE_COMERCIALIZADA&lt;br&gt;QTDE_ESTATISTICA&lt;br&gt;VMLE&lt;br&gt;CODIGO_PRODUTO&lt;br&gt;CPF_CNPJ_EXPORTADOR&lt;br&gt;CPF_CNPJ_DECLARANTE&lt;br&gt;ENDERECO_IMPORTADOR&lt;br&gt;PESO_LIQUIDO_TOTAL&lt;br&gt;NUMERO_CONTEINER&lt;br&gt;NUMERO_LACRE&lt;br&gt;CNPJ_TRANSPORTADOR&lt;br&gt;NOME_TRANSPORTADOR_ESTRANGEIRO&lt;br&gt;TIPOS_EMBALAGEM&lt;br&gt;NOME_CONSIGNATARIO&lt;br&gt;ENDERECO_CONSIGNATARIO&lt;br&gt;VALOR_FINANCIADO&lt;br&gt;VALOR_CONDICAO_VENDA&lt;br&gt;FORMA_EXPORTACAO&lt;br&gt;PAIS_ORIGEM&lt;br&gt;PAIS_AQUISICAO&lt;br&gt;PAIS_PROCEDENCIA&lt;br&gt;CPF_CNPJ_IMPORTADOR&lt;br&gt;CODIGO_NALADI&lt;br&gt;CODIGO_FUNDAMENTO&lt;br&gt;CONDICAO_MERCADORIA&lt;br&gt;EXPORTADOR_E_FABRICANTE_DO_PRODUTO&lt;br&gt;CRONOGRAMA_EMBARQUE&lt;br&gt;CRONOGRAMA_FATURAMENTO&lt;br&gt;RUC&lt;br&gt;NUMERO_CONHECIMENTO&lt;br&gt;PAIS_CONSIGNATARIO&lt;br&gt;TIPO_EMBALAGEM_LISTA&lt;br&gt;TIPO_IMPORTADOR_DUIMP&lt;br&gt;INDICACAO_IMPORTACAO_TERCEIROS&lt;br&gt;MOEDA_NEGOCIADA_DUIMP&lt;br&gt;FABRICANTE_PRODUTOR&lt;br&gt;EXPORTADOR_ESTRANGEIRO&lt;br&gt;UNIDADE_LOCALIZACAO_CARGA&lt;br&gt;UNIDADE_ENTRADA_DESCARGA&lt;br&gt;VIA_TRANSPORTE&lt;br&gt;TIPO_EMBALAGEM_ITEM_CARGA&lt;br&gt;VALOR_UNITARIO_CONDICAO_VENDA&lt;br&gt;LOCAL_EMBARQUE&lt;br&gt;FUNDAMENTO_LEGAL
   * @return codigoAtributo
  **/
  @JsonProperty("codigoAtributo")
  @NotNull
  public String getCodigoAtributo() {
    return codigoAtributo;
  }

  public void setCodigoAtributo(String codigoAtributo) {
    this.codigoAtributo = codigoAtributo;
  }

  public ConsultaDetalhadaCampo codigoAtributo(String codigoAtributo) {
    this.codigoAtributo = codigoAtributo;
    return this;
  }

 /**
   * Código do campo&lt;br&gt;Tamanho máximo: 40&lt;br&gt;Formato: Valores do domínio OU código de atributo no formato ATT_NNNNNNNNN&lt;br&gt;Lei de formação: O código do campo pode ser um dos tipos padrão pré-definidos no domínio ou um código de um atributo do Cadastro de Atributos&lt;br&gt;Domínio: PAIS_DESTINO&lt;br&gt;PAIS_IMPORTADOR&lt;br&gt;SITUACAO_ESPECIAL&lt;br&gt;TRATAMENTO_PRIORITARIO&lt;br&gt;NCM&lt;br&gt;ENQUADRAMENTO_OPERACAO&lt;br&gt;URF_EMBARQUE&lt;br&gt;URF_DESPACHO&lt;br&gt;RECINTO_EMBARQUE&lt;br&gt;RECINTO_DESPACHO&lt;br&gt;CONDICAO_VENDA&lt;br&gt;VIA_ESPECIAL_TRANSPORTE&lt;br&gt;MOEDA&lt;br&gt;MOTIVO_DISPENSA_NF&lt;br&gt;IMPORTADOR&lt;br&gt;CHAVE_ACESSO_NFE&lt;br&gt;QTDE_COMERCIALIZADA&lt;br&gt;QTDE_ESTATISTICA&lt;br&gt;VMLE&lt;br&gt;CODIGO_PRODUTO&lt;br&gt;CPF_CNPJ_EXPORTADOR&lt;br&gt;CPF_CNPJ_DECLARANTE&lt;br&gt;ENDERECO_IMPORTADOR&lt;br&gt;PESO_LIQUIDO_TOTAL&lt;br&gt;NUMERO_CONTEINER&lt;br&gt;NUMERO_LACRE&lt;br&gt;CNPJ_TRANSPORTADOR&lt;br&gt;NOME_TRANSPORTADOR_ESTRANGEIRO&lt;br&gt;TIPOS_EMBALAGEM&lt;br&gt;NOME_CONSIGNATARIO&lt;br&gt;ENDERECO_CONSIGNATARIO&lt;br&gt;VALOR_FINANCIADO&lt;br&gt;VALOR_CONDICAO_VENDA&lt;br&gt;FORMA_EXPORTACAO&lt;br&gt;PAIS_ORIGEM&lt;br&gt;PAIS_AQUISICAO&lt;br&gt;PAIS_PROCEDENCIA&lt;br&gt;CPF_CNPJ_IMPORTADOR&lt;br&gt;CODIGO_NALADI&lt;br&gt;CODIGO_FUNDAMENTO&lt;br&gt;CONDICAO_MERCADORIA&lt;br&gt;EXPORTADOR_E_FABRICANTE_DO_PRODUTO&lt;br&gt;CRONOGRAMA_EMBARQUE&lt;br&gt;CRONOGRAMA_FATURAMENTO&lt;br&gt;RUC&lt;br&gt;NUMERO_CONHECIMENTO&lt;br&gt;PAIS_CONSIGNATARIO&lt;br&gt;TIPO_EMBALAGEM_LISTA&lt;br&gt;TIPO_IMPORTADOR_DUIMP&lt;br&gt;INDICACAO_IMPORTACAO_TERCEIROS&lt;br&gt;MOEDA_NEGOCIADA_DUIMP&lt;br&gt;FABRICANTE_PRODUTOR&lt;br&gt;EXPORTADOR_ESTRANGEIRO&lt;br&gt;UNIDADE_LOCALIZACAO_CARGA&lt;br&gt;UNIDADE_ENTRADA_DESCARGA&lt;br&gt;VIA_TRANSPORTE&lt;br&gt;TIPO_EMBALAGEM_ITEM_CARGA&lt;br&gt;VALOR_UNITARIO_CONDICAO_VENDA&lt;br&gt;LOCAL_EMBARQUE&lt;br&gt;FUNDAMENTO_LEGAL
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

  public ConsultaDetalhadaCampo codigoCampo(String codigoCampo) {
    this.codigoCampo = codigoCampo;
    return this;
  }

 /**
   * Nome do campo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 40
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ConsultaDetalhadaCampo nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Unidade de medida utilizada no campo. Informado apenas nos campos QTD_COMERCIALIZADA e QTD_ESTATISTICA&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 60
   * @return nomeUnidadeMedida
  **/
  @JsonProperty("nomeUnidadeMedida")
  public String getNomeUnidadeMedida() {
    return nomeUnidadeMedida;
  }

  public void setNomeUnidadeMedida(String nomeUnidadeMedida) {
    this.nomeUnidadeMedida = nomeUnidadeMedida;
  }

  public ConsultaDetalhadaCampo nomeUnidadeMedida(String nomeUnidadeMedida) {
    this.nomeUnidadeMedida = nomeUnidadeMedida;
    return this;
  }

 /**
   * Origem do campo: nova situação do LPCO&lt;br&gt;Tamanho mínimo: 0 &lt;br&gt;Tamanho máximo: 50
   * @return origem
  **/
  @JsonProperty("origem")
  @NotNull
  public String getOrigem() {
    if (origem == null) {
      return null;
    }
    return origem.value();
  }

  public void setOrigem(OrigemEnum origem) {
    this.origem = origem;
  }

  public ConsultaDetalhadaCampo origem(OrigemEnum origem) {
    this.origem = origem;
    return this;
  }

 /**
   * Get valores
   * @return valores
  **/
  @JsonProperty("valores")
  public List<ConsultaDetalhadaCampoValor> getValores() {
    return valores;
  }

  public void setValores(List<ConsultaDetalhadaCampoValor> valores) {
    this.valores = valores;
  }

  public ConsultaDetalhadaCampo valores(List<ConsultaDetalhadaCampoValor> valores) {
    this.valores = valores;
    return this;
  }

  public ConsultaDetalhadaCampo addValoresItem(ConsultaDetalhadaCampoValor valoresItem) {
    this.valores.add(valoresItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaCampo {\n");
    
    sb.append("    codigoAtributo: ").append(toIndentedString(codigoAtributo)).append("\n");
    sb.append("    codigoCampo: ").append(toIndentedString(codigoCampo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeUnidadeMedida: ").append(toIndentedString(nomeUnidadeMedida)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    valores: ").append(toIndentedString(valores)).append("\n");
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

