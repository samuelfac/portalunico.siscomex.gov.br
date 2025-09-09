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
@XmlType(name = "ChangeLogArquivoDiarioAtributoNcmDTO", propOrder =
        {"dataVersao", "numero", "alteracoes"
        })

@XmlRootElement(name = "ChangeLogArquivoDiarioAtributoNcmDTO")
public class ChangeLogArquivoDiarioAtributoNcmDTO {

    @XmlElement(name = "dataVersao")
    @ApiModelProperty(value = "")
    private String dataVersao = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private Integer numero = null;

    @XmlElement(name = "alteracoes")
    @ApiModelProperty(value = "")
    @Valid
    private VersaoArquivoDiarioAtributoNcmDTO alteracoes = null;

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

    public ChangeLogArquivoDiarioAtributoNcmDTO dataVersao(String dataVersao) {
        this.dataVersao = dataVersao;
        return this;
    }

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

    public ChangeLogArquivoDiarioAtributoNcmDTO numero(Integer numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get alteracoes
     *
     * @return alteracoes
     **/
    @JsonProperty("alteracoes")
    public VersaoArquivoDiarioAtributoNcmDTO getAlteracoes() {
        return alteracoes;
    }

    public void setAlteracoes(VersaoArquivoDiarioAtributoNcmDTO alteracoes) {
        this.alteracoes = alteracoes;
    }

    public ChangeLogArquivoDiarioAtributoNcmDTO alteracoes(VersaoArquivoDiarioAtributoNcmDTO alteracoes) {
        this.alteracoes = alteracoes;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ChangeLogArquivoDiarioAtributoNcmDTO {\n" +
                "    dataVersao: " + toIndentedString(dataVersao) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    alteracoes: " + toIndentedString(alteracoes) + "\n" +
                "}";
        return sb;
    }
}
