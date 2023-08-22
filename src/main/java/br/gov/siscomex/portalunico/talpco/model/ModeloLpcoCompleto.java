package br.gov.siscomex.portalunico.talpco.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "ModeloLpcoCompleto", propOrder =
    { "orgaoAnuente", "codigo", "nome", "informacoesExportadorImportador", "informacoesAnuente", "exibirInformacaoAdicional", "requerCatalogoProduto", "dataInicioVigencia", "preenchimento"
})

@XmlRootElement(name="ModeloLpcoCompleto")
/**
  * Dados completos de um modelo de LPCO
 **/
@ApiModel(description="Dados completos de um modelo de LPCO")
public class ModeloLpcoCompleto  {
  
  @XmlElement(name="orgaoAnuente", required = true)
  @ApiModelProperty(example = "ANVISA", required = true, value = "Sigla do órgão anuente que gerencia o modelo LPCO")
 /**
   * Sigla do órgão anuente que gerencia o modelo LPCO
  **/
  private String orgaoAnuente = null;

  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de LPCO<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano")
 /**
   * Código do modelo de LPCO<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano
  **/
  private String codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Certificação para Produtos de Origem Vegetal - Embarque Antecipado", required = true, value = "Nome do modelo de LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Nome do modelo de LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String nome = null;

  @XmlElement(name="informacoesExportadorImportador")
  @ApiModelProperty(example = "Caso a carga esteja em contêiner, informe o número do contêiner ...", value = "Informações adicionais ao exportador/importador para preenchimento dos LPCOs do modelo<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000")
 /**
   * Informações adicionais ao exportador/importador para preenchimento dos LPCOs do modelo<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000
  **/
  private String informacoesExportadorImportador = null;

  @XmlElement(name="informacoesAnuente")
  @ApiModelProperty(example = "Caso a carga esteja em contêiner, informe o número do contêiner ...", value = "Informações adicionais ao anuente para LPCOs do modelo<br>Tamanho mínimo: 1<br>Tamanho máximo: 2000")
 /**
   * Informações adicionais ao anuente para LPCOs do modelo<br>Tamanho mínimo: 1<br>Tamanho máximo: 2000
  **/
  private String informacoesAnuente = null;

  @XmlElement(name="exibirInformacaoAdicional", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se o sistema permite que seja informado o campo informacaoAdicional durante o cadastro de LPCOs do modelo")
 /**
   * Indica se o sistema permite que seja informado o campo informacaoAdicional durante o cadastro de LPCOs do modelo
  **/
  private Boolean exibirInformacaoAdicional = false;

  @XmlElement(name="requerCatalogoProduto", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indica se a informação de mercadorias será via Catálogo de Produtos")
 /**
   * Indica se a informação de mercadorias será via Catálogo de Produtos
  **/
  private Boolean requerCatalogoProduto = false;

  @XmlElement(name="dataInicioVigencia", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data de início de vigência do modelo<br> Formato: Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de início de vigência do modelo<br> Formato: Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="preenchimento", required = true)
  @ApiModelProperty(required = true, value = "Forma de preenchimento do modelo, sem pelo importador/exportador, de ofício, ou ambos.")
 /**
   * Forma de preenchimento do modelo, sem pelo importador/exportador, de ofício, ou ambos.
  **/
  private String preenchimento = null;
 /**
   * Sigla do órgão anuente que gerencia o modelo LPCO
   * @return orgaoAnuente
  **/
  @JsonProperty("orgaoAnuente")
  @NotNull
  public String getOrgaoAnuente() {
    return orgaoAnuente;
  }

  public void setOrgaoAnuente(String orgaoAnuente) {
    this.orgaoAnuente = orgaoAnuente;
  }

  public ModeloLpcoCompleto orgaoAnuente(String orgaoAnuente) {
    this.orgaoAnuente = orgaoAnuente;
    return this;
  }

 /**
   * Código do modelo de LPCO&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: ONNNNN&lt;br&gt;Lei de formação: O número do modelo de LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* NNNNN &#x3D; Número sequencial do LPCO no ano
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public ModeloLpcoCompleto codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome do modelo de LPCO&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ModeloLpcoCompleto nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Informações adicionais ao exportador/importador para preenchimento dos LPCOs do modelo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
   * @return informacoesExportadorImportador
  **/
  @JsonProperty("informacoesExportadorImportador")
  public String getInformacoesExportadorImportador() {
    return informacoesExportadorImportador;
  }

  public void setInformacoesExportadorImportador(String informacoesExportadorImportador) {
    this.informacoesExportadorImportador = informacoesExportadorImportador;
  }

  public ModeloLpcoCompleto informacoesExportadorImportador(String informacoesExportadorImportador) {
    this.informacoesExportadorImportador = informacoesExportadorImportador;
    return this;
  }

 /**
   * Informações adicionais ao anuente para LPCOs do modelo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 2000
   * @return informacoesAnuente
  **/
  @JsonProperty("informacoesAnuente")
  public String getInformacoesAnuente() {
    return informacoesAnuente;
  }

  public void setInformacoesAnuente(String informacoesAnuente) {
    this.informacoesAnuente = informacoesAnuente;
  }

  public ModeloLpcoCompleto informacoesAnuente(String informacoesAnuente) {
    this.informacoesAnuente = informacoesAnuente;
    return this;
  }

 /**
   * Indica se o sistema permite que seja informado o campo informacaoAdicional durante o cadastro de LPCOs do modelo
   * @return exibirInformacaoAdicional
  **/
  @JsonProperty("exibirInformacaoAdicional")
  @NotNull
  public Boolean isExibirInformacaoAdicional() {
    return exibirInformacaoAdicional;
  }

  public void setExibirInformacaoAdicional(Boolean exibirInformacaoAdicional) {
    this.exibirInformacaoAdicional = exibirInformacaoAdicional;
  }

  public ModeloLpcoCompleto exibirInformacaoAdicional(Boolean exibirInformacaoAdicional) {
    this.exibirInformacaoAdicional = exibirInformacaoAdicional;
    return this;
  }

 /**
   * Indica se a informação de mercadorias será via Catálogo de Produtos
   * @return requerCatalogoProduto
  **/
  @JsonProperty("requerCatalogoProduto")
  @NotNull
  public Boolean isRequerCatalogoProduto() {
    return requerCatalogoProduto;
  }

  public void setRequerCatalogoProduto(Boolean requerCatalogoProduto) {
    this.requerCatalogoProduto = requerCatalogoProduto;
  }

  public ModeloLpcoCompleto requerCatalogoProduto(Boolean requerCatalogoProduto) {
    this.requerCatalogoProduto = requerCatalogoProduto;
    return this;
  }

 /**
   * Data de início de vigência do modelo&lt;br&gt; Formato: Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataInicioVigencia
  **/
  @JsonProperty("dataInicioVigencia")
  @NotNull
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public ModeloLpcoCompleto dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

 /**
   * Forma de preenchimento do modelo, sem pelo importador/exportador, de ofício, ou ambos.
   * @return preenchimento
  **/
  @JsonProperty("preenchimento")
  @NotNull
  public String getPreenchimento() {
    return preenchimento;
  }

  public void setPreenchimento(String preenchimento) {
    this.preenchimento = preenchimento;
  }

  public ModeloLpcoCompleto preenchimento(String preenchimento) {
    this.preenchimento = preenchimento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModeloLpcoCompleto {\n");
    
    sb.append("    orgaoAnuente: ").append(toIndentedString(orgaoAnuente)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    informacoesExportadorImportador: ").append(toIndentedString(informacoesExportadorImportador)).append("\n");
    sb.append("    informacoesAnuente: ").append(toIndentedString(informacoesAnuente)).append("\n");
    sb.append("    exibirInformacaoAdicional: ").append(toIndentedString(exibirInformacaoAdicional)).append("\n");
    sb.append("    requerCatalogoProduto: ").append(toIndentedString(requerCatalogoProduto)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    preenchimento: ").append(toIndentedString(preenchimento)).append("\n");
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

