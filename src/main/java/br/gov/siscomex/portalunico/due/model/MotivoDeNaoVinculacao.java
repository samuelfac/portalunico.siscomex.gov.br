package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MotivoDeNaoVinculacao", propOrder =
    { "dataDeRecebimentoDaAnaliseDoDrawback", "descricao"
})

@XmlRootElement(name="MotivoDeNaoVinculacao")
public class MotivoDeNaoVinculacao  {
  
  @XmlElement(name="dataDeRecebimentoDaAnaliseDoDrawback")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de criação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de criação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDeRecebimentoDaAnaliseDoDrawback = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição complementar<br />Tamanho mínimo: 0<br />Tamanho máximo: 100")
 /**
   * Descrição complementar<br />Tamanho mínimo: 0<br />Tamanho máximo: 100
  **/
  private String descricao = null;
 /**
   * Data de criação&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDeRecebimentoDaAnaliseDoDrawback
  **/
  @JsonProperty("dataDeRecebimentoDaAnaliseDoDrawback")
  public OffsetDateTime getDataDeRecebimentoDaAnaliseDoDrawback() {
    return dataDeRecebimentoDaAnaliseDoDrawback;
  }

  public void setDataDeRecebimentoDaAnaliseDoDrawback(OffsetDateTime dataDeRecebimentoDaAnaliseDoDrawback) {
    this.dataDeRecebimentoDaAnaliseDoDrawback = dataDeRecebimentoDaAnaliseDoDrawback;
  }

  public MotivoDeNaoVinculacao dataDeRecebimentoDaAnaliseDoDrawback(OffsetDateTime dataDeRecebimentoDaAnaliseDoDrawback) {
    this.dataDeRecebimentoDaAnaliseDoDrawback = dataDeRecebimentoDaAnaliseDoDrawback;
    return this;
  }

 /**
   * Descrição complementar&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 100
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public MotivoDeNaoVinculacao descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoDeNaoVinculacao {\n");
    
    sb.append("    dataDeRecebimentoDaAnaliseDoDrawback: ").append(toIndentedString(dataDeRecebimentoDaAnaliseDoDrawback)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

