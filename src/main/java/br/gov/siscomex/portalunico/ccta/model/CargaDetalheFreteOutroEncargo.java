package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.FormaPagamento;
import br.gov.siscomex.portalunico.ccta.model.TipoAtuacao;
import br.gov.siscomex.portalunico.ccta.model.TipoOutroEncargo;
import br.gov.siscomex.portalunico.ccta.model.ValorMonetario;
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
 @XmlType(name = "CargaDetalheFreteOutroEncargo", propOrder =
    { "formaPgto", "motivo", "recebedor", "tipo", "valorTotal"
})

@XmlRootElement(name="CargaDetalheFreteOutroEncargo")
public class CargaDetalheFreteOutroEncargo  {
  
  @XmlElement(name="formaPgto")
  @ApiModelProperty(value = "")
  @Valid
  private FormaPagamento formaPgto = null;

  @XmlElement(name="motivo")
  @ApiModelProperty(value = "Motivo para o outro encargo do frete.<br/>Tamanho: 70")
 /**
   * Motivo para o outro encargo do frete.<br/>Tamanho: 70
  **/
  private String motivo = null;

  @XmlElement(name="recebedor")
  @ApiModelProperty(value = "")
  @Valid
  private TipoAtuacao recebedor = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoOutroEncargo tipo = null;

  @XmlElement(name="valorTotal")
  @ApiModelProperty(value = "")
  @Valid
  private ValorMonetario valorTotal = null;
 /**
   * Get formaPgto
   * @return formaPgto
  **/
  @JsonProperty("formaPgto")
  public FormaPagamento getFormaPgto() {
    return formaPgto;
  }

  public void setFormaPgto(FormaPagamento formaPgto) {
    this.formaPgto = formaPgto;
  }

  public CargaDetalheFreteOutroEncargo formaPgto(FormaPagamento formaPgto) {
    this.formaPgto = formaPgto;
    return this;
  }

 /**
   * Motivo para o outro encargo do frete.&lt;br/&gt;Tamanho: 70
   * @return motivo
  **/
  @JsonProperty("motivo")
  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public CargaDetalheFreteOutroEncargo motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }

 /**
   * Get recebedor
   * @return recebedor
  **/
  @JsonProperty("recebedor")
  public TipoAtuacao getRecebedor() {
    return recebedor;
  }

  public void setRecebedor(TipoAtuacao recebedor) {
    this.recebedor = recebedor;
  }

  public CargaDetalheFreteOutroEncargo recebedor(TipoAtuacao recebedor) {
    this.recebedor = recebedor;
    return this;
  }

 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoOutroEncargo getTipo() {
    return tipo;
  }

  public void setTipo(TipoOutroEncargo tipo) {
    this.tipo = tipo;
  }

  public CargaDetalheFreteOutroEncargo tipo(TipoOutroEncargo tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get valorTotal
   * @return valorTotal
  **/
  @JsonProperty("valorTotal")
  public ValorMonetario getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(ValorMonetario valorTotal) {
    this.valorTotal = valorTotal;
  }

  public CargaDetalheFreteOutroEncargo valorTotal(ValorMonetario valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDetalheFreteOutroEncargo {\n");
    
    sb.append("    formaPgto: ").append(toIndentedString(formaPgto)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    recebedor: ").append(toIndentedString(recebedor)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
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

