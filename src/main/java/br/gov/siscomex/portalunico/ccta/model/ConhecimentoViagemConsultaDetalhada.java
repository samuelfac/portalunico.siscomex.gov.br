package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.ClassificacaoMercadoriaConsultaDetalhada;
import br.gov.siscomex.portalunico.ccta.model.InfoManuseioConsultaDetalhada;
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
 @XmlType(name = "ConhecimentoViagemConsultaDetalhada", propOrder =
    { "classificacoesMercadoriaManifestoVoo", "cnpjResponsavelArquivo", "dataEmissao", "descricaoMercadoriaManifestoVoo", "identificacao", "indicadorParcialidade", "manuseiosEspeciaisManifestoVoo", "outrasInfosServicoManifestoVoo", "pesoBrutoManifestoVoo", "quantidadeVolumesManifestoVoo", "solicitacoesServicosEspeciaisManifestoVoo", "tipoConhecimento"
})

@XmlRootElement(name="ConhecimentoViagemConsultaDetalhada")
public class ConhecimentoViagemConsultaDetalhada  {
  
  @XmlElement(name="classificacoesMercadoriaManifestoVoo")
  @ApiModelProperty(value = "Lista contendo os itens de carga contidos na carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo os itens de carga contidos na carga / Dsic<br/>
  **/
  private List<ClassificacaoMercadoriaConsultaDetalhada> classificacoesMercadoriaManifestoVoo = null;

  @XmlElement(name="cnpjResponsavelArquivo")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelArquivo = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2020-05-07T17:43:18-03:00", value = "Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataEmissao = null;

  @XmlElement(name="descricaoMercadoriaManifestoVoo")
  @ApiModelProperty(example = "Descrição resumida das mercadorias", value = "Descrição resumida das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>")
 /**
   * Descrição resumida das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>
  **/
  private String descricaoMercadoriaManifestoVoo = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacao = null;


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
  @ApiModelProperty(example = "P", value = "Indicador de parcialidade de carga<br/>Tamanho: 1<br/>T - Remessa total<br/>P - Remessa de peça<br/>S - Remessa dividida em único voo<br/>D - Remessa dividida em vários voos<br/>M - Múltiplas remessas")
 /**
   * Indicador de parcialidade de carga<br/>Tamanho: 1<br/>T - Remessa total<br/>P - Remessa de peça<br/>S - Remessa dividida em único voo<br/>D - Remessa dividida em vários voos<br/>M - Múltiplas remessas
  **/
  private IndicadorParcialidadeEnum indicadorParcialidade = null;

  @XmlElement(name="manuseiosEspeciaisManifestoVoo")
  @ApiModelProperty(value = "Lista contendo os manuseios especiais para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo os manuseios especiais para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> manuseiosEspeciaisManifestoVoo = null;

  @XmlElement(name="outrasInfosServicoManifestoVoo")
  @ApiModelProperty(value = "Lista contendo as outras informações de serviço para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo as outras informações de serviço para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> outrasInfosServicoManifestoVoo = null;

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

  @XmlElement(name="solicitacoesServicosEspeciaisManifestoVoo")
  @ApiModelProperty(value = "Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciaisManifestoVoo = null;


@XmlType(name="TipoConhecimentoEnum")
@XmlEnum(String.class)
public enum TipoConhecimentoEnum {

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

    TipoConhecimentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoConhecimentoEnum fromValue(String v) {
        for (TipoConhecimentoEnum b : TipoConhecimentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoConhecimentoEnum");
    }
}

  @XmlElement(name="tipoConhecimento")
  @ApiModelProperty(example = "HAWB", value = "Tipo de carga.")
 /**
   * Tipo de carga.
  **/
  private TipoConhecimentoEnum tipoConhecimento = null;
 /**
   * Lista contendo os itens de carga contidos na carga / Dsic&lt;br/&gt;
   * @return classificacoesMercadoriaManifestoVoo
  **/
  @JsonProperty("classificacoesMercadoriaManifestoVoo")
  public List<ClassificacaoMercadoriaConsultaDetalhada> getClassificacoesMercadoriaManifestoVoo() {
    return classificacoesMercadoriaManifestoVoo;
  }

  public void setClassificacoesMercadoriaManifestoVoo(List<ClassificacaoMercadoriaConsultaDetalhada> classificacoesMercadoriaManifestoVoo) {
    this.classificacoesMercadoriaManifestoVoo = classificacoesMercadoriaManifestoVoo;
  }

  public ConhecimentoViagemConsultaDetalhada classificacoesMercadoriaManifestoVoo(List<ClassificacaoMercadoriaConsultaDetalhada> classificacoesMercadoriaManifestoVoo) {
    this.classificacoesMercadoriaManifestoVoo = classificacoesMercadoriaManifestoVoo;
    return this;
  }

  public ConhecimentoViagemConsultaDetalhada addClassificacoesMercadoriaManifestoVooItem(ClassificacaoMercadoriaConsultaDetalhada classificacoesMercadoriaManifestoVooItem) {
    this.classificacoesMercadoriaManifestoVoo.add(classificacoesMercadoriaManifestoVooItem);
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

  public ConhecimentoViagemConsultaDetalhada cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
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

  public ConhecimentoViagemConsultaDetalhada dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
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

  public ConhecimentoViagemConsultaDetalhada descricaoMercadoriaManifestoVoo(String descricaoMercadoriaManifestoVoo) {
    this.descricaoMercadoriaManifestoVoo = descricaoMercadoriaManifestoVoo;
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

  public ConhecimentoViagemConsultaDetalhada identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Indicador de parcialidade de carga&lt;br/&gt;Tamanho: 1&lt;br/&gt;T - Remessa total&lt;br/&gt;P - Remessa de peça&lt;br/&gt;S - Remessa dividida em único voo&lt;br/&gt;D - Remessa dividida em vários voos&lt;br/&gt;M - Múltiplas remessas
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

  public ConhecimentoViagemConsultaDetalhada indicadorParcialidade(IndicadorParcialidadeEnum indicadorParcialidade) {
    this.indicadorParcialidade = indicadorParcialidade;
    return this;
  }

 /**
   * Lista contendo os manuseios especiais para a carga / Dsic&lt;br/&gt;
   * @return manuseiosEspeciaisManifestoVoo
  **/
  @JsonProperty("manuseiosEspeciaisManifestoVoo")
  public List<InfoManuseioConsultaDetalhada> getManuseiosEspeciaisManifestoVoo() {
    return manuseiosEspeciaisManifestoVoo;
  }

  public void setManuseiosEspeciaisManifestoVoo(List<InfoManuseioConsultaDetalhada> manuseiosEspeciaisManifestoVoo) {
    this.manuseiosEspeciaisManifestoVoo = manuseiosEspeciaisManifestoVoo;
  }

  public ConhecimentoViagemConsultaDetalhada manuseiosEspeciaisManifestoVoo(List<InfoManuseioConsultaDetalhada> manuseiosEspeciaisManifestoVoo) {
    this.manuseiosEspeciaisManifestoVoo = manuseiosEspeciaisManifestoVoo;
    return this;
  }

  public ConhecimentoViagemConsultaDetalhada addManuseiosEspeciaisManifestoVooItem(InfoManuseioConsultaDetalhada manuseiosEspeciaisManifestoVooItem) {
    this.manuseiosEspeciaisManifestoVoo.add(manuseiosEspeciaisManifestoVooItem);
    return this;
  }

 /**
   * Lista contendo as outras informações de serviço para a carga / Dsic&lt;br/&gt;
   * @return outrasInfosServicoManifestoVoo
  **/
  @JsonProperty("outrasInfosServicoManifestoVoo")
  public List<InfoManuseioConsultaDetalhada> getOutrasInfosServicoManifestoVoo() {
    return outrasInfosServicoManifestoVoo;
  }

  public void setOutrasInfosServicoManifestoVoo(List<InfoManuseioConsultaDetalhada> outrasInfosServicoManifestoVoo) {
    this.outrasInfosServicoManifestoVoo = outrasInfosServicoManifestoVoo;
  }

  public ConhecimentoViagemConsultaDetalhada outrasInfosServicoManifestoVoo(List<InfoManuseioConsultaDetalhada> outrasInfosServicoManifestoVoo) {
    this.outrasInfosServicoManifestoVoo = outrasInfosServicoManifestoVoo;
    return this;
  }

  public ConhecimentoViagemConsultaDetalhada addOutrasInfosServicoManifestoVooItem(InfoManuseioConsultaDetalhada outrasInfosServicoManifestoVooItem) {
    this.outrasInfosServicoManifestoVoo.add(outrasInfosServicoManifestoVooItem);
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

  public ConhecimentoViagemConsultaDetalhada pesoBrutoManifestoVoo(BigDecimal pesoBrutoManifestoVoo) {
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

  public ConhecimentoViagemConsultaDetalhada quantidadeVolumesManifestoVoo(Integer quantidadeVolumesManifestoVoo) {
    this.quantidadeVolumesManifestoVoo = quantidadeVolumesManifestoVoo;
    return this;
  }

 /**
   * Lista contendo as solicitações de serviços especiaos para a carga / Dsic&lt;br/&gt;
   * @return solicitacoesServicosEspeciaisManifestoVoo
  **/
  @JsonProperty("solicitacoesServicosEspeciaisManifestoVoo")
  public List<InfoManuseioConsultaDetalhada> getSolicitacoesServicosEspeciaisManifestoVoo() {
    return solicitacoesServicosEspeciaisManifestoVoo;
  }

  public void setSolicitacoesServicosEspeciaisManifestoVoo(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciaisManifestoVoo) {
    this.solicitacoesServicosEspeciaisManifestoVoo = solicitacoesServicosEspeciaisManifestoVoo;
  }

  public ConhecimentoViagemConsultaDetalhada solicitacoesServicosEspeciaisManifestoVoo(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciaisManifestoVoo) {
    this.solicitacoesServicosEspeciaisManifestoVoo = solicitacoesServicosEspeciaisManifestoVoo;
    return this;
  }

  public ConhecimentoViagemConsultaDetalhada addSolicitacoesServicosEspeciaisManifestoVooItem(InfoManuseioConsultaDetalhada solicitacoesServicosEspeciaisManifestoVooItem) {
    this.solicitacoesServicosEspeciaisManifestoVoo.add(solicitacoesServicosEspeciaisManifestoVooItem);
    return this;
  }

 /**
   * Tipo de carga.
   * @return tipoConhecimento
  **/
  @JsonProperty("tipoConhecimento")
  public String getTipoConhecimento() {
    if (tipoConhecimento == null) {
      return null;
    }
    return tipoConhecimento.value();
  }

  public void setTipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
  }

  public ConhecimentoViagemConsultaDetalhada tipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConhecimentoViagemConsultaDetalhada {\n");
    
    sb.append("    classificacoesMercadoriaManifestoVoo: ").append(toIndentedString(classificacoesMercadoriaManifestoVoo)).append("\n");
    sb.append("    cnpjResponsavelArquivo: ").append(toIndentedString(cnpjResponsavelArquivo)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    descricaoMercadoriaManifestoVoo: ").append(toIndentedString(descricaoMercadoriaManifestoVoo)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    indicadorParcialidade: ").append(toIndentedString(indicadorParcialidade)).append("\n");
    sb.append("    manuseiosEspeciaisManifestoVoo: ").append(toIndentedString(manuseiosEspeciaisManifestoVoo)).append("\n");
    sb.append("    outrasInfosServicoManifestoVoo: ").append(toIndentedString(outrasInfosServicoManifestoVoo)).append("\n");
    sb.append("    pesoBrutoManifestoVoo: ").append(toIndentedString(pesoBrutoManifestoVoo)).append("\n");
    sb.append("    quantidadeVolumesManifestoVoo: ").append(toIndentedString(quantidadeVolumesManifestoVoo)).append("\n");
    sb.append("    solicitacoesServicosEspeciaisManifestoVoo: ").append(toIndentedString(solicitacoesServicosEspeciaisManifestoVoo)).append("\n");
    sb.append("    tipoConhecimento: ").append(toIndentedString(tipoConhecimento)).append("\n");
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

