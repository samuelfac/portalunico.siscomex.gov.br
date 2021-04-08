package br.gov.siscomex.portalunico.due.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DUEResumida", propOrder =
    { "codigoRecintoAduaneiroDespacho", "codigoRecintoAduaneiroEmbarque", "controleAdministrativo", "dataSituacaoDUE", "declarante", "exportadores", "indicadorBloqueio", "latitudeDespacho", "longitudeDespacho", "numeroDUE", "numeroRUC", "responsavelUADespacho", "situacaoCarga", "situacaoDUE", "uaDespacho", "uaEmbarque"
})

@XmlRootElement(name="DUEResumida")
public class DUEResumida  {
  
  @XmlElement(name="codigoRecintoAduaneiroDespacho")
  @ApiModelProperty(example = "8911101", value = "Código do recinto aduaneiro de despacho<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Código do recinto aduaneiro de despacho<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String codigoRecintoAduaneiroDespacho = null;

  @XmlElement(name="codigoRecintoAduaneiroEmbarque")
  @ApiModelProperty(example = "7911101", value = "Código do recinto aduaneiro de embarque<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Código do recinto aduaneiro de embarque<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String codigoRecintoAduaneiroEmbarque = null;

  @XmlElement(name="controleAdministrativo")
  @ApiModelProperty(value = "Controle Administrativo<br />Domínio: <br />1 = Deferido<br /> 2 = Dispensado<br />3 = Pendente<br />4 = Em processamento<br />5 = Impedido")
 /**
   * Controle Administrativo<br />Domínio: <br />1 = Deferido<br /> 2 = Dispensado<br />3 = Pendente<br />4 = Em processamento<br />5 = Impedido
  **/
  private Integer controleAdministrativo = null;

  @XmlElement(name="dataSituacaoDUE")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data da situação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data da situação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private String dataSituacaoDUE = null;

  @XmlElement(name="declarante")
  @ApiModelProperty(value = "")
  @Valid
  private Declarante declarante = null;

  @XmlElement(name="exportadores")
  @ApiModelProperty(value = "")
  @Valid
  private List<Exportador> exportadores = null;

  @XmlElement(name="indicadorBloqueio")
  @ApiModelProperty(value = "Indicador de bloqueio<br />Domínio: <br />1 = Bloqueado<br />2 = Desbloqueado")
 /**
   * Indicador de bloqueio<br />Domínio: <br />1 = Bloqueado<br />2 = Desbloqueado
  **/
  private Integer indicadorBloqueio = null;

  @XmlElement(name="latitudeDespacho")
  @ApiModelProperty(value = "Latitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Latitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String latitudeDespacho = null;

  @XmlElement(name="longitudeDespacho")
  @ApiModelProperty(value = "Latitude do Local de embarque<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Latitude do Local de embarque<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String longitudeDespacho = null;

  @XmlElement(name="numeroDUE")
  @ApiModelProperty(example = "19BR0000056196", value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'")
 /**
   * Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'
  **/
  private String numeroDUE = null;

  @XmlElement(name="numeroRUC")
  @ApiModelProperty(example = "9BR00000000100000000000000000023366", value = "RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'")
 /**
   * RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'
  **/
  private String numeroRUC = null;

  @XmlElement(name="responsavelUADespacho")
  @ApiModelProperty(value = "Responsável pela Unidade Aduaneira do Despacho<br />Tamanho mínimo: 1<br />Tamanho máximo: 14")
 /**
   * Responsável pela Unidade Aduaneira do Despacho<br />Tamanho mínimo: 1<br />Tamanho máximo: 14
  **/
  private String responsavelUADespacho = null;

  @XmlElement(name="situacaoCarga")
  @ApiModelProperty(value = "Situação da Carga<br />Domínio: <br />1 = Estocada<br />2 = Em Trânsito<br />3 = Carga Completamente Exportada")
 /**
   * Situação da Carga<br />Domínio: <br />1 = Estocada<br />2 = Em Trânsito<br />3 = Carga Completamente Exportada
  **/
  private List<Integer> situacaoCarga = null;

  @XmlElement(name="situacaoDUE")
  @ApiModelProperty(value = "Situação<br />Domínio: <br />1 = Em elaboração<br /> 10 = Registrada<br />11 = Declaração apresentada para despacho<br /> 15 = ACD em processamento<br />20 = Liberada sem conferência aduaneira<br /> 21 = Selecionada para conferência aduaneira<br />24 = Embarque antecipado pendente de LPCO<br /> 25 = Embarque antecipado autorizado<br />26 = Embarque antecipado pendente de autorização<br /> 30 = Em análise fiscal<br />35 = Concluída análise fiscal<br /> 36 = Desembaraço pendente de LPCO<br /> 40 = Desembaraçada<br />70 = Averbada<br /> 80 = Cancelada pelo exportador<br /> 81 = Cancelada por expiração de prazo<br />82 = Cancelada pela RFB<br /> 83 = Cancelada pela RFB a pedido do exportador<br /> 86 = Interrompida")
 /**
   * Situação<br />Domínio: <br />1 = Em elaboração<br /> 10 = Registrada<br />11 = Declaração apresentada para despacho<br /> 15 = ACD em processamento<br />20 = Liberada sem conferência aduaneira<br /> 21 = Selecionada para conferência aduaneira<br />24 = Embarque antecipado pendente de LPCO<br /> 25 = Embarque antecipado autorizado<br />26 = Embarque antecipado pendente de autorização<br /> 30 = Em análise fiscal<br />35 = Concluída análise fiscal<br /> 36 = Desembaraço pendente de LPCO<br /> 40 = Desembaraçada<br />70 = Averbada<br /> 80 = Cancelada pelo exportador<br /> 81 = Cancelada por expiração de prazo<br />82 = Cancelada pela RFB<br /> 83 = Cancelada pela RFB a pedido do exportador<br /> 86 = Interrompida
  **/
  private Integer situacaoDUE = null;

  @XmlElement(name="uaDespacho")
  @ApiModelProperty(example = "0317900", value = "Unidade aduaneira de despacho<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Unidade aduaneira de despacho<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String uaDespacho = null;

  @XmlElement(name="uaEmbarque")
  @ApiModelProperty(example = "0317900", value = "Unidade aduaneira de Embarque<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Unidade aduaneira de Embarque<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String uaEmbarque = null;
 /**
   * Código do recinto aduaneiro de despacho&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return codigoRecintoAduaneiroDespacho
  **/
  @JsonProperty("codigoRecintoAduaneiroDespacho")
  public String getCodigoRecintoAduaneiroDespacho() {
    return codigoRecintoAduaneiroDespacho;
  }

  public void setCodigoRecintoAduaneiroDespacho(String codigoRecintoAduaneiroDespacho) {
    this.codigoRecintoAduaneiroDespacho = codigoRecintoAduaneiroDespacho;
  }

  public DUEResumida codigoRecintoAduaneiroDespacho(String codigoRecintoAduaneiroDespacho) {
    this.codigoRecintoAduaneiroDespacho = codigoRecintoAduaneiroDespacho;
    return this;
  }

 /**
   * Código do recinto aduaneiro de embarque&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return codigoRecintoAduaneiroEmbarque
  **/
  @JsonProperty("codigoRecintoAduaneiroEmbarque")
  public String getCodigoRecintoAduaneiroEmbarque() {
    return codigoRecintoAduaneiroEmbarque;
  }

  public void setCodigoRecintoAduaneiroEmbarque(String codigoRecintoAduaneiroEmbarque) {
    this.codigoRecintoAduaneiroEmbarque = codigoRecintoAduaneiroEmbarque;
  }

  public DUEResumida codigoRecintoAduaneiroEmbarque(String codigoRecintoAduaneiroEmbarque) {
    this.codigoRecintoAduaneiroEmbarque = codigoRecintoAduaneiroEmbarque;
    return this;
  }

 /**
   * Controle Administrativo&lt;br /&gt;Domínio: &lt;br /&gt;1 &#x3D; Deferido&lt;br /&gt; 2 &#x3D; Dispensado&lt;br /&gt;3 &#x3D; Pendente&lt;br /&gt;4 &#x3D; Em processamento&lt;br /&gt;5 &#x3D; Impedido
   * @return controleAdministrativo
  **/
  @JsonProperty("controleAdministrativo")
  public Integer getControleAdministrativo() {
    return controleAdministrativo;
  }

  public void setControleAdministrativo(Integer controleAdministrativo) {
    this.controleAdministrativo = controleAdministrativo;
  }

  public DUEResumida controleAdministrativo(Integer controleAdministrativo) {
    this.controleAdministrativo = controleAdministrativo;
    return this;
  }

 /**
   * Data da situação&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataSituacaoDUE
  **/
  @JsonProperty("dataSituacaoDUE")
  public String getDataSituacaoDUE() {
    return dataSituacaoDUE;
  }

  public void setDataSituacaoDUE(String dataSituacaoDUE) {
    this.dataSituacaoDUE = dataSituacaoDUE;
  }

  public DUEResumida dataSituacaoDUE(String dataSituacaoDUE) {
    this.dataSituacaoDUE = dataSituacaoDUE;
    return this;
  }

 /**
   * Get declarante
   * @return declarante
  **/
  @JsonProperty("declarante")
  public Declarante getDeclarante() {
    return declarante;
  }

  public void setDeclarante(Declarante declarante) {
    this.declarante = declarante;
  }

  public DUEResumida declarante(Declarante declarante) {
    this.declarante = declarante;
    return this;
  }

 /**
   * Get exportadores
   * @return exportadores
  **/
  @JsonProperty("exportadores")
  public List<Exportador> getExportadores() {
    return exportadores;
  }

  public void setExportadores(List<Exportador> exportadores) {
    this.exportadores = exportadores;
  }

  public DUEResumida exportadores(List<Exportador> exportadores) {
    this.exportadores = exportadores;
    return this;
  }

  public DUEResumida addExportadoresItem(Exportador exportadoresItem) {
    this.exportadores.add(exportadoresItem);
    return this;
  }

 /**
   * Indicador de bloqueio&lt;br /&gt;Domínio: &lt;br /&gt;1 &#x3D; Bloqueado&lt;br /&gt;2 &#x3D; Desbloqueado
   * @return indicadorBloqueio
  **/
  @JsonProperty("indicadorBloqueio")
  public Integer getIndicadorBloqueio() {
    return indicadorBloqueio;
  }

  public void setIndicadorBloqueio(Integer indicadorBloqueio) {
    this.indicadorBloqueio = indicadorBloqueio;
  }

  public DUEResumida indicadorBloqueio(Integer indicadorBloqueio) {
    this.indicadorBloqueio = indicadorBloqueio;
    return this;
  }

 /**
   * Latitude do Local de Despacho&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return latitudeDespacho
  **/
  @JsonProperty("latitudeDespacho")
  public String getLatitudeDespacho() {
    return latitudeDespacho;
  }

  public void setLatitudeDespacho(String latitudeDespacho) {
    this.latitudeDespacho = latitudeDespacho;
  }

  public DUEResumida latitudeDespacho(String latitudeDespacho) {
    this.latitudeDespacho = latitudeDespacho;
    return this;
  }

 /**
   * Latitude do Local de embarque&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return longitudeDespacho
  **/
  @JsonProperty("longitudeDespacho")
  public String getLongitudeDespacho() {
    return longitudeDespacho;
  }

  public void setLongitudeDespacho(String longitudeDespacho) {
    this.longitudeDespacho = longitudeDespacho;
  }

  public DUEResumida longitudeDespacho(String longitudeDespacho) {
    this.longitudeDespacho = longitudeDespacho;
    return this;
  }

 /**
   * Número da DUE&lt;br /&gt;Tamanho: 14&lt;br /&gt;Formato: &#39;NNAANNNNNNNNNN&#39;
   * @return numeroDUE
  **/
  @JsonProperty("numeroDUE")
  public String getNumeroDUE() {
    return numeroDUE;
  }

  public void setNumeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
  }

  public DUEResumida numeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
    return this;
  }

 /**
   * RUC - Número da referência única de carga&lt;br /&gt;Tamanho: 35&lt;br /&gt;Formato: &#39;NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&#39;
   * @return numeroRUC
  **/
  @JsonProperty("numeroRUC")
  public String getNumeroRUC() {
    return numeroRUC;
  }

  public void setNumeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
  }

  public DUEResumida numeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
    return this;
  }

 /**
   * Responsável pela Unidade Aduaneira do Despacho&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 14
   * @return responsavelUADespacho
  **/
  @JsonProperty("responsavelUADespacho")
  public String getResponsavelUADespacho() {
    return responsavelUADespacho;
  }

  public void setResponsavelUADespacho(String responsavelUADespacho) {
    this.responsavelUADespacho = responsavelUADespacho;
  }

  public DUEResumida responsavelUADespacho(String responsavelUADespacho) {
    this.responsavelUADespacho = responsavelUADespacho;
    return this;
  }

 /**
   * Situação da Carga&lt;br /&gt;Domínio: &lt;br /&gt;1 &#x3D; Estocada&lt;br /&gt;2 &#x3D; Em Trânsito&lt;br /&gt;3 &#x3D; Carga Completamente Exportada
   * @return situacaoCarga
  **/
  @JsonProperty("situacaoCarga")
  public List<Integer> getSituacaoCarga() {
    return situacaoCarga;
  }

  public void setSituacaoCarga(List<Integer> situacaoCarga) {
    this.situacaoCarga = situacaoCarga;
  }

  public DUEResumida situacaoCarga(List<Integer> situacaoCarga) {
    this.situacaoCarga = situacaoCarga;
    return this;
  }

  public DUEResumida addSituacaoCargaItem(Integer situacaoCargaItem) {
    this.situacaoCarga.add(situacaoCargaItem);
    return this;
  }

 /**
   * Situação&lt;br /&gt;Domínio: &lt;br /&gt;1 &#x3D; Em elaboração&lt;br /&gt; 10 &#x3D; Registrada&lt;br /&gt;11 &#x3D; Declaração apresentada para despacho&lt;br /&gt; 15 &#x3D; ACD em processamento&lt;br /&gt;20 &#x3D; Liberada sem conferência aduaneira&lt;br /&gt; 21 &#x3D; Selecionada para conferência aduaneira&lt;br /&gt;24 &#x3D; Embarque antecipado pendente de LPCO&lt;br /&gt; 25 &#x3D; Embarque antecipado autorizado&lt;br /&gt;26 &#x3D; Embarque antecipado pendente de autorização&lt;br /&gt; 30 &#x3D; Em análise fiscal&lt;br /&gt;35 &#x3D; Concluída análise fiscal&lt;br /&gt; 36 &#x3D; Desembaraço pendente de LPCO&lt;br /&gt; 40 &#x3D; Desembaraçada&lt;br /&gt;70 &#x3D; Averbada&lt;br /&gt; 80 &#x3D; Cancelada pelo exportador&lt;br /&gt; 81 &#x3D; Cancelada por expiração de prazo&lt;br /&gt;82 &#x3D; Cancelada pela RFB&lt;br /&gt; 83 &#x3D; Cancelada pela RFB a pedido do exportador&lt;br /&gt; 86 &#x3D; Interrompida
   * @return situacaoDUE
  **/
  @JsonProperty("situacaoDUE")
  public Integer getSituacaoDUE() {
    return situacaoDUE;
  }

  public void setSituacaoDUE(Integer situacaoDUE) {
    this.situacaoDUE = situacaoDUE;
  }

  public DUEResumida situacaoDUE(Integer situacaoDUE) {
    this.situacaoDUE = situacaoDUE;
    return this;
  }

 /**
   * Unidade aduaneira de despacho&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return uaDespacho
  **/
  @JsonProperty("uaDespacho")
  public String getUaDespacho() {
    return uaDespacho;
  }

  public void setUaDespacho(String uaDespacho) {
    this.uaDespacho = uaDespacho;
  }

  public DUEResumida uaDespacho(String uaDespacho) {
    this.uaDespacho = uaDespacho;
    return this;
  }

 /**
   * Unidade aduaneira de Embarque&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return uaEmbarque
  **/
  @JsonProperty("uaEmbarque")
  public String getUaEmbarque() {
    return uaEmbarque;
  }

  public void setUaEmbarque(String uaEmbarque) {
    this.uaEmbarque = uaEmbarque;
  }

  public DUEResumida uaEmbarque(String uaEmbarque) {
    this.uaEmbarque = uaEmbarque;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DUEResumida {\n");
    
    sb.append("    codigoRecintoAduaneiroDespacho: ").append(toIndentedString(codigoRecintoAduaneiroDespacho)).append("\n");
    sb.append("    codigoRecintoAduaneiroEmbarque: ").append(toIndentedString(codigoRecintoAduaneiroEmbarque)).append("\n");
    sb.append("    controleAdministrativo: ").append(toIndentedString(controleAdministrativo)).append("\n");
    sb.append("    dataSituacaoDUE: ").append(toIndentedString(dataSituacaoDUE)).append("\n");
    sb.append("    declarante: ").append(toIndentedString(declarante)).append("\n");
    sb.append("    exportadores: ").append(toIndentedString(exportadores)).append("\n");
    sb.append("    indicadorBloqueio: ").append(toIndentedString(indicadorBloqueio)).append("\n");
    sb.append("    latitudeDespacho: ").append(toIndentedString(latitudeDespacho)).append("\n");
    sb.append("    longitudeDespacho: ").append(toIndentedString(longitudeDespacho)).append("\n");
    sb.append("    numeroDUE: ").append(toIndentedString(numeroDUE)).append("\n");
    sb.append("    numeroRUC: ").append(toIndentedString(numeroRUC)).append("\n");
    sb.append("    responsavelUADespacho: ").append(toIndentedString(responsavelUADespacho)).append("\n");
    sb.append("    situacaoCarga: ").append(toIndentedString(situacaoCarga)).append("\n");
    sb.append("    situacaoDUE: ").append(toIndentedString(situacaoDUE)).append("\n");
    sb.append("    uaDespacho: ").append(toIndentedString(uaDespacho)).append("\n");
    sb.append("    uaEmbarque: ").append(toIndentedString(uaEmbarque)).append("\n");
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

