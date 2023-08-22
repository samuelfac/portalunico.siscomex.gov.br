package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.BloqueioCargaConsultaResumida;
import br.gov.siscomex.portalunico.ccta.model.ChaveViagem;
import br.gov.siscomex.portalunico.ccta.model.EstoqueConsultaResumida;
import br.gov.siscomex.portalunico.ccta.model.RecepcaoComAvaria;
import java.math.BigDecimal;
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
 @XmlType(name = "ConhecimentoConsultaResumida", propOrder =
    { "bloqueiosAtivos", "cnpjResponsavelArquivo", "codigoAeroportoDestinoConhecimento", "codigoAeroportoOrigemConhecimento", "dataEmissao", "identificacao", "indicadorPartesMadeira", "partesEstoque", "pesoBrutoConhecimento", "quantidadeVolumesConhecimento", "recepcoesComAvarias", "ruc", "tipo", "viagensAssociadas"
})

@XmlRootElement(name="ConhecimentoConsultaResumida")
public class ConhecimentoConsultaResumida  {
  
  @XmlElement(name="bloqueiosAtivos")
  @ApiModelProperty(value = "Lista os bloqueios ativos da carga<br/>")
  @Valid
 /**
   * Lista os bloqueios ativos da carga<br/>
  **/
  private List<BloqueioCargaConsultaResumida> bloqueiosAtivos = null;

  @XmlElement(name="cnpjResponsavelArquivo")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelArquivo = null;

  @XmlElement(name="codigoAeroportoDestinoConhecimento")
  @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto de destino do conhecimento<br/>Tamanho: 3")
 /**
   * Código IATA do aeroporto de destino do conhecimento<br/>Tamanho: 3
  **/
  private String codigoAeroportoDestinoConhecimento = null;

  @XmlElement(name="codigoAeroportoOrigemConhecimento")
  @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto de origem do conhecimento<br/>Tamanho: 3")
 /**
   * Código IATA do aeroporto de origem do conhecimento<br/>Tamanho: 3
  **/
  private String codigoAeroportoOrigemConhecimento = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2020-05-07T17:43:18-03:00", value = "Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataEmissao = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacao = null;


@XmlType(name="IndicadorPartesMadeiraEnum")
@XmlEnum(String.class)
public enum IndicadorPartesMadeiraEnum {

	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S")),
	
	@XmlEnumValue("N")
	@JsonProperty("N")
	N(String.valueOf("N"));


    private String value;

    IndicadorPartesMadeiraEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorPartesMadeiraEnum fromValue(String v) {
        for (IndicadorPartesMadeiraEnum b : IndicadorPartesMadeiraEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorPartesMadeiraEnum");
    }
}

  @XmlElement(name="indicadorPartesMadeira")
  @ApiModelProperty(example = "S", value = "Indica a presença de partes de madeira<br/> S - Sim <br/>N - Não<br/>")
 /**
   * Indica a presença de partes de madeira<br/> S - Sim <br/>N - Não<br/>
  **/
  private IndicadorPartesMadeiraEnum indicadorPartesMadeira = null;

  @XmlElement(name="partesEstoque")
  @ApiModelProperty(value = "Lista os estoques ativos da carga<br/>")
  @Valid
 /**
   * Lista os estoques ativos da carga<br/>
  **/
  private List<EstoqueConsultaResumida> partesEstoque = null;

  @XmlElement(name="pesoBrutoConhecimento")
  @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoBrutoConhecimento = null;

  @XmlElement(name="quantidadeVolumesConhecimento")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidadeVolumesConhecimento = null;

  @XmlElement(name="recepcoesComAvarias")
  @ApiModelProperty(value = "Lista de recepções com avarias agrupadas por recinto aduaneiro<br/>")
  @Valid
 /**
   * Lista de recepções com avarias agrupadas por recinto aduaneiro<br/>
  **/
  private List<RecepcaoComAvaria> recepcoesComAvarias = null;

  @XmlElement(name="ruc")
  @ApiModelProperty(example = "0BRIMP000555552000100DGXKKI9LMCG", value = "Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 32")
 /**
   * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 32
  **/
  private String ruc = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("AWB")
	@JsonProperty("AWB")
	AWB(String.valueOf("AWB")),
	
	@XmlEnumValue("DSIC")
	@JsonProperty("DSIC")
	DSIC(String.valueOf("DSIC")),
	
	@XmlEnumValue("HAWB ou MAWB")
	@JsonProperty("HAWB ou MAWB")
	HAWB_OU_MAWB(String.valueOf("HAWB ou MAWB"));


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

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "HAWB", value = "Tipo de carga.")
 /**
   * Tipo de carga.
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="viagensAssociadas")
  @ApiModelProperty(value = "Lista contendo as viagens às quais a carga está associada<br/>")
  @Valid
 /**
   * Lista contendo as viagens às quais a carga está associada<br/>
  **/
  private List<ChaveViagem> viagensAssociadas = null;
 /**
   * Lista os bloqueios ativos da carga&lt;br/&gt;
   * @return bloqueiosAtivos
  **/
  @JsonProperty("bloqueiosAtivos")
  public List<BloqueioCargaConsultaResumida> getBloqueiosAtivos() {
    return bloqueiosAtivos;
  }

  public void setBloqueiosAtivos(List<BloqueioCargaConsultaResumida> bloqueiosAtivos) {
    this.bloqueiosAtivos = bloqueiosAtivos;
  }

  public ConhecimentoConsultaResumida bloqueiosAtivos(List<BloqueioCargaConsultaResumida> bloqueiosAtivos) {
    this.bloqueiosAtivos = bloqueiosAtivos;
    return this;
  }

  public ConhecimentoConsultaResumida addBloqueiosAtivosItem(BloqueioCargaConsultaResumida bloqueiosAtivosItem) {
    this.bloqueiosAtivos.add(bloqueiosAtivosItem);
    return this;
  }

 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelArquivo
  **/
  @JsonProperty("cnpjResponsavelArquivo")
  public String getCnpjResponsavelArquivo() {
    return cnpjResponsavelArquivo;
  }

  public void setCnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
  }

  public ConhecimentoConsultaResumida cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
    return this;
  }

 /**
   * Código IATA do aeroporto de destino do conhecimento&lt;br/&gt;Tamanho: 3
   * @return codigoAeroportoDestinoConhecimento
  **/
  @JsonProperty("codigoAeroportoDestinoConhecimento")
  public String getCodigoAeroportoDestinoConhecimento() {
    return codigoAeroportoDestinoConhecimento;
  }

  public void setCodigoAeroportoDestinoConhecimento(String codigoAeroportoDestinoConhecimento) {
    this.codigoAeroportoDestinoConhecimento = codigoAeroportoDestinoConhecimento;
  }

  public ConhecimentoConsultaResumida codigoAeroportoDestinoConhecimento(String codigoAeroportoDestinoConhecimento) {
    this.codigoAeroportoDestinoConhecimento = codigoAeroportoDestinoConhecimento;
    return this;
  }

 /**
   * Código IATA do aeroporto de origem do conhecimento&lt;br/&gt;Tamanho: 3
   * @return codigoAeroportoOrigemConhecimento
  **/
  @JsonProperty("codigoAeroportoOrigemConhecimento")
  public String getCodigoAeroportoOrigemConhecimento() {
    return codigoAeroportoOrigemConhecimento;
  }

  public void setCodigoAeroportoOrigemConhecimento(String codigoAeroportoOrigemConhecimento) {
    this.codigoAeroportoOrigemConhecimento = codigoAeroportoOrigemConhecimento;
  }

  public ConhecimentoConsultaResumida codigoAeroportoOrigemConhecimento(String codigoAeroportoOrigemConhecimento) {
    this.codigoAeroportoOrigemConhecimento = codigoAeroportoOrigemConhecimento;
    return this;
  }

 /**
   * Data/Hora de emissão.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public ConhecimentoConsultaResumida dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Número do conhecimento&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 35
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public String getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(String identificacao) {
    this.identificacao = identificacao;
  }

  public ConhecimentoConsultaResumida identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Indica a presença de partes de madeira&lt;br/&gt; S - Sim &lt;br/&gt;N - Não&lt;br/&gt;
   * @return indicadorPartesMadeira
  **/
  @JsonProperty("indicadorPartesMadeira")
  public String getIndicadorPartesMadeira() {
    if (indicadorPartesMadeira == null) {
      return null;
    }
    return indicadorPartesMadeira.value();
  }

  public void setIndicadorPartesMadeira(IndicadorPartesMadeiraEnum indicadorPartesMadeira) {
    this.indicadorPartesMadeira = indicadorPartesMadeira;
  }

  public ConhecimentoConsultaResumida indicadorPartesMadeira(IndicadorPartesMadeiraEnum indicadorPartesMadeira) {
    this.indicadorPartesMadeira = indicadorPartesMadeira;
    return this;
  }

 /**
   * Lista os estoques ativos da carga&lt;br/&gt;
   * @return partesEstoque
  **/
  @JsonProperty("partesEstoque")
  public List<EstoqueConsultaResumida> getPartesEstoque() {
    return partesEstoque;
  }

  public void setPartesEstoque(List<EstoqueConsultaResumida> partesEstoque) {
    this.partesEstoque = partesEstoque;
  }

  public ConhecimentoConsultaResumida partesEstoque(List<EstoqueConsultaResumida> partesEstoque) {
    this.partesEstoque = partesEstoque;
    return this;
  }

  public ConhecimentoConsultaResumida addPartesEstoqueItem(EstoqueConsultaResumida partesEstoqueItem) {
    this.partesEstoque.add(partesEstoqueItem);
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoBrutoConhecimento
  **/
  @JsonProperty("pesoBrutoConhecimento")
  public BigDecimal getPesoBrutoConhecimento() {
    return pesoBrutoConhecimento;
  }

  public void setPesoBrutoConhecimento(BigDecimal pesoBrutoConhecimento) {
    this.pesoBrutoConhecimento = pesoBrutoConhecimento;
  }

  public ConhecimentoConsultaResumida pesoBrutoConhecimento(BigDecimal pesoBrutoConhecimento) {
    this.pesoBrutoConhecimento = pesoBrutoConhecimento;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidadeVolumesConhecimento
  **/
  @JsonProperty("quantidadeVolumesConhecimento")
  public Integer getQuantidadeVolumesConhecimento() {
    return quantidadeVolumesConhecimento;
  }

  public void setQuantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
    this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
  }

  public ConhecimentoConsultaResumida quantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
    this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
    return this;
  }

 /**
   * Lista de recepções com avarias agrupadas por recinto aduaneiro&lt;br/&gt;
   * @return recepcoesComAvarias
  **/
  @JsonProperty("recepcoesComAvarias")
  public List<RecepcaoComAvaria> getRecepcoesComAvarias() {
    return recepcoesComAvarias;
  }

  public void setRecepcoesComAvarias(List<RecepcaoComAvaria> recepcoesComAvarias) {
    this.recepcoesComAvarias = recepcoesComAvarias;
  }

  public ConhecimentoConsultaResumida recepcoesComAvarias(List<RecepcaoComAvaria> recepcoesComAvarias) {
    this.recepcoesComAvarias = recepcoesComAvarias;
    return this;
  }

  public ConhecimentoConsultaResumida addRecepcoesComAvariasItem(RecepcaoComAvaria recepcoesComAvariasItem) {
    this.recepcoesComAvarias.add(recepcoesComAvariasItem);
    return this;
  }

 /**
   * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga&lt;br&gt;Tamanho: 32
   * @return ruc
  **/
  @JsonProperty("ruc")
  public String getRuc() {
    return ruc;
  }

  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public ConhecimentoConsultaResumida ruc(String ruc) {
    this.ruc = ruc;
    return this;
  }

 /**
   * Tipo de carga.
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public ConhecimentoConsultaResumida tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Lista contendo as viagens às quais a carga está associada&lt;br/&gt;
   * @return viagensAssociadas
  **/
  @JsonProperty("viagensAssociadas")
  public List<ChaveViagem> getViagensAssociadas() {
    return viagensAssociadas;
  }

  public void setViagensAssociadas(List<ChaveViagem> viagensAssociadas) {
    this.viagensAssociadas = viagensAssociadas;
  }

  public ConhecimentoConsultaResumida viagensAssociadas(List<ChaveViagem> viagensAssociadas) {
    this.viagensAssociadas = viagensAssociadas;
    return this;
  }

  public ConhecimentoConsultaResumida addViagensAssociadasItem(ChaveViagem viagensAssociadasItem) {
    this.viagensAssociadas.add(viagensAssociadasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConhecimentoConsultaResumida {\n");
    
    sb.append("    bloqueiosAtivos: ").append(toIndentedString(bloqueiosAtivos)).append("\n");
    sb.append("    cnpjResponsavelArquivo: ").append(toIndentedString(cnpjResponsavelArquivo)).append("\n");
    sb.append("    codigoAeroportoDestinoConhecimento: ").append(toIndentedString(codigoAeroportoDestinoConhecimento)).append("\n");
    sb.append("    codigoAeroportoOrigemConhecimento: ").append(toIndentedString(codigoAeroportoOrigemConhecimento)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    indicadorPartesMadeira: ").append(toIndentedString(indicadorPartesMadeira)).append("\n");
    sb.append("    partesEstoque: ").append(toIndentedString(partesEstoque)).append("\n");
    sb.append("    pesoBrutoConhecimento: ").append(toIndentedString(pesoBrutoConhecimento)).append("\n");
    sb.append("    quantidadeVolumesConhecimento: ").append(toIndentedString(quantidadeVolumesConhecimento)).append("\n");
    sb.append("    recepcoesComAvarias: ").append(toIndentedString(recepcoesComAvarias)).append("\n");
    sb.append("    ruc: ").append(toIndentedString(ruc)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    viagensAssociadas: ").append(toIndentedString(viagensAssociadas)).append("\n");
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

