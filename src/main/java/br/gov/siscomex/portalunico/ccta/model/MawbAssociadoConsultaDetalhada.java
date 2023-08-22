package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MawbAssociadoConsultaDetalhada", propOrder =
    { "chegadasTerrestres", "cnpjResponsavelArquivo", "dataEmissao", "identificacao"
})

@XmlRootElement(name="MawbAssociadoConsultaDetalhada")
public class MawbAssociadoConsultaDetalhada  {
  
  @XmlElement(name="chegadasTerrestres")
  @ApiModelProperty(value = "Lista as chegadas de viagens terrestres associadas ao MAWB<br/>")
  @Valid
 /**
   * Lista as chegadas de viagens terrestres associadas ao MAWB<br/>
  **/
  private List<CargaDetalheChegadaTerrestre> chegadasTerrestres = null;

  @XmlElement(name="cnpjResponsavelArquivo")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelArquivo = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2020-04-08T11:00:00-03:00", value = "Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataEmissao = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacao = null;
 /**
   * Lista as chegadas de viagens terrestres associadas ao MAWB&lt;br/&gt;
   * @return chegadasTerrestres
  **/
  @JsonProperty("chegadasTerrestres")
  public List<CargaDetalheChegadaTerrestre> getChegadasTerrestres() {
    return chegadasTerrestres;
  }

  public void setChegadasTerrestres(List<CargaDetalheChegadaTerrestre> chegadasTerrestres) {
    this.chegadasTerrestres = chegadasTerrestres;
  }

  public MawbAssociadoConsultaDetalhada chegadasTerrestres(List<CargaDetalheChegadaTerrestre> chegadasTerrestres) {
    this.chegadasTerrestres = chegadasTerrestres;
    return this;
  }

  public MawbAssociadoConsultaDetalhada addChegadasTerrestresItem(CargaDetalheChegadaTerrestre chegadasTerrestresItem) {
    this.chegadasTerrestres.add(chegadasTerrestresItem);
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

  public MawbAssociadoConsultaDetalhada cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
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

  public MawbAssociadoConsultaDetalhada dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
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

  public MawbAssociadoConsultaDetalhada identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MawbAssociadoConsultaDetalhada {\n");
    
    sb.append("    chegadasTerrestres: ").append(toIndentedString(chegadasTerrestres)).append("\n");
    sb.append("    cnpjResponsavelArquivo: ").append(toIndentedString(cnpjResponsavelArquivo)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
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

