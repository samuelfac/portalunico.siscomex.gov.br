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
@XmlType(name = "OutroModal", propOrder =
        {"codigoTipoModal", "identificacaoVeiculo", "numeroDocumentoTransporte", "dataEmissaoDocumentoTransporte", "dadosDocumentoTransporte"
        })

@XmlRootElement(name = "OutroModal")
/**
 * Dados para veículos de outros modais
 **/
@ApiModel(description = "Dados para veículos de outros modais")
public class OutroModal {

    @XmlElement(name = "codigoTipoModal", required = true)
    @ApiModelProperty(example = "01", required = true, value = "Código do tipo de modal<br>Tamanho: 2<br>Formato: ((")
    /**
     * Código do tipo de modal<br>Tamanho: 2<br>Formato: ((
     **/
    private String codigoTipoModal = null;

    @XmlElement(name = "identificacaoVeiculo", required = true)
    @ApiModelProperty(example = "BLT1230", required = true, value = "Identificacao Veículo<br>Tamanho: 15<br>Formato: AAAAAAAAAAAAAAA")
    /**
     * Identificacao Veículo<br>Tamanho: 15<br>Formato: AAAAAAAAAAAAAAA
     **/
    private String identificacaoVeiculo = null;

    @XmlElement(name = "numeroDocumentoTransporte", required = true)
    @ApiModelProperty(example = "15573459", required = true, value = "Número do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho máximo: 15")
    /**
     * Número do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho máximo: 15
     **/
    private String numeroDocumentoTransporte = null;

    @XmlElement(name = "dataEmissaoDocumentoTransporte", required = true)
    @ApiModelProperty(example = "2016-12-19", required = true, value = "Data de emissao do documento de transporte<br>Formato: AAAA-MM-DD")
    /**
     * Data de emissao do documento de transporte<br>Formato: AAAA-MM-DD
     **/
    private String dataEmissaoDocumentoTransporte = null;

    @XmlElement(name = "dadosDocumentoTransporte", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private DadosDocumentoTransporte dadosDocumentoTransporte = null;

    /**
     * Código do tipo de modal&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: ((
     *
     * @return codigoTipoModal
     **/
    @JsonProperty("codigoTipoModal")
    @NotNull
    public String getCodigoTipoModal() {
        return codigoTipoModal;
    }

    public void setCodigoTipoModal(String codigoTipoModal) {
        this.codigoTipoModal = codigoTipoModal;
    }

    public OutroModal codigoTipoModal(String codigoTipoModal) {
        this.codigoTipoModal = codigoTipoModal;
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
     * Identificacao Veículo&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: AAAAAAAAAAAAAAA
     *
     * @return identificacaoVeiculo
     **/
    @JsonProperty("identificacaoVeiculo")
    @NotNull
    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

    /**
     * Número do documento de transporte&lt;br&gt;Tamanho mínimo: 5&lt;br&gt;Tamanho máximo: 15
     *
     * @return numeroDocumentoTransporte
     **/
    @JsonProperty("numeroDocumentoTransporte")
    @NotNull
    public String getNumeroDocumentoTransporte() {
        return numeroDocumentoTransporte;
    }

    public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    }

    public OutroModal numeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
        return this;
    }

    public OutroModal identificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
        return this;
    }

    /**
     * Data de emissao do documento de transporte&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataEmissaoDocumentoTransporte
     **/
    @JsonProperty("dataEmissaoDocumentoTransporte")
    @NotNull
    public String getDataEmissaoDocumentoTransporte() {
        return dataEmissaoDocumentoTransporte;
    }

    public void setDataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
    }

    public OutroModal dataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
        return this;
    }

    /**
     * Get dadosDocumentoTransporte
     *
     * @return dadosDocumentoTransporte
     **/
    @JsonProperty("dadosDocumentoTransporte")
    @NotNull
    public DadosDocumentoTransporte getDadosDocumentoTransporte() {
        return dadosDocumentoTransporte;
    }

    public void setDadosDocumentoTransporte(DadosDocumentoTransporte dadosDocumentoTransporte) {
        this.dadosDocumentoTransporte = dadosDocumentoTransporte;
    }

    public OutroModal dadosDocumentoTransporte(DadosDocumentoTransporte dadosDocumentoTransporte) {
        this.dadosDocumentoTransporte = dadosDocumentoTransporte;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class OutroModal {\n" +
                "    codigoTipoModal: " + toIndentedString(codigoTipoModal) + "\n" +
                "    identificacaoVeiculo: " + toIndentedString(identificacaoVeiculo) + "\n" +
                "    numeroDocumentoTransporte: " + toIndentedString(numeroDocumentoTransporte) + "\n" +
                "    dataEmissaoDocumentoTransporte: " + toIndentedString(dataEmissaoDocumentoTransporte) + "\n" +
                "    dadosDocumentoTransporte: " + toIndentedString(dadosDocumentoTransporte) + "\n" +
                "}";
        return sb;
    }
}
