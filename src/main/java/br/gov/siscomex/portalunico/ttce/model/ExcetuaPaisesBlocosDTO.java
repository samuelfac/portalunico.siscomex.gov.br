package br.gov.siscomex.portalunico.ttce.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ExcetuaPaisesBlocosDTO", propOrder =
    { "blocos", "paises"
})

@XmlRootElement(name="ExcetuaPaisesBlocosDTO")
/**
  * Países/Blocos para os quais NÃO se aplicam (excetuados) este conjunto de Tratamentos Tributários agrupados.
 **/
@ApiModel(description="Países/Blocos para os quais NÃO se aplicam (excetuados) este conjunto de Tratamentos Tributários agrupados.")
public class ExcetuaPaisesBlocosDTO  {
  
  @XmlElement(name="blocos", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo o código e o nome dos Blocos Econômicos para os quais se excetua este conjunto de Tratamento Tributário agrupados.")
  @Valid
 /**
   * Lista contendo o código e o nome dos Blocos Econômicos para os quais se excetua este conjunto de Tratamento Tributário agrupados.
  **/
  private List<CodigoNomeBlocoDTO> blocos = new ArrayList<>();

  @XmlElement(name="paises", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo o código e o nome dos Países para os quais se excetua este conjunto de Tratamentos Tributários agrupados.")
  @Valid
 /**
   * Lista contendo o código e o nome dos Países para os quais se excetua este conjunto de Tratamentos Tributários agrupados.
  **/
  private List<CodigoNomePaisDTO> paises = new ArrayList<>();
 /**
   * Lista contendo o código e o nome dos Blocos Econômicos para os quais se excetua este conjunto de Tratamento Tributário agrupados.
   * @return blocos
  **/
  @JsonProperty("blocos")
  @NotNull
  public List<CodigoNomeBlocoDTO> getBlocos() {
    return blocos;
  }

  public void setBlocos(List<CodigoNomeBlocoDTO> blocos) {
    this.blocos = blocos;
  }

  public ExcetuaPaisesBlocosDTO blocos(List<CodigoNomeBlocoDTO> blocos) {
    this.blocos = blocos;
    return this;
  }

  public ExcetuaPaisesBlocosDTO addBlocosItem(CodigoNomeBlocoDTO blocosItem) {
    this.blocos.add(blocosItem);
    return this;
  }

 /**
   * Lista contendo o código e o nome dos Países para os quais se excetua este conjunto de Tratamentos Tributários agrupados.
   * @return paises
  **/
  @JsonProperty("paises")
  @NotNull
  public List<CodigoNomePaisDTO> getPaises() {
    return paises;
  }

  public void setPaises(List<CodigoNomePaisDTO> paises) {
    this.paises = paises;
  }

  public ExcetuaPaisesBlocosDTO paises(List<CodigoNomePaisDTO> paises) {
    this.paises = paises;
    return this;
  }

  public ExcetuaPaisesBlocosDTO addPaisesItem(CodigoNomePaisDTO paisesItem) {
    this.paises.add(paisesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcetuaPaisesBlocosDTO {\n");
    
    sb.append("    blocos: ").append(toIndentedString(blocos)).append("\n");
    sb.append("    paises: ").append(toIndentedString(paises)).append("\n");
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

