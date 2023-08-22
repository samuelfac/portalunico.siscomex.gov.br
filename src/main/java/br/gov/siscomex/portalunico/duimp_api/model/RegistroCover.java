package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RegistroCover", propOrder =
    { "totalItem", "pagamentos", "confirmacaoAlertaErrosNaoImpeditivos"
})

@XmlRootElement(name="RegistroCover")
public class RegistroCover  {
  
  @XmlElement(name="totalItem", required = true)
  @ApiModelProperty(example = "3", required = true, value = "Número total de itens já enviados e salvos.<br>Formato: Inteiro, com até 5 dígitos<br>Valor mínimo: 0<br>Valor máximo: 99999")
 /**
   * Número total de itens já enviados e salvos.<br>Formato: Inteiro, com até 5 dígitos<br>Valor mínimo: 0<br>Valor máximo: 99999
  **/
  private Integer totalItem = null;

  @XmlElement(name="pagamentos", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<PagamentoRegistroCover> pagamentos = new ArrayList<>();


@XmlType(name="ConfirmacaoAlertaErrosNaoImpeditivosEnum")
@XmlEnum(String.class)
public enum ConfirmacaoAlertaErrosNaoImpeditivosEnum {

	@XmlEnumValue("SIM")
	@JsonProperty("SIM")
	SIM(String.valueOf("SIM")),
	
	@XmlEnumValue("NAO")
	@JsonProperty("NAO")
	NAO(String.valueOf("NAO")),
	
	@XmlEnumValue("NA")
	@JsonProperty("NA")
	NA(String.valueOf("NA"));


    private String value;

    ConfirmacaoAlertaErrosNaoImpeditivosEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConfirmacaoAlertaErrosNaoImpeditivosEnum fromValue(String v) {
        for (ConfirmacaoAlertaErrosNaoImpeditivosEnum b : ConfirmacaoAlertaErrosNaoImpeditivosEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ConfirmacaoAlertaErrosNaoImpeditivosEnum");
    }
}

  @XmlElement(name="confirmacaoAlertaErrosNaoImpeditivos", required = true)
  @ApiModelProperty(example = "SIM", required = true, value = "Indica se a Duimp deve ser registrada mesmo com a existência de erros não impeditivos.<br>Domínio:")
 /**
   * Indica se a Duimp deve ser registrada mesmo com a existência de erros não impeditivos.<br>Domínio:
  **/
  private ConfirmacaoAlertaErrosNaoImpeditivosEnum confirmacaoAlertaErrosNaoImpeditivos = null;
 /**
   * Número total de itens já enviados e salvos.&lt;br&gt;Formato: Inteiro, com até 5 dígitos&lt;br&gt;Valor mínimo: 0&lt;br&gt;Valor máximo: 99999
   * @return totalItem
  **/
  @JsonProperty("totalItem")
  @NotNull
  public Integer getTotalItem() {
    return totalItem;
  }

  public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
  }

  public RegistroCover totalItem(Integer totalItem) {
    this.totalItem = totalItem;
    return this;
  }

 /**
   * Get pagamentos
   * @return pagamentos
  **/
  @JsonProperty("pagamentos")
  @NotNull
  public List<PagamentoRegistroCover> getPagamentos() {
    return pagamentos;
  }

  public void setPagamentos(List<PagamentoRegistroCover> pagamentos) {
    this.pagamentos = pagamentos;
  }

  public RegistroCover pagamentos(List<PagamentoRegistroCover> pagamentos) {
    this.pagamentos = pagamentos;
    return this;
  }

  public RegistroCover addPagamentosItem(PagamentoRegistroCover pagamentosItem) {
    this.pagamentos.add(pagamentosItem);
    return this;
  }

 /**
   * Indica se a Duimp deve ser registrada mesmo com a existência de erros não impeditivos.&lt;br&gt;Domínio:
   * @return confirmacaoAlertaErrosNaoImpeditivos
  **/
  @JsonProperty("confirmacaoAlertaErrosNaoImpeditivos")
  @NotNull
  public String getConfirmacaoAlertaErrosNaoImpeditivos() {
    if (confirmacaoAlertaErrosNaoImpeditivos == null) {
      return null;
    }
    return confirmacaoAlertaErrosNaoImpeditivos.value();
  }

  public void setConfirmacaoAlertaErrosNaoImpeditivos(ConfirmacaoAlertaErrosNaoImpeditivosEnum confirmacaoAlertaErrosNaoImpeditivos) {
    this.confirmacaoAlertaErrosNaoImpeditivos = confirmacaoAlertaErrosNaoImpeditivos;
  }

  public RegistroCover confirmacaoAlertaErrosNaoImpeditivos(ConfirmacaoAlertaErrosNaoImpeditivosEnum confirmacaoAlertaErrosNaoImpeditivos) {
    this.confirmacaoAlertaErrosNaoImpeditivos = confirmacaoAlertaErrosNaoImpeditivos;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistroCover {\n");
    
    sb.append("    totalItem: ").append(toIndentedString(totalItem)).append("\n");
    sb.append("    pagamentos: ").append(toIndentedString(pagamentos)).append("\n");
    sb.append("    confirmacaoAlertaErrosNaoImpeditivos: ").append(toIndentedString(confirmacaoAlertaErrosNaoImpeditivos)).append("\n");
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

