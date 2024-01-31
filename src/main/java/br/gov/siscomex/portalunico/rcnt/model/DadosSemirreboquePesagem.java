package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosSemirreboquePesagem", propOrder =
    { "idElemento", "placa", "tara"
})

@XmlRootElement(name="DadosSemirreboquePesagem")
public class DadosSemirreboquePesagem  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa<br/>Tamanho: 50")
 /**
   * Placa<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="tara")
  @ApiModelProperty(example = "15.5", value = "Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.<br/>É obrigatório informar pelo menos um dos seguintes atributos: 'taraConjunto', 'listaSemirreboque.tara', quando o atributo 'listaSemirreboque.placa' estiver informado.<br/><br/>tara, até 4 casas decimais.")
  @Valid
 /**
   * Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.<br/>É obrigatório informar pelo menos um dos seguintes atributos: 'taraConjunto', 'listaSemirreboque.tara', quando o atributo 'listaSemirreboque.placa' estiver informado.<br/><br/>tara, até 4 casas decimais.
  **/
  private BigDecimal tara = null;
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

  public DadosSemirreboquePesagem idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Placa&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosSemirreboquePesagem placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.&lt;br/&gt;É obrigatório informar pelo menos um dos seguintes atributos: &#39;taraConjunto&#39;, &#39;listaSemirreboque.tara&#39;, quando o atributo &#39;listaSemirreboque.placa&#39; estiver informado.&lt;br/&gt;&lt;br/&gt;tara, até 4 casas decimais.
   * @return tara
  **/
  @JsonProperty("tara")
  public BigDecimal getTara() {
    return tara;
  }

  public void setTara(BigDecimal tara) {
    this.tara = tara;
  }

  public DadosSemirreboquePesagem tara(BigDecimal tara) {
    this.tara = tara;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosSemirreboquePesagem {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
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

