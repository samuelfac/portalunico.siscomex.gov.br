package br.gov.siscomex.portalunico.rcnt.model;

import br.gov.siscomex.portalunico.rcnt.model.DadosDoTipoDeAvaria;
import br.gov.siscomex.portalunico.rcnt.model.DadosVolumeVerificado;
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
 @XmlType(name = "DadosLote", propOrder =
    { "contraMarca", "divergenciaQualificacao", "divergenciaQuantidade", "embalagemComercial", "idElemento", "listaTipoAvaria", "listaVolumesVerificados", "marca", "numeroLote", "observacaoAvaria", "observacaoDivergencia", "pesoLoteBalanca", "quantidadeVolumesAvariados", "quantidadeVolumesDivergentes"
})

@XmlRootElement(name="DadosLote")
public class DadosLote  {
  
  @XmlElement(name="contraMarca")
  @ApiModelProperty(value = "Contramarca visível<br/>Tamanho: 100")
 /**
   * Contramarca visível<br/>Tamanho: 100
  **/
  private String contraMarca = null;

  @XmlElement(name="divergenciaQualificacao")
  @ApiModelProperty(example = "false", value = "Divergência de qualificação de mercadoria/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Divergência de qualificação de mercadoria/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean divergenciaQualificacao = null;

  @XmlElement(name="divergenciaQuantidade")
  @ApiModelProperty(example = "false", value = "Divergência de quantidades de mercadoria/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Divergência de quantidades de mercadoria/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean divergenciaQuantidade = null;

  @XmlElement(name="embalagemComercial")
  @ApiModelProperty(value = "Embalagem comercial visível<br/>Tamanho: 100")
 /**
   * Embalagem comercial visível<br/>Tamanho: 100
  **/
  private String embalagemComercial = null;

  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="listaTipoAvaria")
  @ApiModelProperty(value = "Lista dos Tipos de Avarias.")
  @Valid
 /**
   * Lista dos Tipos de Avarias.
  **/
  private List<DadosDoTipoDeAvaria> listaTipoAvaria = null;

  @XmlElement(name="listaVolumesVerificados")
  @ApiModelProperty(value = "Lista de Volumes recepcionados")
  @Valid
 /**
   * Lista de Volumes recepcionados
  **/
  private List<DadosVolumeVerificado> listaVolumesVerificados = null;

  @XmlElement(name="marca")
  @ApiModelProperty(value = "Marca visível<br/>Tamanho: 100")
 /**
   * Marca visível<br/>Tamanho: 100
  **/
  private String marca = null;

  @XmlElement(name="numeroLote", required = true)
  @ApiModelProperty(required = true, value = "Número do Lote interno gerado pelo Recinto. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Número do Lote interno gerado pelo Recinto. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String numeroLote = null;

  @XmlElement(name="observacaoAvaria")
  @ApiModelProperty(value = "Observações da avaria<br/>Tamanho: 200")
 /**
   * Observações da avaria<br/>Tamanho: 200
  **/
  private String observacaoAvaria = null;

  @XmlElement(name="observacaoDivergencia")
  @ApiModelProperty(value = "Observações da divergência<br/>Tamanho: 200")
 /**
   * Observações da divergência<br/>Tamanho: 200
  **/
  private String observacaoDivergencia = null;

  @XmlElement(name="pesoLoteBalanca")
  @ApiModelProperty(example = "15.5", value = "Peso do lote na balança (Kg).<br/><br/>pesoLoteBalanca, até 4 casas decimais.")
  @Valid
 /**
   * Peso do lote na balança (Kg).<br/><br/>pesoLoteBalanca, até 4 casas decimais.
  **/
  private BigDecimal pesoLoteBalanca = null;

  @XmlElement(name="quantidadeVolumesAvariados")
  @ApiModelProperty(example = "3", value = "Quantidade de volumes avariados")
 /**
   * Quantidade de volumes avariados
  **/
  private Integer quantidadeVolumesAvariados = null;

  @XmlElement(name="quantidadeVolumesDivergentes")
  @ApiModelProperty(example = "10", value = "Quantidade de volumes divergentes")
 /**
   * Quantidade de volumes divergentes
  **/
  private Integer quantidadeVolumesDivergentes = null;
 /**
   * Contramarca visível&lt;br/&gt;Tamanho: 100
   * @return contraMarca
  **/
  @JsonProperty("contraMarca")
  public String getContraMarca() {
    return contraMarca;
  }

  public void setContraMarca(String contraMarca) {
    this.contraMarca = contraMarca;
  }

  public DadosLote contraMarca(String contraMarca) {
    this.contraMarca = contraMarca;
    return this;
  }

 /**
   * Divergência de qualificação de mercadoria/volumes&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return divergenciaQualificacao
  **/
  @JsonProperty("divergenciaQualificacao")
  public Boolean isDivergenciaQualificacao() {
    return divergenciaQualificacao;
  }

  public void setDivergenciaQualificacao(Boolean divergenciaQualificacao) {
    this.divergenciaQualificacao = divergenciaQualificacao;
  }

  public DadosLote divergenciaQualificacao(Boolean divergenciaQualificacao) {
    this.divergenciaQualificacao = divergenciaQualificacao;
    return this;
  }

 /**
   * Divergência de quantidades de mercadoria/volumes&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return divergenciaQuantidade
  **/
  @JsonProperty("divergenciaQuantidade")
  public Boolean isDivergenciaQuantidade() {
    return divergenciaQuantidade;
  }

  public void setDivergenciaQuantidade(Boolean divergenciaQuantidade) {
    this.divergenciaQuantidade = divergenciaQuantidade;
  }

  public DadosLote divergenciaQuantidade(Boolean divergenciaQuantidade) {
    this.divergenciaQuantidade = divergenciaQuantidade;
    return this;
  }

 /**
   * Embalagem comercial visível&lt;br/&gt;Tamanho: 100
   * @return embalagemComercial
  **/
  @JsonProperty("embalagemComercial")
  public String getEmbalagemComercial() {
    return embalagemComercial;
  }

  public void setEmbalagemComercial(String embalagemComercial) {
    this.embalagemComercial = embalagemComercial;
  }

  public DadosLote embalagemComercial(String embalagemComercial) {
    this.embalagemComercial = embalagemComercial;
    return this;
  }

 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosLote idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Lista dos Tipos de Avarias.
   * @return listaTipoAvaria
  **/
  @JsonProperty("listaTipoAvaria")
  public List<DadosDoTipoDeAvaria> getListaTipoAvaria() {
    return listaTipoAvaria;
  }

  public void setListaTipoAvaria(List<DadosDoTipoDeAvaria> listaTipoAvaria) {
    this.listaTipoAvaria = listaTipoAvaria;
  }

  public DadosLote listaTipoAvaria(List<DadosDoTipoDeAvaria> listaTipoAvaria) {
    this.listaTipoAvaria = listaTipoAvaria;
    return this;
  }

  public DadosLote addListaTipoAvariaItem(DadosDoTipoDeAvaria listaTipoAvariaItem) {
    this.listaTipoAvaria.add(listaTipoAvariaItem);
    return this;
  }

 /**
   * Lista de Volumes recepcionados
   * @return listaVolumesVerificados
  **/
  @JsonProperty("listaVolumesVerificados")
  public List<DadosVolumeVerificado> getListaVolumesVerificados() {
    return listaVolumesVerificados;
  }

  public void setListaVolumesVerificados(List<DadosVolumeVerificado> listaVolumesVerificados) {
    this.listaVolumesVerificados = listaVolumesVerificados;
  }

  public DadosLote listaVolumesVerificados(List<DadosVolumeVerificado> listaVolumesVerificados) {
    this.listaVolumesVerificados = listaVolumesVerificados;
    return this;
  }

  public DadosLote addListaVolumesVerificadosItem(DadosVolumeVerificado listaVolumesVerificadosItem) {
    this.listaVolumesVerificados.add(listaVolumesVerificadosItem);
    return this;
  }

 /**
   * Marca visível&lt;br/&gt;Tamanho: 100
   * @return marca
  **/
  @JsonProperty("marca")
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public DadosLote marca(String marca) {
    this.marca = marca;
    return this;
  }

 /**
   * Número do Lote interno gerado pelo Recinto. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
   * @return numeroLote
  **/
  @JsonProperty("numeroLote")
  @NotNull
  public String getNumeroLote() {
    return numeroLote;
  }

  public void setNumeroLote(String numeroLote) {
    this.numeroLote = numeroLote;
  }

  public DadosLote numeroLote(String numeroLote) {
    this.numeroLote = numeroLote;
    return this;
  }

 /**
   * Observações da avaria&lt;br/&gt;Tamanho: 200
   * @return observacaoAvaria
  **/
  @JsonProperty("observacaoAvaria")
  public String getObservacaoAvaria() {
    return observacaoAvaria;
  }

  public void setObservacaoAvaria(String observacaoAvaria) {
    this.observacaoAvaria = observacaoAvaria;
  }

  public DadosLote observacaoAvaria(String observacaoAvaria) {
    this.observacaoAvaria = observacaoAvaria;
    return this;
  }

 /**
   * Observações da divergência&lt;br/&gt;Tamanho: 200
   * @return observacaoDivergencia
  **/
  @JsonProperty("observacaoDivergencia")
  public String getObservacaoDivergencia() {
    return observacaoDivergencia;
  }

  public void setObservacaoDivergencia(String observacaoDivergencia) {
    this.observacaoDivergencia = observacaoDivergencia;
  }

  public DadosLote observacaoDivergencia(String observacaoDivergencia) {
    this.observacaoDivergencia = observacaoDivergencia;
    return this;
  }

 /**
   * Peso do lote na balança (Kg).&lt;br/&gt;&lt;br/&gt;pesoLoteBalanca, até 4 casas decimais.
   * @return pesoLoteBalanca
  **/
  @JsonProperty("pesoLoteBalanca")
  public BigDecimal getPesoLoteBalanca() {
    return pesoLoteBalanca;
  }

  public void setPesoLoteBalanca(BigDecimal pesoLoteBalanca) {
    this.pesoLoteBalanca = pesoLoteBalanca;
  }

  public DadosLote pesoLoteBalanca(BigDecimal pesoLoteBalanca) {
    this.pesoLoteBalanca = pesoLoteBalanca;
    return this;
  }

 /**
   * Quantidade de volumes avariados
   * @return quantidadeVolumesAvariados
  **/
  @JsonProperty("quantidadeVolumesAvariados")
  public Integer getQuantidadeVolumesAvariados() {
    return quantidadeVolumesAvariados;
  }

  public void setQuantidadeVolumesAvariados(Integer quantidadeVolumesAvariados) {
    this.quantidadeVolumesAvariados = quantidadeVolumesAvariados;
  }

  public DadosLote quantidadeVolumesAvariados(Integer quantidadeVolumesAvariados) {
    this.quantidadeVolumesAvariados = quantidadeVolumesAvariados;
    return this;
  }

 /**
   * Quantidade de volumes divergentes
   * @return quantidadeVolumesDivergentes
  **/
  @JsonProperty("quantidadeVolumesDivergentes")
  public Integer getQuantidadeVolumesDivergentes() {
    return quantidadeVolumesDivergentes;
  }

  public void setQuantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
    this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
  }

  public DadosLote quantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
    this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosLote {\n");
    
    sb.append("    contraMarca: ").append(toIndentedString(contraMarca)).append("\n");
    sb.append("    divergenciaQualificacao: ").append(toIndentedString(divergenciaQualificacao)).append("\n");
    sb.append("    divergenciaQuantidade: ").append(toIndentedString(divergenciaQuantidade)).append("\n");
    sb.append("    embalagemComercial: ").append(toIndentedString(embalagemComercial)).append("\n");
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    listaTipoAvaria: ").append(toIndentedString(listaTipoAvaria)).append("\n");
    sb.append("    listaVolumesVerificados: ").append(toIndentedString(listaVolumesVerificados)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    numeroLote: ").append(toIndentedString(numeroLote)).append("\n");
    sb.append("    observacaoAvaria: ").append(toIndentedString(observacaoAvaria)).append("\n");
    sb.append("    observacaoDivergencia: ").append(toIndentedString(observacaoDivergencia)).append("\n");
    sb.append("    pesoLoteBalanca: ").append(toIndentedString(pesoLoteBalanca)).append("\n");
    sb.append("    quantidadeVolumesAvariados: ").append(toIndentedString(quantidadeVolumesAvariados)).append("\n");
    sb.append("    quantidadeVolumesDivergentes: ").append(toIndentedString(quantidadeVolumesDivergentes)).append("\n");
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

