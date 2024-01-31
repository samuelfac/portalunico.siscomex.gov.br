package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SituacaoPagamentoTaxa", propOrder =
    { "id", "descricao"
})

@XmlRootElement(name="SituacaoPagamentoTaxa")
/**
  * Situações possíveis em que se encontra o pagamento quando há taxa
 **/
@ApiModel(description="Situações possíveis em que se encontra o pagamento quando há taxa")
public class SituacaoPagamentoTaxa  {
  

@XmlType(name="IdEnum")
@XmlEnum(String.class)
public enum IdEnum {

	@XmlEnumValue("SEM_ERRO")
	@JsonProperty("SEM_ERRO")
	SEM_ERRO(String.valueOf("SEM_ERRO")),
	
	@XmlEnumValue("ERRO_SEM_TENTATIVA")
	@JsonProperty("ERRO_SEM_TENTATIVA")
	ERRO_SEM_TENTATIVA(String.valueOf("ERRO_SEM_TENTATIVA")),
	
	@XmlEnumValue("ERRO_COM_TENTATIVA")
	@JsonProperty("ERRO_COM_TENTATIVA")
	ERRO_COM_TENTATIVA(String.valueOf("ERRO_COM_TENTATIVA"));


    private String value;

    IdEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IdEnum fromValue(String v) {
        for (IdEnum b : IdEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IdEnum");
    }
}

  @XmlElement(name="id", required = true)
  @ApiModelProperty(example = "SEM_ERRO", required = true, value = "Identificador da situação")
 /**
   * Identificador da situação
  **/
  private IdEnum id = null;


@XmlType(name="DescricaoEnum")
@XmlEnum(String.class)
public enum DescricaoEnum {

	@XmlEnumValue("Sem erro")
	@JsonProperty("Sem erro")
	SEM_ERRO(String.valueOf("Sem erro")),
	
	@XmlEnumValue("Com erro sem nova tentativa")
	@JsonProperty("Com erro sem nova tentativa")
	COM_ERRO_SEM_NOVA_TENTATIVA(String.valueOf("Com erro sem nova tentativa")),
	
	@XmlEnumValue("Com erro e com nova tentativa")
	@JsonProperty("Com erro e com nova tentativa")
	COM_ERRO_E_COM_NOVA_TENTATIVA(String.valueOf("Com erro e com nova tentativa"));


    private String value;

    DescricaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DescricaoEnum fromValue(String v) {
        for (DescricaoEnum b : DescricaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to DescricaoEnum");
    }
}

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Sem erro", value = "Descrição da situação")
 /**
   * Descrição da situação
  **/
  private DescricaoEnum descricao = null;
 /**
   * Identificador da situação
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    if (id == null) {
      return null;
    }
    return id.value();
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  public SituacaoPagamentoTaxa id(IdEnum id) {
    this.id = id;
    return this;
  }

 /**
   * Descrição da situação
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    if (descricao == null) {
      return null;
    }
    return descricao.value();
  }

  public void setDescricao(DescricaoEnum descricao) {
    this.descricao = descricao;
  }

  public SituacaoPagamentoTaxa descricao(DescricaoEnum descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoPagamentoTaxa {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

