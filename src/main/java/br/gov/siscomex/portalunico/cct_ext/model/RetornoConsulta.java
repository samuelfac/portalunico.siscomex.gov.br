package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetornoConsulta", propOrder =
    { "numeroRUC", "numeroDUE", "ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado", "existeImpedimentoEmbarque", "indicadorSeCargaRUCMaster", "numeroRUCMasterDaCarga", "conteineres", "documentosDeTransporte", "listaCargasSoltasVeiculos", "listaGraneis"
})

@XmlRootElement(name="RetornoConsulta")
/**
  * Retorno da Consulta
 **/
@ApiModel(description="Retorno da Consulta")
public class RetornoConsulta  {
  
  @XmlElement(name="numeroRUC")
  @ApiModelProperty(example = "6BR00000000100000000000000000003477", value = "Número RUC<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Número RUC<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numeroRUC = null;

  @XmlElement(name="numeroDUE")
  @ApiModelProperty(example = "16BR0000044309", value = "Número DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Número Sequencial<br>D - DV")
 /**
   * Número DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Número Sequencial<br>D - DV
  **/
  private String numeroDUE = null;

  @XmlElement(name="ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado")
  @ApiModelProperty(example = "false", value = "Ocorreu desembaraço ou autorização embarque antecipado<br>Domínio:  S (Sim), N (Não)")
 /**
   * Ocorreu desembaraço ou autorização embarque antecipado<br>Domínio:  S (Sim), N (Não)
  **/
  private Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado = false;

  @XmlElement(name="existeImpedimentoEmbarque")
  @ApiModelProperty(example = "false", value = "Existe Impedimento Embarque<br>Domínio:  S (Sim), N (Não)")
 /**
   * Existe Impedimento Embarque<br>Domínio:  S (Sim), N (Não)
  **/
  private Boolean existeImpedimentoEmbarque = false;

  @XmlElement(name="indicadorSeCargaRUCMaster")
  @ApiModelProperty(example = "false", value = "Indicador se carga RUC Master<br>Domínio:  S (Sim), N (Não)")
 /**
   * Indicador se carga RUC Master<br>Domínio:  S (Sim), N (Não)
  **/
  private Boolean indicadorSeCargaRUCMaster = false;

  @XmlElement(name="numeroRUCMasterDaCarga")
  @ApiModelProperty(example = "6BR00000000100000000000000000003475", value = "Número RUC Master da carga<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Número RUC Master da carga<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numeroRUCMasterDaCarga = null;

  @XmlElement(name="conteineres")
  @ApiModelProperty(example = "[MARK016,MARK017]", value = "Contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")
 /**
   * Contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA
  **/
  private List<String> conteineres = null;

  @XmlElement(name="documentosDeTransporte")
  @ApiModelProperty(value = "Número documento de transporte<br>Tamanho mínimo: 5<br>Tamanho máximo: 15")
  @Valid
 /**
   * Número documento de transporte<br>Tamanho mínimo: 5<br>Tamanho máximo: 15
  **/
  private List<DocumentosTransporte> documentosDeTransporte = null;

  @XmlElement(name="listaCargasSoltasVeiculos")
  @ApiModelProperty(value = "")
  @Valid
  private List<DadosCargaSoltaVeiculo> listaCargasSoltasVeiculos = null;

  @XmlElement(name="listaGraneis")
  @ApiModelProperty(value = "")
  @Valid
  private List<DadosGranel> listaGraneis = null;
 /**
   * Número RUC&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numeroRUC
  **/
  @JsonProperty("numeroRUC")
  public String getNumeroRUC() {
    return numeroRUC;
  }

  public void setNumeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
  }

  public RetornoConsulta numeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
    return this;
  }

 /**
   * Número DU-E&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD&lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Número Sequencial&lt;br&gt;D - DV
   * @return numeroDUE
  **/
  @JsonProperty("numeroDUE")
  public String getNumeroDUE() {
    return numeroDUE;
  }

  public void setNumeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
  }

  public RetornoConsulta numeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
    return this;
  }

 /**
   * Ocorreu desembaraço ou autorização embarque antecipado&lt;br&gt;Domínio:  S (Sim), N (Não)
   * @return ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado
  **/
  @JsonProperty("ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado")
  public Boolean isOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado() {
    return ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
  }

  public void setOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado(Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado) {
    this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado = ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
  }

  public RetornoConsulta ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado(Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado) {
    this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado = ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    return this;
  }

 /**
   * Existe Impedimento Embarque&lt;br&gt;Domínio:  S (Sim), N (Não)
   * @return existeImpedimentoEmbarque
  **/
  @JsonProperty("existeImpedimentoEmbarque")
  public Boolean isExisteImpedimentoEmbarque() {
    return existeImpedimentoEmbarque;
  }

  public void setExisteImpedimentoEmbarque(Boolean existeImpedimentoEmbarque) {
    this.existeImpedimentoEmbarque = existeImpedimentoEmbarque;
  }

  public RetornoConsulta existeImpedimentoEmbarque(Boolean existeImpedimentoEmbarque) {
    this.existeImpedimentoEmbarque = existeImpedimentoEmbarque;
    return this;
  }

 /**
   * Indicador se carga RUC Master&lt;br&gt;Domínio:  S (Sim), N (Não)
   * @return indicadorSeCargaRUCMaster
  **/
  @JsonProperty("indicadorSeCargaRUCMaster")
  public Boolean isIndicadorSeCargaRUCMaster() {
    return indicadorSeCargaRUCMaster;
  }

  public void setIndicadorSeCargaRUCMaster(Boolean indicadorSeCargaRUCMaster) {
    this.indicadorSeCargaRUCMaster = indicadorSeCargaRUCMaster;
  }

  public RetornoConsulta indicadorSeCargaRUCMaster(Boolean indicadorSeCargaRUCMaster) {
    this.indicadorSeCargaRUCMaster = indicadorSeCargaRUCMaster;
    return this;
  }

 /**
   * Número RUC Master da carga&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numeroRUCMasterDaCarga
  **/
  @JsonProperty("numeroRUCMasterDaCarga")
  public String getNumeroRUCMasterDaCarga() {
    return numeroRUCMasterDaCarga;
  }

  public void setNumeroRUCMasterDaCarga(String numeroRUCMasterDaCarga) {
    this.numeroRUCMasterDaCarga = numeroRUCMasterDaCarga;
  }

  public RetornoConsulta numeroRUCMasterDaCarga(String numeroRUCMasterDaCarga) {
    this.numeroRUCMasterDaCarga = numeroRUCMasterDaCarga;
    return this;
  }

 /**
   * Contêiner&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAA
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  public List<String> getConteineres() {
    return conteineres;
  }

  public void setConteineres(List<String> conteineres) {
    this.conteineres = conteineres;
  }

  public RetornoConsulta conteineres(List<String> conteineres) {
    this.conteineres = conteineres;
    return this;
  }

  public RetornoConsulta addConteineresItem(String conteineresItem) {
    this.conteineres.add(conteineresItem);
    return this;
  }

 /**
   * Número documento de transporte&lt;br&gt;Tamanho mínimo: 5&lt;br&gt;Tamanho máximo: 15
   * @return documentosDeTransporte
  **/
  @JsonProperty("documentosDeTransporte")
  public List<DocumentosTransporte> getDocumentosDeTransporte() {
    return documentosDeTransporte;
  }

  public void setDocumentosDeTransporte(List<DocumentosTransporte> documentosDeTransporte) {
    this.documentosDeTransporte = documentosDeTransporte;
  }

  public RetornoConsulta documentosDeTransporte(List<DocumentosTransporte> documentosDeTransporte) {
    this.documentosDeTransporte = documentosDeTransporte;
    return this;
  }

  public RetornoConsulta addDocumentosDeTransporteItem(DocumentosTransporte documentosDeTransporteItem) {
    this.documentosDeTransporte.add(documentosDeTransporteItem);
    return this;
  }

 /**
   * Get listaCargasSoltasVeiculos
   * @return listaCargasSoltasVeiculos
  **/
  @JsonProperty("listaCargasSoltasVeiculos")
  public List<DadosCargaSoltaVeiculo> getListaCargasSoltasVeiculos() {
    return listaCargasSoltasVeiculos;
  }

  public void setListaCargasSoltasVeiculos(List<DadosCargaSoltaVeiculo> listaCargasSoltasVeiculos) {
    this.listaCargasSoltasVeiculos = listaCargasSoltasVeiculos;
  }

  public RetornoConsulta listaCargasSoltasVeiculos(List<DadosCargaSoltaVeiculo> listaCargasSoltasVeiculos) {
    this.listaCargasSoltasVeiculos = listaCargasSoltasVeiculos;
    return this;
  }

  public RetornoConsulta addListaCargasSoltasVeiculosItem(DadosCargaSoltaVeiculo listaCargasSoltasVeiculosItem) {
    this.listaCargasSoltasVeiculos.add(listaCargasSoltasVeiculosItem);
    return this;
  }

 /**
   * Get listaGraneis
   * @return listaGraneis
  **/
  @JsonProperty("listaGraneis")
  public List<DadosGranel> getListaGraneis() {
    return listaGraneis;
  }

  public void setListaGraneis(List<DadosGranel> listaGraneis) {
    this.listaGraneis = listaGraneis;
  }

  public RetornoConsulta listaGraneis(List<DadosGranel> listaGraneis) {
    this.listaGraneis = listaGraneis;
    return this;
  }

  public RetornoConsulta addListaGraneisItem(DadosGranel listaGraneisItem) {
    this.listaGraneis.add(listaGraneisItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsulta {\n");
    
    sb.append("    numeroRUC: ").append(toIndentedString(numeroRUC)).append("\n");
    sb.append("    numeroDUE: ").append(toIndentedString(numeroDUE)).append("\n");
    sb.append("    ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado: ").append(toIndentedString(ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado)).append("\n");
    sb.append("    existeImpedimentoEmbarque: ").append(toIndentedString(existeImpedimentoEmbarque)).append("\n");
    sb.append("    indicadorSeCargaRUCMaster: ").append(toIndentedString(indicadorSeCargaRUCMaster)).append("\n");
    sb.append("    numeroRUCMasterDaCarga: ").append(toIndentedString(numeroRUCMasterDaCarga)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
    sb.append("    documentosDeTransporte: ").append(toIndentedString(documentosDeTransporte)).append("\n");
    sb.append("    listaCargasSoltasVeiculos: ").append(toIndentedString(listaCargasSoltasVeiculos)).append("\n");
    sb.append("    listaGraneis: ").append(toIndentedString(listaGraneis)).append("\n");
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

