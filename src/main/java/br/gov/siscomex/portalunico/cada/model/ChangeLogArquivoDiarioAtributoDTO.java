package br.gov.siscomex.portalunico.cada.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLogArquivoDiarioAtributoDTO", propOrder =
        {"numero", "dataVersao", "alteracoes"
        })

@XmlRootElement(name = "ChangeLogArquivoDiarioAtributoDTO")
public class ChangeLogArquivoDiarioAtributoDTO {

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private Integer numero = null;

    @XmlElement(name = "dataVersao")
    @ApiModelProperty(value = "")
    private String dataVersao = null;

    @XmlElement(name = "alteracoes")
    @ApiModelProperty(value = "")
    @Valid
    private VersaoArquivoDiarioAtributoDTO alteracoes = null;

    /**
     * Get numero
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ChangeLogArquivoDiarioAtributoDTO numero(Integer numero) {
        this.numero = numero;
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
     * Get dataVersao
     *
     * @return dataVersao
     **/
    @JsonProperty("dataVersao")
    public String getDataVersao() {
        return dataVersao;
    }

    public void setDataVersao(String dataVersao) {
        this.dataVersao = dataVersao;
    }

    /**
     * Get alteracoes
     *
     * @return alteracoes
     **/
    @JsonProperty("alteracoes")
    public VersaoArquivoDiarioAtributoDTO getAlteracoes() {
        return alteracoes;
    }

    public void setAlteracoes(VersaoArquivoDiarioAtributoDTO alteracoes) {
        this.alteracoes = alteracoes;
    }

    public ChangeLogArquivoDiarioAtributoDTO alteracoes(VersaoArquivoDiarioAtributoDTO alteracoes) {
        this.alteracoes = alteracoes;
        return this;
    }

    public ChangeLogArquivoDiarioAtributoDTO dataVersao(String dataVersao) {
        this.dataVersao = dataVersao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ChangeLogArquivoDiarioAtributoDTO {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    dataVersao: " + toIndentedString(dataVersao) + "\n" +
                "    alteracoes: " + toIndentedString(alteracoes) + "\n" +
                "}";
        return sb;
    }
}
