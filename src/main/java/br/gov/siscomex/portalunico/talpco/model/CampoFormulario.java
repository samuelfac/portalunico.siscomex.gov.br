package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CampoFormulario", propOrder =
    { "codigo", "nome", "unidadeMedida", "tipo", "validacao", "condicaoPreenchimento", "codigoAtributoPai", "subatributos", "orientacao", "exemplo"
})

@XmlRootElement(name="CampoFormulario")
/**
  * Definição da estrutura de um campo de um LPCO. Quando o campo for do tipo INDICACAO_IMPORTACAO_TERCEIROS, EXPORTADOR_ESTRANGEIRO, EXPORTADOR_E_FABRICANTE_DO_PRODUTO, FABRICANTE_PRODUTOR, FUNDAMENTO_LEGAL ou ATRIBUTO_COMPOSTO, consultar o DTO \"ReferenciaValorComposto\" na sessão \"Models\" ao final desta documentação.
 **/
@ApiModel(description="Definição da estrutura de um campo de um LPCO. Quando o campo for do tipo INDICACAO_IMPORTACAO_TERCEIROS, EXPORTADOR_ESTRANGEIRO, EXPORTADOR_E_FABRICANTE_DO_PRODUTO, FABRICANTE_PRODUTOR, FUNDAMENTO_LEGAL ou ATRIBUTO_COMPOSTO, consultar o DTO \"ReferenciaValorComposto\" na sessão \"Models\" ao final desta documentação.")
public class CampoFormulario  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("PAIS_DESTINO")
	@JsonProperty("PAIS_DESTINO")
	PAIS_DESTINO(String.valueOf("PAIS_DESTINO")),
	
	@XmlEnumValue("PAIS_IMPORTADOR")
	@JsonProperty("PAIS_IMPORTADOR")
	PAIS_IMPORTADOR(String.valueOf("PAIS_IMPORTADOR")),
	
	@XmlEnumValue("SITUACAO_ESPECIAL")
	@JsonProperty("SITUACAO_ESPECIAL")
	SITUACAO_ESPECIAL(String.valueOf("SITUACAO_ESPECIAL")),
	
	@XmlEnumValue("TRATAMENTO_PRIORITARIO")
	@JsonProperty("TRATAMENTO_PRIORITARIO")
	TRATAMENTO_PRIORITARIO(String.valueOf("TRATAMENTO_PRIORITARIO")),
	
	@XmlEnumValue("NCM")
	@JsonProperty("NCM")
	NCM(String.valueOf("NCM")),
	
	@XmlEnumValue("ENQUADRAMENTO_OPERACAO")
	@JsonProperty("ENQUADRAMENTO_OPERACAO")
	ENQUADRAMENTO_OPERACAO(String.valueOf("ENQUADRAMENTO_OPERACAO")),
	
	@XmlEnumValue("URF_EMBARQUE")
	@JsonProperty("URF_EMBARQUE")
	URF_EMBARQUE(String.valueOf("URF_EMBARQUE")),
	
	@XmlEnumValue("URF_DESPACHO")
	@JsonProperty("URF_DESPACHO")
	URF_DESPACHO(String.valueOf("URF_DESPACHO")),
	
	@XmlEnumValue("RECINTO_EMBARQUE")
	@JsonProperty("RECINTO_EMBARQUE")
	RECINTO_EMBARQUE(String.valueOf("RECINTO_EMBARQUE")),
	
	@XmlEnumValue("RECINTO_DESPACHO")
	@JsonProperty("RECINTO_DESPACHO")
	RECINTO_DESPACHO(String.valueOf("RECINTO_DESPACHO")),
	
	@XmlEnumValue("CONDICAO_VENDA")
	@JsonProperty("CONDICAO_VENDA")
	CONDICAO_VENDA(String.valueOf("CONDICAO_VENDA")),
	
	@XmlEnumValue("VIA_ESPECIAL_TRANSPORTE")
	@JsonProperty("VIA_ESPECIAL_TRANSPORTE")
	VIA_ESPECIAL_TRANSPORTE(String.valueOf("VIA_ESPECIAL_TRANSPORTE")),
	
	@XmlEnumValue("MOEDA")
	@JsonProperty("MOEDA")
	MOEDA(String.valueOf("MOEDA")),
	
	@XmlEnumValue("MOTIVO_DISPENSA_NF")
	@JsonProperty("MOTIVO_DISPENSA_NF")
	MOTIVO_DISPENSA_NF(String.valueOf("MOTIVO_DISPENSA_NF")),
	
	@XmlEnumValue("IMPORTADOR")
	@JsonProperty("IMPORTADOR")
	IMPORTADOR(String.valueOf("IMPORTADOR")),
	
	@XmlEnumValue("CHAVE_ACESSO_NFE")
	@JsonProperty("CHAVE_ACESSO_NFE")
	CHAVE_ACESSO_NFE(String.valueOf("CHAVE_ACESSO_NFE")),
	
	@XmlEnumValue("QTDE_COMERCIALIZADA")
	@JsonProperty("QTDE_COMERCIALIZADA")
	QTDE_COMERCIALIZADA(String.valueOf("QTDE_COMERCIALIZADA")),
	
	@XmlEnumValue("QTDE_ESTATISTICA")
	@JsonProperty("QTDE_ESTATISTICA")
	QTDE_ESTATISTICA(String.valueOf("QTDE_ESTATISTICA")),
	
	@XmlEnumValue("VMLE")
	@JsonProperty("VMLE")
	VMLE(String.valueOf("VMLE")),
	
	@XmlEnumValue("CODIGO_PRODUTO")
	@JsonProperty("CODIGO_PRODUTO")
	CODIGO_PRODUTO(String.valueOf("CODIGO_PRODUTO")),
	
	@XmlEnumValue("CPF_CNPJ_EXPORTADOR")
	@JsonProperty("CPF_CNPJ_EXPORTADOR")
	CPF_CNPJ_EXPORTADOR(String.valueOf("CPF_CNPJ_EXPORTADOR")),
	
	@XmlEnumValue("CPF_CNPJ_DECLARANTE")
	@JsonProperty("CPF_CNPJ_DECLARANTE")
	CPF_CNPJ_DECLARANTE(String.valueOf("CPF_CNPJ_DECLARANTE")),
	
	@XmlEnumValue("ENDERECO_IMPORTADOR")
	@JsonProperty("ENDERECO_IMPORTADOR")
	ENDERECO_IMPORTADOR(String.valueOf("ENDERECO_IMPORTADOR")),
	
	@XmlEnumValue("PESO_LIQUIDO_TOTAL")
	@JsonProperty("PESO_LIQUIDO_TOTAL")
	PESO_LIQUIDO_TOTAL(String.valueOf("PESO_LIQUIDO_TOTAL")),
	
	@XmlEnumValue("NUMERO_CONTEINER")
	@JsonProperty("NUMERO_CONTEINER")
	NUMERO_CONTEINER(String.valueOf("NUMERO_CONTEINER")),
	
	@XmlEnumValue("NUMERO_LACRE")
	@JsonProperty("NUMERO_LACRE")
	NUMERO_LACRE(String.valueOf("NUMERO_LACRE")),
	
	@XmlEnumValue("CNPJ_TRANSPORTADOR")
	@JsonProperty("CNPJ_TRANSPORTADOR")
	CNPJ_TRANSPORTADOR(String.valueOf("CNPJ_TRANSPORTADOR")),
	
	@XmlEnumValue("NOME_TRANSPORTADOR_ESTRANGEIRO")
	@JsonProperty("NOME_TRANSPORTADOR_ESTRANGEIRO")
	NOME_TRANSPORTADOR_ESTRANGEIRO(String.valueOf("NOME_TRANSPORTADOR_ESTRANGEIRO")),
	
	@XmlEnumValue("TIPOS_EMBALAGEM")
	@JsonProperty("TIPOS_EMBALAGEM")
	TIPOS_EMBALAGEM(String.valueOf("TIPOS_EMBALAGEM")),
	
	@XmlEnumValue("NOME_CONSIGNATARIO")
	@JsonProperty("NOME_CONSIGNATARIO")
	NOME_CONSIGNATARIO(String.valueOf("NOME_CONSIGNATARIO")),
	
	@XmlEnumValue("ENDERECO_CONSIGNATARIO")
	@JsonProperty("ENDERECO_CONSIGNATARIO")
	ENDERECO_CONSIGNATARIO(String.valueOf("ENDERECO_CONSIGNATARIO")),
	
	@XmlEnumValue("VALOR_FINANCIADO")
	@JsonProperty("VALOR_FINANCIADO")
	VALOR_FINANCIADO(String.valueOf("VALOR_FINANCIADO")),
	
	@XmlEnumValue("VALOR_CONDICAO_VENDA")
	@JsonProperty("VALOR_CONDICAO_VENDA")
	VALOR_CONDICAO_VENDA(String.valueOf("VALOR_CONDICAO_VENDA")),
	
	@XmlEnumValue("FORMA_EXPORTACAO")
	@JsonProperty("FORMA_EXPORTACAO")
	FORMA_EXPORTACAO(String.valueOf("FORMA_EXPORTACAO")),
	
	@XmlEnumValue("PAIS_ORIGEM")
	@JsonProperty("PAIS_ORIGEM")
	PAIS_ORIGEM(String.valueOf("PAIS_ORIGEM")),
	
	@XmlEnumValue("PAIS_AQUISICAO")
	@JsonProperty("PAIS_AQUISICAO")
	PAIS_AQUISICAO(String.valueOf("PAIS_AQUISICAO")),
	
	@XmlEnumValue("PAIS_PROCEDENCIA")
	@JsonProperty("PAIS_PROCEDENCIA")
	PAIS_PROCEDENCIA(String.valueOf("PAIS_PROCEDENCIA")),
	
	@XmlEnumValue("CPF_CNPJ_IMPORTADOR")
	@JsonProperty("CPF_CNPJ_IMPORTADOR")
	CPF_CNPJ_IMPORTADOR(String.valueOf("CPF_CNPJ_IMPORTADOR")),
	
	@XmlEnumValue("CODIGO_NALADI")
	@JsonProperty("CODIGO_NALADI")
	CODIGO_NALADI(String.valueOf("CODIGO_NALADI")),
	
	@XmlEnumValue("CODIGO_FUNDAMENTO")
	@JsonProperty("CODIGO_FUNDAMENTO")
	CODIGO_FUNDAMENTO(String.valueOf("CODIGO_FUNDAMENTO")),
	
	@XmlEnumValue("CONDICAO_MERCADORIA")
	@JsonProperty("CONDICAO_MERCADORIA")
	CONDICAO_MERCADORIA(String.valueOf("CONDICAO_MERCADORIA")),
	
	@XmlEnumValue("EXPORTADOR_E_FABRICANTE_DO_PRODUTO")
	@JsonProperty("EXPORTADOR_E_FABRICANTE_DO_PRODUTO")
	EXPORTADOR_E_FABRICANTE_DO_PRODUTO(String.valueOf("EXPORTADOR_E_FABRICANTE_DO_PRODUTO")),
	
	@XmlEnumValue("CRONOGRAMA_EMBARQUE")
	@JsonProperty("CRONOGRAMA_EMBARQUE")
	CRONOGRAMA_EMBARQUE(String.valueOf("CRONOGRAMA_EMBARQUE")),
	
	@XmlEnumValue("CRONOGRAMA_FATURAMENTO")
	@JsonProperty("CRONOGRAMA_FATURAMENTO")
	CRONOGRAMA_FATURAMENTO(String.valueOf("CRONOGRAMA_FATURAMENTO")),
	
	@XmlEnumValue("RUC")
	@JsonProperty("RUC")
	RUC(String.valueOf("RUC")),
	
	@XmlEnumValue("NUMERO_CONHECIMENTO")
	@JsonProperty("NUMERO_CONHECIMENTO")
	NUMERO_CONHECIMENTO(String.valueOf("NUMERO_CONHECIMENTO")),
	
	@XmlEnumValue("PAIS_CONSIGNATARIO")
	@JsonProperty("PAIS_CONSIGNATARIO")
	PAIS_CONSIGNATARIO(String.valueOf("PAIS_CONSIGNATARIO")),
	
	@XmlEnumValue("TIPO_EMBALAGEM_LISTA")
	@JsonProperty("TIPO_EMBALAGEM_LISTA")
	TIPO_EMBALAGEM_LISTA(String.valueOf("TIPO_EMBALAGEM_LISTA")),
	
	@XmlEnumValue("TIPO_IMPORTADOR_DUIMP")
	@JsonProperty("TIPO_IMPORTADOR_DUIMP")
	TIPO_IMPORTADOR_DUIMP(String.valueOf("TIPO_IMPORTADOR_DUIMP")),
	
	@XmlEnumValue("INDICACAO_IMPORTACAO_TERCEIROS")
	@JsonProperty("INDICACAO_IMPORTACAO_TERCEIROS")
	INDICACAO_IMPORTACAO_TERCEIROS(String.valueOf("INDICACAO_IMPORTACAO_TERCEIROS")),
	
	@XmlEnumValue("MOEDA_NEGOCIADA_DUIMP")
	@JsonProperty("MOEDA_NEGOCIADA_DUIMP")
	MOEDA_NEGOCIADA_DUIMP(String.valueOf("MOEDA_NEGOCIADA_DUIMP")),
	
	@XmlEnumValue("FABRICANTE_PRODUTOR")
	@JsonProperty("FABRICANTE_PRODUTOR")
	FABRICANTE_PRODUTOR(String.valueOf("FABRICANTE_PRODUTOR")),
	
	@XmlEnumValue("EXPORTADOR_ESTRANGEIRO")
	@JsonProperty("EXPORTADOR_ESTRANGEIRO")
	EXPORTADOR_ESTRANGEIRO(String.valueOf("EXPORTADOR_ESTRANGEIRO")),
	
	@XmlEnumValue("UNIDADE_DESPACHO")
	@JsonProperty("UNIDADE_DESPACHO")
	UNIDADE_DESPACHO(String.valueOf("UNIDADE_DESPACHO")),
	
	@XmlEnumValue("UNIDADE_ENTRADA_DESCARGA")
	@JsonProperty("UNIDADE_ENTRADA_DESCARGA")
	UNIDADE_ENTRADA_DESCARGA(String.valueOf("UNIDADE_ENTRADA_DESCARGA")),
	
	@XmlEnumValue("VIA_TRANSPORTE")
	@JsonProperty("VIA_TRANSPORTE")
	VIA_TRANSPORTE(String.valueOf("VIA_TRANSPORTE")),
	
	@XmlEnumValue("TIPO_EMBALAGEM_ITEM_CARGA")
	@JsonProperty("TIPO_EMBALAGEM_ITEM_CARGA")
	TIPO_EMBALAGEM_ITEM_CARGA(String.valueOf("TIPO_EMBALAGEM_ITEM_CARGA")),
	
	@XmlEnumValue("VALOR_UNITARIO_CONDICAO_VENDA")
	@JsonProperty("VALOR_UNITARIO_CONDICAO_VENDA")
	VALOR_UNITARIO_CONDICAO_VENDA(String.valueOf("VALOR_UNITARIO_CONDICAO_VENDA")),
	
	@XmlEnumValue("FUNDAMENTO_LEGAL")
	@JsonProperty("FUNDAMENTO_LEGAL")
	FUNDAMENTO_LEGAL(String.valueOf("FUNDAMENTO_LEGAL")),
	
	@XmlEnumValue("QTDE_COTA")
	@JsonProperty("QTDE_COTA")
	QTDE_COTA(String.valueOf("QTDE_COTA")),
	
	@XmlEnumValue("ATRIBUTO_COMPOSTO")
	@JsonProperty("ATRIBUTO_COMPOSTO")
	ATRIBUTO_COMPOSTO(String.valueOf("ATRIBUTO_COMPOSTO")),
	
	@XmlEnumValue("IMPORTADOR_ADQUIRENTE_ENCOMENDANTE")
	@JsonProperty("IMPORTADOR_ADQUIRENTE_ENCOMENDANTE")
	IMPORTADOR_ADQUIRENTE_ENCOMENDANTE(String.valueOf("IMPORTADOR_ADQUIRENTE_ENCOMENDANTE")),
	
	@XmlEnumValue("UNIDADE_DESTINO_CARGA")
	@JsonProperty("UNIDADE_DESTINO_CARGA")
	UNIDADE_DESTINO_CARGA(String.valueOf("UNIDADE_DESTINO_CARGA")),
	
	@XmlEnumValue("RECINTO_ARMAZENAMENTO CAMPO_CONTROLE_DE_SALDO")
	@JsonProperty("RECINTO_ARMAZENAMENTO CAMPO_CONTROLE_DE_SALDO")
	RECINTO_ARMAZENAMENTO_CAMPO_CONTROLE_DE_SALDO(String.valueOf("RECINTO_ARMAZENAMENTO CAMPO_CONTROLE_DE_SALDO")),
	
	@XmlEnumValue("LPCO_VINCULADO DENOMINACAO_PRODUTO PESO_LIQUIDO_ITEM")
	@JsonProperty("LPCO_VINCULADO DENOMINACAO_PRODUTO PESO_LIQUIDO_ITEM")
	LPCO_VINCULADO_DENOMINACAO_PRODUTO_PESO_LIQUIDO_ITEM(String.valueOf("LPCO_VINCULADO DENOMINACAO_PRODUTO PESO_LIQUIDO_ITEM")),
	
	@XmlEnumValue("ATT_<número>")
	@JsonProperty("ATT_<número>")
	ATT__N_MERO_(String.valueOf("ATT_<número>"));


    private String value;

    CodigoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CodigoEnum fromValue(String v) {
        for (CodigoEnum b : CodigoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CodigoEnum");
    }
}

  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "PAIS_DESTINO", required = true, value = "Código de identificação do campo<br>Tamanho mínimo: 0 <br>Tamanho máximo: 50")
 /**
   * Código de identificação do campo<br>Tamanho mínimo: 0 <br>Tamanho máximo: 50
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "País de destino", required = true, value = "Nome descritivo do campo<br>Tamanho mínimo: 1 <br>Tamanho máximo: 40")
 /**
   * Nome descritivo do campo<br>Tamanho mínimo: 1 <br>Tamanho máximo: 40
  **/
  private String nome = null;

  @XmlElement(name="unidadeMedida")
  @ApiModelProperty(example = "KG", value = "Unidade de medida que será retornada para os campos QTDE_ESTATISTICA e QTDE_COMERCIALIZADA e deverá ser informada para QTDE_COMERCIALIZADA<br>Tamanho mínimo: 0<br>Tamanho máximo: 60")
 /**
   * Unidade de medida que será retornada para os campos QTDE_ESTATISTICA e QTDE_COMERCIALIZADA e deverá ser informada para QTDE_COMERCIALIZADA<br>Tamanho mínimo: 0<br>Tamanho máximo: 60
  **/
  private String unidadeMedida = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("BOOLEANO")
	@JsonProperty("BOOLEANO")
	BOOLEANO(String.valueOf("BOOLEANO")),
	
	@XmlEnumValue("DATA")
	@JsonProperty("DATA")
	DATA(String.valueOf("DATA")),
	
	@XmlEnumValue("DATA_HORA")
	@JsonProperty("DATA_HORA")
	DATA_HORA(String.valueOf("DATA_HORA")),
	
	@XmlEnumValue("NUMERO_INTEIRO")
	@JsonProperty("NUMERO_INTEIRO")
	NUMERO_INTEIRO(String.valueOf("NUMERO_INTEIRO")),
	
	@XmlEnumValue("NUMERO_REAL")
	@JsonProperty("NUMERO_REAL")
	NUMERO_REAL(String.valueOf("NUMERO_REAL")),
	
	@XmlEnumValue("TEXTO")
	@JsonProperty("TEXTO")
	TEXTO(String.valueOf("TEXTO")),
	
	@XmlEnumValue("LISTA")
	@JsonProperty("LISTA")
	LISTA(String.valueOf("LISTA")),
	
	@XmlEnumValue("CRONOGRAMA")
	@JsonProperty("CRONOGRAMA")
	CRONOGRAMA(String.valueOf("CRONOGRAMA")),
	
	@XmlEnumValue("RUC")
	@JsonProperty("RUC")
	RUC(String.valueOf("RUC")),
	
	@XmlEnumValue("OPERADOR_ESTRANGEIRO")
	@JsonProperty("OPERADOR_ESTRANGEIRO")
	OPERADOR_ESTRANGEIRO(String.valueOf("OPERADOR_ESTRANGEIRO")),
	
	@XmlEnumValue("FABRICANTE")
	@JsonProperty("FABRICANTE")
	FABRICANTE(String.valueOf("FABRICANTE")),
	
	@XmlEnumValue("IMPORTACAO_TERCEIROS")
	@JsonProperty("IMPORTACAO_TERCEIROS")
	IMPORTACAO_TERCEIROS(String.valueOf("IMPORTACAO_TERCEIROS")),
	
	@XmlEnumValue("VALOR_COM_UNIDADE_MEDIDA")
	@JsonProperty("VALOR_COM_UNIDADE_MEDIDA")
	VALOR_COM_UNIDADE_MEDIDA(String.valueOf("VALOR_COM_UNIDADE_MEDIDA")),
	
	@XmlEnumValue("VALOR_MONETARIO")
	@JsonProperty("VALOR_MONETARIO")
	VALOR_MONETARIO(String.valueOf("VALOR_MONETARIO")),
	
	@XmlEnumValue("FUNDAMENTO_LEGAL")
	@JsonProperty("FUNDAMENTO_LEGAL")
	FUNDAMENTO_LEGAL(String.valueOf("FUNDAMENTO_LEGAL")),
	
	@XmlEnumValue("ATRIBUTO_COMPOSTO")
	@JsonProperty("ATRIBUTO_COMPOSTO")
	ATRIBUTO_COMPOSTO(String.valueOf("ATRIBUTO_COMPOSTO")),
	
	@XmlEnumValue("VALOR_LPCO_VINCULADO")
	@JsonProperty("VALOR_LPCO_VINCULADO")
	VALOR_LPCO_VINCULADO(String.valueOf("VALOR_LPCO_VINCULADO")),
	
	@XmlEnumValue("CHAVE_NFE")
	@JsonProperty("CHAVE_NFE")
	CHAVE_NFE(String.valueOf("CHAVE_NFE")),
	
	@XmlEnumValue("CPF_CNPJ")
	@JsonProperty("CPF_CNPJ")
	CPF_CNPJ(String.valueOf("CPF_CNPJ")),
	
	@XmlEnumValue("CNPJ")
	@JsonProperty("CNPJ")
	CNPJ(String.valueOf("CNPJ"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(example = "LISTA_ESTATICA", required = true, value = "Tipo da informação recebida pelo campo<br>Tamanho mínimo: 1 <br>Tamanho máximo: 40")
 /**
   * Tipo da informação recebida pelo campo<br>Tamanho mínimo: 1 <br>Tamanho máximo: 40
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="validacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ValidacaoCampoLpco validacao = null;

  @XmlElement(name="condicaoPreenchimento")
  @ApiModelProperty(example = "ATT_1 >= 10 && ATT_1 <=100", value = "Indica em qual condição este campo pode ser preenchido")
 /**
   * Indica em qual condição este campo pode ser preenchido
  **/
  private String condicaoPreenchimento = null;

  @XmlElement(name="codigoAtributoPai")
  @ApiModelProperty(example = "ATT_1", value = "Código do atributo condicionante a ser informado no campo LPCO na propriedade 'codigoAtributoPai'")
 /**
   * Código do atributo condicionante a ser informado no campo LPCO na propriedade 'codigoAtributoPai'
  **/
  private String codigoAtributoPai = null;

  @XmlElement(name="subatributos")
  @ApiModelProperty(value = "Lista de subatributos que compõem este campo quando for um atributo composto")
  @Valid
 /**
   * Lista de subatributos que compõem este campo quando for um atributo composto
  **/
  private List<CampoFormulario> subatributos = null;

  @XmlElement(name="orientacao")
  @ApiModelProperty(example = "Preencher o valor conforme a máscara do campo.", value = "Orientação de como preencher o campo nos serviços de inclusão, alteração e retifiação de pedido LPCO.")
 /**
   * Orientação de como preencher o campo nos serviços de inclusão, alteração e retifiação de pedido LPCO.
  **/
  private String orientacao = null;

  @XmlElement(name="exemplo")
  @ApiModelProperty(example = "{ \"codigo\": \"ATT_0001\", \"listaValor\": [ \"true\"] }", value = "Exemplo de JSON para preenchimento do campo nos serviços de inclusão, alteração e retifiação de pedido LPCO.")
 /**
   * Exemplo de JSON para preenchimento do campo nos serviços de inclusão, alteração e retifiação de pedido LPCO.
  **/
  private String exemplo = null;
 /**
   * Código de identificação do campo&lt;br&gt;Tamanho mínimo: 0 &lt;br&gt;Tamanho máximo: 50
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    if (codigo == null) {
      return null;
    }
    return codigo.value();
  }

  public void setCodigo(CodigoEnum codigo) {
    this.codigo = codigo;
  }

  public CampoFormulario codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome descritivo do campo&lt;br&gt;Tamanho mínimo: 1 &lt;br&gt;Tamanho máximo: 40
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

  public CampoFormulario nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Unidade de medida que será retornada para os campos QTDE_ESTATISTICA e QTDE_COMERCIALIZADA e deverá ser informada para QTDE_COMERCIALIZADA&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 60
   * @return unidadeMedida
  **/
  @JsonProperty("unidadeMedida")
  public String getUnidadeMedida() {
    return unidadeMedida;
  }

  public void setUnidadeMedida(String unidadeMedida) {
    this.unidadeMedida = unidadeMedida;
  }

  public CampoFormulario unidadeMedida(String unidadeMedida) {
    this.unidadeMedida = unidadeMedida;
    return this;
  }

 /**
   * Tipo da informação recebida pelo campo&lt;br&gt;Tamanho mínimo: 1 &lt;br&gt;Tamanho máximo: 40
   * @return tipo
  **/
  @JsonProperty("tipo")
  @NotNull
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public CampoFormulario tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get validacao
   * @return validacao
  **/
  @JsonProperty("validacao")
  @NotNull
  public ValidacaoCampoLpco getValidacao() {
    return validacao;
  }

  public void setValidacao(ValidacaoCampoLpco validacao) {
    this.validacao = validacao;
  }

  public CampoFormulario validacao(ValidacaoCampoLpco validacao) {
    this.validacao = validacao;
    return this;
  }

 /**
   * Indica em qual condição este campo pode ser preenchido
   * @return condicaoPreenchimento
  **/
  @JsonProperty("condicaoPreenchimento")
  public String getCondicaoPreenchimento() {
    return condicaoPreenchimento;
  }

  public void setCondicaoPreenchimento(String condicaoPreenchimento) {
    this.condicaoPreenchimento = condicaoPreenchimento;
  }

  public CampoFormulario condicaoPreenchimento(String condicaoPreenchimento) {
    this.condicaoPreenchimento = condicaoPreenchimento;
    return this;
  }

 /**
   * Código do atributo condicionante a ser informado no campo LPCO na propriedade &#39;codigoAtributoPai&#39;
   * @return codigoAtributoPai
  **/
  @JsonProperty("codigoAtributoPai")
  public String getCodigoAtributoPai() {
    return codigoAtributoPai;
  }

  public void setCodigoAtributoPai(String codigoAtributoPai) {
    this.codigoAtributoPai = codigoAtributoPai;
  }

  public CampoFormulario codigoAtributoPai(String codigoAtributoPai) {
    this.codigoAtributoPai = codigoAtributoPai;
    return this;
  }

 /**
   * Lista de subatributos que compõem este campo quando for um atributo composto
   * @return subatributos
  **/
  @JsonProperty("subatributos")
  public List<CampoFormulario> getSubatributos() {
    return subatributos;
  }

  public void setSubatributos(List<CampoFormulario> subatributos) {
    this.subatributos = subatributos;
  }

  public CampoFormulario subatributos(List<CampoFormulario> subatributos) {
    this.subatributos = subatributos;
    return this;
  }

  public CampoFormulario addSubatributosItem(CampoFormulario subatributosItem) {
    this.subatributos.add(subatributosItem);
    return this;
  }

 /**
   * Orientação de como preencher o campo nos serviços de inclusão, alteração e retifiação de pedido LPCO.
   * @return orientacao
  **/
  @JsonProperty("orientacao")
  public String getOrientacao() {
    return orientacao;
  }

  public void setOrientacao(String orientacao) {
    this.orientacao = orientacao;
  }

  public CampoFormulario orientacao(String orientacao) {
    this.orientacao = orientacao;
    return this;
  }

 /**
   * Exemplo de JSON para preenchimento do campo nos serviços de inclusão, alteração e retifiação de pedido LPCO.
   * @return exemplo
  **/
  @JsonProperty("exemplo")
  public String getExemplo() {
    return exemplo;
  }

  public void setExemplo(String exemplo) {
    this.exemplo = exemplo;
  }

  public CampoFormulario exemplo(String exemplo) {
    this.exemplo = exemplo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoFormulario {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    unidadeMedida: ").append(toIndentedString(unidadeMedida)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    validacao: ").append(toIndentedString(validacao)).append("\n");
    sb.append("    condicaoPreenchimento: ").append(toIndentedString(condicaoPreenchimento)).append("\n");
    sb.append("    codigoAtributoPai: ").append(toIndentedString(codigoAtributoPai)).append("\n");
    sb.append("    subatributos: ").append(toIndentedString(subatributos)).append("\n");
    sb.append("    orientacao: ").append(toIndentedString(orientacao)).append("\n");
    sb.append("    exemplo: ").append(toIndentedString(exemplo)).append("\n");
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

