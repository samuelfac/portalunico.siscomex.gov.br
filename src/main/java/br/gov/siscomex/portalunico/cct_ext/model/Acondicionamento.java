package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.CargaSoltaVeiculo;
import br.gov.siscomex.portalunico.cct_ext.model.Conteiner;
import br.gov.siscomex.portalunico.cct_ext.model.Embalagem;
import br.gov.siscomex.portalunico.cct_ext.model.Granel;
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
 @XmlType(name = "Acondicionamento", propOrder =
    { "listaConteiner", "listaEmbalagem", "listaCargaSolta", "listaGranel"
})

@XmlRootElement(name="Acondicionamento")
/**
  * Dados sobre o acondicionamento da carga
 **/
@ApiModel(description="Dados sobre o acondicionamento da carga")
public class Acondicionamento  {
  
  @XmlElement(name="listaConteiner", required = true)
  @ApiModelProperty(required = true, value = "Lista dos contêineres onde as cargas a serem consolidadas estão acondicionadas")
  @Valid
 /**
   * Lista dos contêineres onde as cargas a serem consolidadas estão acondicionadas
  **/
  private List<Conteiner> listaConteiner = new ArrayList<>();

  @XmlElement(name="listaEmbalagem", required = true)
  @ApiModelProperty(required = true, value = "Lista das embalagens onde as cargas a serem consolidadas estão acondicionadas<br>Obs: Não pode haver duplicata de códigos de tipos de embalagem na lista.")
  @Valid
 /**
   * Lista das embalagens onde as cargas a serem consolidadas estão acondicionadas<br>Obs: Não pode haver duplicata de códigos de tipos de embalagem na lista.
  **/
  private List<Embalagem> listaEmbalagem = new ArrayList<>();

  @XmlElement(name="listaCargaSolta", required = true)
  @ApiModelProperty(required = true, value = "Cargas soltas sem embalagem ou veículos envolvidas na consolidação")
  @Valid
 /**
   * Cargas soltas sem embalagem ou veículos envolvidas na consolidação
  **/
  private List<CargaSoltaVeiculo> listaCargaSolta = new ArrayList<>();

  @XmlElement(name="listaGranel", required = true)
  @ApiModelProperty(required = true, value = "Granéis envolvidos na consolidação<br>Obs: Não pode haver duplicata de códigos de tipos de granel na lista.")
  @Valid
 /**
   * Granéis envolvidos na consolidação<br>Obs: Não pode haver duplicata de códigos de tipos de granel na lista.
  **/
  private List<Granel> listaGranel = new ArrayList<>();
 /**
   * Lista dos contêineres onde as cargas a serem consolidadas estão acondicionadas
   * @return listaConteiner
  **/
  @JsonProperty("listaConteiner")
  @NotNull
  public List<Conteiner> getListaConteiner() {
    return listaConteiner;
  }

  public void setListaConteiner(List<Conteiner> listaConteiner) {
    this.listaConteiner = listaConteiner;
  }

  public Acondicionamento listaConteiner(List<Conteiner> listaConteiner) {
    this.listaConteiner = listaConteiner;
    return this;
  }

  public Acondicionamento addListaConteinerItem(Conteiner listaConteinerItem) {
    this.listaConteiner.add(listaConteinerItem);
    return this;
  }

 /**
   * Lista das embalagens onde as cargas a serem consolidadas estão acondicionadas&lt;br&gt;Obs: Não pode haver duplicata de códigos de tipos de embalagem na lista.
   * @return listaEmbalagem
  **/
  @JsonProperty("listaEmbalagem")
  @NotNull
  public List<Embalagem> getListaEmbalagem() {
    return listaEmbalagem;
  }

  public void setListaEmbalagem(List<Embalagem> listaEmbalagem) {
    this.listaEmbalagem = listaEmbalagem;
  }

  public Acondicionamento listaEmbalagem(List<Embalagem> listaEmbalagem) {
    this.listaEmbalagem = listaEmbalagem;
    return this;
  }

  public Acondicionamento addListaEmbalagemItem(Embalagem listaEmbalagemItem) {
    this.listaEmbalagem.add(listaEmbalagemItem);
    return this;
  }

 /**
   * Cargas soltas sem embalagem ou veículos envolvidas na consolidação
   * @return listaCargaSolta
  **/
  @JsonProperty("listaCargaSolta")
  @NotNull
  public List<CargaSoltaVeiculo> getListaCargaSolta() {
    return listaCargaSolta;
  }

  public void setListaCargaSolta(List<CargaSoltaVeiculo> listaCargaSolta) {
    this.listaCargaSolta = listaCargaSolta;
  }

  public Acondicionamento listaCargaSolta(List<CargaSoltaVeiculo> listaCargaSolta) {
    this.listaCargaSolta = listaCargaSolta;
    return this;
  }

  public Acondicionamento addListaCargaSoltaItem(CargaSoltaVeiculo listaCargaSoltaItem) {
    this.listaCargaSolta.add(listaCargaSoltaItem);
    return this;
  }

 /**
   * Granéis envolvidos na consolidação&lt;br&gt;Obs: Não pode haver duplicata de códigos de tipos de granel na lista.
   * @return listaGranel
  **/
  @JsonProperty("listaGranel")
  @NotNull
  public List<Granel> getListaGranel() {
    return listaGranel;
  }

  public void setListaGranel(List<Granel> listaGranel) {
    this.listaGranel = listaGranel;
  }

  public Acondicionamento listaGranel(List<Granel> listaGranel) {
    this.listaGranel = listaGranel;
    return this;
  }

  public Acondicionamento addListaGranelItem(Granel listaGranelItem) {
    this.listaGranel.add(listaGranelItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acondicionamento {\n");
    
    sb.append("    listaConteiner: ").append(toIndentedString(listaConteiner)).append("\n");
    sb.append("    listaEmbalagem: ").append(toIndentedString(listaEmbalagem)).append("\n");
    sb.append("    listaCargaSolta: ").append(toIndentedString(listaCargaSolta)).append("\n");
    sb.append("    listaGranel: ").append(toIndentedString(listaGranel)).append("\n");
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

