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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaracaoVinculada", propOrder =
    { "tipo", "numeroDeclaracaoVinculada", "versaoDeclaracaoVinculada", "numeroDeclaracaoOriginal", "versaoDeclaracaoOriginal", "numeroItemDeclaracaoOriginal", "dataHoraRegistro", "numeroItemDeclaracaoVinculada", "valorFreteReal", "valorSeguroReal", "unidadeMedidaEstatistica", "qtdMercadoriaUnidadeEstatistica", "itemCodigoRegime", "itemCodigoFundamento", "itemNcmAssociada", "mnemonicoSistemaControle"
})

@XmlRootElement(name="DeclaracaoVinculada")
/**
  * Declaração vinculada
 **/
@ApiModel(description="Declaração vinculada")
public class DeclaracaoVinculada  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3")),
	
	@XmlEnumValue("4")
	@JsonProperty("4")
	_4(String.valueOf("4"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "1", value = "Tipo de declaração vinculada.<br>Dominio:<br>1 - Duimp, <br>2 - DU-E, <br>3 - DI, <br>4 - DE<br>Tamanho: 1")
 /**
   * Tipo de declaração vinculada.<br>Dominio:<br>1 - Duimp, <br>2 - DU-E, <br>3 - DI, <br>4 - DE<br>Tamanho: 1
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="numeroDeclaracaoVinculada")
  @ApiModelProperty(example = "19BR00000004936", value = "Número da Declaração vinculada.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16")
 /**
   * Número da Declaração vinculada.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16
  **/
  private String numeroDeclaracaoVinculada = null;

  @XmlElement(name="versaoDeclaracaoVinculada")
  @ApiModelProperty(example = "0001", value = "Versão da Declaração vinculada.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Versão da Declaração vinculada.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private String versaoDeclaracaoVinculada = null;

  @XmlElement(name="numeroDeclaracaoOriginal")
  @ApiModelProperty(example = "19BR00000004936", value = "Número da declaração original relacionada à declaração vinculada.<br>O número da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)")
 /**
   * Número da declaração original relacionada à declaração vinculada.<br>O número da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
  **/
  private String numeroDeclaracaoOriginal = null;

  @XmlElement(name="versaoDeclaracaoOriginal")
  @ApiModelProperty(example = "0001", value = "Versão da declaração original relacionada à declaração vinculada.<br>A versão da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a versão da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a versão da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999")
 /**
   * Versão da declaração original relacionada à declaração vinculada.<br>A versão da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a versão da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a versão da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999
  **/
  private String versaoDeclaracaoOriginal = null;

  @XmlElement(name="numeroItemDeclaracaoOriginal")
  @ApiModelProperty(example = "10001", value = "Item da declaração original relacionada à declaração vinculada.<br>O número do item original é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Item da declaração original relacionada à declaração vinculada.<br>O número do item original é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private String numeroItemDeclaracaoOriginal = null;

  @XmlElement(name="dataHoraRegistro")
  @ApiModelProperty(value = "Data de Registro<br>A data de registro é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a data/hora de registro da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a data/hora de registro da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de Registro<br>A data de registro é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a data/hora de registro da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a data/hora de registro da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHoraRegistro = null;

  @XmlElement(name="numeroItemDeclaracaoVinculada")
  @ApiModelProperty(example = "10001", value = "Número do item ou adição da declaração vinculada.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Número do item ou adição da declaração vinculada.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private String numeroItemDeclaracaoVinculada = null;

  @XmlElement(name="valorFreteReal")
  @ApiModelProperty(example = "3806.5", value = "Valor do frete (R$) do item.<br>O valor do frete (R$) do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do frete (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do frete (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
  @Valid
 /**
   * Valor do frete (R$) do item.<br>O valor do frete (R$) do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do frete (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do frete (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private BigDecimal valorFreteReal = null;

  @XmlElement(name="valorSeguroReal")
  @ApiModelProperty(example = "3806.5", value = "Valor do seguro (R$) do item.<br>O valor do seguro (R$) item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o seguro foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do seguro (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do seguro (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do seguro (R$) do item.<br>O valor do seguro (R$) item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o seguro foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do seguro (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do seguro (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorSeguroReal = null;

  @XmlElement(name="unidadeMedidaEstatistica")
  @ApiModelProperty(example = "Peças", value = "Unidade de medida estatística (UME) do item.<br>A unidade de medida estatística (UME) do item do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: unidade de medida estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou unidade de medida estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Unidade de medida estatística (UME) do item.<br>A unidade de medida estatística (UME) do item do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: unidade de medida estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou unidade de medida estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String unidadeMedidaEstatistica = null;

  @XmlElement(name="qtdMercadoriaUnidadeEstatistica")
  @ApiModelProperty(example = "1234.00005", value = "Quantidade na unidade estatística do item.<br>A quantidade na unidade estatística do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: quantidade na unidade estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou quantidade na unidade estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade na unidade estatística do item.<br>A quantidade na unidade estatística do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: quantidade na unidade estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou quantidade na unidade estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal qtdMercadoriaUnidadeEstatistica = null;

  @XmlElement(name="itemCodigoRegime")
  @ApiModelProperty(example = "3", value = "Regime Aplicado ao  Item da Declaração Vinculada.<br>Dominio: Regimes tributários existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Regime Aplicado ao  Item da Declaração Vinculada.<br>Dominio: Regimes tributários existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private Integer itemCodigoRegime = null;

  @XmlElement(name="itemCodigoFundamento")
  @ApiModelProperty(example = "1031", value = "Fundamento Aplicado ao Item da Declaração Vinculada<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Fundamento Aplicado ao Item da Declaração Vinculada<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private Integer itemCodigoFundamento = null;

  @XmlElement(name="itemNcmAssociada")
  @ApiModelProperty(example = "02013000", value = "Código da NCM associada ao item da Declaração Vinculada.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Código da NCM associada ao item da Declaração Vinculada.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private String itemNcmAssociada = null;


@XmlType(name="MnemonicoSistemaControleEnum")
@XmlEnum(String.class)
public enum MnemonicoSistemaControleEnum {

	@XmlEnumValue("RAES")
	@JsonProperty("RAES")
	RAES(String.valueOf("RAES")),
	
	@XmlEnumValue("DRAW_ISENCAO")
	@JsonProperty("DRAW_ISENCAO")
	DRAW_ISENCAO(String.valueOf("DRAW_ISENCAO")),
	
	@XmlEnumValue("DRAW_INTEGRADO")
	@JsonProperty("DRAW_INTEGRADO")
	DRAW_INTEGRADO(String.valueOf("DRAW_INTEGRADO")),
	
	@XmlEnumValue("DRAW_SUSPENSAO")
	@JsonProperty("DRAW_SUSPENSAO")
	DRAW_SUSPENSAO(String.valueOf("DRAW_SUSPENSAO")),
	
	@XmlEnumValue("DRAW_CONTINUO")
	@JsonProperty("DRAW_CONTINUO")
	DRAW_CONTINUO(String.valueOf("DRAW_CONTINUO"));


    private String value;

    MnemonicoSistemaControleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MnemonicoSistemaControleEnum fromValue(String v) {
        for (MnemonicoSistemaControleEnum b : MnemonicoSistemaControleEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to MnemonicoSistemaControleEnum");
    }
}

  @XmlElement(name="mnemonicoSistemaControle")
  @ApiModelProperty(example = "DRAW_ISENCAO", value = "Mnemonico do sistema de controle Associado ao Fundamento Aplicado ao Item da Declaração Vinculada.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Mnemonico do sistema de controle Associado ao Fundamento Aplicado ao Item da Declaração Vinculada.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private MnemonicoSistemaControleEnum mnemonicoSistemaControle = null;
 /**
   * Tipo de declaração vinculada.&lt;br&gt;Dominio:&lt;br&gt;1 - Duimp, &lt;br&gt;2 - DU-E, &lt;br&gt;3 - DI, &lt;br&gt;4 - DE&lt;br&gt;Tamanho: 1
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public DeclaracaoVinculada tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Número da Declaração vinculada.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 16
   * @return numeroDeclaracaoVinculada
  **/
  @JsonProperty("numeroDeclaracaoVinculada")
  public String getNumeroDeclaracaoVinculada() {
    return numeroDeclaracaoVinculada;
  }

  public void setNumeroDeclaracaoVinculada(String numeroDeclaracaoVinculada) {
    this.numeroDeclaracaoVinculada = numeroDeclaracaoVinculada;
  }

  public DeclaracaoVinculada numeroDeclaracaoVinculada(String numeroDeclaracaoVinculada) {
    this.numeroDeclaracaoVinculada = numeroDeclaracaoVinculada;
    return this;
  }

 /**
   * Versão da Declaração vinculada.&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return versaoDeclaracaoVinculada
  **/
  @JsonProperty("versaoDeclaracaoVinculada")
  public String getVersaoDeclaracaoVinculada() {
    return versaoDeclaracaoVinculada;
  }

  public void setVersaoDeclaracaoVinculada(String versaoDeclaracaoVinculada) {
    this.versaoDeclaracaoVinculada = versaoDeclaracaoVinculada;
  }

  public DeclaracaoVinculada versaoDeclaracaoVinculada(String versaoDeclaracaoVinculada) {
    this.versaoDeclaracaoVinculada = versaoDeclaracaoVinculada;
    return this;
  }

 /**
   * Número da declaração original relacionada à declaração vinculada.&lt;br&gt;O número da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* NN &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* N &#x3D; 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
   * @return numeroDeclaracaoOriginal
  **/
  @JsonProperty("numeroDeclaracaoOriginal")
  public String getNumeroDeclaracaoOriginal() {
    return numeroDeclaracaoOriginal;
  }

  public void setNumeroDeclaracaoOriginal(String numeroDeclaracaoOriginal) {
    this.numeroDeclaracaoOriginal = numeroDeclaracaoOriginal;
  }

  public DeclaracaoVinculada numeroDeclaracaoOriginal(String numeroDeclaracaoOriginal) {
    this.numeroDeclaracaoOriginal = numeroDeclaracaoOriginal;
    return this;
  }

 /**
   * Versão da declaração original relacionada à declaração vinculada.&lt;br&gt;A versão da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a versão da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a versão da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999
   * @return versaoDeclaracaoOriginal
  **/
  @JsonProperty("versaoDeclaracaoOriginal")
  public String getVersaoDeclaracaoOriginal() {
    return versaoDeclaracaoOriginal;
  }

  public void setVersaoDeclaracaoOriginal(String versaoDeclaracaoOriginal) {
    this.versaoDeclaracaoOriginal = versaoDeclaracaoOriginal;
  }

  public DeclaracaoVinculada versaoDeclaracaoOriginal(String versaoDeclaracaoOriginal) {
    this.versaoDeclaracaoOriginal = versaoDeclaracaoOriginal;
    return this;
  }

 /**
   * Item da declaração original relacionada à declaração vinculada.&lt;br&gt;O número do item original é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItemDeclaracaoOriginal
  **/
  @JsonProperty("numeroItemDeclaracaoOriginal")
  public String getNumeroItemDeclaracaoOriginal() {
    return numeroItemDeclaracaoOriginal;
  }

  public void setNumeroItemDeclaracaoOriginal(String numeroItemDeclaracaoOriginal) {
    this.numeroItemDeclaracaoOriginal = numeroItemDeclaracaoOriginal;
  }

  public DeclaracaoVinculada numeroItemDeclaracaoOriginal(String numeroItemDeclaracaoOriginal) {
    this.numeroItemDeclaracaoOriginal = numeroItemDeclaracaoOriginal;
    return this;
  }

 /**
   * Data de Registro&lt;br&gt;A data de registro é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a data/hora de registro da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a data/hora de registro da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataHoraRegistro
  **/
  @JsonProperty("dataHoraRegistro")
  public OffsetDateTime getDataHoraRegistro() {
    return dataHoraRegistro;
  }

  public void setDataHoraRegistro(OffsetDateTime dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
  }

  public DeclaracaoVinculada dataHoraRegistro(OffsetDateTime dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
    return this;
  }

 /**
   * Número do item ou adição da declaração vinculada.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItemDeclaracaoVinculada
  **/
  @JsonProperty("numeroItemDeclaracaoVinculada")
  public String getNumeroItemDeclaracaoVinculada() {
    return numeroItemDeclaracaoVinculada;
  }

  public void setNumeroItemDeclaracaoVinculada(String numeroItemDeclaracaoVinculada) {
    this.numeroItemDeclaracaoVinculada = numeroItemDeclaracaoVinculada;
  }

  public DeclaracaoVinculada numeroItemDeclaracaoVinculada(String numeroItemDeclaracaoVinculada) {
    this.numeroItemDeclaracaoVinculada = numeroItemDeclaracaoVinculada;
    return this;
  }

 /**
   * Valor do frete (R$) do item.&lt;br&gt;O valor do frete (R$) do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \&quot;Duimp\&quot; e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do frete (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do frete (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return valorFreteReal
  **/
  @JsonProperty("valorFreteReal")
  public BigDecimal getValorFreteReal() {
    return valorFreteReal;
  }

  public void setValorFreteReal(BigDecimal valorFreteReal) {
    this.valorFreteReal = valorFreteReal;
  }

  public DeclaracaoVinculada valorFreteReal(BigDecimal valorFreteReal) {
    this.valorFreteReal = valorFreteReal;
    return this;
  }

 /**
   * Valor do seguro (R$) do item.&lt;br&gt;O valor do seguro (R$) item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \&quot;Duimp\&quot; e quando o seguro foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do seguro (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do seguro (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorSeguroReal
  **/
  @JsonProperty("valorSeguroReal")
  public BigDecimal getValorSeguroReal() {
    return valorSeguroReal;
  }

  public void setValorSeguroReal(BigDecimal valorSeguroReal) {
    this.valorSeguroReal = valorSeguroReal;
  }

  public DeclaracaoVinculada valorSeguroReal(BigDecimal valorSeguroReal) {
    this.valorSeguroReal = valorSeguroReal;
    return this;
  }

 /**
   * Unidade de medida estatística (UME) do item.&lt;br&gt;A unidade de medida estatística (UME) do item do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \&quot;Duimp\&quot; e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: unidade de medida estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou unidade de medida estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return unidadeMedidaEstatistica
  **/
  @JsonProperty("unidadeMedidaEstatistica")
  public String getUnidadeMedidaEstatistica() {
    return unidadeMedidaEstatistica;
  }

  public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
  }

  public DeclaracaoVinculada unidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    return this;
  }

 /**
   * Quantidade na unidade estatística do item.&lt;br&gt;A quantidade na unidade estatística do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \&quot;Duimp\&quot; e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: quantidade na unidade estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou quantidade na unidade estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return qtdMercadoriaUnidadeEstatistica
  **/
  @JsonProperty("qtdMercadoriaUnidadeEstatistica")
  public BigDecimal getQtdMercadoriaUnidadeEstatistica() {
    return qtdMercadoriaUnidadeEstatistica;
  }

  public void setQtdMercadoriaUnidadeEstatistica(BigDecimal qtdMercadoriaUnidadeEstatistica) {
    this.qtdMercadoriaUnidadeEstatistica = qtdMercadoriaUnidadeEstatistica;
  }

  public DeclaracaoVinculada qtdMercadoriaUnidadeEstatistica(BigDecimal qtdMercadoriaUnidadeEstatistica) {
    this.qtdMercadoriaUnidadeEstatistica = qtdMercadoriaUnidadeEstatistica;
    return this;
  }

 /**
   * Regime Aplicado ao  Item da Declaração Vinculada.&lt;br&gt;Dominio: Regimes tributários existentes no sistema Tratamento Tributário&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return itemCodigoRegime
  **/
  @JsonProperty("itemCodigoRegime")
  public Integer getItemCodigoRegime() {
    return itemCodigoRegime;
  }

  public void setItemCodigoRegime(Integer itemCodigoRegime) {
    this.itemCodigoRegime = itemCodigoRegime;
  }

  public DeclaracaoVinculada itemCodigoRegime(Integer itemCodigoRegime) {
    this.itemCodigoRegime = itemCodigoRegime;
    return this;
  }

 /**
   * Fundamento Aplicado ao Item da Declaração Vinculada&lt;br&gt;Dominio: Fundamentos legais existentes no sistema Tratamento Tributário&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return itemCodigoFundamento
  **/
  @JsonProperty("itemCodigoFundamento")
  public Integer getItemCodigoFundamento() {
    return itemCodigoFundamento;
  }

  public void setItemCodigoFundamento(Integer itemCodigoFundamento) {
    this.itemCodigoFundamento = itemCodigoFundamento;
  }

  public DeclaracaoVinculada itemCodigoFundamento(Integer itemCodigoFundamento) {
    this.itemCodigoFundamento = itemCodigoFundamento;
    return this;
  }

 /**
   * Código da NCM associada ao item da Declaração Vinculada.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return itemNcmAssociada
  **/
  @JsonProperty("itemNcmAssociada")
  public String getItemNcmAssociada() {
    return itemNcmAssociada;
  }

  public void setItemNcmAssociada(String itemNcmAssociada) {
    this.itemNcmAssociada = itemNcmAssociada;
  }

  public DeclaracaoVinculada itemNcmAssociada(String itemNcmAssociada) {
    this.itemNcmAssociada = itemNcmAssociada;
    return this;
  }

 /**
   * Mnemonico do sistema de controle Associado ao Fundamento Aplicado ao Item da Declaração Vinculada.&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return mnemonicoSistemaControle
  **/
  @JsonProperty("mnemonicoSistemaControle")
  public String getMnemonicoSistemaControle() {
    if (mnemonicoSistemaControle == null) {
      return null;
    }
    return mnemonicoSistemaControle.value();
  }

  public void setMnemonicoSistemaControle(MnemonicoSistemaControleEnum mnemonicoSistemaControle) {
    this.mnemonicoSistemaControle = mnemonicoSistemaControle;
  }

  public DeclaracaoVinculada mnemonicoSistemaControle(MnemonicoSistemaControleEnum mnemonicoSistemaControle) {
    this.mnemonicoSistemaControle = mnemonicoSistemaControle;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoVinculada {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numeroDeclaracaoVinculada: ").append(toIndentedString(numeroDeclaracaoVinculada)).append("\n");
    sb.append("    versaoDeclaracaoVinculada: ").append(toIndentedString(versaoDeclaracaoVinculada)).append("\n");
    sb.append("    numeroDeclaracaoOriginal: ").append(toIndentedString(numeroDeclaracaoOriginal)).append("\n");
    sb.append("    versaoDeclaracaoOriginal: ").append(toIndentedString(versaoDeclaracaoOriginal)).append("\n");
    sb.append("    numeroItemDeclaracaoOriginal: ").append(toIndentedString(numeroItemDeclaracaoOriginal)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    numeroItemDeclaracaoVinculada: ").append(toIndentedString(numeroItemDeclaracaoVinculada)).append("\n");
    sb.append("    valorFreteReal: ").append(toIndentedString(valorFreteReal)).append("\n");
    sb.append("    valorSeguroReal: ").append(toIndentedString(valorSeguroReal)).append("\n");
    sb.append("    unidadeMedidaEstatistica: ").append(toIndentedString(unidadeMedidaEstatistica)).append("\n");
    sb.append("    qtdMercadoriaUnidadeEstatistica: ").append(toIndentedString(qtdMercadoriaUnidadeEstatistica)).append("\n");
    sb.append("    itemCodigoRegime: ").append(toIndentedString(itemCodigoRegime)).append("\n");
    sb.append("    itemCodigoFundamento: ").append(toIndentedString(itemCodigoFundamento)).append("\n");
    sb.append("    itemNcmAssociada: ").append(toIndentedString(itemNcmAssociada)).append("\n");
    sb.append("    mnemonicoSistemaControle: ").append(toIndentedString(mnemonicoSistemaControle)).append("\n");
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

