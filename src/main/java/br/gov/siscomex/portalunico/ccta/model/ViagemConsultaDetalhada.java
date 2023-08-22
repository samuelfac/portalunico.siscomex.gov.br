package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.ChaveDsic;
import br.gov.siscomex.portalunico.ccta.model.ChegadaConsultaDetalhada;
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
 @XmlType(name = "ViagemConsultaDetalhada", propOrder =
    { "aeroportoPartida", "chegadas", "ciaAerea", "cnpjResponsavelManifestoVoo", "codigoVoo", "dataHoraEnvioManifestoVoo", "dataHoraPartidaEfetiva", "dataHoraPartidaPrevista", "dsicsAssociados", "identificacaoViagem", "numeroUnicoViagemIntermodal", "prefixoAeronaveManifestoVoo", "situacaoViagem"
})

@XmlRootElement(name="ViagemConsultaDetalhada")
public class ViagemConsultaDetalhada  {
  
  @XmlElement(name="aeroportoPartida")
  @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto<br/>Tamanho: 3")
 /**
   * Código IATA do aeroporto<br/>Tamanho: 3
  **/
  private String aeroportoPartida = null;

  @XmlElement(name="chegadas")
  @ApiModelProperty(value = "Lista contendo as chegadas previstas para este manifesto<br/>")
  @Valid
 /**
   * Lista contendo as chegadas previstas para este manifesto<br/>
  **/
  private List<ChegadaConsultaDetalhada> chegadas = null;

  @XmlElement(name="ciaAerea")
  @ApiModelProperty(example = "ZZ", value = "Identificação da compania aérea<br/>Tamanho: 2<br/>")
 /**
   * Identificação da compania aérea<br/>Tamanho: 2<br/>
  **/
  private String ciaAerea = null;

  @XmlElement(name="cnpjResponsavelManifestoVoo")
  @ApiModelProperty(example = "00000000000000", value = "CNPJ do responsável pelo manifesto.<br/>Tamanho: 8<br/>Formato: NNNNNNNN ou <br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pelo manifesto.<br/>Tamanho: 8<br/>Formato: NNNNNNNN ou <br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelManifestoVoo = null;

  @XmlElement(name="codigoVoo")
  @ApiModelProperty(example = "XX9876", value = "Código do voo, formado por 2 caracteres da sigla IATA da CIA aérea e 4 caracteres do número de voo. Quando o número do voo contiver menos de 4 caracteres numéricos, são exibidos zeros à esquerda.<br/> Formato: AANNNN")
 /**
   * Código do voo, formado por 2 caracteres da sigla IATA da CIA aérea e 4 caracteres do número de voo. Quando o número do voo contiver menos de 4 caracteres numéricos, são exibidos zeros à esquerda.<br/> Formato: AANNNN
  **/
  private String codigoVoo = null;

  @XmlElement(name="dataHoraEnvioManifestoVoo")
  @ApiModelProperty(example = "2020-08-07T15:45:38-03:00", value = "Data/Hora do envio do manifesto.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora do envio do manifesto.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataHoraEnvioManifestoVoo = null;

  @XmlElement(name="dataHoraPartidaEfetiva")
  @ApiModelProperty(example = "2020-08-07T15:45:38-03:00", value = "Data e hora da partida efetiva<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data e hora da partida efetiva<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataHoraPartidaEfetiva = null;

  @XmlElement(name="dataHoraPartidaPrevista")
  @ApiModelProperty(example = "2020-08-07T15:45:38-03:00", value = "Data e hora da partida prevista<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data e hora da partida prevista<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataHoraPartidaPrevista = null;

  @XmlElement(name="dsicsAssociados")
  @ApiModelProperty(value = "Lista contendo os Dsics associados a este manifesto<br/>")
  @Valid
 /**
   * Lista contendo os Dsics associados a este manifesto<br/>
  **/
  private List<ChaveDsic> dsicsAssociados = null;

  @XmlElement(name="identificacaoViagem")
  @ApiModelProperty(example = "XX099020200922MIA", value = "Número de identificação do manifesto<br/>Tamanho: 17")
 /**
   * Número de identificação do manifesto<br/>Tamanho: 17
  **/
  private String identificacaoViagem = null;

  @XmlElement(name="numeroUnicoViagemIntermodal")
  @ApiModelProperty(example = "220000000000001", value = "Número Único de Viagem Intermodal<br/>Tamanho: 15<br/>NNNNNNNNNNNNNNN<br>Composição: <br/>Modal: 1 (aquaviário), 2 (aéreo), 3 (terrestre) <br/>Ano: 2 dígitos (XX) <br/>Sequencial: 11 dígitos (XXXXXXXXXXX) <br/>DV: X")
 /**
   * Número Único de Viagem Intermodal<br/>Tamanho: 15<br/>NNNNNNNNNNNNNNN<br>Composição: <br/>Modal: 1 (aquaviário), 2 (aéreo), 3 (terrestre) <br/>Ano: 2 dígitos (XX) <br/>Sequencial: 11 dígitos (XXXXXXXXXXX) <br/>DV: X
  **/
  private String numeroUnicoViagemIntermodal = null;

  @XmlElement(name="prefixoAeronaveManifestoVoo")
  @ApiModelProperty(example = "N659UA", value = "Prefixo da aeronave<br/>Tamanho máximo: 70")
 /**
   * Prefixo da aeronave<br/>Tamanho máximo: 70
  **/
  private String prefixoAeronaveManifestoVoo = null;

  @XmlElement(name="situacaoViagem")
  @ApiModelProperty(example = "A", value = "Código da situação da viagem<br>Tamanho: 1<br/>A - Ativa <br/>C - Cancelada<br/>")
 /**
   * Código da situação da viagem<br>Tamanho: 1<br/>A - Ativa <br/>C - Cancelada<br/>
  **/
  private String situacaoViagem = null;
 /**
   * Código IATA do aeroporto&lt;br/&gt;Tamanho: 3
   * @return aeroportoPartida
  **/
  @JsonProperty("aeroportoPartida")
  public String getAeroportoPartida() {
    return aeroportoPartida;
  }

  public void setAeroportoPartida(String aeroportoPartida) {
    this.aeroportoPartida = aeroportoPartida;
  }

  public ViagemConsultaDetalhada aeroportoPartida(String aeroportoPartida) {
    this.aeroportoPartida = aeroportoPartida;
    return this;
  }

 /**
   * Lista contendo as chegadas previstas para este manifesto&lt;br/&gt;
   * @return chegadas
  **/
  @JsonProperty("chegadas")
  public List<ChegadaConsultaDetalhada> getChegadas() {
    return chegadas;
  }

  public void setChegadas(List<ChegadaConsultaDetalhada> chegadas) {
    this.chegadas = chegadas;
  }

  public ViagemConsultaDetalhada chegadas(List<ChegadaConsultaDetalhada> chegadas) {
    this.chegadas = chegadas;
    return this;
  }

  public ViagemConsultaDetalhada addChegadasItem(ChegadaConsultaDetalhada chegadasItem) {
    this.chegadas.add(chegadasItem);
    return this;
  }

 /**
   * Identificação da compania aérea&lt;br/&gt;Tamanho: 2&lt;br/&gt;
   * @return ciaAerea
  **/
  @JsonProperty("ciaAerea")
  public String getCiaAerea() {
    return ciaAerea;
  }

  public void setCiaAerea(String ciaAerea) {
    this.ciaAerea = ciaAerea;
  }

  public ViagemConsultaDetalhada ciaAerea(String ciaAerea) {
    this.ciaAerea = ciaAerea;
    return this;
  }

 /**
   * CNPJ do responsável pelo manifesto.&lt;br/&gt;Tamanho: 8&lt;br/&gt;Formato: NNNNNNNN ou &lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelManifestoVoo
  **/
  @JsonProperty("cnpjResponsavelManifestoVoo")
  public String getCnpjResponsavelManifestoVoo() {
    return cnpjResponsavelManifestoVoo;
  }

  public void setCnpjResponsavelManifestoVoo(String cnpjResponsavelManifestoVoo) {
    this.cnpjResponsavelManifestoVoo = cnpjResponsavelManifestoVoo;
  }

  public ViagemConsultaDetalhada cnpjResponsavelManifestoVoo(String cnpjResponsavelManifestoVoo) {
    this.cnpjResponsavelManifestoVoo = cnpjResponsavelManifestoVoo;
    return this;
  }

 /**
   * Código do voo, formado por 2 caracteres da sigla IATA da CIA aérea e 4 caracteres do número de voo. Quando o número do voo contiver menos de 4 caracteres numéricos, são exibidos zeros à esquerda.&lt;br/&gt; Formato: AANNNN
   * @return codigoVoo
  **/
  @JsonProperty("codigoVoo")
  public String getCodigoVoo() {
    return codigoVoo;
  }

  public void setCodigoVoo(String codigoVoo) {
    this.codigoVoo = codigoVoo;
  }

  public ViagemConsultaDetalhada codigoVoo(String codigoVoo) {
    this.codigoVoo = codigoVoo;
    return this;
  }

 /**
   * Data/Hora do envio do manifesto.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraEnvioManifestoVoo
  **/
  @JsonProperty("dataHoraEnvioManifestoVoo")
  public String getDataHoraEnvioManifestoVoo() {
    return dataHoraEnvioManifestoVoo;
  }

  public void setDataHoraEnvioManifestoVoo(String dataHoraEnvioManifestoVoo) {
    this.dataHoraEnvioManifestoVoo = dataHoraEnvioManifestoVoo;
  }

  public ViagemConsultaDetalhada dataHoraEnvioManifestoVoo(String dataHoraEnvioManifestoVoo) {
    this.dataHoraEnvioManifestoVoo = dataHoraEnvioManifestoVoo;
    return this;
  }

 /**
   * Data e hora da partida efetiva&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraPartidaEfetiva
  **/
  @JsonProperty("dataHoraPartidaEfetiva")
  public String getDataHoraPartidaEfetiva() {
    return dataHoraPartidaEfetiva;
  }

  public void setDataHoraPartidaEfetiva(String dataHoraPartidaEfetiva) {
    this.dataHoraPartidaEfetiva = dataHoraPartidaEfetiva;
  }

  public ViagemConsultaDetalhada dataHoraPartidaEfetiva(String dataHoraPartidaEfetiva) {
    this.dataHoraPartidaEfetiva = dataHoraPartidaEfetiva;
    return this;
  }

 /**
   * Data e hora da partida prevista&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraPartidaPrevista
  **/
  @JsonProperty("dataHoraPartidaPrevista")
  public String getDataHoraPartidaPrevista() {
    return dataHoraPartidaPrevista;
  }

  public void setDataHoraPartidaPrevista(String dataHoraPartidaPrevista) {
    this.dataHoraPartidaPrevista = dataHoraPartidaPrevista;
  }

  public ViagemConsultaDetalhada dataHoraPartidaPrevista(String dataHoraPartidaPrevista) {
    this.dataHoraPartidaPrevista = dataHoraPartidaPrevista;
    return this;
  }

 /**
   * Lista contendo os Dsics associados a este manifesto&lt;br/&gt;
   * @return dsicsAssociados
  **/
  @JsonProperty("dsicsAssociados")
  public List<ChaveDsic> getDsicsAssociados() {
    return dsicsAssociados;
  }

  public void setDsicsAssociados(List<ChaveDsic> dsicsAssociados) {
    this.dsicsAssociados = dsicsAssociados;
  }

  public ViagemConsultaDetalhada dsicsAssociados(List<ChaveDsic> dsicsAssociados) {
    this.dsicsAssociados = dsicsAssociados;
    return this;
  }

  public ViagemConsultaDetalhada addDsicsAssociadosItem(ChaveDsic dsicsAssociadosItem) {
    this.dsicsAssociados.add(dsicsAssociadosItem);
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

  public ViagemConsultaDetalhada identificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
    return this;
  }

 /**
   * Número Único de Viagem Intermodal&lt;br/&gt;Tamanho: 15&lt;br/&gt;NNNNNNNNNNNNNNN&lt;br&gt;Composição: &lt;br/&gt;Modal: 1 (aquaviário), 2 (aéreo), 3 (terrestre) &lt;br/&gt;Ano: 2 dígitos (XX) &lt;br/&gt;Sequencial: 11 dígitos (XXXXXXXXXXX) &lt;br/&gt;DV: X
   * @return numeroUnicoViagemIntermodal
  **/
  @JsonProperty("numeroUnicoViagemIntermodal")
  public String getNumeroUnicoViagemIntermodal() {
    return numeroUnicoViagemIntermodal;
  }

  public void setNumeroUnicoViagemIntermodal(String numeroUnicoViagemIntermodal) {
    this.numeroUnicoViagemIntermodal = numeroUnicoViagemIntermodal;
  }

  public ViagemConsultaDetalhada numeroUnicoViagemIntermodal(String numeroUnicoViagemIntermodal) {
    this.numeroUnicoViagemIntermodal = numeroUnicoViagemIntermodal;
    return this;
  }

 /**
   * Prefixo da aeronave&lt;br/&gt;Tamanho máximo: 70
   * @return prefixoAeronaveManifestoVoo
  **/
  @JsonProperty("prefixoAeronaveManifestoVoo")
  public String getPrefixoAeronaveManifestoVoo() {
    return prefixoAeronaveManifestoVoo;
  }

  public void setPrefixoAeronaveManifestoVoo(String prefixoAeronaveManifestoVoo) {
    this.prefixoAeronaveManifestoVoo = prefixoAeronaveManifestoVoo;
  }

  public ViagemConsultaDetalhada prefixoAeronaveManifestoVoo(String prefixoAeronaveManifestoVoo) {
    this.prefixoAeronaveManifestoVoo = prefixoAeronaveManifestoVoo;
    return this;
  }

 /**
   * Código da situação da viagem&lt;br&gt;Tamanho: 1&lt;br/&gt;A - Ativa &lt;br/&gt;C - Cancelada&lt;br/&gt;
   * @return situacaoViagem
  **/
  @JsonProperty("situacaoViagem")
  public String getSituacaoViagem() {
    return situacaoViagem;
  }

  public void setSituacaoViagem(String situacaoViagem) {
    this.situacaoViagem = situacaoViagem;
  }

  public ViagemConsultaDetalhada situacaoViagem(String situacaoViagem) {
    this.situacaoViagem = situacaoViagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViagemConsultaDetalhada {\n");
    
    sb.append("    aeroportoPartida: ").append(toIndentedString(aeroportoPartida)).append("\n");
    sb.append("    chegadas: ").append(toIndentedString(chegadas)).append("\n");
    sb.append("    ciaAerea: ").append(toIndentedString(ciaAerea)).append("\n");
    sb.append("    cnpjResponsavelManifestoVoo: ").append(toIndentedString(cnpjResponsavelManifestoVoo)).append("\n");
    sb.append("    codigoVoo: ").append(toIndentedString(codigoVoo)).append("\n");
    sb.append("    dataHoraEnvioManifestoVoo: ").append(toIndentedString(dataHoraEnvioManifestoVoo)).append("\n");
    sb.append("    dataHoraPartidaEfetiva: ").append(toIndentedString(dataHoraPartidaEfetiva)).append("\n");
    sb.append("    dataHoraPartidaPrevista: ").append(toIndentedString(dataHoraPartidaPrevista)).append("\n");
    sb.append("    dsicsAssociados: ").append(toIndentedString(dsicsAssociados)).append("\n");
    sb.append("    identificacaoViagem: ").append(toIndentedString(identificacaoViagem)).append("\n");
    sb.append("    numeroUnicoViagemIntermodal: ").append(toIndentedString(numeroUnicoViagemIntermodal)).append("\n");
    sb.append("    prefixoAeronaveManifestoVoo: ").append(toIndentedString(prefixoAeronaveManifestoVoo)).append("\n");
    sb.append("    situacaoViagem: ").append(toIndentedString(situacaoViagem)).append("\n");
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

