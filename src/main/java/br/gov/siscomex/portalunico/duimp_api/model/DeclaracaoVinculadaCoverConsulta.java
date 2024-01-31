package br.gov.siscomex.portalunico.duimp_api.model;

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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaracaoVinculadaCoverConsulta", propOrder =
    { "tipo", "numeroDeclaracaoVinculada", "versaoDeclaracaoVinculada", "dataRegistro", "numeroDeclaracaoOriginal", "versaoDeclaracaoOriginal", "numeroItemDeclaracaoOriginal", "item"
})

@XmlRootElement(name="DeclaracaoVinculadaCoverConsulta")
/**
  * Lista de declarações aduaneiras vinculadas.
 **/
@ApiModel(description="Lista de declarações aduaneiras vinculadas.")
public class DeclaracaoVinculadaCoverConsulta  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP")),
	
	@XmlEnumValue("DUE")
	@JsonProperty("DUE")
	DUE(String.valueOf("DUE")),
	
	@XmlEnumValue("DI")
	@JsonProperty("DI")
	DI(String.valueOf("DI")),
	
	@XmlEnumValue("DE")
	@JsonProperty("DE")
	DE(String.valueOf("DE"));


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
  @ApiModelProperty(example = "DUIMP", value = "Tipo de declaração vinculada.<br>Domínio:")
 /**
   * Tipo de declaração vinculada.<br>Domínio:
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="numeroDeclaracaoVinculada")
  @ApiModelProperty(example = "23BR00001010550", value = "Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16")
 /**
   * Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16
  **/
  private String numeroDeclaracaoVinculada = null;

  @XmlElement(name="versaoDeclaracaoVinculada")
  @ApiModelProperty(example = "1", value = "Versão da declaração vinculada vigente no registro da Duimp consultada. Este atributo é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo")
 /**
   * Versão da declaração vinculada vigente no registro da Duimp consultada. Este atributo é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo
  **/
  private String versaoDeclaracaoVinculada = null;

  @XmlElement(name="dataRegistro")
  @ApiModelProperty(value = "Data de Registro<br>A data de registro é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a data/hora de registro da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a data/hora de registro da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho")
 /**
   * Data de Registro<br>A data de registro é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a data/hora de registro da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a data/hora de registro da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho
  **/
  private OffsetDateTime dataRegistro = null;

  @XmlElement(name="numeroDeclaracaoOriginal")
  @ApiModelProperty(example = "23BR00001010550", value = "Número da declaração original relacionada à declaração vinculada.<br>O número da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)")
 /**
   * Número da declaração original relacionada à declaração vinculada.<br>O número da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
  **/
  private String numeroDeclaracaoOriginal = null;

  @XmlElement(name="versaoDeclaracaoOriginal")
  @ApiModelProperty(example = "1", value = "Versão da declaração original relacionada à declaração vinculada.<br>A versão da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a versão da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a versão da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.")
 /**
   * Versão da declaração original relacionada à declaração vinculada.<br>A versão da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a versão da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a versão da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.
  **/
  private String versaoDeclaracaoOriginal = null;

  @XmlElement(name="numeroItemDeclaracaoOriginal")
  @ApiModelProperty(example = "10001", value = "Item da declaração original relacionada à declaração vinculada.<br>O número do item original é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Item da declaração original relacionada à declaração vinculada.<br>O número do item original é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private Integer numeroItemDeclaracaoOriginal = null;

  @XmlElement(name="item")
  @ApiModelProperty(value = "")
  @Valid
  private ItemDeclaracaoVinculadaCover item = null;
 /**
   * Tipo de declaração vinculada.&lt;br&gt;Domínio:
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

  public DeclaracaoVinculadaCoverConsulta tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Número da Declaração.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 16
   * @return numeroDeclaracaoVinculada
  **/
  @JsonProperty("numeroDeclaracaoVinculada")
  public String getNumeroDeclaracaoVinculada() {
    return numeroDeclaracaoVinculada;
  }

  public void setNumeroDeclaracaoVinculada(String numeroDeclaracaoVinculada) {
    this.numeroDeclaracaoVinculada = numeroDeclaracaoVinculada;
  }

  public DeclaracaoVinculadaCoverConsulta numeroDeclaracaoVinculada(String numeroDeclaracaoVinculada) {
    this.numeroDeclaracaoVinculada = numeroDeclaracaoVinculada;
    return this;
  }

 /**
   * Versão da declaração vinculada vigente no registro da Duimp consultada. Este atributo é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo
   * @return versaoDeclaracaoVinculada
  **/
  @JsonProperty("versaoDeclaracaoVinculada")
  public String getVersaoDeclaracaoVinculada() {
    return versaoDeclaracaoVinculada;
  }

  public void setVersaoDeclaracaoVinculada(String versaoDeclaracaoVinculada) {
    this.versaoDeclaracaoVinculada = versaoDeclaracaoVinculada;
  }

  public DeclaracaoVinculadaCoverConsulta versaoDeclaracaoVinculada(String versaoDeclaracaoVinculada) {
    this.versaoDeclaracaoVinculada = versaoDeclaracaoVinculada;
    return this;
  }

 /**
   * Data de Registro&lt;br&gt;A data de registro é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a data/hora de registro da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a data/hora de registro da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  public OffsetDateTime getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public DeclaracaoVinculadaCoverConsulta dataRegistro(OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Número da declaração original relacionada à declaração vinculada.&lt;br&gt;O número da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* AA &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* BR &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* SSSSSSSSSS &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* D &#x3D; 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
   * @return numeroDeclaracaoOriginal
  **/
  @JsonProperty("numeroDeclaracaoOriginal")
  public String getNumeroDeclaracaoOriginal() {
    return numeroDeclaracaoOriginal;
  }

  public void setNumeroDeclaracaoOriginal(String numeroDeclaracaoOriginal) {
    this.numeroDeclaracaoOriginal = numeroDeclaracaoOriginal;
  }

  public DeclaracaoVinculadaCoverConsulta numeroDeclaracaoOriginal(String numeroDeclaracaoOriginal) {
    this.numeroDeclaracaoOriginal = numeroDeclaracaoOriginal;
    return this;
  }

 /**
   * Versão da declaração original relacionada à declaração vinculada.&lt;br&gt;A versão da declaração original é informada apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: a versão da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou a versão da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.
   * @return versaoDeclaracaoOriginal
  **/
  @JsonProperty("versaoDeclaracaoOriginal")
  public String getVersaoDeclaracaoOriginal() {
    return versaoDeclaracaoOriginal;
  }

  public void setVersaoDeclaracaoOriginal(String versaoDeclaracaoOriginal) {
    this.versaoDeclaracaoOriginal = versaoDeclaracaoOriginal;
  }

  public DeclaracaoVinculadaCoverConsulta versaoDeclaracaoOriginal(String versaoDeclaracaoOriginal) {
    this.versaoDeclaracaoOriginal = versaoDeclaracaoOriginal;
    return this;
  }

 /**
   * Item da declaração original relacionada à declaração vinculada.&lt;br&gt;O número do item original é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o número do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o número do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItemDeclaracaoOriginal
  **/
  @JsonProperty("numeroItemDeclaracaoOriginal")
  public Integer getNumeroItemDeclaracaoOriginal() {
    return numeroItemDeclaracaoOriginal;
  }

  public void setNumeroItemDeclaracaoOriginal(Integer numeroItemDeclaracaoOriginal) {
    this.numeroItemDeclaracaoOriginal = numeroItemDeclaracaoOriginal;
  }

  public DeclaracaoVinculadaCoverConsulta numeroItemDeclaracaoOriginal(Integer numeroItemDeclaracaoOriginal) {
    this.numeroItemDeclaracaoOriginal = numeroItemDeclaracaoOriginal;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public ItemDeclaracaoVinculadaCover getItem() {
    return item;
  }

  public void setItem(ItemDeclaracaoVinculadaCover item) {
    this.item = item;
  }

  public DeclaracaoVinculadaCoverConsulta item(ItemDeclaracaoVinculadaCover item) {
    this.item = item;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoVinculadaCoverConsulta {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numeroDeclaracaoVinculada: ").append(toIndentedString(numeroDeclaracaoVinculada)).append("\n");
    sb.append("    versaoDeclaracaoVinculada: ").append(toIndentedString(versaoDeclaracaoVinculada)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    numeroDeclaracaoOriginal: ").append(toIndentedString(numeroDeclaracaoOriginal)).append("\n");
    sb.append("    versaoDeclaracaoOriginal: ").append(toIndentedString(versaoDeclaracaoOriginal)).append("\n");
    sb.append("    numeroItemDeclaracaoOriginal: ").append(toIndentedString(numeroItemDeclaracaoOriginal)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

