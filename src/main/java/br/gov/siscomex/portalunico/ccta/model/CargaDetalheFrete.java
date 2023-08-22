package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.CargaDetalheFreteFormaPgto;
import br.gov.siscomex.portalunico.ccta.model.CargaDetalheFreteOutroEncargo;
import br.gov.siscomex.portalunico.ccta.model.CargaDetalheFreteTotalMoedaDestino;
import br.gov.siscomex.portalunico.ccta.model.CargaDetalheFreteTotalMoedaOrigem;
import br.gov.siscomex.portalunico.ccta.model.Moeda;
import br.gov.siscomex.portalunico.ccta.model.ValorMonetario;
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
 @XmlType(name = "CargaDetalheFrete", propOrder =
    { "formaPgto", "moedaOrigem", "outrosEncargos", "pendenciaPagamento", "somatorioFretePorItemCarga", "totaisMoedaDestino", "totaisMoedaOrigem"
})

@XmlRootElement(name="CargaDetalheFrete")
public class CargaDetalheFrete  {
  
  @XmlElement(name="formaPgto")
  @ApiModelProperty(value = "")
  @Valid
  private CargaDetalheFreteFormaPgto formaPgto = null;

  @XmlElement(name="moedaOrigem")
  @ApiModelProperty(value = "")
  @Valid
  private Moeda moedaOrigem = null;

  @XmlElement(name="outrosEncargos")
  @ApiModelProperty(value = "Lista de outros encargos")
  @Valid
 /**
   * Lista de outros encargos
  **/
  private List<CargaDetalheFreteOutroEncargo> outrosEncargos = null;


@XmlType(name="PendenciaPagamentoEnum")
@XmlEnum(String.class)
public enum PendenciaPagamentoEnum {

	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S")),
	
	@XmlEnumValue("N")
	@JsonProperty("N")
	N(String.valueOf("N"));


    private String value;

    PendenciaPagamentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PendenciaPagamentoEnum fromValue(String v) {
        for (PendenciaPagamentoEnum b : PendenciaPagamentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to PendenciaPagamentoEnum");
    }
}

  @XmlElement(name="pendenciaPagamento")
  @ApiModelProperty(example = "S", value = "Indicador de pendência de pagamento de frete.<br/>Tamanho: 1<br/>S - Sim<br/>N - Não")
 /**
   * Indicador de pendência de pagamento de frete.<br/>Tamanho: 1<br/>S - Sim<br/>N - Não
  **/
  private PendenciaPagamentoEnum pendenciaPagamento = null;

  @XmlElement(name="somatorioFretePorItemCarga")
  @ApiModelProperty(value = "")
  @Valid
  private ValorMonetario somatorioFretePorItemCarga = null;

  @XmlElement(name="totaisMoedaDestino")
  @ApiModelProperty(value = "Lista de totais na moeda de destino")
  @Valid
 /**
   * Lista de totais na moeda de destino
  **/
  private List<CargaDetalheFreteTotalMoedaDestino> totaisMoedaDestino = null;

  @XmlElement(name="totaisMoedaOrigem")
  @ApiModelProperty(value = "Lista de totais na moeda de origem")
  @Valid
 /**
   * Lista de totais na moeda de origem
  **/
  private List<CargaDetalheFreteTotalMoedaOrigem> totaisMoedaOrigem = null;
 /**
   * Get formaPgto
   * @return formaPgto
  **/
  @JsonProperty("formaPgto")
  public CargaDetalheFreteFormaPgto getFormaPgto() {
    return formaPgto;
  }

  public void setFormaPgto(CargaDetalheFreteFormaPgto formaPgto) {
    this.formaPgto = formaPgto;
  }

  public CargaDetalheFrete formaPgto(CargaDetalheFreteFormaPgto formaPgto) {
    this.formaPgto = formaPgto;
    return this;
  }

 /**
   * Get moedaOrigem
   * @return moedaOrigem
  **/
  @JsonProperty("moedaOrigem")
  public Moeda getMoedaOrigem() {
    return moedaOrigem;
  }

  public void setMoedaOrigem(Moeda moedaOrigem) {
    this.moedaOrigem = moedaOrigem;
  }

  public CargaDetalheFrete moedaOrigem(Moeda moedaOrigem) {
    this.moedaOrigem = moedaOrigem;
    return this;
  }

 /**
   * Lista de outros encargos
   * @return outrosEncargos
  **/
  @JsonProperty("outrosEncargos")
  public List<CargaDetalheFreteOutroEncargo> getOutrosEncargos() {
    return outrosEncargos;
  }

  public void setOutrosEncargos(List<CargaDetalheFreteOutroEncargo> outrosEncargos) {
    this.outrosEncargos = outrosEncargos;
  }

  public CargaDetalheFrete outrosEncargos(List<CargaDetalheFreteOutroEncargo> outrosEncargos) {
    this.outrosEncargos = outrosEncargos;
    return this;
  }

  public CargaDetalheFrete addOutrosEncargosItem(CargaDetalheFreteOutroEncargo outrosEncargosItem) {
    this.outrosEncargos.add(outrosEncargosItem);
    return this;
  }

 /**
   * Indicador de pendência de pagamento de frete.&lt;br/&gt;Tamanho: 1&lt;br/&gt;S - Sim&lt;br/&gt;N - Não
   * @return pendenciaPagamento
  **/
  @JsonProperty("pendenciaPagamento")
  public String getPendenciaPagamento() {
    if (pendenciaPagamento == null) {
      return null;
    }
    return pendenciaPagamento.value();
  }

  public void setPendenciaPagamento(PendenciaPagamentoEnum pendenciaPagamento) {
    this.pendenciaPagamento = pendenciaPagamento;
  }

  public CargaDetalheFrete pendenciaPagamento(PendenciaPagamentoEnum pendenciaPagamento) {
    this.pendenciaPagamento = pendenciaPagamento;
    return this;
  }

 /**
   * Get somatorioFretePorItemCarga
   * @return somatorioFretePorItemCarga
  **/
  @JsonProperty("somatorioFretePorItemCarga")
  public ValorMonetario getSomatorioFretePorItemCarga() {
    return somatorioFretePorItemCarga;
  }

  public void setSomatorioFretePorItemCarga(ValorMonetario somatorioFretePorItemCarga) {
    this.somatorioFretePorItemCarga = somatorioFretePorItemCarga;
  }

  public CargaDetalheFrete somatorioFretePorItemCarga(ValorMonetario somatorioFretePorItemCarga) {
    this.somatorioFretePorItemCarga = somatorioFretePorItemCarga;
    return this;
  }

 /**
   * Lista de totais na moeda de destino
   * @return totaisMoedaDestino
  **/
  @JsonProperty("totaisMoedaDestino")
  public List<CargaDetalheFreteTotalMoedaDestino> getTotaisMoedaDestino() {
    return totaisMoedaDestino;
  }

  public void setTotaisMoedaDestino(List<CargaDetalheFreteTotalMoedaDestino> totaisMoedaDestino) {
    this.totaisMoedaDestino = totaisMoedaDestino;
  }

  public CargaDetalheFrete totaisMoedaDestino(List<CargaDetalheFreteTotalMoedaDestino> totaisMoedaDestino) {
    this.totaisMoedaDestino = totaisMoedaDestino;
    return this;
  }

  public CargaDetalheFrete addTotaisMoedaDestinoItem(CargaDetalheFreteTotalMoedaDestino totaisMoedaDestinoItem) {
    this.totaisMoedaDestino.add(totaisMoedaDestinoItem);
    return this;
  }

 /**
   * Lista de totais na moeda de origem
   * @return totaisMoedaOrigem
  **/
  @JsonProperty("totaisMoedaOrigem")
  public List<CargaDetalheFreteTotalMoedaOrigem> getTotaisMoedaOrigem() {
    return totaisMoedaOrigem;
  }

  public void setTotaisMoedaOrigem(List<CargaDetalheFreteTotalMoedaOrigem> totaisMoedaOrigem) {
    this.totaisMoedaOrigem = totaisMoedaOrigem;
  }

  public CargaDetalheFrete totaisMoedaOrigem(List<CargaDetalheFreteTotalMoedaOrigem> totaisMoedaOrigem) {
    this.totaisMoedaOrigem = totaisMoedaOrigem;
    return this;
  }

  public CargaDetalheFrete addTotaisMoedaOrigemItem(CargaDetalheFreteTotalMoedaOrigem totaisMoedaOrigemItem) {
    this.totaisMoedaOrigem.add(totaisMoedaOrigemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDetalheFrete {\n");
    
    sb.append("    formaPgto: ").append(toIndentedString(formaPgto)).append("\n");
    sb.append("    moedaOrigem: ").append(toIndentedString(moedaOrigem)).append("\n");
    sb.append("    outrosEncargos: ").append(toIndentedString(outrosEncargos)).append("\n");
    sb.append("    pendenciaPagamento: ").append(toIndentedString(pendenciaPagamento)).append("\n");
    sb.append("    somatorioFretePorItemCarga: ").append(toIndentedString(somatorioFretePorItemCarga)).append("\n");
    sb.append("    totaisMoedaDestino: ").append(toIndentedString(totaisMoedaDestino)).append("\n");
    sb.append("    totaisMoedaOrigem: ").append(toIndentedString(totaisMoedaOrigem)).append("\n");
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

