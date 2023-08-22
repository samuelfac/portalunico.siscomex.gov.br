package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.MoedaNegociadaCover;
import br.gov.siscomex.portalunico.duimp_api.model.TipoAplicacaoCover;
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
 @XmlType(name = "MercadoriaCover", propOrder =
    { "tipoAplicacao", "condicao", "unidadeComercial", "quantidadeComercial", "quantidadeMedidaEstatistica", "pesoLiquido", "moedaNegociada", "valorUnitarioMoedaNegociada", "descricao"
})

@XmlRootElement(name="MercadoriaCover")
/**
  * Dados da Mercadoria.
 **/
@ApiModel(description="Dados da Mercadoria.")
public class MercadoriaCover  {
  
  @XmlElement(name="tipoAplicacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private TipoAplicacaoCover tipoAplicacao = null;


@XmlType(name="CondicaoEnum")
@XmlEnum(String.class)
public enum CondicaoEnum {

	@XmlEnumValue("NOVA")
	@JsonProperty("NOVA")
	NOVA(String.valueOf("NOVA")),
	
	@XmlEnumValue("USADA")
	@JsonProperty("USADA")
	USADA(String.valueOf("USADA"));


    private String value;

    CondicaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CondicaoEnum fromValue(String v) {
        for (CondicaoEnum b : CondicaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CondicaoEnum");
    }
}

  @XmlElement(name="condicao", required = true)
  @ApiModelProperty(example = "NOVA", required = true, value = "Indica se a mercadoria é nova ou usada.<br>Domínio:")
 /**
   * Indica se a mercadoria é nova ou usada.<br>Domínio:
  **/
  private CondicaoEnum condicao = null;

  @XmlElement(name="unidadeComercial", required = true)
  @ApiModelProperty(example = "SACAS", required = true, value = "Unidade de medida utilizada na comercialização da mercadoria.<br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
 /**
   * Unidade de medida utilizada na comercialização da mercadoria.<br>Tamanho mínimo: 1<br>Tamanho máximo: 20
  **/
  private String unidadeComercial = null;

  @XmlElement(name="quantidadeComercial", required = true)
  @ApiModelProperty(example = "100.5", required = true, value = "Quantidade da mercadoria na unidade de medida comercial.<br>Tamanho: 9,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
 /**
   * Quantidade da mercadoria na unidade de medida comercial.<br>Tamanho: 9,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private Double quantidadeComercial = null;

  @XmlElement(name="quantidadeMedidaEstatistica", required = true)
  @ApiModelProperty(example = "12.12345", required = true, value = "Quantidade na unidade de medida estatística associada à NCM do produto.<br>Tamanho: 9,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
 /**
   * Quantidade na unidade de medida estatística associada à NCM do produto.<br>Tamanho: 9,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private Double quantidadeMedidaEstatistica = null;

  @XmlElement(name="pesoLiquido", required = true)
  @ApiModelProperty(example = "100.0", required = true, value = "Peso líquido, em quilogramas, que corresponde ao quantitativo total das mercadorias do item.<br>Tamanho: 9,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
 /**
   * Peso líquido, em quilogramas, que corresponde ao quantitativo total das mercadorias do item.<br>Tamanho: 9,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private Double pesoLiquido = null;

  @XmlElement(name="moedaNegociada", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private MoedaNegociadaCover moedaNegociada = null;

  @XmlElement(name="valorUnitarioMoedaNegociada", required = true)
  @ApiModelProperty(example = "10.0", required = true, value = "Valor unitário da mercadoria na condição de venda.<br>Tamanho: 13,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor unitário da mercadoria na condição de venda.<br>Tamanho: 13,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorUnitarioMoedaNegociada = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Texto de exemplo.", value = "Descrição complementar da mercadoria.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000")
 /**
   * Descrição complementar da mercadoria.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000
  **/
  private String descricao = null;
 /**
   * Get tipoAplicacao
   * @return tipoAplicacao
  **/
  @JsonProperty("tipoAplicacao")
  @NotNull
  public TipoAplicacaoCover getTipoAplicacao() {
    return tipoAplicacao;
  }

  public void setTipoAplicacao(TipoAplicacaoCover tipoAplicacao) {
    this.tipoAplicacao = tipoAplicacao;
  }

  public MercadoriaCover tipoAplicacao(TipoAplicacaoCover tipoAplicacao) {
    this.tipoAplicacao = tipoAplicacao;
    return this;
  }

 /**
   * Indica se a mercadoria é nova ou usada.&lt;br&gt;Domínio:
   * @return condicao
  **/
  @JsonProperty("condicao")
  @NotNull
  public String getCondicao() {
    if (condicao == null) {
      return null;
    }
    return condicao.value();
  }

  public void setCondicao(CondicaoEnum condicao) {
    this.condicao = condicao;
  }

  public MercadoriaCover condicao(CondicaoEnum condicao) {
    this.condicao = condicao;
    return this;
  }

 /**
   * Unidade de medida utilizada na comercialização da mercadoria.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
   * @return unidadeComercial
  **/
  @JsonProperty("unidadeComercial")
  @NotNull
  public String getUnidadeComercial() {
    return unidadeComercial;
  }

  public void setUnidadeComercial(String unidadeComercial) {
    this.unidadeComercial = unidadeComercial;
  }

  public MercadoriaCover unidadeComercial(String unidadeComercial) {
    this.unidadeComercial = unidadeComercial;
    return this;
  }

 /**
   * Quantidade da mercadoria na unidade de medida comercial.&lt;br&gt;Tamanho: 9,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeComercial
  **/
  @JsonProperty("quantidadeComercial")
  @NotNull
  public Double getQuantidadeComercial() {
    return quantidadeComercial;
  }

  public void setQuantidadeComercial(Double quantidadeComercial) {
    this.quantidadeComercial = quantidadeComercial;
  }

  public MercadoriaCover quantidadeComercial(Double quantidadeComercial) {
    this.quantidadeComercial = quantidadeComercial;
    return this;
  }

 /**
   * Quantidade na unidade de medida estatística associada à NCM do produto.&lt;br&gt;Tamanho: 9,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeMedidaEstatistica
  **/
  @JsonProperty("quantidadeMedidaEstatistica")
  @NotNull
  public Double getQuantidadeMedidaEstatistica() {
    return quantidadeMedidaEstatistica;
  }

  public void setQuantidadeMedidaEstatistica(Double quantidadeMedidaEstatistica) {
    this.quantidadeMedidaEstatistica = quantidadeMedidaEstatistica;
  }

  public MercadoriaCover quantidadeMedidaEstatistica(Double quantidadeMedidaEstatistica) {
    this.quantidadeMedidaEstatistica = quantidadeMedidaEstatistica;
    return this;
  }

 /**
   * Peso líquido, em quilogramas, que corresponde ao quantitativo total das mercadorias do item.&lt;br&gt;Tamanho: 9,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return pesoLiquido
  **/
  @JsonProperty("pesoLiquido")
  @NotNull
  public Double getPesoLiquido() {
    return pesoLiquido;
  }

  public void setPesoLiquido(Double pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
  }

  public MercadoriaCover pesoLiquido(Double pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
    return this;
  }

 /**
   * Get moedaNegociada
   * @return moedaNegociada
  **/
  @JsonProperty("moedaNegociada")
  @NotNull
  public MoedaNegociadaCover getMoedaNegociada() {
    return moedaNegociada;
  }

  public void setMoedaNegociada(MoedaNegociadaCover moedaNegociada) {
    this.moedaNegociada = moedaNegociada;
  }

  public MercadoriaCover moedaNegociada(MoedaNegociadaCover moedaNegociada) {
    this.moedaNegociada = moedaNegociada;
    return this;
  }

 /**
   * Valor unitário da mercadoria na condição de venda.&lt;br&gt;Tamanho: 13,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorUnitarioMoedaNegociada
  **/
  @JsonProperty("valorUnitarioMoedaNegociada")
  @NotNull
  public Double getValorUnitarioMoedaNegociada() {
    return valorUnitarioMoedaNegociada;
  }

  public void setValorUnitarioMoedaNegociada(Double valorUnitarioMoedaNegociada) {
    this.valorUnitarioMoedaNegociada = valorUnitarioMoedaNegociada;
  }

  public MercadoriaCover valorUnitarioMoedaNegociada(Double valorUnitarioMoedaNegociada) {
    this.valorUnitarioMoedaNegociada = valorUnitarioMoedaNegociada;
    return this;
  }

 /**
   * Descrição complementar da mercadoria.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 4000
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public MercadoriaCover descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MercadoriaCover {\n");
    
    sb.append("    tipoAplicacao: ").append(toIndentedString(tipoAplicacao)).append("\n");
    sb.append("    condicao: ").append(toIndentedString(condicao)).append("\n");
    sb.append("    unidadeComercial: ").append(toIndentedString(unidadeComercial)).append("\n");
    sb.append("    quantidadeComercial: ").append(toIndentedString(quantidadeComercial)).append("\n");
    sb.append("    quantidadeMedidaEstatistica: ").append(toIndentedString(quantidadeMedidaEstatistica)).append("\n");
    sb.append("    pesoLiquido: ").append(toIndentedString(pesoLiquido)).append("\n");
    sb.append("    moedaNegociada: ").append(toIndentedString(moedaNegociada)).append("\n");
    sb.append("    valorUnitarioMoedaNegociada: ").append(toIndentedString(valorUnitarioMoedaNegociada)).append("\n");
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

