package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosMercadoriaCover", propOrder =
    { "tipoAplicacao", "condicao", "unidadeEstatistica", "quantidadeUnidadeEstatistica", "pesoLiquido", "unidadeComercializada", "quantidadeUnidadeComercializada", "moedaNegociada", "valorUnitarioCondicaoVenda", "valorMercadoriaCondicaoVendaMoedaNegociada", "valorMercadoriaCondicaoVendaReal"
})

@XmlRootElement(name="DadosMercadoriaCover")
/**
  * Dados da mercadoria
 **/
@ApiModel(description="Dados da mercadoria")
public class DadosMercadoriaCover  {
  

@XmlType(name="TipoAplicacaoEnum")
@XmlEnum(Integer.class)
public enum TipoAplicacaoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	NUMBER_2(Integer.valueOf(2));


    private Integer value;

    TipoAplicacaoEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoAplicacaoEnum fromValue(String v) {
        for (TipoAplicacaoEnum b : TipoAplicacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAplicacaoEnum");
    }
}

  @XmlElement(name="tipoAplicacao")
  @ApiModelProperty(example = "1", value = "Destinação da mercadoria de acordo com o domínio a seguir: .<br>Dominio:<br>1 - consumo,<br>2 - revenda,<br>3 - Incorporação ao Ativo Fixo,<br>4 - Industrialização,<br>9 - Outra<br>Tamanho: 1")
 /**
   * Destinação da mercadoria de acordo com o domínio a seguir: .<br>Dominio:<br>1 - consumo,<br>2 - revenda,<br>3 - Incorporação ao Ativo Fixo,<br>4 - Industrialização,<br>9 - Outra<br>Tamanho: 1
  **/
  private TipoAplicacaoEnum tipoAplicacao = null;


@XmlType(name="CondicaoEnum")
@XmlEnum(Integer.class)
public enum CondicaoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	NUMBER_2(Integer.valueOf(2));


    private Integer value;

    CondicaoEnum (Integer v) {
        value = v;
    }

    public Integer value() {
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

  @XmlElement(name="condicao")
  @ApiModelProperty(example = "1", value = "Indica se a mercadoria é nova ou usada.<br>Dominio:<br>1 = Nova, <br>2 = Usada<br>Tamanho: 1")
 /**
   * Indica se a mercadoria é nova ou usada.<br>Dominio:<br>1 = Nova, <br>2 = Usada<br>Tamanho: 1
  **/
  private CondicaoEnum condicao = null;

  @XmlElement(name="unidadeEstatistica")
  @ApiModelProperty(example = "KG", value = "Unidade de medida estatística associada à NCM do produto<br>Dominio: Tabela de Unidades Estatísticas de Valoração Siscomex<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Unidade de medida estatística associada à NCM do produto<br>Dominio: Tabela de Unidades Estatísticas de Valoração Siscomex<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String unidadeEstatistica = null;

  @XmlElement(name="quantidadeUnidadeEstatistica")
  @ApiModelProperty(value = "Quantidade na unidade de medida estatística associada à NCM do produto;<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade na unidade de medida estatística associada à NCM do produto;<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeUnidadeEstatistica = null;

  @XmlElement(name="pesoLiquido")
  @ApiModelProperty(example = "100.0", value = "Peso líquido em quilogramas corresponde ao quantitativo total das mercadorias do item.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso líquido em quilogramas corresponde ao quantitativo total das mercadorias do item.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoLiquido = null;

  @XmlElement(name="unidadeComercializada")
  @ApiModelProperty(example = "Sacas", value = "Unidade de medida utilizada na comercialização da mercadoria.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Unidade de medida utilizada na comercialização da mercadoria.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String unidadeComercializada = null;

  @XmlElement(name="quantidadeUnidadeComercializada")
  @ApiModelProperty(example = "100.0", value = "Quantidade da mercadoria na unidade de medida comercial.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade da mercadoria na unidade de medida comercial.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeUnidadeComercializada = null;

  @XmlElement(name="moedaNegociada")
  @ApiModelProperty(value = "Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'")
 /**
   * Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'
  **/
  private Integer moedaNegociada = null;

  @XmlElement(name="valorUnitarioCondicaoVenda")
  @ApiModelProperty(example = "10.0", value = "Valor unitário da mercadoria na condição de venda.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor unitário da mercadoria na condição de venda.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorUnitarioCondicaoVenda = null;

  @XmlElement(name="valorMercadoriaCondicaoVendaMoedaNegociada")
  @ApiModelProperty(example = "1000.0", value = "Valor total do item na Condição de Venda na moeda negociada.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total do item na Condição de Venda na moeda negociada.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorMercadoriaCondicaoVendaMoedaNegociada = null;

  @XmlElement(name="valorMercadoriaCondicaoVendaReal")
  @ApiModelProperty(example = "3806.5", value = "Valor total do item na Condição de Venda em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total do item na Condição de Venda em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorMercadoriaCondicaoVendaReal = null;
 /**
   * Destinação da mercadoria de acordo com o domínio a seguir: .&lt;br&gt;Dominio:&lt;br&gt;1 - consumo,&lt;br&gt;2 - revenda,&lt;br&gt;3 - Incorporação ao Ativo Fixo,&lt;br&gt;4 - Industrialização,&lt;br&gt;9 - Outra&lt;br&gt;Tamanho: 1
   * @return tipoAplicacao
  **/
  @JsonProperty("tipoAplicacao")
  public Integer getTipoAplicacao() {
    if (tipoAplicacao == null) {
      return null;
    }
    return tipoAplicacao.value();
  }

  public void setTipoAplicacao(TipoAplicacaoEnum tipoAplicacao) {
    this.tipoAplicacao = tipoAplicacao;
  }

  public DadosMercadoriaCover tipoAplicacao(TipoAplicacaoEnum tipoAplicacao) {
    this.tipoAplicacao = tipoAplicacao;
    return this;
  }

 /**
   * Indica se a mercadoria é nova ou usada.&lt;br&gt;Dominio:&lt;br&gt;1 &#x3D; Nova, &lt;br&gt;2 &#x3D; Usada&lt;br&gt;Tamanho: 1
   * @return condicao
  **/
  @JsonProperty("condicao")
  public Integer getCondicao() {
    if (condicao == null) {
      return null;
    }
    return condicao.value();
  }

  public void setCondicao(CondicaoEnum condicao) {
    this.condicao = condicao;
  }

  public DadosMercadoriaCover condicao(CondicaoEnum condicao) {
    this.condicao = condicao;
    return this;
  }

 /**
   * Unidade de medida estatística associada à NCM do produto&lt;br&gt;Dominio: Tabela de Unidades Estatísticas de Valoração Siscomex&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return unidadeEstatistica
  **/
  @JsonProperty("unidadeEstatistica")
  public String getUnidadeEstatistica() {
    return unidadeEstatistica;
  }

  public void setUnidadeEstatistica(String unidadeEstatistica) {
    this.unidadeEstatistica = unidadeEstatistica;
  }

  public DadosMercadoriaCover unidadeEstatistica(String unidadeEstatistica) {
    this.unidadeEstatistica = unidadeEstatistica;
    return this;
  }

 /**
   * Quantidade na unidade de medida estatística associada à NCM do produto;&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeUnidadeEstatistica
  **/
  @JsonProperty("quantidadeUnidadeEstatistica")
  public BigDecimal getQuantidadeUnidadeEstatistica() {
    return quantidadeUnidadeEstatistica;
  }

  public void setQuantidadeUnidadeEstatistica(BigDecimal quantidadeUnidadeEstatistica) {
    this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
  }

  public DadosMercadoriaCover quantidadeUnidadeEstatistica(BigDecimal quantidadeUnidadeEstatistica) {
    this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
    return this;
  }

 /**
   * Peso líquido em quilogramas corresponde ao quantitativo total das mercadorias do item.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return pesoLiquido
  **/
  @JsonProperty("pesoLiquido")
  public BigDecimal getPesoLiquido() {
    return pesoLiquido;
  }

  public void setPesoLiquido(BigDecimal pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
  }

  public DadosMercadoriaCover pesoLiquido(BigDecimal pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
    return this;
  }

 /**
   * Unidade de medida utilizada na comercialização da mercadoria.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return unidadeComercializada
  **/
  @JsonProperty("unidadeComercializada")
  public String getUnidadeComercializada() {
    return unidadeComercializada;
  }

  public void setUnidadeComercializada(String unidadeComercializada) {
    this.unidadeComercializada = unidadeComercializada;
  }

  public DadosMercadoriaCover unidadeComercializada(String unidadeComercializada) {
    this.unidadeComercializada = unidadeComercializada;
    return this;
  }

 /**
   * Quantidade da mercadoria na unidade de medida comercial.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeUnidadeComercializada
  **/
  @JsonProperty("quantidadeUnidadeComercializada")
  public BigDecimal getQuantidadeUnidadeComercializada() {
    return quantidadeUnidadeComercializada;
  }

  public void setQuantidadeUnidadeComercializada(BigDecimal quantidadeUnidadeComercializada) {
    this.quantidadeUnidadeComercializada = quantidadeUnidadeComercializada;
  }

  public DadosMercadoriaCover quantidadeUnidadeComercializada(BigDecimal quantidadeUnidadeComercializada) {
    this.quantidadeUnidadeComercializada = quantidadeUnidadeComercializada;
    return this;
  }

 /**
   * Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;
   * @return moedaNegociada
  **/
  @JsonProperty("moedaNegociada")
  public Integer getMoedaNegociada() {
    return moedaNegociada;
  }

  public void setMoedaNegociada(Integer moedaNegociada) {
    this.moedaNegociada = moedaNegociada;
  }

  public DadosMercadoriaCover moedaNegociada(Integer moedaNegociada) {
    this.moedaNegociada = moedaNegociada;
    return this;
  }

 /**
   * Valor unitário da mercadoria na condição de venda.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorUnitarioCondicaoVenda
  **/
  @JsonProperty("valorUnitarioCondicaoVenda")
  public BigDecimal getValorUnitarioCondicaoVenda() {
    return valorUnitarioCondicaoVenda;
  }

  public void setValorUnitarioCondicaoVenda(BigDecimal valorUnitarioCondicaoVenda) {
    this.valorUnitarioCondicaoVenda = valorUnitarioCondicaoVenda;
  }

  public DadosMercadoriaCover valorUnitarioCondicaoVenda(BigDecimal valorUnitarioCondicaoVenda) {
    this.valorUnitarioCondicaoVenda = valorUnitarioCondicaoVenda;
    return this;
  }

 /**
   * Valor total do item na Condição de Venda na moeda negociada.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorMercadoriaCondicaoVendaMoedaNegociada
  **/
  @JsonProperty("valorMercadoriaCondicaoVendaMoedaNegociada")
  public BigDecimal getValorMercadoriaCondicaoVendaMoedaNegociada() {
    return valorMercadoriaCondicaoVendaMoedaNegociada;
  }

  public void setValorMercadoriaCondicaoVendaMoedaNegociada(BigDecimal valorMercadoriaCondicaoVendaMoedaNegociada) {
    this.valorMercadoriaCondicaoVendaMoedaNegociada = valorMercadoriaCondicaoVendaMoedaNegociada;
  }

  public DadosMercadoriaCover valorMercadoriaCondicaoVendaMoedaNegociada(BigDecimal valorMercadoriaCondicaoVendaMoedaNegociada) {
    this.valorMercadoriaCondicaoVendaMoedaNegociada = valorMercadoriaCondicaoVendaMoedaNegociada;
    return this;
  }

 /**
   * Valor total do item na Condição de Venda em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorMercadoriaCondicaoVendaReal
  **/
  @JsonProperty("valorMercadoriaCondicaoVendaReal")
  public BigDecimal getValorMercadoriaCondicaoVendaReal() {
    return valorMercadoriaCondicaoVendaReal;
  }

  public void setValorMercadoriaCondicaoVendaReal(BigDecimal valorMercadoriaCondicaoVendaReal) {
    this.valorMercadoriaCondicaoVendaReal = valorMercadoriaCondicaoVendaReal;
  }

  public DadosMercadoriaCover valorMercadoriaCondicaoVendaReal(BigDecimal valorMercadoriaCondicaoVendaReal) {
    this.valorMercadoriaCondicaoVendaReal = valorMercadoriaCondicaoVendaReal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosMercadoriaCover {\n");
    
    sb.append("    tipoAplicacao: ").append(toIndentedString(tipoAplicacao)).append("\n");
    sb.append("    condicao: ").append(toIndentedString(condicao)).append("\n");
    sb.append("    unidadeEstatistica: ").append(toIndentedString(unidadeEstatistica)).append("\n");
    sb.append("    quantidadeUnidadeEstatistica: ").append(toIndentedString(quantidadeUnidadeEstatistica)).append("\n");
    sb.append("    pesoLiquido: ").append(toIndentedString(pesoLiquido)).append("\n");
    sb.append("    unidadeComercializada: ").append(toIndentedString(unidadeComercializada)).append("\n");
    sb.append("    quantidadeUnidadeComercializada: ").append(toIndentedString(quantidadeUnidadeComercializada)).append("\n");
    sb.append("    moedaNegociada: ").append(toIndentedString(moedaNegociada)).append("\n");
    sb.append("    valorUnitarioCondicaoVenda: ").append(toIndentedString(valorUnitarioCondicaoVenda)).append("\n");
    sb.append("    valorMercadoriaCondicaoVendaMoedaNegociada: ").append(toIndentedString(valorMercadoriaCondicaoVendaMoedaNegociada)).append("\n");
    sb.append("    valorMercadoriaCondicaoVendaReal: ").append(toIndentedString(valorMercadoriaCondicaoVendaReal)).append("\n");
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

