package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaId", propOrder =
        {"tipo", "numero", "dataEmissao", "tipoNumero"
        })

@XmlRootElement(name = "ViagemRodoviariaId")
public class ViagemRodoviariaId {

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoManifestoViagem tipo = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "AR123040104", value = "Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15")
    /**
     * Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15
     **/
    private String numero = null;

    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data de emissão do documento de transporte<br/>Formato: yyyy-MM-dd")
    /**
     * Data de emissão do documento de transporte<br/>Formato: yyyy-MM-dd
     **/
    private LocalDate dataEmissao = null;

    @XmlElement(name = "tipoNumero")
    @ApiModelProperty(value = "")
    @Valid
    private TipoNumeroManifestoViagem tipoNumero = null;

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
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoManifestoViagem getTipo() {
        return tipo;
    }

    public void setTipo(TipoManifestoViagem tipo) {
        this.tipo = tipo;
    }

    public ViagemRodoviariaId tipo(TipoManifestoViagem tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Número do documento de transporte.&lt;br/&gt;Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.&lt;br/&gt; Tamanho Máximo: 15
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ViagemRodoviariaId numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Data de emissão do documento de transporte&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ViagemRodoviariaId dataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * Get tipoNumero
     *
     * @return tipoNumero
     **/
    @JsonProperty("tipoNumero")
    public TipoNumeroManifestoViagem getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumeroManifestoViagem tipoNumero) {
        this.tipoNumero = tipoNumero;
    }

    public ViagemRodoviariaId tipoNumero(TipoNumeroManifestoViagem tipoNumero) {
        this.tipoNumero = tipoNumero;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaId {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    tipoNumero: " + toIndentedString(tipoNumero) + "\n" +
                "}";
        return sb;
    }
}
