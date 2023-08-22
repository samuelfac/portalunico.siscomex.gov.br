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
 @XmlType(name = "SituacaoLpco", propOrder =
    { "id", "descricao"
})

@XmlRootElement(name="SituacaoLpco")
/**
  * Situações possíveis em que se encontra um pedido de LPCO
 **/
@ApiModel(description="Situações possíveis em que se encontra um pedido de LPCO")
public class SituacaoLpco  {
  

@XmlType(name="IdEnum")
@XmlEnum(String.class)
public enum IdEnum {

	@XmlEnumValue("PARA_ANALISE")
	@JsonProperty("PARA_ANALISE")
	PARA_ANALISE(String.valueOf("PARA_ANALISE")),
	
	@XmlEnumValue("EM_ANALISE")
	@JsonProperty("EM_ANALISE")
	EM_ANALISE(String.valueOf("EM_ANALISE")),
	
	@XmlEnumValue("INDEFERIDO")
	@JsonProperty("INDEFERIDO")
	INDEFERIDO(String.valueOf("INDEFERIDO")),
	
	@XmlEnumValue("EM_EXIGENCIA")
	@JsonProperty("EM_EXIGENCIA")
	EM_EXIGENCIA(String.valueOf("EM_EXIGENCIA")),
	
	@XmlEnumValue("RESPOSTA_EXIGENCIA")
	@JsonProperty("RESPOSTA_EXIGENCIA")
	RESPOSTA_EXIGENCIA(String.valueOf("RESPOSTA_EXIGENCIA")),
	
	@XmlEnumValue("CANCELADO")
	@JsonProperty("CANCELADO")
	CANCELADO(String.valueOf("CANCELADO")),
	
	@XmlEnumValue("DEFERIDO")
	@JsonProperty("DEFERIDO")
	DEFERIDO(String.valueOf("DEFERIDO")),
	
	@XmlEnumValue("VENCIDO")
	@JsonProperty("VENCIDO")
	VENCIDO(String.valueOf("VENCIDO")),
	
	@XmlEnumValue("ANULADO_REVOGADO")
	@JsonProperty("ANULADO_REVOGADO")
	ANULADO_REVOGADO(String.valueOf("ANULADO_REVOGADO")),
	
	@XmlEnumValue("EM_VERIFICACAO")
	@JsonProperty("EM_VERIFICACAO")
	EM_VERIFICACAO(String.valueOf("EM_VERIFICACAO")),
	
	@XmlEnumValue("EM_INSPECAO")
	@JsonProperty("EM_INSPECAO")
	EM_INSPECAO(String.valueOf("EM_INSPECAO")),
	
	@XmlEnumValue("AGUARDANDO_PAGAMENTO")
	@JsonProperty("AGUARDANDO_PAGAMENTO")
	AGUARDANDO_PAGAMENTO(String.valueOf("AGUARDANDO_PAGAMENTO")),
	
	@XmlEnumValue("AUTORIZACAO_IMPORTACAO_EMITIDA")
	@JsonProperty("AUTORIZACAO_IMPORTACAO_EMITIDA")
	AUTORIZACAO_IMPORTACAO_EMITIDA(String.valueOf("AUTORIZACAO_IMPORTACAO_EMITIDA")),
	
	@XmlEnumValue("PARAMETRIZADO")
	@JsonProperty("PARAMETRIZADO")
	PARAMETRIZADO(String.valueOf("PARAMETRIZADO")),
	
	@XmlEnumValue("CONFERENCIA_DOCUMENTAL")
	@JsonProperty("CONFERENCIA_DOCUMENTAL")
	CONFERENCIA_DOCUMENTAL(String.valueOf("CONFERENCIA_DOCUMENTAL")),
	
	@XmlEnumValue("INSPECAO_FISICA")
	@JsonProperty("INSPECAO_FISICA")
	INSPECAO_FISICA(String.valueOf("INSPECAO_FISICA")),
	
	@XmlEnumValue("RECURSO_INDEFERIMENTO")
	@JsonProperty("RECURSO_INDEFERIMENTO")
	RECURSO_INDEFERIMENTO(String.valueOf("RECURSO_INDEFERIMENTO"));


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
  @ApiModelProperty(example = "DEFERIDO", required = true, value = "Identificador da situação")
 /**
   * Identificador da situação
  **/
  private IdEnum id = null;


@XmlType(name="DescricaoEnum")
@XmlEnum(String.class)
public enum DescricaoEnum {

	@XmlEnumValue("Para análise")
	@JsonProperty("Para análise")
	PARA_AN_LISE(String.valueOf("Para análise")),
	
	@XmlEnumValue("Em análise")
	@JsonProperty("Em análise")
	EM_AN_LISE(String.valueOf("Em análise")),
	
	@XmlEnumValue("Indeferido")
	@JsonProperty("Indeferido")
	INDEFERIDO(String.valueOf("Indeferido")),
	
	@XmlEnumValue("Em exigência")
	@JsonProperty("Em exigência")
	EM_EXIG_NCIA(String.valueOf("Em exigência")),
	
	@XmlEnumValue("Resposta de exigência")
	@JsonProperty("Resposta de exigência")
	RESPOSTA_DE_EXIG_NCIA(String.valueOf("Resposta de exigência")),
	
	@XmlEnumValue("Cancelado")
	@JsonProperty("Cancelado")
	CANCELADO(String.valueOf("Cancelado")),
	
	@XmlEnumValue("Deferido")
	@JsonProperty("Deferido")
	DEFERIDO(String.valueOf("Deferido")),
	
	@XmlEnumValue("Vencido")
	@JsonProperty("Vencido")
	VENCIDO(String.valueOf("Vencido")),
	
	@XmlEnumValue("Anulado/Revogado")
	@JsonProperty("Anulado/Revogado")
	ANULADO_REVOGADO(String.valueOf("Anulado/Revogado")),
	
	@XmlEnumValue("Em verificação")
	@JsonProperty("Em verificação")
	EM_VERIFICA_O(String.valueOf("Em verificação")),
	
	@XmlEnumValue("Em inspeção")
	@JsonProperty("Em inspeção")
	EM_INSPE_O(String.valueOf("Em inspeção")),
	
	@XmlEnumValue("Aguardando pagamento")
	@JsonProperty("Aguardando pagamento")
	AGUARDANDO_PAGAMENTO(String.valueOf("Aguardando pagamento")),
	
	@XmlEnumValue("Autorização de importação emitida")
	@JsonProperty("Autorização de importação emitida")
	AUTORIZA_O_DE_IMPORTA_O_EMITIDA(String.valueOf("Autorização de importação emitida")),
	
	@XmlEnumValue("Parametrizado")
	@JsonProperty("Parametrizado")
	PARAMETRIZADO(String.valueOf("Parametrizado")),
	
	@XmlEnumValue("Conferência documental")
	@JsonProperty("Conferência documental")
	CONFER_NCIA_DOCUMENTAL(String.valueOf("Conferência documental")),
	
	@XmlEnumValue("Inspeção física")
	@JsonProperty("Inspeção física")
	INSPE_O_F_SICA(String.valueOf("Inspeção física")),
	
	@XmlEnumValue("Recurso de indeferimento")
	@JsonProperty("Recurso de indeferimento")
	RECURSO_DE_INDEFERIMENTO(String.valueOf("Recurso de indeferimento"));


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
  @ApiModelProperty(example = "Deferido", value = "Descrição da situação")
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

  public SituacaoLpco id(IdEnum id) {
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

  public SituacaoLpco descricao(DescricaoEnum descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoLpco {\n");
    
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

