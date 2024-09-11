package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoTratamentoIcmsDTO", propOrder =
        {"descTipoTratamento", "opcoesIcms", "tipoTratamento"
        })

@XmlRootElement(name = "TipoTratamentoIcmsDTO")
/**
 * Dados do tipo de tratamento usado pela Sefaz para o ICMS de Duimp
 **/
@ApiModel(description = "Dados do tipo de tratamento usado pela Sefaz para o ICMS de Duimp")
public class TipoTratamentoIcmsDTO {

    @XmlElement(name = "descTipoTratamento", required = true)
    @ApiModelProperty(example = "Análise manual", required = true, value = "Descrição do tipo de tratamento")
    /**
     * Descrição do tipo de tratamento
     **/
    private String descTipoTratamento = null;

    @XmlElement(name = "opcoesIcms")
    @ApiModelProperty(value = "Lista das opcões disponíveis para solicitação de cálculo (tipo de tratamento = 'CALCULO_SEFAZ')")
    @Valid
    /**
     * Lista das opcões disponíveis para solicitação de cálculo (tipo de tratamento = 'CALCULO_SEFAZ')
     **/
    private List<OpcaoCalculoIcmsDTO> opcoesIcms = null;


    @XmlType(name = "TipoTratamentoEnum")
    @XmlEnum(String.class)
    public enum TipoTratamentoEnum {

        @XmlEnumValue("MANUAL")
        @JsonProperty("MANUAL")
        MANUAL("MANUAL"),

        @XmlEnumValue("DECLARATORIO")
        @JsonProperty("DECLARATORIO")
        DECLARATORIO("DECLARATORIO"),

        @XmlEnumValue("CALCULO_SEFAZ")
        @JsonProperty("CALCULO_SEFAZ")
        CALCULO_SEFAZ("CALCULO_SEFAZ");


        private final String value;

        TipoTratamentoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoTratamentoEnum fromValue(String v) {
            for (TipoTratamentoEnum b : TipoTratamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTratamentoEnum");
        }
    }

    @XmlElement(name = "tipoTratamento", required = true)
    @ApiModelProperty(required = true, value = "Tipo de tratamento usado pela Sefaz para o ICMS")
    /**
     * Tipo de tratamento usado pela Sefaz para o ICMS
     **/
    private TipoTratamentoEnum tipoTratamento = null;

    /**
     * Descrição do tipo de tratamento
     *
     * @return descTipoTratamento
     **/
    @JsonProperty("descTipoTratamento")
    @NotNull
    public String getDescTipoTratamento() {
        return descTipoTratamento;
    }

    public void setDescTipoTratamento(String descTipoTratamento) {
        this.descTipoTratamento = descTipoTratamento;
    }

    public TipoTratamentoIcmsDTO descTipoTratamento(String descTipoTratamento) {
        this.descTipoTratamento = descTipoTratamento;
        return this;
    }

    /**
     * Lista das opcões disponíveis para solicitação de cálculo (tipo de tratamento &#x3D; &#39;CALCULO_SEFAZ&#39;)
     *
     * @return opcoesIcms
     **/
    @JsonProperty("opcoesIcms")
    public List<OpcaoCalculoIcmsDTO> getOpcoesIcms() {
        return opcoesIcms;
    }

    public void setOpcoesIcms(List<OpcaoCalculoIcmsDTO> opcoesIcms) {
        this.opcoesIcms = opcoesIcms;
    }

    public TipoTratamentoIcmsDTO opcoesIcms(List<OpcaoCalculoIcmsDTO> opcoesIcms) {
        this.opcoesIcms = opcoesIcms;
        return this;
    }

    public TipoTratamentoIcmsDTO addOpcoesIcmsItem(OpcaoCalculoIcmsDTO opcoesIcmsItem) {
        this.opcoesIcms.add(opcoesIcmsItem);
        return this;
    }

    /**
     * Tipo de tratamento usado pela Sefaz para o ICMS
     *
     * @return tipoTratamento
     **/
    @JsonProperty("tipoTratamento")
    @NotNull
    public String getTipoTratamento() {
        if (tipoTratamento == null) {
            return null;
        }
        return tipoTratamento.value();
    }

    public void setTipoTratamento(TipoTratamentoEnum tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    public TipoTratamentoIcmsDTO tipoTratamento(TipoTratamentoEnum tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TipoTratamentoIcmsDTO {\n" +
                "    descTipoTratamento: " + toIndentedString(descTipoTratamento) + "\n" +
                "    opcoesIcms: " + toIndentedString(opcoesIcms) + "\n" +
                "    tipoTratamento: " + toIndentedString(tipoTratamento) + "\n" +
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

