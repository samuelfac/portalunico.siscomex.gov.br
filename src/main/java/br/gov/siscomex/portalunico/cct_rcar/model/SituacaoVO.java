package br.gov.siscomex.portalunico.cct_rcar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoVO", propOrder =
        {"nome", "dataInicio", "dataFim"
        })

@XmlRootElement(name = "SituacaoVO")
/**
 * Situação (status) de um protocolo
 **/
@ApiModel(description = "Situação (status) de um protocolo")
public class SituacaoVO {

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "EM PROCESSAMENTO", value = "Nome da situação do protocolo")
    /**
     * Nome da situação do protocolo
     **/
    private String nome = null;

    @XmlElement(name = "dataInicio")
    @ApiModelProperty(example = "2024-04-15T12:46:54.453-03:00", value = "Data de início da situação")
    /**
     * Data de início da situação
     **/
    private OffsetDateTime dataInicio = null;

    @XmlElement(name = "dataFim")
    @ApiModelProperty(example = "2024-04-15T12:46:55.232-03:00", value = "Data de conclusão da situação")
    /**
     * Data de conclusão da situação
     **/
    private OffsetDateTime dataFim = null;

    /**
     * Nome da situação do protocolo
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SituacaoVO nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Data de início da situação
     *
     * @return dataInicio
     **/
    @JsonProperty("dataInicio")
    public OffsetDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(OffsetDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public SituacaoVO dataInicio(OffsetDateTime dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }

    /**
     * Data de conclusão da situação
     *
     * @return dataFim
     **/
    @JsonProperty("dataFim")
    public OffsetDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(OffsetDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public SituacaoVO dataFim(OffsetDateTime dataFim) {
        this.dataFim = dataFim;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SituacaoVO {\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    dataInicio: " + toIndentedString(dataInicio) + "\n" +
                "    dataFim: " + toIndentedString(dataFim) + "\n" +
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

