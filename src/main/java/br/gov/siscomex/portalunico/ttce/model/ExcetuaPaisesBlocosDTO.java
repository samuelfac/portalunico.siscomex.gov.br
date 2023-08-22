package br.gov.siscomex.portalunico.ttce.model;

import br.gov.siscomex.portalunico.ttce.model.CodigoNomeBlocoExcetuaDTO;
import br.gov.siscomex.portalunico.ttce.model.CodigoNomePaisExcetuaDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
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
  private List<CodigoNomeBlocoExcetuaDTO> blocos = new ArrayList<>();

  @XmlElement(name="paises", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo o código e o nome dos Países para os quais se excetua este conjunto de Tratamentos Tributários agrupados.")
  @Valid
 /**
   * Lista contendo o código e o nome dos Países para os quais se excetua este conjunto de Tratamentos Tributários agrupados.
  **/
  private List<CodigoNomePaisExcetuaDTO> paises = new ArrayList<>();
 /**
   * Lista contendo o código e o nome dos Blocos Econômicos para os quais se excetua este conjunto de Tratamento Tributário agrupados.
   * @return blocos
  **/
  @JsonProperty("blocos")
  @NotNull
  public List<CodigoNomeBlocoExcetuaDTO> getBlocos() {
    return blocos;
  }

  public void setBlocos(List<CodigoNomeBlocoExcetuaDTO> blocos) {
    this.blocos = blocos;
  }

  public ExcetuaPaisesBlocosDTO blocos(List<CodigoNomeBlocoExcetuaDTO> blocos) {
    this.blocos = blocos;
    return this;
  }

  public ExcetuaPaisesBlocosDTO addBlocosItem(CodigoNomeBlocoExcetuaDTO blocosItem) {
    this.blocos.add(blocosItem);
    return this;
  }

 /**
   * Lista contendo o código e o nome dos Países para os quais se excetua este conjunto de Tratamentos Tributários agrupados.
   * @return paises
  **/
  @JsonProperty("paises")
  @NotNull
  public List<CodigoNomePaisExcetuaDTO> getPaises() {
    return paises;
  }

  public void setPaises(List<CodigoNomePaisExcetuaDTO> paises) {
    this.paises = paises;
  }

  public ExcetuaPaisesBlocosDTO paises(List<CodigoNomePaisExcetuaDTO> paises) {
    this.paises = paises;
    return this;
  }

  public ExcetuaPaisesBlocosDTO addPaisesItem(CodigoNomePaisExcetuaDTO paisesItem) {
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

