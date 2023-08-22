package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AplicaPaisesBlocosDTO", propOrder =
    { "indicadorTodosPaises", "paises", "blocos"
})

@XmlRootElement(name="AplicaPaisesBlocosDTO")
/**
  * Países e Blocos para as quais se aplicam este conjunto de Tratamentos Tributários agrupados.
 **/
@ApiModel(description="Países e Blocos para as quais se aplicam este conjunto de Tratamentos Tributários agrupados.")
public class AplicaPaisesBlocosDTO  {
  
  @XmlElement(name="indicadorTodosPaises", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indicador de que estes Tratamentos Tributários agrupados se aplicam para todos os países.<br/><br>Dominio:<br>true - Sim, <br>false - Não")
 /**
   * Indicador de que estes Tratamentos Tributários agrupados se aplicam para todos os países.<br/><br>Dominio:<br>true - Sim, <br>false - Não
  **/
  private Boolean indicadorTodosPaises = null;

  @XmlElement(name="paises", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo o código e nome dos Países para os quais se aplica este conjunto de Tratamentos Tributários agrupados.")
  @Valid
 /**
   * Lista contendo o código e nome dos Países para os quais se aplica este conjunto de Tratamentos Tributários agrupados.
  **/
  private List<CodigoNomePaisAplicaDTO> paises = new ArrayList<>();

  @XmlElement(name="blocos", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo o código e nome dos Blocos Econômicos para os quais se aplica este conjunto de Tratamentos Tributários agrupados.")
  @Valid
 /**
   * Lista contendo o código e nome dos Blocos Econômicos para os quais se aplica este conjunto de Tratamentos Tributários agrupados.
  **/
  private List<CodigoNomeBlocoAplicaDTO> blocos = new ArrayList<>();
 /**
   * Indicador de que estes Tratamentos Tributários agrupados se aplicam para todos os países.&lt;br/&gt;&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
   * @return indicadorTodosPaises
  **/
  @JsonProperty("indicadorTodosPaises")
  @NotNull
  public Boolean isIndicadorTodosPaises() {
    return indicadorTodosPaises;
  }

  public void setIndicadorTodosPaises(Boolean indicadorTodosPaises) {
    this.indicadorTodosPaises = indicadorTodosPaises;
  }

  public AplicaPaisesBlocosDTO indicadorTodosPaises(Boolean indicadorTodosPaises) {
    this.indicadorTodosPaises = indicadorTodosPaises;
    return this;
  }

 /**
   * Lista contendo o código e nome dos Países para os quais se aplica este conjunto de Tratamentos Tributários agrupados.
   * @return paises
  **/
  @JsonProperty("paises")
  @NotNull
  public List<CodigoNomePaisAplicaDTO> getPaises() {
    return paises;
  }

  public void setPaises(List<CodigoNomePaisAplicaDTO> paises) {
    this.paises = paises;
  }

  public AplicaPaisesBlocosDTO paises(List<CodigoNomePaisAplicaDTO> paises) {
    this.paises = paises;
    return this;
  }

  public AplicaPaisesBlocosDTO addPaisesItem(CodigoNomePaisAplicaDTO paisesItem) {
    this.paises.add(paisesItem);
    return this;
  }

 /**
   * Lista contendo o código e nome dos Blocos Econômicos para os quais se aplica este conjunto de Tratamentos Tributários agrupados.
   * @return blocos
  **/
  @JsonProperty("blocos")
  @NotNull
  public List<CodigoNomeBlocoAplicaDTO> getBlocos() {
    return blocos;
  }

  public void setBlocos(List<CodigoNomeBlocoAplicaDTO> blocos) {
    this.blocos = blocos;
  }

  public AplicaPaisesBlocosDTO blocos(List<CodigoNomeBlocoAplicaDTO> blocos) {
    this.blocos = blocos;
    return this;
  }

  public AplicaPaisesBlocosDTO addBlocosItem(CodigoNomeBlocoAplicaDTO blocosItem) {
    this.blocos.add(blocosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicaPaisesBlocosDTO {\n");
    
    sb.append("    indicadorTodosPaises: ").append(toIndentedString(indicadorTodosPaises)).append("\n");
    sb.append("    paises: ").append(toIndentedString(paises)).append("\n");
    sb.append("    blocos: ").append(toIndentedString(blocos)).append("\n");
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

