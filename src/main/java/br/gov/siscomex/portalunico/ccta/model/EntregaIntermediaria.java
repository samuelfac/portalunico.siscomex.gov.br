package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EntregaIntermediaria", propOrder =
    { "cnpjRecebedor", "cnpjResponsavelArquivo", "cnpjResponsavelEntregaIntermediaria", "cpfRecebedor", "dataEmissao", "detalheMotivo", "identificacaoCarga", "motivoEntregaIntermediaria", "numeroDTA", "observacoes", "pesoEntrega", "recintoAduaneiro", "tipoCarga", "tipoDTA", "tipoRecebedor", "unidadeRFB", "volumeEntrega"
})

@XmlRootElement(name="EntregaIntermediaria")
public class EntregaIntermediaria  {
  
  @XmlElement(name="cnpjRecebedor", required = true)
  @ApiModelProperty(example = "00000000000191", required = true, value = "CNPJ do recebedor da entrega intermediária da carga.<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do recebedor da entrega intermediária da carga.<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjRecebedor = null;

  @XmlElement(name="cnpjResponsavelArquivo", required = true)
  @ApiModelProperty(example = "00000000000191", required = true, value = "CNPJ do responsável pelo arquivo do conhecimento de carga.<br/>Somente deve ser informado para conhecimentos do tipo HAWB<br/>Tamanho: 8<br/>Formato: NNNNNNNN ou <br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pelo arquivo do conhecimento de carga.<br/>Somente deve ser informado para conhecimentos do tipo HAWB<br/>Tamanho: 8<br/>Formato: NNNNNNNN ou <br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelArquivo = null;

  @XmlElement(name="cnpjResponsavelEntregaIntermediaria", required = true)
  @ApiModelProperty(example = "00000000000191", required = true, value = "CNPJ do responsável pela entrega intermediaria da carga.<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela entrega intermediaria da carga.<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelEntregaIntermediaria = null;

  @XmlElement(name="cpfRecebedor", required = true)
  @ApiModelProperty(example = "12345678901", required = true, value = "CPF da Pessoa física que recebeu a mercadoria<br/>Tamanho: 11<br/>Formato: NNNNNNNNNNN")
 /**
   * CPF da Pessoa física que recebeu a mercadoria<br/>Tamanho: 11<br/>Formato: NNNNNNNNNNN
  **/
  private String cpfRecebedor = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2020-08-07", value = "Data da emissão do conhecimento.<br/>Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.<br/>Para o tipo DSIC não deve ser informado.<br/>Formato: yyyy-MM-dd<br/>Formato: yyyy-MM-dd")
 /**
   * Data da emissão do conhecimento.<br/>Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.<br/>Para o tipo DSIC não deve ser informado.<br/>Formato: yyyy-MM-dd<br/>Formato: yyyy-MM-dd
  **/
  private String dataEmissao = null;

  @XmlElement(name="detalheMotivo")
  @ApiModelProperty(example = "Texto livre para detalhe de motivo da entrega.", value = "Detalhe do motivo da entrega intermediária.<br/>Este campo é obrigatório para o motivo OUTROS e não deve ser informado para os demais motivos.<br/>Tamanho máximo: 1000")
 /**
   * Detalhe do motivo da entrega intermediária.<br/>Este campo é obrigatório para o motivo OUTROS e não deve ser informado para os demais motivos.<br/>Tamanho máximo: 1000
  **/
  private String detalheMotivo = null;

  @XmlElement(name="identificacaoCarga", required = true)
  @ApiModelProperty(example = "43NQKMM8KNT", required = true, value = "Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacaoCarga = null;


@XmlType(name="MotivoEntregaIntermediariaEnum")
@XmlEnum(String.class)
public enum MotivoEntregaIntermediariaEnum {

	@XmlEnumValue("TRANSITO_INTERNACIONAL")
	@JsonProperty("TRANSITO_INTERNACIONAL")
	TRANSITO_INTERNACIONAL(String.valueOf("TRANSITO_INTERNACIONAL")),
	
	@XmlEnumValue("TRANSITO_NACIONAL")
	@JsonProperty("TRANSITO_NACIONAL")
	TRANSITO_NACIONAL(String.valueOf("TRANSITO_NACIONAL")),
	
	@XmlEnumValue("REMESSA_POSTAL")
	@JsonProperty("REMESSA_POSTAL")
	REMESSA_POSTAL(String.valueOf("REMESSA_POSTAL")),
	
	@XmlEnumValue("REMESSA_EXPRESSA")
	@JsonProperty("REMESSA_EXPRESSA")
	REMESSA_EXPRESSA(String.valueOf("REMESSA_EXPRESSA")),
	
	@XmlEnumValue("OUTROS")
	@JsonProperty("OUTROS")
	OUTROS(String.valueOf("OUTROS"));


    private String value;

    MotivoEntregaIntermediariaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MotivoEntregaIntermediariaEnum fromValue(String v) {
        for (MotivoEntregaIntermediariaEnum b : MotivoEntregaIntermediariaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to MotivoEntregaIntermediariaEnum");
    }
}

  @XmlElement(name="motivoEntregaIntermediaria", required = true)
  @ApiModelProperty(example = "TRANSITO_INTERNACIONAL", required = true, value = "Motivo da entrega intermediária.<br/>Na entrega intermediária entre depositário e transportador terrestre, os motivos escolhidos são obrigatoriamente TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.")
 /**
   * Motivo da entrega intermediária.<br/>Na entrega intermediária entre depositário e transportador terrestre, os motivos escolhidos são obrigatoriamente TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.
  **/
  private MotivoEntregaIntermediariaEnum motivoEntregaIntermediaria = null;

  @XmlElement(name="numeroDTA")
  @ApiModelProperty(example = "2000017171", value = "Número do DTA<br/>Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.</br>Para os demais motivos não deve ser informado.<br/><br/>Tamanho mínimo: 8<br/>Tamanho máximo: 15<br/> Formato: AAAAAAAAAAAAAAA<br/><br/>")
 /**
   * Número do DTA<br/>Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.</br>Para os demais motivos não deve ser informado.<br/><br/>Tamanho mínimo: 8<br/>Tamanho máximo: 15<br/> Formato: AAAAAAAAAAAAAAA<br/><br/>
  **/
  private String numeroDTA = null;

  @XmlElement(name="observacoes")
  @ApiModelProperty(example = "Qualquer observação sobre a entrega intermediária", value = "Observações sobre a entrega intermediária<br/>Tamanho máximo: 1000")
 /**
   * Observações sobre a entrega intermediária<br/>Tamanho máximo: 1000
  **/
  private String observacoes = null;

  @XmlElement(name="pesoEntrega", required = true)
  @ApiModelProperty(example = "105.478", required = true, value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoEntrega = null;

  @XmlElement(name="recintoAduaneiro")
  @ApiModelProperty(example = "7911101", value = "Recinto Aduaneiro do Depositário responsável pela entrega intermediária.<br/>Este campo é obrigatório para o Depositário e não deve ser informado pelos demais intervenientes.")
 /**
   * Recinto Aduaneiro do Depositário responsável pela entrega intermediária.<br/>Este campo é obrigatório para o Depositário e não deve ser informado pelos demais intervenientes.
  **/
  private String recintoAduaneiro = null;


@XmlType(name="TipoCargaEnum")
@XmlEnum(String.class)
public enum TipoCargaEnum {

	@XmlEnumValue("740")
	@JsonProperty("740")
	_740(String.valueOf("740")),
	
	@XmlEnumValue("741")
	@JsonProperty("741")
	_741(String.valueOf("741")),
	
	@XmlEnumValue("703")
	@JsonProperty("703")
	_703(String.valueOf("703")),
	
	@XmlEnumValue("14")
	@JsonProperty("14")
	_14(String.valueOf("14"));


    private String value;

    TipoCargaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoCargaEnum fromValue(String v) {
        for (TipoCargaEnum b : TipoCargaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoCargaEnum");
    }
}

  @XmlElement(name="tipoCarga", required = true)
  @ApiModelProperty(example = "740", required = true, value = "Tipo de carga. <p>Os tipos podem ser:</p><ul><li><em>740</em> – Air Waybill.</li><li><em>741</em> – Master Air Waybill.</li><li><em>703</em> – House Air Waybill.</li><li><em>14</em> – DSIC - Documento Subsidiário de Identificação de Carga.</li></ul>")
 /**
   * Tipo de carga. <p>Os tipos podem ser:</p><ul><li><em>740</em> – Air Waybill.</li><li><em>741</em> – Master Air Waybill.</li><li><em>703</em> – House Air Waybill.</li><li><em>14</em> – DSIC - Documento Subsidiário de Identificação de Carga.</li></ul>
  **/
  private TipoCargaEnum tipoCarga = null;


@XmlType(name="TipoDTAEnum")
@XmlEnum(String.class)
public enum TipoDTAEnum {

	@XmlEnumValue("30")
	@JsonProperty("30")
	_30(String.valueOf("30")),
	
	@XmlEnumValue("31")
	@JsonProperty("31")
	_31(String.valueOf("31")),
	
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
	_40(String.valueOf("40"));


    private String value;

    TipoDTAEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDTAEnum fromValue(String v) {
        for (TipoDTAEnum b : TipoDTAEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDTAEnum");
    }
}

  @XmlElement(name="tipoDTA")
  @ApiModelProperty(example = "30", value = "Tipos de DTA.<br/>Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.</br>Para os demais motivos não deve ser informado.<br/><br/>30 - Importacao comum<br/>31 - Importacao especial - bagagem desacompanhada<br/>32 - Importacao especial - mala diplomática<br/>33 - Importacao especial - urna funerária<br/>34 - Importacao especial - outras<br/>35 - Passagem comum<br/>36 - Passagem comum - bagagem desacompanhada<br/>37 - Passagem comum - mala diplomática<br/>38 - Passagem comum - partes e peças<br/>39 - Passagem comum - urna funerária<br/>40 - Passagem comum - outras<br/>")
 /**
   * Tipos de DTA.<br/>Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.</br>Para os demais motivos não deve ser informado.<br/><br/>30 - Importacao comum<br/>31 - Importacao especial - bagagem desacompanhada<br/>32 - Importacao especial - mala diplomática<br/>33 - Importacao especial - urna funerária<br/>34 - Importacao especial - outras<br/>35 - Passagem comum<br/>36 - Passagem comum - bagagem desacompanhada<br/>37 - Passagem comum - mala diplomática<br/>38 - Passagem comum - partes e peças<br/>39 - Passagem comum - urna funerária<br/>40 - Passagem comum - outras<br/>
  **/
  private TipoDTAEnum tipoDTA = null;


@XmlType(name="TipoRecebedorEnum")
@XmlEnum(String.class)
public enum TipoRecebedorEnum {

	@XmlEnumValue("CIA_AEREA")
	@JsonProperty("CIA_AEREA")
	CIA_AEREA(String.valueOf("CIA_AEREA")),
	
	@XmlEnumValue("DEPOSITARIO")
	@JsonProperty("DEPOSITARIO")
	DEPOSITARIO(String.valueOf("DEPOSITARIO")),
	
	@XmlEnumValue("TRANSPORTADOR_TERRESTRE")
	@JsonProperty("TRANSPORTADOR_TERRESTRE")
	TRANSPORTADOR_TERRESTRE(String.valueOf("TRANSPORTADOR_TERRESTRE")),
	
	@XmlEnumValue("OPERADOR_REMESSA_POSTAL")
	@JsonProperty("OPERADOR_REMESSA_POSTAL")
	OPERADOR_REMESSA_POSTAL(String.valueOf("OPERADOR_REMESSA_POSTAL"));


    private String value;

    TipoRecebedorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoRecebedorEnum fromValue(String v) {
        for (TipoRecebedorEnum b : TipoRecebedorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoRecebedorEnum");
    }
}

  @XmlElement(name="tipoRecebedor", required = true)
  @ApiModelProperty(example = "OPERADOR_REMESSA_POSTAL", required = true, value = "Tipo do recebedor da entrega intermediária que será realizada.<br/>Quando o interveniente de origem for CIA_AEREA apenas intervenientes CIA_AEREA e OPERADOR_REMESSA_POSTAL serão permitidos como recebedores da entrega intermediária.")
 /**
   * Tipo do recebedor da entrega intermediária que será realizada.<br/>Quando o interveniente de origem for CIA_AEREA apenas intervenientes CIA_AEREA e OPERADOR_REMESSA_POSTAL serão permitidos como recebedores da entrega intermediária.
  **/
  private TipoRecebedorEnum tipoRecebedor = null;

  @XmlElement(name="unidadeRFB", required = true)
  @ApiModelProperty(example = "0717700", required = true, value = "Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega intermediária<br/>")
 /**
   * Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega intermediária<br/>
  **/
  private String unidadeRFB = null;

  @XmlElement(name="volumeEntrega", required = true)
  @ApiModelProperty(example = "5", required = true, value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Long volumeEntrega = null;
 /**
   * CNPJ do recebedor da entrega intermediária da carga.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjRecebedor
  **/
  @JsonProperty("cnpjRecebedor")
  @NotNull
  public String getCnpjRecebedor() {
    return cnpjRecebedor;
  }

  public void setCnpjRecebedor(String cnpjRecebedor) {
    this.cnpjRecebedor = cnpjRecebedor;
  }

  public EntregaIntermediaria cnpjRecebedor(String cnpjRecebedor) {
    this.cnpjRecebedor = cnpjRecebedor;
    return this;
  }

 /**
   * CNPJ do responsável pelo arquivo do conhecimento de carga.&lt;br/&gt;Somente deve ser informado para conhecimentos do tipo HAWB&lt;br/&gt;Tamanho: 8&lt;br/&gt;Formato: NNNNNNNN ou &lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelArquivo
  **/
  @JsonProperty("cnpjResponsavelArquivo")
  @NotNull
  public String getCnpjResponsavelArquivo() {
    return cnpjResponsavelArquivo;
  }

  public void setCnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
  }

  public EntregaIntermediaria cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
    return this;
  }

 /**
   * CNPJ do responsável pela entrega intermediaria da carga.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelEntregaIntermediaria
  **/
  @JsonProperty("cnpjResponsavelEntregaIntermediaria")
  @NotNull
  public String getCnpjResponsavelEntregaIntermediaria() {
    return cnpjResponsavelEntregaIntermediaria;
  }

  public void setCnpjResponsavelEntregaIntermediaria(String cnpjResponsavelEntregaIntermediaria) {
    this.cnpjResponsavelEntregaIntermediaria = cnpjResponsavelEntregaIntermediaria;
  }

  public EntregaIntermediaria cnpjResponsavelEntregaIntermediaria(String cnpjResponsavelEntregaIntermediaria) {
    this.cnpjResponsavelEntregaIntermediaria = cnpjResponsavelEntregaIntermediaria;
    return this;
  }

 /**
   * CPF da Pessoa física que recebeu a mercadoria&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: NNNNNNNNNNN
   * @return cpfRecebedor
  **/
  @JsonProperty("cpfRecebedor")
  @NotNull
  public String getCpfRecebedor() {
    return cpfRecebedor;
  }

  public void setCpfRecebedor(String cpfRecebedor) {
    this.cpfRecebedor = cpfRecebedor;
  }

  public EntregaIntermediaria cpfRecebedor(String cpfRecebedor) {
    this.cpfRecebedor = cpfRecebedor;
    return this;
  }

 /**
   * Data da emissão do conhecimento.&lt;br/&gt;Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.&lt;br/&gt;Para o tipo DSIC não deve ser informado.&lt;br/&gt;Formato: yyyy-MM-dd&lt;br/&gt;Formato: yyyy-MM-dd
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public EntregaIntermediaria dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Detalhe do motivo da entrega intermediária.&lt;br/&gt;Este campo é obrigatório para o motivo OUTROS e não deve ser informado para os demais motivos.&lt;br/&gt;Tamanho máximo: 1000
   * @return detalheMotivo
  **/
  @JsonProperty("detalheMotivo")
  public String getDetalheMotivo() {
    return detalheMotivo;
  }

  public void setDetalheMotivo(String detalheMotivo) {
    this.detalheMotivo = detalheMotivo;
  }

  public EntregaIntermediaria detalheMotivo(String detalheMotivo) {
    this.detalheMotivo = detalheMotivo;
    return this;
  }

 /**
   * Identificação da carga (Conhecimento/DSIC)&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 35
   * @return identificacaoCarga
  **/
  @JsonProperty("identificacaoCarga")
  @NotNull
  public String getIdentificacaoCarga() {
    return identificacaoCarga;
  }

  public void setIdentificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
  }

  public EntregaIntermediaria identificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
    return this;
  }

 /**
   * Motivo da entrega intermediária.&lt;br/&gt;Na entrega intermediária entre depositário e transportador terrestre, os motivos escolhidos são obrigatoriamente TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.
   * @return motivoEntregaIntermediaria
  **/
  @JsonProperty("motivoEntregaIntermediaria")
  @NotNull
  public String getMotivoEntregaIntermediaria() {
    if (motivoEntregaIntermediaria == null) {
      return null;
    }
    return motivoEntregaIntermediaria.value();
  }

  public void setMotivoEntregaIntermediaria(MotivoEntregaIntermediariaEnum motivoEntregaIntermediaria) {
    this.motivoEntregaIntermediaria = motivoEntregaIntermediaria;
  }

  public EntregaIntermediaria motivoEntregaIntermediaria(MotivoEntregaIntermediariaEnum motivoEntregaIntermediaria) {
    this.motivoEntregaIntermediaria = motivoEntregaIntermediaria;
    return this;
  }

 /**
   * Número do DTA&lt;br/&gt;Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.&lt;/br&gt;Para os demais motivos não deve ser informado.&lt;br/&gt;&lt;br/&gt;Tamanho mínimo: 8&lt;br/&gt;Tamanho máximo: 15&lt;br/&gt; Formato: AAAAAAAAAAAAAAA&lt;br/&gt;&lt;br/&gt;
   * @return numeroDTA
  **/
  @JsonProperty("numeroDTA")
  public String getNumeroDTA() {
    return numeroDTA;
  }

  public void setNumeroDTA(String numeroDTA) {
    this.numeroDTA = numeroDTA;
  }

  public EntregaIntermediaria numeroDTA(String numeroDTA) {
    this.numeroDTA = numeroDTA;
    return this;
  }

 /**
   * Observações sobre a entrega intermediária&lt;br/&gt;Tamanho máximo: 1000
   * @return observacoes
  **/
  @JsonProperty("observacoes")
  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public EntregaIntermediaria observacoes(String observacoes) {
    this.observacoes = observacoes;
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoEntrega
  **/
  @JsonProperty("pesoEntrega")
  @NotNull
  public BigDecimal getPesoEntrega() {
    return pesoEntrega;
  }

  public void setPesoEntrega(BigDecimal pesoEntrega) {
    this.pesoEntrega = pesoEntrega;
  }

  public EntregaIntermediaria pesoEntrega(BigDecimal pesoEntrega) {
    this.pesoEntrega = pesoEntrega;
    return this;
  }

 /**
   * Recinto Aduaneiro do Depositário responsável pela entrega intermediária.&lt;br/&gt;Este campo é obrigatório para o Depositário e não deve ser informado pelos demais intervenientes.
   * @return recintoAduaneiro
  **/
  @JsonProperty("recintoAduaneiro")
  public String getRecintoAduaneiro() {
    return recintoAduaneiro;
  }

  public void setRecintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
  }

  public EntregaIntermediaria recintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
    return this;
  }

 /**
   * Tipo de carga. &lt;p&gt;Os tipos podem ser:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;em&gt;740&lt;/em&gt; – Air Waybill.&lt;/li&gt;&lt;li&gt;&lt;em&gt;741&lt;/em&gt; – Master Air Waybill.&lt;/li&gt;&lt;li&gt;&lt;em&gt;703&lt;/em&gt; – House Air Waybill.&lt;/li&gt;&lt;li&gt;&lt;em&gt;14&lt;/em&gt; – DSIC - Documento Subsidiário de Identificação de Carga.&lt;/li&gt;&lt;/ul&gt;
   * @return tipoCarga
  **/
  @JsonProperty("tipoCarga")
  @NotNull
  public String getTipoCarga() {
    if (tipoCarga == null) {
      return null;
    }
    return tipoCarga.value();
  }

  public void setTipoCarga(TipoCargaEnum tipoCarga) {
    this.tipoCarga = tipoCarga;
  }

  public EntregaIntermediaria tipoCarga(TipoCargaEnum tipoCarga) {
    this.tipoCarga = tipoCarga;
    return this;
  }

 /**
   * Tipos de DTA.&lt;br/&gt;Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.&lt;/br&gt;Para os demais motivos não deve ser informado.&lt;br/&gt;&lt;br/&gt;30 - Importacao comum&lt;br/&gt;31 - Importacao especial - bagagem desacompanhada&lt;br/&gt;32 - Importacao especial - mala diplomática&lt;br/&gt;33 - Importacao especial - urna funerária&lt;br/&gt;34 - Importacao especial - outras&lt;br/&gt;35 - Passagem comum&lt;br/&gt;36 - Passagem comum - bagagem desacompanhada&lt;br/&gt;37 - Passagem comum - mala diplomática&lt;br/&gt;38 - Passagem comum - partes e peças&lt;br/&gt;39 - Passagem comum - urna funerária&lt;br/&gt;40 - Passagem comum - outras&lt;br/&gt;
   * @return tipoDTA
  **/
  @JsonProperty("tipoDTA")
  public String getTipoDTA() {
    if (tipoDTA == null) {
      return null;
    }
    return tipoDTA.value();
  }

  public void setTipoDTA(TipoDTAEnum tipoDTA) {
    this.tipoDTA = tipoDTA;
  }

  public EntregaIntermediaria tipoDTA(TipoDTAEnum tipoDTA) {
    this.tipoDTA = tipoDTA;
    return this;
  }

 /**
   * Tipo do recebedor da entrega intermediária que será realizada.&lt;br/&gt;Quando o interveniente de origem for CIA_AEREA apenas intervenientes CIA_AEREA e OPERADOR_REMESSA_POSTAL serão permitidos como recebedores da entrega intermediária.
   * @return tipoRecebedor
  **/
  @JsonProperty("tipoRecebedor")
  @NotNull
  public String getTipoRecebedor() {
    if (tipoRecebedor == null) {
      return null;
    }
    return tipoRecebedor.value();
  }

  public void setTipoRecebedor(TipoRecebedorEnum tipoRecebedor) {
    this.tipoRecebedor = tipoRecebedor;
  }

  public EntregaIntermediaria tipoRecebedor(TipoRecebedorEnum tipoRecebedor) {
    this.tipoRecebedor = tipoRecebedor;
    return this;
  }

 /**
   * Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega intermediária&lt;br/&gt;
   * @return unidadeRFB
  **/
  @JsonProperty("unidadeRFB")
  @NotNull
  public String getUnidadeRFB() {
    return unidadeRFB;
  }

  public void setUnidadeRFB(String unidadeRFB) {
    this.unidadeRFB = unidadeRFB;
  }

  public EntregaIntermediaria unidadeRFB(String unidadeRFB) {
    this.unidadeRFB = unidadeRFB;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return volumeEntrega
  **/
  @JsonProperty("volumeEntrega")
  @NotNull
  public Long getVolumeEntrega() {
    return volumeEntrega;
  }

  public void setVolumeEntrega(Long volumeEntrega) {
    this.volumeEntrega = volumeEntrega;
  }

  public EntregaIntermediaria volumeEntrega(Long volumeEntrega) {
    this.volumeEntrega = volumeEntrega;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregaIntermediaria {\n");
    
    sb.append("    cnpjRecebedor: ").append(toIndentedString(cnpjRecebedor)).append("\n");
    sb.append("    cnpjResponsavelArquivo: ").append(toIndentedString(cnpjResponsavelArquivo)).append("\n");
    sb.append("    cnpjResponsavelEntregaIntermediaria: ").append(toIndentedString(cnpjResponsavelEntregaIntermediaria)).append("\n");
    sb.append("    cpfRecebedor: ").append(toIndentedString(cpfRecebedor)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    detalheMotivo: ").append(toIndentedString(detalheMotivo)).append("\n");
    sb.append("    identificacaoCarga: ").append(toIndentedString(identificacaoCarga)).append("\n");
    sb.append("    motivoEntregaIntermediaria: ").append(toIndentedString(motivoEntregaIntermediaria)).append("\n");
    sb.append("    numeroDTA: ").append(toIndentedString(numeroDTA)).append("\n");
    sb.append("    observacoes: ").append(toIndentedString(observacoes)).append("\n");
    sb.append("    pesoEntrega: ").append(toIndentedString(pesoEntrega)).append("\n");
    sb.append("    recintoAduaneiro: ").append(toIndentedString(recintoAduaneiro)).append("\n");
    sb.append("    tipoCarga: ").append(toIndentedString(tipoCarga)).append("\n");
    sb.append("    tipoDTA: ").append(toIndentedString(tipoDTA)).append("\n");
    sb.append("    tipoRecebedor: ").append(toIndentedString(tipoRecebedor)).append("\n");
    sb.append("    unidadeRFB: ").append(toIndentedString(unidadeRFB)).append("\n");
    sb.append("    volumeEntrega: ").append(toIndentedString(volumeEntrega)).append("\n");
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

