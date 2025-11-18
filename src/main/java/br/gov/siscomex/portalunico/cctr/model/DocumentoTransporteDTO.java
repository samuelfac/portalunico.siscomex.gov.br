package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoTransporteDTO", propOrder =
        {"id", "tipoDocumento", "numeroDocumento", "dataEmissao", "identificacaoVeiculo"
        })

@XmlRootElement(name = "DocumentoTransporteDTO")
/**
 * Documento de transporte
 **/
@ApiModel(description = "Documento de transporte")
public class DocumentoTransporteDTO {

    @XmlElement(name = "id")
    @ApiModelProperty(value = "")
    @Valid
    private DocumentoTransportePK id = null;

    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(example = "1", value = "Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros")
    /**
     * Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros
     **/
    private String tipoDocumento = null;

    @XmlElement(name = "numeroDocumento")
    @ApiModelProperty(example = "123456", value = "Tamanho mínimo: 5<br>Tamanho máximo: 15")
    /**
     * Tamanho mínimo: 5<br>Tamanho máximo: 15
     **/
    private String numeroDocumento = null;

    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(example = "2019-12-30", value = "Formato: AAAA-MM-DD")
    /**
     * Formato: AAAA-MM-DD
     **/
    private String dataEmissao = null;

    @XmlElement(name = "identificacaoVeiculo")
    @ApiModelProperty(example = "ABC1234", value = "Tamanho mínimo: 1<br>Tamanho máximo: 15")
    /**
     * Tamanho mínimo: 1<br>Tamanho máximo: 15
     **/
    private String identificacaoVeiculo = null;

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
     * Get id
     *
     * @return id
     **/
    @JsonProperty("id")
    public DocumentoTransportePK getId() {
        return id;
    }

    public void setId(DocumentoTransportePK id) {
        this.id = id;
    }

    public DocumentoTransporteDTO id(DocumentoTransportePK id) {
        this.id = id;
        return this;
    }

    /**
     * Domínio&lt;br&gt;01 - MIC/DTA&lt;br&gt;02 - TIF/DTA&lt;br&gt;03 - DTAI&lt;br&gt;04 - Outros
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public DocumentoTransporteDTO tipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    /**
     * Tamanho mínimo: 5&lt;br&gt;Tamanho máximo: 15
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public DocumentoTransporteDTO numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    /**
     * Formato: AAAA-MM-DD
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public DocumentoTransporteDTO dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

    public DocumentoTransporteDTO identificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
        return this;
    }

    /**
     * Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 15
     *
     * @return identificacaoVeiculo
     **/
    @JsonProperty("identificacaoVeiculo")
    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoTransporteDTO {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    identificacaoVeiculo: " + toIndentedString(identificacaoVeiculo) + "\n" +
                "}";
        return sb;
    }
}
