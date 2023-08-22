package br.gov.siscomex.portalunico.duimp.model;

import br.gov.siscomex.portalunico.duimp.model.PasDeProcednciaDaMercadoriaObjetoCompostoPelosAtributosCdigoEDescrio;
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
 @XmlType(name = "ExportadorEstrangeiroCover", propOrder =
    { "relacaoExportadorFabricante", "vinculacaoCompradorVendedor", "codigoOperadorExportador", "paisOperadorExportador"
})

@XmlRootElement(name="ExportadorEstrangeiroCover")
/**
  * Dados de Operador Estrangeiro
 **/
@ApiModel(description="Dados de Operador Estrangeiro")
public class ExportadorEstrangeiroCover  {
  

@XmlType(name="RelacaoExportadorFabricanteEnum")
@XmlEnum(String.class)
public enum RelacaoExportadorFabricanteEnum {

	@XmlEnumValue("0")
	@JsonProperty("0")
	_0(String.valueOf("0")),
	
	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1"));


    private String value;

    RelacaoExportadorFabricanteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RelacaoExportadorFabricanteEnum fromValue(String v) {
        for (RelacaoExportadorFabricanteEnum b : RelacaoExportadorFabricanteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to RelacaoExportadorFabricanteEnum");
    }
}

  @XmlElement(name="relacaoExportadorFabricante")
  @ApiModelProperty(example = "1", value = "Relação exportador x fabricante.<br>Dominio:<br>0 - Exportador é diferente do fabricante,<br>1 - exportador é fabricante")
 /**
   * Relação exportador x fabricante.<br>Dominio:<br>0 - Exportador é diferente do fabricante,<br>1 - exportador é fabricante
  **/
  private RelacaoExportadorFabricanteEnum relacaoExportadorFabricante = null;


@XmlType(name="VinculacaoCompradorVendedorEnum")
@XmlEnum(String.class)
public enum VinculacaoCompradorVendedorEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3"));


    private String value;

    VinculacaoCompradorVendedorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VinculacaoCompradorVendedorEnum fromValue(String v) {
        for (VinculacaoCompradorVendedorEnum b : VinculacaoCompradorVendedorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to VinculacaoCompradorVendedorEnum");
    }
}

  @XmlElement(name="vinculacaoCompradorVendedor")
  @ApiModelProperty(example = "1", value = "Vinculação comprador x vendedor.<br>Dominio:<br>1 - Não há vinculação, <br>2 - Vinculação sem influência no preço,<br> 3 - Vinculação com influência no preço")
 /**
   * Vinculação comprador x vendedor.<br>Dominio:<br>1 - Não há vinculação, <br>2 - Vinculação sem influência no preço,<br> 3 - Vinculação com influência no preço
  **/
  private VinculacaoCompradorVendedorEnum vinculacaoCompradorVendedor = null;

  @XmlElement(name="codigoOperadorExportador")
  @ApiModelProperty(example = "CN001", value = "Código do exportador estrangeiro (TIN)<br>Tamanho mínimo: 1<br>Tamanho máximo: 35")
 /**
   * Código do exportador estrangeiro (TIN)<br>Tamanho mínimo: 1<br>Tamanho máximo: 35
  **/
  private String codigoOperadorExportador = null;

  @XmlElement(name="paisOperadorExportador")
  @ApiModelProperty(value = "")
  @Valid
  private PasDeProcednciaDaMercadoriaObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorExportador = null;
 /**
   * Relação exportador x fabricante.&lt;br&gt;Dominio:&lt;br&gt;0 - Exportador é diferente do fabricante,&lt;br&gt;1 - exportador é fabricante
   * @return relacaoExportadorFabricante
  **/
  @JsonProperty("relacaoExportadorFabricante")
  public String getRelacaoExportadorFabricante() {
    if (relacaoExportadorFabricante == null) {
      return null;
    }
    return relacaoExportadorFabricante.value();
  }

  public void setRelacaoExportadorFabricante(RelacaoExportadorFabricanteEnum relacaoExportadorFabricante) {
    this.relacaoExportadorFabricante = relacaoExportadorFabricante;
  }

  public ExportadorEstrangeiroCover relacaoExportadorFabricante(RelacaoExportadorFabricanteEnum relacaoExportadorFabricante) {
    this.relacaoExportadorFabricante = relacaoExportadorFabricante;
    return this;
  }

 /**
   * Vinculação comprador x vendedor.&lt;br&gt;Dominio:&lt;br&gt;1 - Não há vinculação, &lt;br&gt;2 - Vinculação sem influência no preço,&lt;br&gt; 3 - Vinculação com influência no preço
   * @return vinculacaoCompradorVendedor
  **/
  @JsonProperty("vinculacaoCompradorVendedor")
  public String getVinculacaoCompradorVendedor() {
    if (vinculacaoCompradorVendedor == null) {
      return null;
    }
    return vinculacaoCompradorVendedor.value();
  }

  public void setVinculacaoCompradorVendedor(VinculacaoCompradorVendedorEnum vinculacaoCompradorVendedor) {
    this.vinculacaoCompradorVendedor = vinculacaoCompradorVendedor;
  }

  public ExportadorEstrangeiroCover vinculacaoCompradorVendedor(VinculacaoCompradorVendedorEnum vinculacaoCompradorVendedor) {
    this.vinculacaoCompradorVendedor = vinculacaoCompradorVendedor;
    return this;
  }

 /**
   * Código do exportador estrangeiro (TIN)&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35
   * @return codigoOperadorExportador
  **/
  @JsonProperty("codigoOperadorExportador")
  public String getCodigoOperadorExportador() {
    return codigoOperadorExportador;
  }

  public void setCodigoOperadorExportador(String codigoOperadorExportador) {
    this.codigoOperadorExportador = codigoOperadorExportador;
  }

  public ExportadorEstrangeiroCover codigoOperadorExportador(String codigoOperadorExportador) {
    this.codigoOperadorExportador = codigoOperadorExportador;
    return this;
  }

 /**
   * Get paisOperadorExportador
   * @return paisOperadorExportador
  **/
  @JsonProperty("paisOperadorExportador")
  public PasDeProcednciaDaMercadoriaObjetoCompostoPelosAtributosCdigoEDescrio getPaisOperadorExportador() {
    return paisOperadorExportador;
  }

  public void setPaisOperadorExportador(PasDeProcednciaDaMercadoriaObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorExportador) {
    this.paisOperadorExportador = paisOperadorExportador;
  }

  public ExportadorEstrangeiroCover paisOperadorExportador(PasDeProcednciaDaMercadoriaObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorExportador) {
    this.paisOperadorExportador = paisOperadorExportador;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportadorEstrangeiroCover {\n");
    
    sb.append("    relacaoExportadorFabricante: ").append(toIndentedString(relacaoExportadorFabricante)).append("\n");
    sb.append("    vinculacaoCompradorVendedor: ").append(toIndentedString(vinculacaoCompradorVendedor)).append("\n");
    sb.append("    codigoOperadorExportador: ").append(toIndentedString(codigoOperadorExportador)).append("\n");
    sb.append("    paisOperadorExportador: ").append(toIndentedString(paisOperadorExportador)).append("\n");
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

