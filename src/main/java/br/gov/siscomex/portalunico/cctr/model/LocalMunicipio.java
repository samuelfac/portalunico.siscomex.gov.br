package br.gov.siscomex.portalunico.cctr.model;

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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalMunicipio", propOrder =
        {"codigoURF", "coordenadas", "cnpjResponsavel", "cpfResponsavel", "codigoRA", "cidade"
        })

@XmlRootElement(name = "LocalMunicipio")
/**
 * Local incluindo o código do município
 **/
@ApiModel(description = "Local incluindo o código do município")
public class LocalMunicipio {

    @XmlElement(name = "codigoURF", required = true)
    @ApiModelProperty(example = "0717700", required = true, value = "Código da Unidade de Região Fiscal<br>Tamanho: 7<br>Formato: NNNNNNN")
    /**
     * Código da Unidade de Região Fiscal<br>Tamanho: 7<br>Formato: NNNNNNN
     **/
    private String codigoURF = null;

    @XmlElement(name = "coordenadas")
    @ApiModelProperty(value = "")
    @Valid
    private Coordenadas coordenadas = null;

    @XmlElement(name = "cnpjResponsavel")
    @ApiModelProperty(example = "15573459000106", value = "Cnpj do responsável pelo local<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando codigoRA não for informado.")
    /**
     * Cnpj do responsável pelo local<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando codigoRA não for informado.
     **/
    private String cnpjResponsavel = null;

    @XmlElement(name = "cpfResponsavel")
    @ApiModelProperty(example = "00000000000", value = "CPF do responsável pelo local<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
    /**
     * CPF do responsável pelo local<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
     **/
    private String cpfResponsavel = null;

    @XmlElement(name = "codigoRA")
    @ApiModelProperty(example = "8911101", value = "Código do Recinto Alfandegado<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.<br>Deve ser informado somente quando o atributo coordenadas não for informado.")
    /**
     * Código do Recinto Alfandegado<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.<br>Deve ser informado somente quando o atributo coordenadas não for informado.
     **/
    private String codigoRA = null;

    @XmlElement(name = "cidade", required = true)
    @ApiModelProperty(example = "1234", required = true, value = "Código do Município<br>Tamanho: 4<br>Formato: NNNN")
    /**
     * Código do Município<br>Tamanho: 4<br>Formato: NNNN
     **/
    private Integer cidade = null;

    /**
     * Código da Unidade de Região Fiscal&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return codigoURF
     **/
    @JsonProperty("codigoURF")
    @NotNull
    public String getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
    }

    public LocalMunicipio codigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
        return this;
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

    /**
     * Get coordenadas
     *
     * @return coordenadas
     **/
    @JsonProperty("coordenadas")
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Cnpj do responsável pelo local&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando codigoRA não for informado.
     *
     * @return cnpjResponsavel
     **/
    @JsonProperty("cnpjResponsavel")
    public String getCnpjResponsavel() {
        return cnpjResponsavel;
    }

    public void setCnpjResponsavel(String cnpjResponsavel) {
        this.cnpjResponsavel = cnpjResponsavel;
    }

    public LocalMunicipio cnpjResponsavel(String cnpjResponsavel) {
        this.cnpjResponsavel = cnpjResponsavel;
        return this;
    }

    public LocalMunicipio coordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
        return this;
    }

    /**
     * CPF do responsável pelo local&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
     *
     * @return cpfResponsavel
     **/
    @JsonProperty("cpfResponsavel")
    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    /**
     * Código do Recinto Alfandegado&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Recintos Alfandegados.&lt;br&gt;Deve ser informado somente quando o atributo coordenadas não for informado.
     *
     * @return codigoRA
     **/
    @JsonProperty("codigoRA")
    public String getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
    }

    public LocalMunicipio codigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
        return this;
    }

    public LocalMunicipio cpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
        return this;
    }

    /**
     * Código do Município&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: NNNN
     *
     * @return cidade
     **/
    @JsonProperty("cidade")
    @NotNull
    public Integer getCidade() {
        return cidade;
    }

    public void setCidade(Integer cidade) {
        this.cidade = cidade;
    }

    public LocalMunicipio cidade(Integer cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class LocalMunicipio {\n" +
                "    codigoURF: " + toIndentedString(codigoURF) + "\n" +
                "    coordenadas: " + toIndentedString(coordenadas) + "\n" +
                "    cnpjResponsavel: " + toIndentedString(cnpjResponsavel) + "\n" +
                "    cpfResponsavel: " + toIndentedString(cpfResponsavel) + "\n" +
                "    codigoRA: " + toIndentedString(codigoRA) + "\n" +
                "    cidade: " + toIndentedString(cidade) + "\n" +
                "}";
        return sb;
    }
}
