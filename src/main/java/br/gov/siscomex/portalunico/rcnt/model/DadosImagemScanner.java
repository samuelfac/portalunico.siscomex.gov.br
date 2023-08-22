package br.gov.siscomex.portalunico.rcnt.model;

import br.gov.siscomex.portalunico.rcnt.model.DadosDaCoordenadaDeAlerta;
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
 @XmlType(name = "DadosImagemScanner", propOrder =
    { "dataHoraScaneamento", "dataHoraUltimaModificacaoArquivo", "nomeArquivo", "tipoArquivo", "listaCoordenadasAlerta", "arquivoImagem", "idChaveLocalizacao"
})

@XmlRootElement(name="DadosImagemScanner")
/**
  * Deve ser nulo quando o evento for de exclusão.
 **/
@ApiModel(description="Deve ser nulo quando o evento for de exclusão.")
public class DadosImagemScanner  {
  
  @XmlElement(name="dataHoraScaneamento")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e Hora do escaneamento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e Hora do escaneamento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraScaneamento = null;

  @XmlElement(name="dataHoraUltimaModificacaoArquivo")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora da última modificação do arquivo de imagem. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora da última modificação do arquivo de imagem. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraUltimaModificacaoArquivo = null;

  @XmlElement(name="nomeArquivo")
  @ApiModelProperty(example = "file_name.jpeg", value = "Nome do arquivo enviado (file name). Enviar juntamente com extensão jpeg.<br/>Tamanho: 200")
 /**
   * Nome do arquivo enviado (file name). Enviar juntamente com extensão jpeg.<br/>Tamanho: 200
  **/
  private String nomeArquivo = null;

  @XmlElement(name="tipoArquivo")
  @ApiModelProperty(value = "Tipo de arquivo (contentType) ('image/jpeg')<br/>Tamanho: 200")
 /**
   * Tipo de arquivo (contentType) ('image/jpeg')<br/>Tamanho: 200
  **/
  private String tipoArquivo = null;

  @XmlElement(name="listaCoordenadasAlerta")
  @ApiModelProperty(value = "Lista de coordenadas de alerta no formato (x, y, x2, y2) para marcar o alerta. Trata-se dos alertas desenhados pelo operador de scanner na imagem.")
  @Valid
 /**
   * Lista de coordenadas de alerta no formato (x, y, x2, y2) para marcar o alerta. Trata-se dos alertas desenhados pelo operador de scanner na imagem.
  **/
  private List<DadosDaCoordenadaDeAlerta> listaCoordenadasAlerta = null;

  @XmlElement(name="arquivoImagem")
  @ApiModelProperty(value = "Arquivo de imagem jpeg (encoder base64). <br/>Enviar uma cópia da imagem original gerada pelo equipamento de inspeção não invasiva no formato jpeg, redimensionada para 800 linhas, com colunas proporcionais, com uso de filtro Antialias/Lanczos próprio para redução de imagens, com preservação da informação de canais de cor original. (doc técnica). A imagem redimensionada também não poderá ser superior a 400 Kb, sendo o caso, redimensionar para um tamanho um pouco menor que 800 linhas.")
 /**
   * Arquivo de imagem jpeg (encoder base64). <br/>Enviar uma cópia da imagem original gerada pelo equipamento de inspeção não invasiva no formato jpeg, redimensionada para 800 linhas, com colunas proporcionais, com uso de filtro Antialias/Lanczos próprio para redução de imagens, com preservação da informação de canais de cor original. (doc técnica). A imagem redimensionada também não poderá ser superior a 400 Kb, sendo o caso, redimensionar para um tamanho um pouco menor que 800 linhas.
  **/
  private String arquivoImagem = null;

  @XmlElement(name="idChaveLocalizacao")
  @ApiModelProperty(value = "Referência ao código (truck id, ref id, etc) gerado pelo sistema de inspeção não invasiva e que permite acessar os dados diretamente no equipamento utilizando o software proprietário. Omitir caso o sistema implantado no recinto permita localizar estes dados usando o número da unidade de carga / ou dados do veículo transportador.<br/>Tamanho: 200")
 /**
   * Referência ao código (truck id, ref id, etc) gerado pelo sistema de inspeção não invasiva e que permite acessar os dados diretamente no equipamento utilizando o software proprietário. Omitir caso o sistema implantado no recinto permita localizar estes dados usando o número da unidade de carga / ou dados do veículo transportador.<br/>Tamanho: 200
  **/
  private String idChaveLocalizacao = null;
 /**
   * Data e Hora do escaneamento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraScaneamento
  **/
  @JsonProperty("dataHoraScaneamento")
  public String getDataHoraScaneamento() {
    return dataHoraScaneamento;
  }

  public void setDataHoraScaneamento(String dataHoraScaneamento) {
    this.dataHoraScaneamento = dataHoraScaneamento;
  }

  public DadosImagemScanner dataHoraScaneamento(String dataHoraScaneamento) {
    this.dataHoraScaneamento = dataHoraScaneamento;
    return this;
  }

 /**
   * Data e hora da última modificação do arquivo de imagem. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraUltimaModificacaoArquivo
  **/
  @JsonProperty("dataHoraUltimaModificacaoArquivo")
  public String getDataHoraUltimaModificacaoArquivo() {
    return dataHoraUltimaModificacaoArquivo;
  }

  public void setDataHoraUltimaModificacaoArquivo(String dataHoraUltimaModificacaoArquivo) {
    this.dataHoraUltimaModificacaoArquivo = dataHoraUltimaModificacaoArquivo;
  }

  public DadosImagemScanner dataHoraUltimaModificacaoArquivo(String dataHoraUltimaModificacaoArquivo) {
    this.dataHoraUltimaModificacaoArquivo = dataHoraUltimaModificacaoArquivo;
    return this;
  }

 /**
   * Nome do arquivo enviado (file name). Enviar juntamente com extensão jpeg.&lt;br/&gt;Tamanho: 200
   * @return nomeArquivo
  **/
  @JsonProperty("nomeArquivo")
  public String getNomeArquivo() {
    return nomeArquivo;
  }

  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  public DadosImagemScanner nomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
    return this;
  }

 /**
   * Tipo de arquivo (contentType) (&#39;image/jpeg&#39;)&lt;br/&gt;Tamanho: 200
   * @return tipoArquivo
  **/
  @JsonProperty("tipoArquivo")
  public String getTipoArquivo() {
    return tipoArquivo;
  }

  public void setTipoArquivo(String tipoArquivo) {
    this.tipoArquivo = tipoArquivo;
  }

  public DadosImagemScanner tipoArquivo(String tipoArquivo) {
    this.tipoArquivo = tipoArquivo;
    return this;
  }

 /**
   * Lista de coordenadas de alerta no formato (x, y, x2, y2) para marcar o alerta. Trata-se dos alertas desenhados pelo operador de scanner na imagem.
   * @return listaCoordenadasAlerta
  **/
  @JsonProperty("listaCoordenadasAlerta")
  public List<DadosDaCoordenadaDeAlerta> getListaCoordenadasAlerta() {
    return listaCoordenadasAlerta;
  }

  public void setListaCoordenadasAlerta(List<DadosDaCoordenadaDeAlerta> listaCoordenadasAlerta) {
    this.listaCoordenadasAlerta = listaCoordenadasAlerta;
  }

  public DadosImagemScanner listaCoordenadasAlerta(List<DadosDaCoordenadaDeAlerta> listaCoordenadasAlerta) {
    this.listaCoordenadasAlerta = listaCoordenadasAlerta;
    return this;
  }

  public DadosImagemScanner addListaCoordenadasAlertaItem(DadosDaCoordenadaDeAlerta listaCoordenadasAlertaItem) {
    this.listaCoordenadasAlerta.add(listaCoordenadasAlertaItem);
    return this;
  }

 /**
   * Arquivo de imagem jpeg (encoder base64). &lt;br/&gt;Enviar uma cópia da imagem original gerada pelo equipamento de inspeção não invasiva no formato jpeg, redimensionada para 800 linhas, com colunas proporcionais, com uso de filtro Antialias/Lanczos próprio para redução de imagens, com preservação da informação de canais de cor original. (doc técnica). A imagem redimensionada também não poderá ser superior a 400 Kb, sendo o caso, redimensionar para um tamanho um pouco menor que 800 linhas.
   * @return arquivoImagem
  **/
  @JsonProperty("arquivoImagem")
  public String getArquivoImagem() {
    return arquivoImagem;
  }

  public void setArquivoImagem(String arquivoImagem) {
    this.arquivoImagem = arquivoImagem;
  }

  public DadosImagemScanner arquivoImagem(String arquivoImagem) {
    this.arquivoImagem = arquivoImagem;
    return this;
  }

 /**
   * Referência ao código (truck id, ref id, etc) gerado pelo sistema de inspeção não invasiva e que permite acessar os dados diretamente no equipamento utilizando o software proprietário. Omitir caso o sistema implantado no recinto permita localizar estes dados usando o número da unidade de carga / ou dados do veículo transportador.&lt;br/&gt;Tamanho: 200
   * @return idChaveLocalizacao
  **/
  @JsonProperty("idChaveLocalizacao")
  public String getIdChaveLocalizacao() {
    return idChaveLocalizacao;
  }

  public void setIdChaveLocalizacao(String idChaveLocalizacao) {
    this.idChaveLocalizacao = idChaveLocalizacao;
  }

  public DadosImagemScanner idChaveLocalizacao(String idChaveLocalizacao) {
    this.idChaveLocalizacao = idChaveLocalizacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosImagemScanner {\n");
    
    sb.append("    dataHoraScaneamento: ").append(toIndentedString(dataHoraScaneamento)).append("\n");
    sb.append("    dataHoraUltimaModificacaoArquivo: ").append(toIndentedString(dataHoraUltimaModificacaoArquivo)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
    sb.append("    tipoArquivo: ").append(toIndentedString(tipoArquivo)).append("\n");
    sb.append("    listaCoordenadasAlerta: ").append(toIndentedString(listaCoordenadasAlerta)).append("\n");
    sb.append("    arquivoImagem: ").append(toIndentedString(arquivoImagem)).append("\n");
    sb.append("    idChaveLocalizacao: ").append(toIndentedString(idChaveLocalizacao)).append("\n");
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

