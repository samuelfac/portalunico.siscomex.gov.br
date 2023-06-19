package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EstoqueConsultaDetalhada", propOrder =
    { "cnpjResponsavelAtual", "dataHoraSituacaoAtual", "identificacaoViagem", "numeroDocumentoSaida", "pesoBrutoEstoque", "quantidadeVolumesEstoque", "recintoAduaneiro", "situacaoAtual", "tipoDocumentoSaida", "unidadeRfb"
})

@XmlRootElement(name="EstoqueConsultaDetalhada")
public class EstoqueConsultaDetalhada  {
  
  @XmlElement(name="cnpjResponsavelAtual")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ responsável pelo estoque<br/> ")
 /**
   * CNPJ responsável pelo estoque<br/> 
  **/
  private String cnpjResponsavelAtual = null;

  @XmlElement(name="dataHoraSituacaoAtual")
  @ApiModelProperty(example = "12/02/2021 21:21", value = "Data / Hora de atualização do registro na tabela de estoque. A cada momento em que o registro é alterado, esta data é atualizada.<br/> ")
 /**
   * Data / Hora de atualização do registro na tabela de estoque. A cada momento em que o registro é alterado, esta data é atualizada.<br/> 
  **/
  private String dataHoraSituacaoAtual = null;

  @XmlElement(name="identificacaoViagem")
  @ApiModelProperty(example = "XX099020200922MIA", value = "Número de identificação do manifesto<br/>Tamanho: 17")
 /**
   * Número de identificação do manifesto<br/>Tamanho: 17
  **/
  private String identificacaoViagem = null;

  @XmlElement(name="numeroDocumentoSaida")
  @ApiModelProperty(example = "5490178901", value = "Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN")
 /**
   * Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN
  **/
  private String numeroDocumentoSaida = null;

  @XmlElement(name="pesoBrutoEstoque")
  @ApiModelProperty(example = "55.0", value = "Peso do volume transportado. Quando for granel, esse campo será nulo.<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. ")
  @Valid
 /**
   * Peso do volume transportado. Quando for granel, esse campo será nulo.<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. 
  **/
  private BigDecimal pesoBrutoEstoque = null;

  @XmlElement(name="quantidadeVolumesEstoque")
  @ApiModelProperty(example = "780.348", value = "Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. ")
  @Valid
 /**
   * Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. 
  **/
  private BigDecimal quantidadeVolumesEstoque = null;

  @XmlElement(name="recintoAduaneiro")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos
  **/
  private String recintoAduaneiro = null;

  @XmlElement(name="situacaoAtual")
  @ApiModelProperty(example = "Em área de transferência", value = "Descrição da situação do estoque da carga<br/> ")
 /**
   * Descrição da situação do estoque da carga<br/> 
  **/
  private String situacaoAtual = null;


@XmlType(name="TipoDocumentoSaidaEnum")
@XmlEnum(String.class)
public enum TipoDocumentoSaidaEnum {

	@XmlEnumValue("10")
	@JsonProperty("10")
	_10(String.valueOf("10")),
	
	@XmlEnumValue("11")
	@JsonProperty("11")
	_11(String.valueOf("11")),
	
	@XmlEnumValue("12")
	@JsonProperty("12")
	_12(String.valueOf("12")),
	
	@XmlEnumValue("20")
	@JsonProperty("20")
	_20(String.valueOf("20")),
	
	@XmlEnumValue("21")
	@JsonProperty("21")
	_21(String.valueOf("21")),
	
	@XmlEnumValue("22")
	@JsonProperty("22")
	_22(String.valueOf("22")),
	
	@XmlEnumValue("23")
	@JsonProperty("23")
	_23(String.valueOf("23")),
	
	@XmlEnumValue("24")
	@JsonProperty("24")
	_24(String.valueOf("24")),
	
	@XmlEnumValue("30")
	@JsonProperty("30")
	_30(String.valueOf("30")),
	
	@XmlEnumValue("21")
	@JsonProperty("21")
	_21_9(String.valueOf("21")),
	
	@XmlEnumValue("32")
	@JsonProperty("32")
	_32(String.valueOf("32")),
	
	@XmlEnumValue("33")
	@JsonProperty("33")
	_33(String.valueOf("33")),
	
	@XmlEnumValue("34")
	@JsonProperty("34")
	_34(String.valueOf("34")),
	
	@XmlEnumValue("35")
	@JsonProperty("35")
	_35(String.valueOf("35")),
	
	@XmlEnumValue("36")
	@JsonProperty("36")
	_36(String.valueOf("36")),
	
	@XmlEnumValue("37")
	@JsonProperty("37")
	_37(String.valueOf("37")),
	
	@XmlEnumValue("38")
	@JsonProperty("38")
	_38(String.valueOf("38")),
	
	@XmlEnumValue("39")
	@JsonProperty("39")
	_39(String.valueOf("39")),
	
	@XmlEnumValue("40")
	@JsonProperty("40")
	_40(String.valueOf("40")),
	
	@XmlEnumValue("50")
	@JsonProperty("50")
	_50(String.valueOf("50")),
	
	@XmlEnumValue("99")
	@JsonProperty("99")
	_99(String.valueOf("99"));


    private String value;

    TipoDocumentoSaidaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDocumentoSaidaEnum fromValue(String v) {
        for (TipoDocumentoSaidaEnum b : TipoDocumentoSaidaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoSaidaEnum");
    }
}

  @XmlElement(name="tipoDocumentoSaida")
  @ApiModelProperty(example = "20", value = "Tipo de documento de saída<p>Os documentos podem ser:</p>10 – DI<br/>11 – Processo Digital/Processo Dossiê<br/>12 – E-DMOV<br/>20 – Outros<br/>21 – PMB<br/>22 – PDE/TR<br/>23 – DSI Eletrônica<br/>24 – DSI Formulário<br/>30 – DTA - Importação comum<br/>31 – DTA - Importação especial - bagagem desacompanhada<br/>32 – DTA - Importação especial - mala diplomática<br/>33 – DTA - Importação especial - urna funerária<br/>34 – DTA - Importação especial - outras<br/>35 – DTA - Passagem comum<br/>36 – DTA - Passagem comum - bagagem desacompanhada<br/>37 – DTA - Passagem comum - mala diplomática<br/>38 – DTA - Passagem comum - partes e peças<br/>39 – DTA - Passagem comum - urna funerária<br/>40 – DTA - Passagem comum - outras<br/>50 – DTI<br/>99 – DUIMP<br/>")
 /**
   * Tipo de documento de saída<p>Os documentos podem ser:</p>10 – DI<br/>11 – Processo Digital/Processo Dossiê<br/>12 – E-DMOV<br/>20 – Outros<br/>21 – PMB<br/>22 – PDE/TR<br/>23 – DSI Eletrônica<br/>24 – DSI Formulário<br/>30 – DTA - Importação comum<br/>31 – DTA - Importação especial - bagagem desacompanhada<br/>32 – DTA - Importação especial - mala diplomática<br/>33 – DTA - Importação especial - urna funerária<br/>34 – DTA - Importação especial - outras<br/>35 – DTA - Passagem comum<br/>36 – DTA - Passagem comum - bagagem desacompanhada<br/>37 – DTA - Passagem comum - mala diplomática<br/>38 – DTA - Passagem comum - partes e peças<br/>39 – DTA - Passagem comum - urna funerária<br/>40 – DTA - Passagem comum - outras<br/>50 – DTI<br/>99 – DUIMP<br/>
  **/
  private TipoDocumentoSaidaEnum tipoDocumentoSaida = null;

  @XmlElement(name="unidadeRfb")
  @ApiModelProperty(example = "0817600", value = "Código da UL<br/> Tamanho: 7<br/> Formato: AAAAAAA")
 /**
   * Código da UL<br/> Tamanho: 7<br/> Formato: AAAAAAA
  **/
  private String unidadeRfb = null;
 /**
   * CNPJ responsável pelo estoque&lt;br/&gt; 
   * @return cnpjResponsavelAtual
  **/
  @JsonProperty("cnpjResponsavelAtual")
  public String getCnpjResponsavelAtual() {
    return cnpjResponsavelAtual;
  }

  public void setCnpjResponsavelAtual(String cnpjResponsavelAtual) {
    this.cnpjResponsavelAtual = cnpjResponsavelAtual;
  }

  public EstoqueConsultaDetalhada cnpjResponsavelAtual(String cnpjResponsavelAtual) {
    this.cnpjResponsavelAtual = cnpjResponsavelAtual;
    return this;
  }

 /**
   * Data / Hora de atualização do registro na tabela de estoque. A cada momento em que o registro é alterado, esta data é atualizada.&lt;br/&gt; 
   * @return dataHoraSituacaoAtual
  **/
  @JsonProperty("dataHoraSituacaoAtual")
  public String getDataHoraSituacaoAtual() {
    return dataHoraSituacaoAtual;
  }

  public void setDataHoraSituacaoAtual(String dataHoraSituacaoAtual) {
    this.dataHoraSituacaoAtual = dataHoraSituacaoAtual;
  }

  public EstoqueConsultaDetalhada dataHoraSituacaoAtual(String dataHoraSituacaoAtual) {
    this.dataHoraSituacaoAtual = dataHoraSituacaoAtual;
    return this;
  }

 /**
   * Número de identificação do manifesto&lt;br/&gt;Tamanho: 17
   * @return identificacaoViagem
  **/
  @JsonProperty("identificacaoViagem")
  public String getIdentificacaoViagem() {
    return identificacaoViagem;
  }

  public void setIdentificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
  }

  public EstoqueConsultaDetalhada identificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
    return this;
  }

 /**
   * Número de documento de saída&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo:17&lt;br/&gt; Formato: NNNNNNNNNNNNNNNNN
   * @return numeroDocumentoSaida
  **/
  @JsonProperty("numeroDocumentoSaida")
  public String getNumeroDocumentoSaida() {
    return numeroDocumentoSaida;
  }

  public void setNumeroDocumentoSaida(String numeroDocumentoSaida) {
    this.numeroDocumentoSaida = numeroDocumentoSaida;
  }

  public EstoqueConsultaDetalhada numeroDocumentoSaida(String numeroDocumentoSaida) {
    this.numeroDocumentoSaida = numeroDocumentoSaida;
    return this;
  }

 /**
   * Peso do volume transportado. Quando for granel, esse campo será nulo.&lt;br/&gt;Tamanho: 10,3&lt;br/&gt; Formato: Decimal, com até 3 casas decimais separadas por ponto. 
   * @return pesoBrutoEstoque
  **/
  @JsonProperty("pesoBrutoEstoque")
  public BigDecimal getPesoBrutoEstoque() {
    return pesoBrutoEstoque;
  }

  public void setPesoBrutoEstoque(BigDecimal pesoBrutoEstoque) {
    this.pesoBrutoEstoque = pesoBrutoEstoque;
  }

  public EstoqueConsultaDetalhada pesoBrutoEstoque(BigDecimal pesoBrutoEstoque) {
    this.pesoBrutoEstoque = pesoBrutoEstoque;
    return this;
  }

 /**
   * Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto&lt;br/&gt;Tamanho: 10,3&lt;br/&gt; Formato: Decimal, com até 3 casas decimais separadas por ponto. 
   * @return quantidadeVolumesEstoque
  **/
  @JsonProperty("quantidadeVolumesEstoque")
  public BigDecimal getQuantidadeVolumesEstoque() {
    return quantidadeVolumesEstoque;
  }

  public void setQuantidadeVolumesEstoque(BigDecimal quantidadeVolumesEstoque) {
    this.quantidadeVolumesEstoque = quantidadeVolumesEstoque;
  }

  public EstoqueConsultaDetalhada quantidadeVolumesEstoque(BigDecimal quantidadeVolumesEstoque) {
    this.quantidadeVolumesEstoque = quantidadeVolumesEstoque;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro.&lt;br/&gt;Tamanho: 7&lt;br/&gt; Formato: inteiro com até 7 dígitos
   * @return recintoAduaneiro
  **/
  @JsonProperty("recintoAduaneiro")
  public String getRecintoAduaneiro() {
    return recintoAduaneiro;
  }

  public void setRecintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
  }

  public EstoqueConsultaDetalhada recintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
    return this;
  }

 /**
   * Descrição da situação do estoque da carga&lt;br/&gt; 
   * @return situacaoAtual
  **/
  @JsonProperty("situacaoAtual")
  public String getSituacaoAtual() {
    return situacaoAtual;
  }

  public void setSituacaoAtual(String situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
  }

  public EstoqueConsultaDetalhada situacaoAtual(String situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
    return this;
  }

 /**
   * Tipo de documento de saída&lt;p&gt;Os documentos podem ser:&lt;/p&gt;10 – DI&lt;br/&gt;11 – Processo Digital/Processo Dossiê&lt;br/&gt;12 – E-DMOV&lt;br/&gt;20 – Outros&lt;br/&gt;21 – PMB&lt;br/&gt;22 – PDE/TR&lt;br/&gt;23 – DSI Eletrônica&lt;br/&gt;24 – DSI Formulário&lt;br/&gt;30 – DTA - Importação comum&lt;br/&gt;31 – DTA - Importação especial - bagagem desacompanhada&lt;br/&gt;32 – DTA - Importação especial - mala diplomática&lt;br/&gt;33 – DTA - Importação especial - urna funerária&lt;br/&gt;34 – DTA - Importação especial - outras&lt;br/&gt;35 – DTA - Passagem comum&lt;br/&gt;36 – DTA - Passagem comum - bagagem desacompanhada&lt;br/&gt;37 – DTA - Passagem comum - mala diplomática&lt;br/&gt;38 – DTA - Passagem comum - partes e peças&lt;br/&gt;39 – DTA - Passagem comum - urna funerária&lt;br/&gt;40 – DTA - Passagem comum - outras&lt;br/&gt;50 – DTI&lt;br/&gt;99 – DUIMP&lt;br/&gt;
   * @return tipoDocumentoSaida
  **/
  @JsonProperty("tipoDocumentoSaida")
  public String getTipoDocumentoSaida() {
    if (tipoDocumentoSaida == null) {
      return null;
    }
    return tipoDocumentoSaida.value();
  }

  public void setTipoDocumentoSaida(TipoDocumentoSaidaEnum tipoDocumentoSaida) {
    this.tipoDocumentoSaida = tipoDocumentoSaida;
  }

  public EstoqueConsultaDetalhada tipoDocumentoSaida(TipoDocumentoSaidaEnum tipoDocumentoSaida) {
    this.tipoDocumentoSaida = tipoDocumentoSaida;
    return this;
  }

 /**
   * Código da UL&lt;br/&gt; Tamanho: 7&lt;br/&gt; Formato: AAAAAAA
   * @return unidadeRfb
  **/
  @JsonProperty("unidadeRfb")
  public String getUnidadeRfb() {
    return unidadeRfb;
  }

  public void setUnidadeRfb(String unidadeRfb) {
    this.unidadeRfb = unidadeRfb;
  }

  public EstoqueConsultaDetalhada unidadeRfb(String unidadeRfb) {
    this.unidadeRfb = unidadeRfb;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstoqueConsultaDetalhada {\n");
    
    sb.append("    cnpjResponsavelAtual: ").append(toIndentedString(cnpjResponsavelAtual)).append("\n");
    sb.append("    dataHoraSituacaoAtual: ").append(toIndentedString(dataHoraSituacaoAtual)).append("\n");
    sb.append("    identificacaoViagem: ").append(toIndentedString(identificacaoViagem)).append("\n");
    sb.append("    numeroDocumentoSaida: ").append(toIndentedString(numeroDocumentoSaida)).append("\n");
    sb.append("    pesoBrutoEstoque: ").append(toIndentedString(pesoBrutoEstoque)).append("\n");
    sb.append("    quantidadeVolumesEstoque: ").append(toIndentedString(quantidadeVolumesEstoque)).append("\n");
    sb.append("    recintoAduaneiro: ").append(toIndentedString(recintoAduaneiro)).append("\n");
    sb.append("    situacaoAtual: ").append(toIndentedString(situacaoAtual)).append("\n");
    sb.append("    tipoDocumentoSaida: ").append(toIndentedString(tipoDocumentoSaida)).append("\n");
    sb.append("    unidadeRfb: ").append(toIndentedString(unidadeRfb)).append("\n");
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

