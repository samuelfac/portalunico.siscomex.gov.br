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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaResumidaCargasDetalhadas", propOrder =
        {"tipoDocumento", "conhecimentosCargaViagem", "todasCargasEntregues", "numeroDocumentoViagem", "dataEmissao"
        })

@XmlRootElement(name = "ViagemRodoviariaResumidaCargasDetalhadas")
public class ViagemRodoviariaResumidaCargasDetalhadas {

    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(value = "")
    @Valid
    private TipoManifestoViagem tipoDocumento = null;

    @XmlElement(name = "conhecimentosCargaViagem")
    @ApiModelProperty(value = "")
    @Valid
    private List<ViagemRodoviariaCargaDetalhada> conhecimentosCargaViagem = null;

    @XmlElement(name = "todasCargasEntregues")
    @ApiModelProperty(value = "Indicador que informa se todas as cargas já foram entregues")
    /**
     * Indicador que informa se todas as cargas já foram entregues
     **/
    private Boolean todasCargasEntregues = null;

    @XmlElement(name = "numeroDocumentoViagem")
    @ApiModelProperty(example = "AR123040104", value = "Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15")
    /**
     * Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15
     **/
    private String numeroDocumentoViagem = null;

    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data de emissão do documento de transporte<br/>Formato: yyyy-MM-dd")
    /**
     * Data de emissão do documento de transporte<br/>Formato: yyyy-MM-dd
     **/
    private LocalDate dataEmissao = null;

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
     * Get tipoDocumento
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    public TipoManifestoViagem getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoManifestoViagem tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public ViagemRodoviariaResumidaCargasDetalhadas tipoDocumento(TipoManifestoViagem tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    /**
     * Get conhecimentosCargaViagem
     *
     * @return conhecimentosCargaViagem
     **/
    @JsonProperty("conhecimentosCargaViagem")
    public List<ViagemRodoviariaCargaDetalhada> getConhecimentosCargaViagem() {
        return conhecimentosCargaViagem;
    }

    public void setConhecimentosCargaViagem(List<ViagemRodoviariaCargaDetalhada> conhecimentosCargaViagem) {
        this.conhecimentosCargaViagem = conhecimentosCargaViagem;
    }

    public ViagemRodoviariaResumidaCargasDetalhadas conhecimentosCargaViagem(List<ViagemRodoviariaCargaDetalhada> conhecimentosCargaViagem) {
        this.conhecimentosCargaViagem = conhecimentosCargaViagem;
        return this;
    }

    public ViagemRodoviariaResumidaCargasDetalhadas addConhecimentosCargaViagemItem(ViagemRodoviariaCargaDetalhada conhecimentosCargaViagemItem) {
        this.conhecimentosCargaViagem.add(conhecimentosCargaViagemItem);
        return this;
    }

    /**
     * Indicador que informa se todas as cargas já foram entregues
     *
     * @return todasCargasEntregues
     **/
    @JsonProperty("todasCargasEntregues")
    public Boolean isisTodasCargasEntregues() {
        return todasCargasEntregues;
    }

    public void setTodasCargasEntregues(Boolean todasCargasEntregues) {
        this.todasCargasEntregues = todasCargasEntregues;
    }

    public ViagemRodoviariaResumidaCargasDetalhadas todasCargasEntregues(Boolean todasCargasEntregues) {
        this.todasCargasEntregues = todasCargasEntregues;
        return this;
    }

    /**
     * Número do documento de transporte.&lt;br/&gt;Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.&lt;br/&gt; Tamanho Máximo: 15
     *
     * @return numeroDocumentoViagem
     **/
    @JsonProperty("numeroDocumentoViagem")
    public String getNumeroDocumentoViagem() {
        return numeroDocumentoViagem;
    }

    public void setNumeroDocumentoViagem(String numeroDocumentoViagem) {
        this.numeroDocumentoViagem = numeroDocumentoViagem;
    }

    public ViagemRodoviariaResumidaCargasDetalhadas numeroDocumentoViagem(String numeroDocumentoViagem) {
        this.numeroDocumentoViagem = numeroDocumentoViagem;
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

    public ViagemRodoviariaResumidaCargasDetalhadas dataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaResumidaCargasDetalhadas {\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "    conhecimentosCargaViagem: " + toIndentedString(conhecimentosCargaViagem) + "\n" +
                "    todasCargasEntregues: " + toIndentedString(todasCargasEntregues) + "\n" +
                "    numeroDocumentoViagem: " + toIndentedString(numeroDocumentoViagem) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "}";
        return sb;
    }
}
