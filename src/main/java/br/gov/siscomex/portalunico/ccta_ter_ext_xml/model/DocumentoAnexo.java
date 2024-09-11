package br.gov.siscomex.portalunico.ccta_ter_ext_xml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoAnexo", propOrder =
        {"descricaoDocumento", "idDocumento", "tipoDocumento"
        })

@XmlRootElement(name = "DocumentoAnexo")
public class DocumentoAnexo {

    @XmlElement(name = "descricaoDocumento")
    @ApiModelProperty(example = "Descrição do documento.", value = "Descrição do documento que será apresentado na fronteira<br/> Tamanho Máximo: 50")
    /**
     * Descrição do documento que será apresentado na fronteira<br/> Tamanho Máximo: 50
     **/
    private String descricaoDocumento = null;

    @XmlElement(name = "idDocumento", required = true)
    @ApiModelProperty(example = "US123456-543B", required = true, value = "Número do identificador do documento<br/> Tamanho Máximo: 20")
    /**
     * Número do identificador do documento<br/> Tamanho Máximo: 20
     **/
    private String idDocumento = null;

    @XmlElement(name = "tipoDocumento", required = true)
    @ApiModelProperty(example = "49.0", required = true, value = "Código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.<br/> Pelo menos um tipo de documento deverá ser 49 (fatura comercial).<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.<br/> Pelo menos um tipo de documento deverá ser 49 (fatura comercial).<br/> Tamanho Máximo: 4
     **/
    private BigDecimal tipoDocumento = null;

    /**
     * Descrição do documento que será apresentado na fronteira&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return descricaoDocumento
     **/
    @JsonProperty("descricaoDocumento")
    public String getDescricaoDocumento() {
        return descricaoDocumento;
    }

    public void setDescricaoDocumento(String descricaoDocumento) {
        this.descricaoDocumento = descricaoDocumento;
    }

    public DocumentoAnexo descricaoDocumento(String descricaoDocumento) {
        this.descricaoDocumento = descricaoDocumento;
        return this;
    }

    /**
     * Número do identificador do documento&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return idDocumento
     **/
    @JsonProperty("idDocumento")
    @NotNull
    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public DocumentoAnexo idDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
        return this;
    }

    /**
     * Código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.&lt;br/&gt; Pelo menos um tipo de documento deverá ser 49 (fatura comercial).&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    @NotNull
    public BigDecimal getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(BigDecimal tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public DocumentoAnexo tipoDocumento(BigDecimal tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DocumentoAnexo {\n" +
                "    descricaoDocumento: " + toIndentedString(descricaoDocumento) + "\n" +
                "    idDocumento: " + toIndentedString(idDocumento) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
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

