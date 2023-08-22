package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DadosVolumeManifestado", propOrder =
    { "idElemento", "quantidade", "tipo"
})

@XmlRootElement(name="DadosVolumeManifestado")
public class DadosVolumeManifestado  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="quantidade")
  @ApiModelProperty(example = "10", value = "Quantidade de volumes manifestados na carga")
 /**
   * Quantidade de volumes manifestados na carga
  **/
  private Integer quantidade = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "Tipo de volumes/embalagens.<br/>Domínio:<br/>01 - AMARRADO/ATADO/FEIXE<br/>02 - BARRICA DE FERRO<br/>03 - BARRICA DE FIBRA DE VIDRO<br/>04 - BARRICA DE PAPELAO<br/>05 - BARRICA DE PLASTICO<br/>06 - BARRICA DE OUTROS MATERIAIS<br/>07 - BAU DE MADEIRA<br/>08 - BAU DE METAL<br/>09 - BAU DE OUTROS MATERIAIS<br/>10 - BIG BAG<br/>11 - BLOCO<br/>12 - BOBINA<br/>13 - BOMBONA<br/>14 - BOTIJAO<br/>15 - CAIXA CORRUGADA<br/>16 - CAIXA DE ISOPOR<br/>17 - CAIXA DE MADEIRA<br/>18 - CAIXA DE METAL<br/>19 - CAIXA DE PAPELAO<br/>20 - CAIXA DE PLASTICO<br/>21 - CAIXA DE OUTROS MATERIAIS<br/>22 - CANUDO<br/>23 - CARRETEL<br/>24 - CILINDRO<br/>25 - CINTADO<br/>26 - ENGRADADO DE MADEIRA<br/>27 - ENGRADADO DE PLASTICO<br/>28 - ENGRADADO DE OUTROS MATERIAIS<br/>29 - ENVELOPE<br/>30 - ESTOJO<br/>31 - ESTRADO<br/>32 - FARDO<br/>33 - FRASCO<br/>34 - GALAO DE METAL<br/>35 - GALAO DE PLASTICO<br/>36 - GALAO DE OUTROS MATERIAIS<br/>37 - GRANEL<br/>38 - LATA<br/>39 - MALA<br/>40 - MALETA<br/>41 - PACOTE<br/>42 - PECA<br/>43 - QUARTOLA<br/>44 - ROLO<br/>45 - SACA<br/>46 - SACO DE ANIAGEM<br/>47 - SACO DE COURO<br/>48 - SACO DE LONA<br/>49 - SACO DE NYLON<br/>50 - SACO DE PAPEL<br/>51 - SACO DE PAPELAO<br/>52 - SACO DE PLASTICO<br/>53 - SACO DE OUTROS MATERIAIS<br/>54 - SACOLA<br/>55 - SAN BAG<br/>56 - TAMBOR DE METAL<br/>57 - TAMBOR DE PAPELAO<br/>58 - TAMBOR DE PLASTICO<br/>59 - TAMBOR DE OUTROS MATERIAIS<br/>60 - PALLETS<br/>99 - OUTROS")
 /**
   * Tipo de volumes/embalagens.<br/>Domínio:<br/>01 - AMARRADO/ATADO/FEIXE<br/>02 - BARRICA DE FERRO<br/>03 - BARRICA DE FIBRA DE VIDRO<br/>04 - BARRICA DE PAPELAO<br/>05 - BARRICA DE PLASTICO<br/>06 - BARRICA DE OUTROS MATERIAIS<br/>07 - BAU DE MADEIRA<br/>08 - BAU DE METAL<br/>09 - BAU DE OUTROS MATERIAIS<br/>10 - BIG BAG<br/>11 - BLOCO<br/>12 - BOBINA<br/>13 - BOMBONA<br/>14 - BOTIJAO<br/>15 - CAIXA CORRUGADA<br/>16 - CAIXA DE ISOPOR<br/>17 - CAIXA DE MADEIRA<br/>18 - CAIXA DE METAL<br/>19 - CAIXA DE PAPELAO<br/>20 - CAIXA DE PLASTICO<br/>21 - CAIXA DE OUTROS MATERIAIS<br/>22 - CANUDO<br/>23 - CARRETEL<br/>24 - CILINDRO<br/>25 - CINTADO<br/>26 - ENGRADADO DE MADEIRA<br/>27 - ENGRADADO DE PLASTICO<br/>28 - ENGRADADO DE OUTROS MATERIAIS<br/>29 - ENVELOPE<br/>30 - ESTOJO<br/>31 - ESTRADO<br/>32 - FARDO<br/>33 - FRASCO<br/>34 - GALAO DE METAL<br/>35 - GALAO DE PLASTICO<br/>36 - GALAO DE OUTROS MATERIAIS<br/>37 - GRANEL<br/>38 - LATA<br/>39 - MALA<br/>40 - MALETA<br/>41 - PACOTE<br/>42 - PECA<br/>43 - QUARTOLA<br/>44 - ROLO<br/>45 - SACA<br/>46 - SACO DE ANIAGEM<br/>47 - SACO DE COURO<br/>48 - SACO DE LONA<br/>49 - SACO DE NYLON<br/>50 - SACO DE PAPEL<br/>51 - SACO DE PAPELAO<br/>52 - SACO DE PLASTICO<br/>53 - SACO DE OUTROS MATERIAIS<br/>54 - SACOLA<br/>55 - SAN BAG<br/>56 - TAMBOR DE METAL<br/>57 - TAMBOR DE PAPELAO<br/>58 - TAMBOR DE PLASTICO<br/>59 - TAMBOR DE OUTROS MATERIAIS<br/>60 - PALLETS<br/>99 - OUTROS
  **/
  private String tipo = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosVolumeManifestado idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Quantidade de volumes manifestados na carga
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public DadosVolumeManifestado quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }

 /**
   * Tipo de volumes/embalagens.&lt;br/&gt;Domínio:&lt;br/&gt;01 - AMARRADO/ATADO/FEIXE&lt;br/&gt;02 - BARRICA DE FERRO&lt;br/&gt;03 - BARRICA DE FIBRA DE VIDRO&lt;br/&gt;04 - BARRICA DE PAPELAO&lt;br/&gt;05 - BARRICA DE PLASTICO&lt;br/&gt;06 - BARRICA DE OUTROS MATERIAIS&lt;br/&gt;07 - BAU DE MADEIRA&lt;br/&gt;08 - BAU DE METAL&lt;br/&gt;09 - BAU DE OUTROS MATERIAIS&lt;br/&gt;10 - BIG BAG&lt;br/&gt;11 - BLOCO&lt;br/&gt;12 - BOBINA&lt;br/&gt;13 - BOMBONA&lt;br/&gt;14 - BOTIJAO&lt;br/&gt;15 - CAIXA CORRUGADA&lt;br/&gt;16 - CAIXA DE ISOPOR&lt;br/&gt;17 - CAIXA DE MADEIRA&lt;br/&gt;18 - CAIXA DE METAL&lt;br/&gt;19 - CAIXA DE PAPELAO&lt;br/&gt;20 - CAIXA DE PLASTICO&lt;br/&gt;21 - CAIXA DE OUTROS MATERIAIS&lt;br/&gt;22 - CANUDO&lt;br/&gt;23 - CARRETEL&lt;br/&gt;24 - CILINDRO&lt;br/&gt;25 - CINTADO&lt;br/&gt;26 - ENGRADADO DE MADEIRA&lt;br/&gt;27 - ENGRADADO DE PLASTICO&lt;br/&gt;28 - ENGRADADO DE OUTROS MATERIAIS&lt;br/&gt;29 - ENVELOPE&lt;br/&gt;30 - ESTOJO&lt;br/&gt;31 - ESTRADO&lt;br/&gt;32 - FARDO&lt;br/&gt;33 - FRASCO&lt;br/&gt;34 - GALAO DE METAL&lt;br/&gt;35 - GALAO DE PLASTICO&lt;br/&gt;36 - GALAO DE OUTROS MATERIAIS&lt;br/&gt;37 - GRANEL&lt;br/&gt;38 - LATA&lt;br/&gt;39 - MALA&lt;br/&gt;40 - MALETA&lt;br/&gt;41 - PACOTE&lt;br/&gt;42 - PECA&lt;br/&gt;43 - QUARTOLA&lt;br/&gt;44 - ROLO&lt;br/&gt;45 - SACA&lt;br/&gt;46 - SACO DE ANIAGEM&lt;br/&gt;47 - SACO DE COURO&lt;br/&gt;48 - SACO DE LONA&lt;br/&gt;49 - SACO DE NYLON&lt;br/&gt;50 - SACO DE PAPEL&lt;br/&gt;51 - SACO DE PAPELAO&lt;br/&gt;52 - SACO DE PLASTICO&lt;br/&gt;53 - SACO DE OUTROS MATERIAIS&lt;br/&gt;54 - SACOLA&lt;br/&gt;55 - SAN BAG&lt;br/&gt;56 - TAMBOR DE METAL&lt;br/&gt;57 - TAMBOR DE PAPELAO&lt;br/&gt;58 - TAMBOR DE PLASTICO&lt;br/&gt;59 - TAMBOR DE OUTROS MATERIAIS&lt;br/&gt;60 - PALLETS&lt;br/&gt;99 - OUTROS
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public DadosVolumeManifestado tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosVolumeManifestado {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

