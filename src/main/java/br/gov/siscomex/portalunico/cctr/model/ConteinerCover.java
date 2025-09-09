package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConteinerCover", propOrder =
        {"lacres", "numeroConteiner", "tara", "notasFiscais"
        })

@XmlRootElement(name = "ConteinerCover")
/**
 * Dados do contêiner
 **/
@ApiModel(description = "Dados do contêiner")
public class ConteinerCover {

    @XmlElement(name = "lacres")
    @ApiModelProperty(value = "Lista com os lacres vinculados ao contêiner<br>Máximo 4 lacres diferentes entre si.")
    @Valid
    /**
     * Lista com os lacres vinculados ao contêiner<br>Máximo 4 lacres diferentes entre si.
     **/
    private List<LacreCover> lacres = null;

    @XmlElement(name = "numeroConteiner", required = true)
    @ApiModelProperty(example = "CONT000001", required = true, value = "Número do contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")
    /**
     * Número do contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "tara", required = true)
    @ApiModelProperty(example = "1500.252", required = true, value = "Valor da tara informada<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto")
    /**
     * Valor da tara informada<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto
     **/
    private String tara = null;

    @XmlElement(name = "notasFiscais")
    @ApiModelProperty(value = "Notas Fiscais Eletrônicas<br>Coleção de NotaFiscalCover")
    @Valid
    /**
     * Notas Fiscais Eletrônicas<br>Coleção de NotaFiscalCover
     **/
    private List<NotaFiscalCover> notasFiscais = null;

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

    /**
     * Lista com os lacres vinculados ao contêiner&lt;br&gt;Máximo 4 lacres diferentes entre si.
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    @Size(min = 0, max = 4)
    public List<LacreCover> getLacres() {
        return lacres;
    }

    public void setLacres(List<LacreCover> lacres) {
        this.lacres = lacres;
    }

    public ConteinerCover lacres(List<LacreCover> lacres) {
        this.lacres = lacres;
        return this;
    }

    public ConteinerCover addLacresItem(LacreCover lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }

    /**
     * Número do contêiner&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAA
     *
     * @return numeroConteiner
     **/
    @JsonProperty("numeroConteiner")
    @NotNull
    @Pattern(regexp = "[0-9a-zA-Z]{1,11}")
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public ConteinerCover numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    /**
     * Valor da tara informada&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto
     *
     * @return tara
     **/
    @JsonProperty("tara")
    @NotNull
    @Pattern(regexp = "0\\.\\d{3}|[1-9]\\d{0,5}\\.\\d{3}")
    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public ConteinerCover tara(String tara) {
        this.tara = tara;
        return this;
    }

    /**
     * Notas Fiscais Eletrônicas&lt;br&gt;Coleção de NotaFiscalCover
     *
     * @return notasFiscais
     **/
    @JsonProperty("notasFiscais")
    @Size(min = 1, max = 1000)
    public List<NotaFiscalCover> getNotasFiscais() {
        return notasFiscais;
    }

    public void setNotasFiscais(List<NotaFiscalCover> notasFiscais) {
        this.notasFiscais = notasFiscais;
    }

    public ConteinerCover notasFiscais(List<NotaFiscalCover> notasFiscais) {
        this.notasFiscais = notasFiscais;
        return this;
    }

    public ConteinerCover addNotasFiscaisItem(NotaFiscalCover notasFiscaisItem) {
        this.notasFiscais.add(notasFiscaisItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConteinerCover {\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "    notasFiscais: " + toIndentedString(notasFiscais) + "\n" +
                "}";
        return sb;
    }
}
