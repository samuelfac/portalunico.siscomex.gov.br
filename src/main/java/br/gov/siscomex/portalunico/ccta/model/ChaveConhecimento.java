package br.gov.siscomex.portalunico.ccta.model;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ChaveConhecimento", propOrder =
    { "manuseiosEspeciais", "solicitacoesServicosEspeciais", "outrasInfosServico", "tipo", "identificacao", "dataEmissao", "cnpjResponsavelArquivo", "descricaoMercadoriaManifestoVoo", "pesoBrutoManifestoVoo", "quantidadeVolumesManifestoVoo", "indicadorParcialidade", "classificacoesMercadoriaManifestoVoo"
})

@XmlRootElement(name="ChaveConhecimento")
public class ChaveConhecimento  {
  
  @XmlElement(name="manuseiosEspeciais")
  @ApiModelProperty(value = "Lista contendo os manuseios especiais para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo os manuseios especiais para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> manuseiosEspeciais = null;

  @XmlElement(name="solicitacoesServicosEspeciais")
  @ApiModelProperty(value = "Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais = null;

  @XmlElement(name="outrasInfosServico")
  @ApiModelProperty(value = "Lista contendo as outras informações de serviço para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo as outras informações de serviço para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> outrasInfosServico = null;


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

  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacao = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2020-04-08T11:00:00-03:00", value = "Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataEmissao = null;

  @XmlElement(name="cnpjResponsavelArquivo")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelArquivo = null;

  @XmlElement(name="descricaoMercadoriaManifestoVoo")
  @ApiModelProperty(example = "Descrição resumida das mercadorias", value = "Descrição resumida das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>")
 /**
   * Descrição resumida das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>
  **/
  private String descricaoMercadoriaManifestoVoo = null;

  @XmlElement(name="pesoBrutoManifestoVoo")
  @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoBrutoManifestoVoo = null;

  @XmlElement(name="quantidadeVolumesManifestoVoo")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidadeVolumesManifestoVoo = null;


@XmlType(name="IndicadorParcialidadeEnum")
@XmlEnum(String.class)
public enum IndicadorParcialidadeEnum {

	@XmlEnumValue("D")
	@JsonProperty("D")
	D(String.valueOf("D")),
	
	@XmlEnumValue("M")
	@JsonProperty("M")
	M(String.valueOf("M")),
	
	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P")),
	
	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S")),
	
	@XmlEnumValue("T")
	@JsonProperty("T")
	T(String.valueOf("T"));


    private String value;

    IndicadorParcialidadeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorParcialidadeEnum fromValue(String v) {
        for (IndicadorParcialidadeEnum b : IndicadorParcialidadeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorParcialidadeEnum");
    }
}

  @XmlElement(name="indicadorParcialidade")
  @ApiModelProperty(example = "P", value = "indicador de parcialidade de carga")
 /**
   * indicador de parcialidade de carga
  **/
  private IndicadorParcialidadeEnum indicadorParcialidade = null;

  @XmlElement(name="classificacoesMercadoriaManifestoVoo")
  @ApiModelProperty(value = "Lista de classificações das mercadorias")
  @Valid
 /**
   * Lista de classificações das mercadorias
  **/
  private List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> classificacoesMercadoriaManifestoVoo = null;
 /**
   * Lista contendo os manuseios especiais para a carga / Dsic&lt;br/&gt;
   * @return manuseiosEspeciais
  **/
  @JsonProperty("manuseiosEspeciais")
  public List<InfoManuseioConsultaDetalhada> getManuseiosEspeciais() {
    return manuseiosEspeciais;
  }

  public void setManuseiosEspeciais(List<InfoManuseioConsultaDetalhada> manuseiosEspeciais) {
    this.manuseiosEspeciais = manuseiosEspeciais;
  }

  public ChaveConhecimento manuseiosEspeciais(List<InfoManuseioConsultaDetalhada> manuseiosEspeciais) {
    this.manuseiosEspeciais = manuseiosEspeciais;
    return this;
  }

  public ChaveConhecimento addManuseiosEspeciaisItem(InfoManuseioConsultaDetalhada manuseiosEspeciaisItem) {
    this.manuseiosEspeciais.add(manuseiosEspeciaisItem);
    return this;
  }

 /**
   * Lista contendo as solicitações de serviços especiaos para a carga / Dsic&lt;br/&gt;
   * @return solicitacoesServicosEspeciais
  **/
  @JsonProperty("solicitacoesServicosEspeciais")
  public List<InfoManuseioConsultaDetalhada> getSolicitacoesServicosEspeciais() {
    return solicitacoesServicosEspeciais;
  }

  public void setSolicitacoesServicosEspeciais(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais) {
    this.solicitacoesServicosEspeciais = solicitacoesServicosEspeciais;
  }

  public ChaveConhecimento solicitacoesServicosEspeciais(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais) {
    this.solicitacoesServicosEspeciais = solicitacoesServicosEspeciais;
    return this;
  }

  public ChaveConhecimento addSolicitacoesServicosEspeciaisItem(InfoManuseioConsultaDetalhada solicitacoesServicosEspeciaisItem) {
    this.solicitacoesServicosEspeciais.add(solicitacoesServicosEspeciaisItem);
    return this;
  }

 /**
   * Lista contendo as outras informações de serviço para a carga / Dsic&lt;br/&gt;
   * @return outrasInfosServico
  **/
  @JsonProperty("outrasInfosServico")
  public List<InfoManuseioConsultaDetalhada> getOutrasInfosServico() {
    return outrasInfosServico;
  }

  public void setOutrasInfosServico(List<InfoManuseioConsultaDetalhada> outrasInfosServico) {
    this.outrasInfosServico = outrasInfosServico;
  }

  public ChaveConhecimento outrasInfosServico(List<InfoManuseioConsultaDetalhada> outrasInfosServico) {
    this.outrasInfosServico = outrasInfosServico;
    return this;
  }

  public ChaveConhecimento addOutrasInfosServicoItem(InfoManuseioConsultaDetalhada outrasInfosServicoItem) {
    this.outrasInfosServico.add(outrasInfosServicoItem);
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

  public ChaveConhecimento tipo(TipoEnum tipo) {
    this.tipo = tipo;
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

  public ChaveConhecimento identificacao(String identificacao) {
    this.identificacao = identificacao;
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

  public ChaveConhecimento dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
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

  public ChaveConhecimento cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
    return this;
  }

 /**
   * Descrição resumida das mercadorias que estão sendo transportadas&lt;br&gt;Tamanho: 600&lt;br/&gt;
   * @return descricaoMercadoriaManifestoVoo
  **/
  @JsonProperty("descricaoMercadoriaManifestoVoo")
  public String getDescricaoMercadoriaManifestoVoo() {
    return descricaoMercadoriaManifestoVoo;
  }

  public void setDescricaoMercadoriaManifestoVoo(String descricaoMercadoriaManifestoVoo) {
    this.descricaoMercadoriaManifestoVoo = descricaoMercadoriaManifestoVoo;
  }

  public ChaveConhecimento descricaoMercadoriaManifestoVoo(String descricaoMercadoriaManifestoVoo) {
    this.descricaoMercadoriaManifestoVoo = descricaoMercadoriaManifestoVoo;
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoBrutoManifestoVoo
  **/
  @JsonProperty("pesoBrutoManifestoVoo")
  public BigDecimal getPesoBrutoManifestoVoo() {
    return pesoBrutoManifestoVoo;
  }

  public void setPesoBrutoManifestoVoo(BigDecimal pesoBrutoManifestoVoo) {
    this.pesoBrutoManifestoVoo = pesoBrutoManifestoVoo;
  }

  public ChaveConhecimento pesoBrutoManifestoVoo(BigDecimal pesoBrutoManifestoVoo) {
    this.pesoBrutoManifestoVoo = pesoBrutoManifestoVoo;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidadeVolumesManifestoVoo
  **/
  @JsonProperty("quantidadeVolumesManifestoVoo")
  public Integer getQuantidadeVolumesManifestoVoo() {
    return quantidadeVolumesManifestoVoo;
  }

  public void setQuantidadeVolumesManifestoVoo(Integer quantidadeVolumesManifestoVoo) {
    this.quantidadeVolumesManifestoVoo = quantidadeVolumesManifestoVoo;
  }

  public ChaveConhecimento quantidadeVolumesManifestoVoo(Integer quantidadeVolumesManifestoVoo) {
    this.quantidadeVolumesManifestoVoo = quantidadeVolumesManifestoVoo;
    return this;
  }

 /**
   * indicador de parcialidade de carga
   * @return indicadorParcialidade
  **/
  @JsonProperty("indicadorParcialidade")
  public String getIndicadorParcialidade() {
    if (indicadorParcialidade == null) {
      return null;
    }
    return indicadorParcialidade.value();
  }

  public void setIndicadorParcialidade(IndicadorParcialidadeEnum indicadorParcialidade) {
    this.indicadorParcialidade = indicadorParcialidade;
  }

  public ChaveConhecimento indicadorParcialidade(IndicadorParcialidadeEnum indicadorParcialidade) {
    this.indicadorParcialidade = indicadorParcialidade;
    return this;
  }

 /**
   * Lista de classificações das mercadorias
   * @return classificacoesMercadoriaManifestoVoo
  **/
  @JsonProperty("classificacoesMercadoriaManifestoVoo")
  public List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> getClassificacoesMercadoriaManifestoVoo() {
    return classificacoesMercadoriaManifestoVoo;
  }

  public void setClassificacoesMercadoriaManifestoVoo(List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> classificacoesMercadoriaManifestoVoo) {
    this.classificacoesMercadoriaManifestoVoo = classificacoesMercadoriaManifestoVoo;
  }

  public ChaveConhecimento classificacoesMercadoriaManifestoVoo(List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> classificacoesMercadoriaManifestoVoo) {
    this.classificacoesMercadoriaManifestoVoo = classificacoesMercadoriaManifestoVoo;
    return this;
  }

  public ChaveConhecimento addClassificacoesMercadoriaManifestoVooItem(ClassificacaoMercadoriaConsultaDetalhadaRepresentation classificacoesMercadoriaManifestoVooItem) {
    this.classificacoesMercadoriaManifestoVoo.add(classificacoesMercadoriaManifestoVooItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveConhecimento {\n");
    
    sb.append("    manuseiosEspeciais: ").append(toIndentedString(manuseiosEspeciais)).append("\n");
    sb.append("    solicitacoesServicosEspeciais: ").append(toIndentedString(solicitacoesServicosEspeciais)).append("\n");
    sb.append("    outrasInfosServico: ").append(toIndentedString(outrasInfosServico)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    cnpjResponsavelArquivo: ").append(toIndentedString(cnpjResponsavelArquivo)).append("\n");
    sb.append("    descricaoMercadoriaManifestoVoo: ").append(toIndentedString(descricaoMercadoriaManifestoVoo)).append("\n");
    sb.append("    pesoBrutoManifestoVoo: ").append(toIndentedString(pesoBrutoManifestoVoo)).append("\n");
    sb.append("    quantidadeVolumesManifestoVoo: ").append(toIndentedString(quantidadeVolumesManifestoVoo)).append("\n");
    sb.append("    indicadorParcialidade: ").append(toIndentedString(indicadorParcialidade)).append("\n");
    sb.append("    classificacoesMercadoriaManifestoVoo: ").append(toIndentedString(classificacoesMercadoriaManifestoVoo)).append("\n");
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

