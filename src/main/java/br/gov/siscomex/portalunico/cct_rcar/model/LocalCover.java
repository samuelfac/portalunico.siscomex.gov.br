package br.gov.siscomex.portalunico.cct_rcar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalCover", propOrder =
        {"codigoURF", "codigoRA", "latitude", "longitude"
        })

@XmlRootElement(name = "LocalCover")
/**
 * Dados do local da recepção
 **/
@ApiModel(description = "Dados do local da recepção")
public class LocalCover {

    @XmlElement(name = "codigoURF", required = true)
    @ApiModelProperty(example = "0817600", required = true, value = "Código da Unidade da Receita Federal de Despacho<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB de Despacho")
    /**
     * Código da Unidade da Receita Federal de Despacho<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB de Despacho
     **/
    private String codigoURF = null;

    @XmlElement(name = "codigoRA")
    @ApiModelProperty(example = "8911101", value = "Código do Recinto Alfandegado<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.<br>Deve ser informado somente quando o atributo coordenadas não for informado.")
    /**
     * Código do Recinto Alfandegado<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.<br>Deve ser informado somente quando o atributo coordenadas não for informado.
     **/
    private String codigoRA = null;

    @XmlElement(name = "latitude")
    @ApiModelProperty(example = "-22.812222", value = "Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN")
    /**
     * Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN
     **/
    private String latitude = null;

    @XmlElement(name = "longitude")
    @ApiModelProperty(example = "-43.248333", value = "Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN")
    /**
     * Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN
     **/
    private String longitude = null;

    /**
     * Código da Unidade da Receita Federal de Despacho&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Unidades da RFB de Despacho
     *
     * @return codigoURF
     **/
    @JsonProperty("codigoURF")
    @NotNull
    @Pattern(regexp = "\\d{7}")
    public String getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
    }

    public LocalCover codigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
        return this;
    }

    /**
     * Código do Recinto Alfandegado&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Recintos Alfandegados.&lt;br&gt;Deve ser informado somente quando o atributo coordenadas não for informado.
     *
     * @return codigoRA
     **/
    @JsonProperty("codigoRA")
    @Pattern(regexp = "[a-zA-Z0-9]{7}")
    public String getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
    }

    public LocalCover codigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
        return this;
    }

    /**
     * Latitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNNN ou -NN.NNNNNNN
     *
     * @return latitude
     **/
    @JsonProperty("latitude")
    @Pattern(regexp = "\\-?(90\\.0{1,6}|[1-8]?\\d\\.\\d{1,6})")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocalCover latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNNN ou -NN.NNNNNNN
     *
     * @return longitude
     **/
    @JsonProperty("longitude")
    @Pattern(regexp = "\\-?(180\\.0{1,6}|1[0-7]\\d\\.\\d{1,6}|[1-9]?\\d\\.\\d{1,6})")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public LocalCover longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class LocalCover {\n" +
                "    codigoURF: " + toIndentedString(codigoURF) + "\n" +
                "    codigoRA: " + toIndentedString(codigoRA) + "\n" +
                "    latitude: " + toIndentedString(latitude) + "\n" +
                "    longitude: " + toIndentedString(longitude) + "\n" +
                "}";
        return sb;
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

