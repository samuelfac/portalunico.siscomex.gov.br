package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.BloqueioConsultaDetalhada;
import br.gov.siscomex.portalunico.ccta.model.CargaDetalheChegadaTerrestre;
import br.gov.siscomex.portalunico.ccta.model.ChaveConhecimento;
import br.gov.siscomex.portalunico.ccta.model.ChaveViagem;
import br.gov.siscomex.portalunico.ccta.model.DesbloqueioConsultaDetalhada;
import br.gov.siscomex.portalunico.ccta.model.DocumentoSaidaConsultaDetalhada;
import br.gov.siscomex.portalunico.ccta.model.EstoqueConsultaDetalhada;
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
 @XmlType(name = "DsicConsultaDetalhada", propOrder =
    { "bloqueiosAtivos", "bloqueiosBaixados", "chegadasTerrestres", "cnpjResponsavelGeracaoDsicDepositario", "codigoAeroportoDestinoConhecimento", "codigoAeroportoOrigemConhecimento", "conhecimentoApropriado", "dataHoraEmissao", "descricaoMercadoria", "documentosSaida", "identificacaoConhecimento", "identificacaoDSIC", "identificacaoDocumentoConsignatario", "manuseiosEspeciais", "motivo", "nomeConsignatario", "nomeResponsavelGeracaoDsicDepositario", "nomeViajante", "numeroAutorizacaoSobrevooDac", "numeroDocumentoRetencaoApreensao", "numeroDocumentoViajante", "observacoes", "orgaoEmissorDocumentoViajante", "outrasInfosServico", "partesEstoque", "pesoBruto", "quantidadeVolumes", "recintoAduaneiroGeracaoDsic", "ruc", "setorResponsavelGeracaoDsicRfb", "situacao", "solicitacoesServicosEspeciais", "tipoConhecimento", "tipoDocumentoConsignatario", "tipoDocumentoRetencaoApreensao", "tipoDocumentoViajante", "unidadeResponsavelGeracaoDsicRfb", "unidadeRfbGeracaoDsic", "valorArbitrado", "viagemAssociada"
})

@XmlRootElement(name="DsicConsultaDetalhada")
public class DsicConsultaDetalhada  {
  
  @XmlElement(name="bloqueiosAtivos")
  @ApiModelProperty(value = "Lista os bloqueios ativos da carga / Dsic<br/>")
  @Valid
 /**
   * Lista os bloqueios ativos da carga / Dsic<br/>
  **/
  private List<BloqueioConsultaDetalhada> bloqueiosAtivos = null;

  @XmlElement(name="bloqueiosBaixados")
  @ApiModelProperty(value = "Lista os bloqueios baixados da carga / Dsic<br/>")
  @Valid
 /**
   * Lista os bloqueios baixados da carga / Dsic<br/>
  **/
  private List<DesbloqueioConsultaDetalhada> bloqueiosBaixados = null;

  @XmlElement(name="chegadasTerrestres")
  @ApiModelProperty(value = "Lista as chegadas de viagens terrestres associadas ao DSIC<br/>")
  @Valid
 /**
   * Lista as chegadas de viagens terrestres associadas ao DSIC<br/>
  **/
  private List<CargaDetalheChegadaTerrestre> chegadasTerrestres = null;

  @XmlElement(name="cnpjResponsavelGeracaoDsicDepositario")
  @ApiModelProperty(example = "00000000000000", value = "CNPJ responsável pela geração do DSIC<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ responsável pela geração do DSIC<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelGeracaoDsicDepositario = null;

  @XmlElement(name="codigoAeroportoDestinoConhecimento")
  @ApiModelProperty(example = "GIG", value = "Código do Aeroporto de destino do conhecimento de carga associado ao DSIC<br/>Tamanho: 3")
 /**
   * Código do Aeroporto de destino do conhecimento de carga associado ao DSIC<br/>Tamanho: 3
  **/
  private String codigoAeroportoDestinoConhecimento = null;

  @XmlElement(name="codigoAeroportoOrigemConhecimento")
  @ApiModelProperty(example = "GIG", value = "Código do Aeroporto de origem do conhecimento de carga associado ao DSIC<br/>Tamanho: 3")
 /**
   * Código do Aeroporto de origem do conhecimento de carga associado ao DSIC<br/>Tamanho: 3
  **/
  private String codigoAeroportoOrigemConhecimento = null;

  @XmlElement(name="conhecimentoApropriado")
  @ApiModelProperty(value = "")
  @Valid
  private ChaveConhecimento conhecimentoApropriado = null;

  @XmlElement(name="dataHoraEmissao")
  @ApiModelProperty(example = "12/02/2021 21:21:21", value = "Data/Hora de emissão do DSIC.<br/> Formato: dd/MM/yyyy HH:mm:ss")
 /**
   * Data/Hora de emissão do DSIC.<br/> Formato: dd/MM/yyyy HH:mm:ss
  **/
  private String dataHoraEmissao = null;

  @XmlElement(name="descricaoMercadoria")
  @ApiModelProperty(example = "Descrição completa das mercadorias", value = "Descrição completa das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>")
 /**
   * Descrição completa das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>
  **/
  private String descricaoMercadoria = null;

  @XmlElement(name="documentosSaida")
  @ApiModelProperty(value = "Lista contendo os documentos de saída associados a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo os documentos de saída associados a carga / Dsic<br/>
  **/
  private List<DocumentoSaidaConsultaDetalhada> documentosSaida = null;

  @XmlElement(name="identificacaoConhecimento")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacaoConhecimento = null;

  @XmlElement(name="identificacaoDSIC")
  @ApiModelProperty(example = "D2000000035", value = "Número de identificação do DSIC<br/>Tamanho: 11<br/> Formato: ANNNNNNNNNN")
 /**
   * Número de identificação do DSIC<br/>Tamanho: 11<br/> Formato: ANNNNNNNNNN
  **/
  private String identificacaoDSIC = null;

  @XmlElement(name="identificacaoDocumentoConsignatario")
  @ApiModelProperty(example = "99999999999", value = "Tipo de documento do consignatário da carga<br/>Tamanho máximo: 35")
 /**
   * Tipo de documento do consignatário da carga<br/>Tamanho máximo: 35
  **/
  private String identificacaoDocumentoConsignatario = null;

  @XmlElement(name="manuseiosEspeciais")
  @ApiModelProperty(value = "Lista contendo os manuseios especiais para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo os manuseios especiais para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> manuseiosEspeciais = null;


@XmlType(name="MotivoEnum")
@XmlEnum(String.class)
public enum MotivoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3")),
	
	@XmlEnumValue("4")
	@JsonProperty("4")
	_4(String.valueOf("4")),
	
	@XmlEnumValue("5")
	@JsonProperty("5")
	_5(String.valueOf("5"));


    private String value;

    MotivoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MotivoEnum fromValue(String v) {
        for (MotivoEnum b : MotivoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to MotivoEnum");
    }
}

  @XmlElement(name="motivo")
  @ApiModelProperty(example = "5", value = "Motivo de geração do DSIC<br/>1 - Meios Próprios<br/>2 - Apreensão<br/>3 - Retenção<br/>4 - Descaracterização de Bagagem<br/>5 - Outros<br/>")
 /**
   * Motivo de geração do DSIC<br/>1 - Meios Próprios<br/>2 - Apreensão<br/>3 - Retenção<br/>4 - Descaracterização de Bagagem<br/>5 - Outros<br/>
  **/
  private MotivoEnum motivo = null;

  @XmlElement(name="nomeConsignatario")
  @ApiModelProperty(example = "Banco do Brasil", value = "Nome do consignatário<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 40")
 /**
   * Nome do consignatário<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 40
  **/
  private String nomeConsignatario = null;

  @XmlElement(name="nomeResponsavelGeracaoDsicDepositario")
  @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do responsável pela geração do DSIC<br/>Tamanho: 70")
 /**
   * Nome do responsável pela geração do DSIC<br/>Tamanho: 70
  **/
  private String nomeResponsavelGeracaoDsicDepositario = null;

  @XmlElement(name="nomeViajante")
  @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do passageiro<br/>Tamanho máximo: 40")
 /**
   * Nome do passageiro<br/>Tamanho máximo: 40
  **/
  private String nomeViajante = null;

  @XmlElement(name="numeroAutorizacaoSobrevooDac")
  @ApiModelProperty(example = "97890798", value = "Número de autorização de sobrevoo DAC<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN")
 /**
   * Número de autorização de sobrevoo DAC<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN
  **/
  private String numeroAutorizacaoSobrevooDac = null;

  @XmlElement(name="numeroDocumentoRetencaoApreensao")
  @ApiModelProperty(example = "123456789012345", value = "Número do documento para retenção e apreensão<br/>Tamanho:15<br/>Formato: NNNNNNNNNNNNNNNN")
 /**
   * Número do documento para retenção e apreensão<br/>Tamanho:15<br/>Formato: NNNNNNNNNNNNNNNN
  **/
  private String numeroDocumentoRetencaoApreensao = null;

  @XmlElement(name="numeroDocumentoViajante")
  @ApiModelProperty(example = "9840998BR65406", value = "Número do documento do passageiro<br/>Tamanho máximo: 20")
 /**
   * Número do documento do passageiro<br/>Tamanho máximo: 20
  **/
  private String numeroDocumentoViajante = null;

  @XmlElement(name="observacoes")
  @ApiModelProperty(example = "Observação do DSIC.", value = "Observação<br/>Tamanho máximo: 50")
 /**
   * Observação<br/>Tamanho máximo: 50
  **/
  private String observacoes = null;

  @XmlElement(name="orgaoEmissorDocumentoViajante")
  @ApiModelProperty(example = "DETRAN RJ", value = "Número do documento do passageiro<br/>Tamanho máximo: 30")
 /**
   * Número do documento do passageiro<br/>Tamanho máximo: 30
  **/
  private String orgaoEmissorDocumentoViajante = null;

  @XmlElement(name="outrasInfosServico")
  @ApiModelProperty(value = "Lista contendo as outras informações de serviço para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo as outras informações de serviço para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> outrasInfosServico = null;

  @XmlElement(name="partesEstoque")
  @ApiModelProperty(value = "Lista contendo as partes da carga<br/>")
  @Valid
 /**
   * Lista contendo as partes da carga<br/>
  **/
  private List<EstoqueConsultaDetalhada> partesEstoque = null;

  @XmlElement(name="pesoBruto")
  @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoBruto = null;

  @XmlElement(name="quantidadeVolumes")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidadeVolumes = null;

  @XmlElement(name="recintoAduaneiroGeracaoDsic")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos
  **/
  private String recintoAduaneiroGeracaoDsic = null;

  @XmlElement(name="ruc")
  @ApiModelProperty(example = "0BRIMP000555552000100DGXKKI9LMCG", value = "Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 32")
 /**
   * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 32
  **/
  private String ruc = null;

  @XmlElement(name="setorResponsavelGeracaoDsicRfb")
  @ApiModelProperty(example = "PORTO DO RIO", value = "Setor de lotação do fiscal responsável pela geração do DSIC<br/>Tamanho: 35")
 /**
   * Setor de lotação do fiscal responsável pela geração do DSIC<br/>Tamanho: 35
  **/
  private String setorResponsavelGeracaoDsicRfb = null;


@XmlType(name="SituacaoEnum")
@XmlEnum(String.class)
public enum SituacaoEnum {

	@XmlEnumValue("A")
	@JsonProperty("A")
	A(String.valueOf("A")),
	
	@XmlEnumValue("E")
	@JsonProperty("E")
	E(String.valueOf("E")),
	
	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P"));


    private String value;

    SituacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoEnum fromValue(String v) {
        for (SituacaoEnum b : SituacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoEnum");
    }
}

  @XmlElement(name="situacao")
  @ApiModelProperty(example = "A", value = "Código da situação do DSIC<br>Tamanho: 1<br/>A - Ativo <br/>E - Excludído<br/>P - Apropriado<br/>")
 /**
   * Código da situação do DSIC<br>Tamanho: 1<br/>A - Ativo <br/>E - Excludído<br/>P - Apropriado<br/>
  **/
  private SituacaoEnum situacao = null;

  @XmlElement(name="solicitacoesServicosEspeciais")
  @ApiModelProperty(value = "Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>")
  @Valid
 /**
   * Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>
  **/
  private List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais = null;


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


@XmlType(name="TipoDocumentoConsignatarioEnum")
@XmlEnum(String.class)
public enum TipoDocumentoConsignatarioEnum {

	@XmlEnumValue("CPF")
	@JsonProperty("CPF")
	CPF(String.valueOf("CPF")),
	
	@XmlEnumValue("CNPJ")
	@JsonProperty("CNPJ")
	CNPJ(String.valueOf("CNPJ")),
	
	@XmlEnumValue("PASSAPORTE")
	@JsonProperty("PASSAPORTE")
	PASSAPORTE(String.valueOf("PASSAPORTE"));


    private String value;

    TipoDocumentoConsignatarioEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDocumentoConsignatarioEnum fromValue(String v) {
        for (TipoDocumentoConsignatarioEnum b : TipoDocumentoConsignatarioEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoConsignatarioEnum");
    }
}

  @XmlElement(name="tipoDocumentoConsignatario")
  @ApiModelProperty(example = "PASSAPORTE", value = "Tipo de documento do consignatário da carga<br/>Tamanho: 10")
 /**
   * Tipo de documento do consignatário da carga<br/>Tamanho: 10
  **/
  private TipoDocumentoConsignatarioEnum tipoDocumentoConsignatario = null;


@XmlType(name="TipoDocumentoRetencaoApreensaoEnum")
@XmlEnum(String.class)
public enum TipoDocumentoRetencaoApreensaoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2"));


    private String value;

    TipoDocumentoRetencaoApreensaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDocumentoRetencaoApreensaoEnum fromValue(String v) {
        for (TipoDocumentoRetencaoApreensaoEnum b : TipoDocumentoRetencaoApreensaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoRetencaoApreensaoEnum");
    }
}

  @XmlElement(name="tipoDocumentoRetencaoApreensao")
  @ApiModelProperty(example = "1", value = "Tipo do documento dpara retenção e apreensão<br/>1 – Termo de retenção e guarda<br/>2 – Auto de infração<br/>")
 /**
   * Tipo do documento dpara retenção e apreensão<br/>1 – Termo de retenção e guarda<br/>2 – Auto de infração<br/>
  **/
  private TipoDocumentoRetencaoApreensaoEnum tipoDocumentoRetencaoApreensao = null;


@XmlType(name="TipoDocumentoViajanteEnum")
@XmlEnum(String.class)
public enum TipoDocumentoViajanteEnum {

	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P")),
	
	@XmlEnumValue("I")
	@JsonProperty("I")
	I(String.valueOf("I")),
	
	@XmlEnumValue("F")
	@JsonProperty("F")
	F(String.valueOf("F")),
	
	@XmlEnumValue("O")
	@JsonProperty("O")
	O(String.valueOf("O")),
	
	@XmlEnumValue("N")
	@JsonProperty("N")
	N(String.valueOf("N"));


    private String value;

    TipoDocumentoViajanteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDocumentoViajanteEnum fromValue(String v) {
        for (TipoDocumentoViajanteEnum b : TipoDocumentoViajanteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoViajanteEnum");
    }
}

  @XmlElement(name="tipoDocumentoViajante")
  @ApiModelProperty(example = "I", value = "Tipo de documento do passageiro<br/>P – Passaporte<br/>I – Carteira de identidade<br/>F – CPF<br/>O – Outros<br/>N – Nenhum<br/>")
 /**
   * Tipo de documento do passageiro<br/>P – Passaporte<br/>I – Carteira de identidade<br/>F – CPF<br/>O – Outros<br/>N – Nenhum<br/>
  **/
  private TipoDocumentoViajanteEnum tipoDocumentoViajante = null;

  @XmlElement(name="unidadeResponsavelGeracaoDsicRfb")
  @ApiModelProperty(example = "0817600", value = "Unidade de lotação do fiscal responsável pela geração do DSIC<br/>Tamanho: 8")
 /**
   * Unidade de lotação do fiscal responsável pela geração do DSIC<br/>Tamanho: 8
  **/
  private String unidadeResponsavelGeracaoDsicRfb = null;

  @XmlElement(name="unidadeRfbGeracaoDsic")
  @ApiModelProperty(example = "0817600", value = "Código da UL de destino<br/> Tamanho: 7<br/> Formato: AAAAAAA")
 /**
   * Código da UL de destino<br/> Tamanho: 7<br/> Formato: AAAAAAA
  **/
  private String unidadeRfbGeracaoDsic = null;

  @XmlElement(name="valorArbitrado")
  @ApiModelProperty(example = "34.58", value = "Valor arbitrado pela RFB.<br/>Tamanho: 9,2<br/>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor arbitrado pela RFB.<br/>Tamanho: 9,2<br/>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorArbitrado = null;

  @XmlElement(name="viagemAssociada")
  @ApiModelProperty(value = "")
  @Valid
  private ChaveViagem viagemAssociada = null;
 /**
   * Lista os bloqueios ativos da carga / Dsic&lt;br/&gt;
   * @return bloqueiosAtivos
  **/
  @JsonProperty("bloqueiosAtivos")
  public List<BloqueioConsultaDetalhada> getBloqueiosAtivos() {
    return bloqueiosAtivos;
  }

  public void setBloqueiosAtivos(List<BloqueioConsultaDetalhada> bloqueiosAtivos) {
    this.bloqueiosAtivos = bloqueiosAtivos;
  }

  public DsicConsultaDetalhada bloqueiosAtivos(List<BloqueioConsultaDetalhada> bloqueiosAtivos) {
    this.bloqueiosAtivos = bloqueiosAtivos;
    return this;
  }

  public DsicConsultaDetalhada addBloqueiosAtivosItem(BloqueioConsultaDetalhada bloqueiosAtivosItem) {
    this.bloqueiosAtivos.add(bloqueiosAtivosItem);
    return this;
  }

 /**
   * Lista os bloqueios baixados da carga / Dsic&lt;br/&gt;
   * @return bloqueiosBaixados
  **/
  @JsonProperty("bloqueiosBaixados")
  public List<DesbloqueioConsultaDetalhada> getBloqueiosBaixados() {
    return bloqueiosBaixados;
  }

  public void setBloqueiosBaixados(List<DesbloqueioConsultaDetalhada> bloqueiosBaixados) {
    this.bloqueiosBaixados = bloqueiosBaixados;
  }

  public DsicConsultaDetalhada bloqueiosBaixados(List<DesbloqueioConsultaDetalhada> bloqueiosBaixados) {
    this.bloqueiosBaixados = bloqueiosBaixados;
    return this;
  }

  public DsicConsultaDetalhada addBloqueiosBaixadosItem(DesbloqueioConsultaDetalhada bloqueiosBaixadosItem) {
    this.bloqueiosBaixados.add(bloqueiosBaixadosItem);
    return this;
  }

 /**
   * Lista as chegadas de viagens terrestres associadas ao DSIC&lt;br/&gt;
   * @return chegadasTerrestres
  **/
  @JsonProperty("chegadasTerrestres")
  public List<CargaDetalheChegadaTerrestre> getChegadasTerrestres() {
    return chegadasTerrestres;
  }

  public void setChegadasTerrestres(List<CargaDetalheChegadaTerrestre> chegadasTerrestres) {
    this.chegadasTerrestres = chegadasTerrestres;
  }

  public DsicConsultaDetalhada chegadasTerrestres(List<CargaDetalheChegadaTerrestre> chegadasTerrestres) {
    this.chegadasTerrestres = chegadasTerrestres;
    return this;
  }

  public DsicConsultaDetalhada addChegadasTerrestresItem(CargaDetalheChegadaTerrestre chegadasTerrestresItem) {
    this.chegadasTerrestres.add(chegadasTerrestresItem);
    return this;
  }

 /**
   * CNPJ responsável pela geração do DSIC&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelGeracaoDsicDepositario
  **/
  @JsonProperty("cnpjResponsavelGeracaoDsicDepositario")
  public String getCnpjResponsavelGeracaoDsicDepositario() {
    return cnpjResponsavelGeracaoDsicDepositario;
  }

  public void setCnpjResponsavelGeracaoDsicDepositario(String cnpjResponsavelGeracaoDsicDepositario) {
    this.cnpjResponsavelGeracaoDsicDepositario = cnpjResponsavelGeracaoDsicDepositario;
  }

  public DsicConsultaDetalhada cnpjResponsavelGeracaoDsicDepositario(String cnpjResponsavelGeracaoDsicDepositario) {
    this.cnpjResponsavelGeracaoDsicDepositario = cnpjResponsavelGeracaoDsicDepositario;
    return this;
  }

 /**
   * Código do Aeroporto de destino do conhecimento de carga associado ao DSIC&lt;br/&gt;Tamanho: 3
   * @return codigoAeroportoDestinoConhecimento
  **/
  @JsonProperty("codigoAeroportoDestinoConhecimento")
  public String getCodigoAeroportoDestinoConhecimento() {
    return codigoAeroportoDestinoConhecimento;
  }

  public void setCodigoAeroportoDestinoConhecimento(String codigoAeroportoDestinoConhecimento) {
    this.codigoAeroportoDestinoConhecimento = codigoAeroportoDestinoConhecimento;
  }

  public DsicConsultaDetalhada codigoAeroportoDestinoConhecimento(String codigoAeroportoDestinoConhecimento) {
    this.codigoAeroportoDestinoConhecimento = codigoAeroportoDestinoConhecimento;
    return this;
  }

 /**
   * Código do Aeroporto de origem do conhecimento de carga associado ao DSIC&lt;br/&gt;Tamanho: 3
   * @return codigoAeroportoOrigemConhecimento
  **/
  @JsonProperty("codigoAeroportoOrigemConhecimento")
  public String getCodigoAeroportoOrigemConhecimento() {
    return codigoAeroportoOrigemConhecimento;
  }

  public void setCodigoAeroportoOrigemConhecimento(String codigoAeroportoOrigemConhecimento) {
    this.codigoAeroportoOrigemConhecimento = codigoAeroportoOrigemConhecimento;
  }

  public DsicConsultaDetalhada codigoAeroportoOrigemConhecimento(String codigoAeroportoOrigemConhecimento) {
    this.codigoAeroportoOrigemConhecimento = codigoAeroportoOrigemConhecimento;
    return this;
  }

 /**
   * Get conhecimentoApropriado
   * @return conhecimentoApropriado
  **/
  @JsonProperty("conhecimentoApropriado")
  public ChaveConhecimento getConhecimentoApropriado() {
    return conhecimentoApropriado;
  }

  public void setConhecimentoApropriado(ChaveConhecimento conhecimentoApropriado) {
    this.conhecimentoApropriado = conhecimentoApropriado;
  }

  public DsicConsultaDetalhada conhecimentoApropriado(ChaveConhecimento conhecimentoApropriado) {
    this.conhecimentoApropriado = conhecimentoApropriado;
    return this;
  }

 /**
   * Data/Hora de emissão do DSIC.&lt;br/&gt; Formato: dd/MM/yyyy HH:mm:ss
   * @return dataHoraEmissao
  **/
  @JsonProperty("dataHoraEmissao")
  public String getDataHoraEmissao() {
    return dataHoraEmissao;
  }

  public void setDataHoraEmissao(String dataHoraEmissao) {
    this.dataHoraEmissao = dataHoraEmissao;
  }

  public DsicConsultaDetalhada dataHoraEmissao(String dataHoraEmissao) {
    this.dataHoraEmissao = dataHoraEmissao;
    return this;
  }

 /**
   * Descrição completa das mercadorias que estão sendo transportadas&lt;br&gt;Tamanho: 600&lt;br/&gt;
   * @return descricaoMercadoria
  **/
  @JsonProperty("descricaoMercadoria")
  public String getDescricaoMercadoria() {
    return descricaoMercadoria;
  }

  public void setDescricaoMercadoria(String descricaoMercadoria) {
    this.descricaoMercadoria = descricaoMercadoria;
  }

  public DsicConsultaDetalhada descricaoMercadoria(String descricaoMercadoria) {
    this.descricaoMercadoria = descricaoMercadoria;
    return this;
  }

 /**
   * Lista contendo os documentos de saída associados a carga / Dsic&lt;br/&gt;
   * @return documentosSaida
  **/
  @JsonProperty("documentosSaida")
  public List<DocumentoSaidaConsultaDetalhada> getDocumentosSaida() {
    return documentosSaida;
  }

  public void setDocumentosSaida(List<DocumentoSaidaConsultaDetalhada> documentosSaida) {
    this.documentosSaida = documentosSaida;
  }

  public DsicConsultaDetalhada documentosSaida(List<DocumentoSaidaConsultaDetalhada> documentosSaida) {
    this.documentosSaida = documentosSaida;
    return this;
  }

  public DsicConsultaDetalhada addDocumentosSaidaItem(DocumentoSaidaConsultaDetalhada documentosSaidaItem) {
    this.documentosSaida.add(documentosSaidaItem);
    return this;
  }

 /**
   * Número do conhecimento&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 35
   * @return identificacaoConhecimento
  **/
  @JsonProperty("identificacaoConhecimento")
  public String getIdentificacaoConhecimento() {
    return identificacaoConhecimento;
  }

  public void setIdentificacaoConhecimento(String identificacaoConhecimento) {
    this.identificacaoConhecimento = identificacaoConhecimento;
  }

  public DsicConsultaDetalhada identificacaoConhecimento(String identificacaoConhecimento) {
    this.identificacaoConhecimento = identificacaoConhecimento;
    return this;
  }

 /**
   * Número de identificação do DSIC&lt;br/&gt;Tamanho: 11&lt;br/&gt; Formato: ANNNNNNNNNN
   * @return identificacaoDSIC
  **/
  @JsonProperty("identificacaoDSIC")
  public String getIdentificacaoDSIC() {
    return identificacaoDSIC;
  }

  public void setIdentificacaoDSIC(String identificacaoDSIC) {
    this.identificacaoDSIC = identificacaoDSIC;
  }

  public DsicConsultaDetalhada identificacaoDSIC(String identificacaoDSIC) {
    this.identificacaoDSIC = identificacaoDSIC;
    return this;
  }

 /**
   * Tipo de documento do consignatário da carga&lt;br/&gt;Tamanho máximo: 35
   * @return identificacaoDocumentoConsignatario
  **/
  @JsonProperty("identificacaoDocumentoConsignatario")
  public String getIdentificacaoDocumentoConsignatario() {
    return identificacaoDocumentoConsignatario;
  }

  public void setIdentificacaoDocumentoConsignatario(String identificacaoDocumentoConsignatario) {
    this.identificacaoDocumentoConsignatario = identificacaoDocumentoConsignatario;
  }

  public DsicConsultaDetalhada identificacaoDocumentoConsignatario(String identificacaoDocumentoConsignatario) {
    this.identificacaoDocumentoConsignatario = identificacaoDocumentoConsignatario;
    return this;
  }

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

  public DsicConsultaDetalhada manuseiosEspeciais(List<InfoManuseioConsultaDetalhada> manuseiosEspeciais) {
    this.manuseiosEspeciais = manuseiosEspeciais;
    return this;
  }

  public DsicConsultaDetalhada addManuseiosEspeciaisItem(InfoManuseioConsultaDetalhada manuseiosEspeciaisItem) {
    this.manuseiosEspeciais.add(manuseiosEspeciaisItem);
    return this;
  }

 /**
   * Motivo de geração do DSIC&lt;br/&gt;1 - Meios Próprios&lt;br/&gt;2 - Apreensão&lt;br/&gt;3 - Retenção&lt;br/&gt;4 - Descaracterização de Bagagem&lt;br/&gt;5 - Outros&lt;br/&gt;
   * @return motivo
  **/
  @JsonProperty("motivo")
  public String getMotivo() {
    if (motivo == null) {
      return null;
    }
    return motivo.value();
  }

  public void setMotivo(MotivoEnum motivo) {
    this.motivo = motivo;
  }

  public DsicConsultaDetalhada motivo(MotivoEnum motivo) {
    this.motivo = motivo;
    return this;
  }

 /**
   * Nome do consignatário&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 40
   * @return nomeConsignatario
  **/
  @JsonProperty("nomeConsignatario")
  public String getNomeConsignatario() {
    return nomeConsignatario;
  }

  public void setNomeConsignatario(String nomeConsignatario) {
    this.nomeConsignatario = nomeConsignatario;
  }

  public DsicConsultaDetalhada nomeConsignatario(String nomeConsignatario) {
    this.nomeConsignatario = nomeConsignatario;
    return this;
  }

 /**
   * Nome do responsável pela geração do DSIC&lt;br/&gt;Tamanho: 70
   * @return nomeResponsavelGeracaoDsicDepositario
  **/
  @JsonProperty("nomeResponsavelGeracaoDsicDepositario")
  public String getNomeResponsavelGeracaoDsicDepositario() {
    return nomeResponsavelGeracaoDsicDepositario;
  }

  public void setNomeResponsavelGeracaoDsicDepositario(String nomeResponsavelGeracaoDsicDepositario) {
    this.nomeResponsavelGeracaoDsicDepositario = nomeResponsavelGeracaoDsicDepositario;
  }

  public DsicConsultaDetalhada nomeResponsavelGeracaoDsicDepositario(String nomeResponsavelGeracaoDsicDepositario) {
    this.nomeResponsavelGeracaoDsicDepositario = nomeResponsavelGeracaoDsicDepositario;
    return this;
  }

 /**
   * Nome do passageiro&lt;br/&gt;Tamanho máximo: 40
   * @return nomeViajante
  **/
  @JsonProperty("nomeViajante")
  public String getNomeViajante() {
    return nomeViajante;
  }

  public void setNomeViajante(String nomeViajante) {
    this.nomeViajante = nomeViajante;
  }

  public DsicConsultaDetalhada nomeViajante(String nomeViajante) {
    this.nomeViajante = nomeViajante;
    return this;
  }

 /**
   * Número de autorização de sobrevoo DAC&lt;br/&gt;Tamanho: 15&lt;br/&gt;Formato: NNNNNNNNNNNNNNN
   * @return numeroAutorizacaoSobrevooDac
  **/
  @JsonProperty("numeroAutorizacaoSobrevooDac")
  public String getNumeroAutorizacaoSobrevooDac() {
    return numeroAutorizacaoSobrevooDac;
  }

  public void setNumeroAutorizacaoSobrevooDac(String numeroAutorizacaoSobrevooDac) {
    this.numeroAutorizacaoSobrevooDac = numeroAutorizacaoSobrevooDac;
  }

  public DsicConsultaDetalhada numeroAutorizacaoSobrevooDac(String numeroAutorizacaoSobrevooDac) {
    this.numeroAutorizacaoSobrevooDac = numeroAutorizacaoSobrevooDac;
    return this;
  }

 /**
   * Número do documento para retenção e apreensão&lt;br/&gt;Tamanho:15&lt;br/&gt;Formato: NNNNNNNNNNNNNNNN
   * @return numeroDocumentoRetencaoApreensao
  **/
  @JsonProperty("numeroDocumentoRetencaoApreensao")
  public String getNumeroDocumentoRetencaoApreensao() {
    return numeroDocumentoRetencaoApreensao;
  }

  public void setNumeroDocumentoRetencaoApreensao(String numeroDocumentoRetencaoApreensao) {
    this.numeroDocumentoRetencaoApreensao = numeroDocumentoRetencaoApreensao;
  }

  public DsicConsultaDetalhada numeroDocumentoRetencaoApreensao(String numeroDocumentoRetencaoApreensao) {
    this.numeroDocumentoRetencaoApreensao = numeroDocumentoRetencaoApreensao;
    return this;
  }

 /**
   * Número do documento do passageiro&lt;br/&gt;Tamanho máximo: 20
   * @return numeroDocumentoViajante
  **/
  @JsonProperty("numeroDocumentoViajante")
  public String getNumeroDocumentoViajante() {
    return numeroDocumentoViajante;
  }

  public void setNumeroDocumentoViajante(String numeroDocumentoViajante) {
    this.numeroDocumentoViajante = numeroDocumentoViajante;
  }

  public DsicConsultaDetalhada numeroDocumentoViajante(String numeroDocumentoViajante) {
    this.numeroDocumentoViajante = numeroDocumentoViajante;
    return this;
  }

 /**
   * Observação&lt;br/&gt;Tamanho máximo: 50
   * @return observacoes
  **/
  @JsonProperty("observacoes")
  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public DsicConsultaDetalhada observacoes(String observacoes) {
    this.observacoes = observacoes;
    return this;
  }

 /**
   * Número do documento do passageiro&lt;br/&gt;Tamanho máximo: 30
   * @return orgaoEmissorDocumentoViajante
  **/
  @JsonProperty("orgaoEmissorDocumentoViajante")
  public String getOrgaoEmissorDocumentoViajante() {
    return orgaoEmissorDocumentoViajante;
  }

  public void setOrgaoEmissorDocumentoViajante(String orgaoEmissorDocumentoViajante) {
    this.orgaoEmissorDocumentoViajante = orgaoEmissorDocumentoViajante;
  }

  public DsicConsultaDetalhada orgaoEmissorDocumentoViajante(String orgaoEmissorDocumentoViajante) {
    this.orgaoEmissorDocumentoViajante = orgaoEmissorDocumentoViajante;
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

  public DsicConsultaDetalhada outrasInfosServico(List<InfoManuseioConsultaDetalhada> outrasInfosServico) {
    this.outrasInfosServico = outrasInfosServico;
    return this;
  }

  public DsicConsultaDetalhada addOutrasInfosServicoItem(InfoManuseioConsultaDetalhada outrasInfosServicoItem) {
    this.outrasInfosServico.add(outrasInfosServicoItem);
    return this;
  }

 /**
   * Lista contendo as partes da carga&lt;br/&gt;
   * @return partesEstoque
  **/
  @JsonProperty("partesEstoque")
  public List<EstoqueConsultaDetalhada> getPartesEstoque() {
    return partesEstoque;
  }

  public void setPartesEstoque(List<EstoqueConsultaDetalhada> partesEstoque) {
    this.partesEstoque = partesEstoque;
  }

  public DsicConsultaDetalhada partesEstoque(List<EstoqueConsultaDetalhada> partesEstoque) {
    this.partesEstoque = partesEstoque;
    return this;
  }

  public DsicConsultaDetalhada addPartesEstoqueItem(EstoqueConsultaDetalhada partesEstoqueItem) {
    this.partesEstoque.add(partesEstoqueItem);
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoBruto
  **/
  @JsonProperty("pesoBruto")
  public BigDecimal getPesoBruto() {
    return pesoBruto;
  }

  public void setPesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
  }

  public DsicConsultaDetalhada pesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidadeVolumes
  **/
  @JsonProperty("quantidadeVolumes")
  public Integer getQuantidadeVolumes() {
    return quantidadeVolumes;
  }

  public void setQuantidadeVolumes(Integer quantidadeVolumes) {
    this.quantidadeVolumes = quantidadeVolumes;
  }

  public DsicConsultaDetalhada quantidadeVolumes(Integer quantidadeVolumes) {
    this.quantidadeVolumes = quantidadeVolumes;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro.&lt;br/&gt;Tamanho: 7&lt;br/&gt; Formato: inteiro com até 7 dígitos
   * @return recintoAduaneiroGeracaoDsic
  **/
  @JsonProperty("recintoAduaneiroGeracaoDsic")
  public String getRecintoAduaneiroGeracaoDsic() {
    return recintoAduaneiroGeracaoDsic;
  }

  public void setRecintoAduaneiroGeracaoDsic(String recintoAduaneiroGeracaoDsic) {
    this.recintoAduaneiroGeracaoDsic = recintoAduaneiroGeracaoDsic;
  }

  public DsicConsultaDetalhada recintoAduaneiroGeracaoDsic(String recintoAduaneiroGeracaoDsic) {
    this.recintoAduaneiroGeracaoDsic = recintoAduaneiroGeracaoDsic;
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

  public DsicConsultaDetalhada ruc(String ruc) {
    this.ruc = ruc;
    return this;
  }

 /**
   * Setor de lotação do fiscal responsável pela geração do DSIC&lt;br/&gt;Tamanho: 35
   * @return setorResponsavelGeracaoDsicRfb
  **/
  @JsonProperty("setorResponsavelGeracaoDsicRfb")
  public String getSetorResponsavelGeracaoDsicRfb() {
    return setorResponsavelGeracaoDsicRfb;
  }

  public void setSetorResponsavelGeracaoDsicRfb(String setorResponsavelGeracaoDsicRfb) {
    this.setorResponsavelGeracaoDsicRfb = setorResponsavelGeracaoDsicRfb;
  }

  public DsicConsultaDetalhada setorResponsavelGeracaoDsicRfb(String setorResponsavelGeracaoDsicRfb) {
    this.setorResponsavelGeracaoDsicRfb = setorResponsavelGeracaoDsicRfb;
    return this;
  }

 /**
   * Código da situação do DSIC&lt;br&gt;Tamanho: 1&lt;br/&gt;A - Ativo &lt;br/&gt;E - Excludído&lt;br/&gt;P - Apropriado&lt;br/&gt;
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    if (situacao == null) {
      return null;
    }
    return situacao.value();
  }

  public void setSituacao(SituacaoEnum situacao) {
    this.situacao = situacao;
  }

  public DsicConsultaDetalhada situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
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

  public DsicConsultaDetalhada solicitacoesServicosEspeciais(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais) {
    this.solicitacoesServicosEspeciais = solicitacoesServicosEspeciais;
    return this;
  }

  public DsicConsultaDetalhada addSolicitacoesServicosEspeciaisItem(InfoManuseioConsultaDetalhada solicitacoesServicosEspeciaisItem) {
    this.solicitacoesServicosEspeciais.add(solicitacoesServicosEspeciaisItem);
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

  public DsicConsultaDetalhada tipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }

 /**
   * Tipo de documento do consignatário da carga&lt;br/&gt;Tamanho: 10
   * @return tipoDocumentoConsignatario
  **/
  @JsonProperty("tipoDocumentoConsignatario")
  public String getTipoDocumentoConsignatario() {
    if (tipoDocumentoConsignatario == null) {
      return null;
    }
    return tipoDocumentoConsignatario.value();
  }

  public void setTipoDocumentoConsignatario(TipoDocumentoConsignatarioEnum tipoDocumentoConsignatario) {
    this.tipoDocumentoConsignatario = tipoDocumentoConsignatario;
  }

  public DsicConsultaDetalhada tipoDocumentoConsignatario(TipoDocumentoConsignatarioEnum tipoDocumentoConsignatario) {
    this.tipoDocumentoConsignatario = tipoDocumentoConsignatario;
    return this;
  }

 /**
   * Tipo do documento dpara retenção e apreensão&lt;br/&gt;1 – Termo de retenção e guarda&lt;br/&gt;2 – Auto de infração&lt;br/&gt;
   * @return tipoDocumentoRetencaoApreensao
  **/
  @JsonProperty("tipoDocumentoRetencaoApreensao")
  public String getTipoDocumentoRetencaoApreensao() {
    if (tipoDocumentoRetencaoApreensao == null) {
      return null;
    }
    return tipoDocumentoRetencaoApreensao.value();
  }

  public void setTipoDocumentoRetencaoApreensao(TipoDocumentoRetencaoApreensaoEnum tipoDocumentoRetencaoApreensao) {
    this.tipoDocumentoRetencaoApreensao = tipoDocumentoRetencaoApreensao;
  }

  public DsicConsultaDetalhada tipoDocumentoRetencaoApreensao(TipoDocumentoRetencaoApreensaoEnum tipoDocumentoRetencaoApreensao) {
    this.tipoDocumentoRetencaoApreensao = tipoDocumentoRetencaoApreensao;
    return this;
  }

 /**
   * Tipo de documento do passageiro&lt;br/&gt;P – Passaporte&lt;br/&gt;I – Carteira de identidade&lt;br/&gt;F – CPF&lt;br/&gt;O – Outros&lt;br/&gt;N – Nenhum&lt;br/&gt;
   * @return tipoDocumentoViajante
  **/
  @JsonProperty("tipoDocumentoViajante")
  public String getTipoDocumentoViajante() {
    if (tipoDocumentoViajante == null) {
      return null;
    }
    return tipoDocumentoViajante.value();
  }

  public void setTipoDocumentoViajante(TipoDocumentoViajanteEnum tipoDocumentoViajante) {
    this.tipoDocumentoViajante = tipoDocumentoViajante;
  }

  public DsicConsultaDetalhada tipoDocumentoViajante(TipoDocumentoViajanteEnum tipoDocumentoViajante) {
    this.tipoDocumentoViajante = tipoDocumentoViajante;
    return this;
  }

 /**
   * Unidade de lotação do fiscal responsável pela geração do DSIC&lt;br/&gt;Tamanho: 8
   * @return unidadeResponsavelGeracaoDsicRfb
  **/
  @JsonProperty("unidadeResponsavelGeracaoDsicRfb")
  public String getUnidadeResponsavelGeracaoDsicRfb() {
    return unidadeResponsavelGeracaoDsicRfb;
  }

  public void setUnidadeResponsavelGeracaoDsicRfb(String unidadeResponsavelGeracaoDsicRfb) {
    this.unidadeResponsavelGeracaoDsicRfb = unidadeResponsavelGeracaoDsicRfb;
  }

  public DsicConsultaDetalhada unidadeResponsavelGeracaoDsicRfb(String unidadeResponsavelGeracaoDsicRfb) {
    this.unidadeResponsavelGeracaoDsicRfb = unidadeResponsavelGeracaoDsicRfb;
    return this;
  }

 /**
   * Código da UL de destino&lt;br/&gt; Tamanho: 7&lt;br/&gt; Formato: AAAAAAA
   * @return unidadeRfbGeracaoDsic
  **/
  @JsonProperty("unidadeRfbGeracaoDsic")
  public String getUnidadeRfbGeracaoDsic() {
    return unidadeRfbGeracaoDsic;
  }

  public void setUnidadeRfbGeracaoDsic(String unidadeRfbGeracaoDsic) {
    this.unidadeRfbGeracaoDsic = unidadeRfbGeracaoDsic;
  }

  public DsicConsultaDetalhada unidadeRfbGeracaoDsic(String unidadeRfbGeracaoDsic) {
    this.unidadeRfbGeracaoDsic = unidadeRfbGeracaoDsic;
    return this;
  }

 /**
   * Valor arbitrado pela RFB.&lt;br/&gt;Tamanho: 9,2&lt;br/&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorArbitrado
  **/
  @JsonProperty("valorArbitrado")
  public BigDecimal getValorArbitrado() {
    return valorArbitrado;
  }

  public void setValorArbitrado(BigDecimal valorArbitrado) {
    this.valorArbitrado = valorArbitrado;
  }

  public DsicConsultaDetalhada valorArbitrado(BigDecimal valorArbitrado) {
    this.valorArbitrado = valorArbitrado;
    return this;
  }

 /**
   * Get viagemAssociada
   * @return viagemAssociada
  **/
  @JsonProperty("viagemAssociada")
  public ChaveViagem getViagemAssociada() {
    return viagemAssociada;
  }

  public void setViagemAssociada(ChaveViagem viagemAssociada) {
    this.viagemAssociada = viagemAssociada;
  }

  public DsicConsultaDetalhada viagemAssociada(ChaveViagem viagemAssociada) {
    this.viagemAssociada = viagemAssociada;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DsicConsultaDetalhada {\n");
    
    sb.append("    bloqueiosAtivos: ").append(toIndentedString(bloqueiosAtivos)).append("\n");
    sb.append("    bloqueiosBaixados: ").append(toIndentedString(bloqueiosBaixados)).append("\n");
    sb.append("    chegadasTerrestres: ").append(toIndentedString(chegadasTerrestres)).append("\n");
    sb.append("    cnpjResponsavelGeracaoDsicDepositario: ").append(toIndentedString(cnpjResponsavelGeracaoDsicDepositario)).append("\n");
    sb.append("    codigoAeroportoDestinoConhecimento: ").append(toIndentedString(codigoAeroportoDestinoConhecimento)).append("\n");
    sb.append("    codigoAeroportoOrigemConhecimento: ").append(toIndentedString(codigoAeroportoOrigemConhecimento)).append("\n");
    sb.append("    conhecimentoApropriado: ").append(toIndentedString(conhecimentoApropriado)).append("\n");
    sb.append("    dataHoraEmissao: ").append(toIndentedString(dataHoraEmissao)).append("\n");
    sb.append("    descricaoMercadoria: ").append(toIndentedString(descricaoMercadoria)).append("\n");
    sb.append("    documentosSaida: ").append(toIndentedString(documentosSaida)).append("\n");
    sb.append("    identificacaoConhecimento: ").append(toIndentedString(identificacaoConhecimento)).append("\n");
    sb.append("    identificacaoDSIC: ").append(toIndentedString(identificacaoDSIC)).append("\n");
    sb.append("    identificacaoDocumentoConsignatario: ").append(toIndentedString(identificacaoDocumentoConsignatario)).append("\n");
    sb.append("    manuseiosEspeciais: ").append(toIndentedString(manuseiosEspeciais)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    nomeConsignatario: ").append(toIndentedString(nomeConsignatario)).append("\n");
    sb.append("    nomeResponsavelGeracaoDsicDepositario: ").append(toIndentedString(nomeResponsavelGeracaoDsicDepositario)).append("\n");
    sb.append("    nomeViajante: ").append(toIndentedString(nomeViajante)).append("\n");
    sb.append("    numeroAutorizacaoSobrevooDac: ").append(toIndentedString(numeroAutorizacaoSobrevooDac)).append("\n");
    sb.append("    numeroDocumentoRetencaoApreensao: ").append(toIndentedString(numeroDocumentoRetencaoApreensao)).append("\n");
    sb.append("    numeroDocumentoViajante: ").append(toIndentedString(numeroDocumentoViajante)).append("\n");
    sb.append("    observacoes: ").append(toIndentedString(observacoes)).append("\n");
    sb.append("    orgaoEmissorDocumentoViajante: ").append(toIndentedString(orgaoEmissorDocumentoViajante)).append("\n");
    sb.append("    outrasInfosServico: ").append(toIndentedString(outrasInfosServico)).append("\n");
    sb.append("    partesEstoque: ").append(toIndentedString(partesEstoque)).append("\n");
    sb.append("    pesoBruto: ").append(toIndentedString(pesoBruto)).append("\n");
    sb.append("    quantidadeVolumes: ").append(toIndentedString(quantidadeVolumes)).append("\n");
    sb.append("    recintoAduaneiroGeracaoDsic: ").append(toIndentedString(recintoAduaneiroGeracaoDsic)).append("\n");
    sb.append("    ruc: ").append(toIndentedString(ruc)).append("\n");
    sb.append("    setorResponsavelGeracaoDsicRfb: ").append(toIndentedString(setorResponsavelGeracaoDsicRfb)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    solicitacoesServicosEspeciais: ").append(toIndentedString(solicitacoesServicosEspeciais)).append("\n");
    sb.append("    tipoConhecimento: ").append(toIndentedString(tipoConhecimento)).append("\n");
    sb.append("    tipoDocumentoConsignatario: ").append(toIndentedString(tipoDocumentoConsignatario)).append("\n");
    sb.append("    tipoDocumentoRetencaoApreensao: ").append(toIndentedString(tipoDocumentoRetencaoApreensao)).append("\n");
    sb.append("    tipoDocumentoViajante: ").append(toIndentedString(tipoDocumentoViajante)).append("\n");
    sb.append("    unidadeResponsavelGeracaoDsicRfb: ").append(toIndentedString(unidadeResponsavelGeracaoDsicRfb)).append("\n");
    sb.append("    unidadeRfbGeracaoDsic: ").append(toIndentedString(unidadeRfbGeracaoDsic)).append("\n");
    sb.append("    valorArbitrado: ").append(toIndentedString(valorArbitrado)).append("\n");
    sb.append("    viagemAssociada: ").append(toIndentedString(viagemAssociada)).append("\n");
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

