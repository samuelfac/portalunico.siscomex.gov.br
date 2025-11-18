package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao", propOrder =
        {"tipoConhecimento", "motivoDSIC", "quantidadeVolumes", "resumoRUC", "valorOutrosCustosRemetente", "valorOutrosCustosDestinatario"
        })

@XmlRootElement(name = "DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao")
public class DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao {


    @XmlElement(name = "tipoConhecimento")
    @ApiModelProperty(example = "CRT", value = "Tipo de conhecimento de transporte de carga rodoviária")
    /**
     * Tipo de conhecimento de transporte de carga rodoviária
     **/
    private TipoConhecimentoEnum tipoConhecimento = null;
    @XmlElement(name = "motivoDSIC")
    @ApiModelProperty(value = "")
    @Valid
    private SefazMotivoDSICDTO motivoDSIC = null;
    @XmlElement(name = "resumoRUC")
    @ApiModelProperty(value = "")
    @Valid
    private SefazResumoRUCCover resumoRUC = null;

    @XmlElement(name = "quantidadeVolumes")
    @ApiModelProperty(example = "2000", value = "Quantidade total de volumes.<br>Formato: Inteiro, com até 10 digitos<br>Valor mínimo: 1<br>Valor máximo: 2.147.483.647")
    /**
     * Quantidade total de volumes.<br>Formato: Inteiro, com até 10 digitos<br>Valor mínimo: 1<br>Valor máximo: 2.147.483.647
     **/
    private Integer quantidadeVolumes = null;
    @XmlElement(name = "valorOutrosCustosRemetente")
    @ApiModelProperty(value = "")
    @Valid
    private OutrosCustosDoRemetenteDeUmaCargaRodoviria valorOutrosCustosRemetente = null;

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

    @XmlElement(name = "valorOutrosCustosDestinatario")
    @ApiModelProperty(value = "")
    @Valid
    private OutrosCustosDoDestinatrioDeUmaCargaRodoviria valorOutrosCustosDestinatario = null;

    /**
     * Tipo de conhecimento de transporte de carga rodoviária
     *
     * @return tipoConhecimento
     **/
    @JsonProperty("tipoConhecimento")
    public String getTipoConhecimento() {
        if (tipoConhecimento == null) {
            return null;
        }
        return tipoConhecimento.value();
    }

    public void setTipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
        this.tipoConhecimento = tipoConhecimento;
    }

    public DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao tipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
        this.tipoConhecimento = tipoConhecimento;
        return this;
    }

    /**
     * Get motivoDSIC
     *
     * @return motivoDSIC
     **/
    @JsonProperty("motivoDSIC")
    public SefazMotivoDSICDTO getMotivoDSIC() {
        return motivoDSIC;
    }

    public void setMotivoDSIC(SefazMotivoDSICDTO motivoDSIC) {
        this.motivoDSIC = motivoDSIC;
    }

    public DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao motivoDSIC(SefazMotivoDSICDTO motivoDSIC) {
        this.motivoDSIC = motivoDSIC;
        return this;
    }

    /**
     * Quantidade total de volumes.&lt;br&gt;Formato: Inteiro, com até 10 digitos&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 2.147.483.647
     *
     * @return quantidadeVolumes
     **/
    @JsonProperty("quantidadeVolumes")
    public Integer getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao quantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
        return this;
    }

    /**
     * Get resumoRUC
     *
     * @return resumoRUC
     **/
    @JsonProperty("resumoRUC")
    public SefazResumoRUCCover getResumoRUC() {
        return resumoRUC;
    }

    public void setResumoRUC(SefazResumoRUCCover resumoRUC) {
        this.resumoRUC = resumoRUC;
    }

    public DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao resumoRUC(SefazResumoRUCCover resumoRUC) {
        this.resumoRUC = resumoRUC;
        return this;
    }

    /**
     * Get valorOutrosCustosRemetente
     *
     * @return valorOutrosCustosRemetente
     **/
    @JsonProperty("valorOutrosCustosRemetente")
    public OutrosCustosDoRemetenteDeUmaCargaRodoviria getValorOutrosCustosRemetente() {
        return valorOutrosCustosRemetente;
    }

    public void setValorOutrosCustosRemetente(OutrosCustosDoRemetenteDeUmaCargaRodoviria valorOutrosCustosRemetente) {
        this.valorOutrosCustosRemetente = valorOutrosCustosRemetente;
    }

    public DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao valorOutrosCustosRemetente(OutrosCustosDoRemetenteDeUmaCargaRodoviria valorOutrosCustosRemetente) {
        this.valorOutrosCustosRemetente = valorOutrosCustosRemetente;
        return this;
    }

    /**
     * Get valorOutrosCustosDestinatario
     *
     * @return valorOutrosCustosDestinatario
     **/
    @JsonProperty("valorOutrosCustosDestinatario")
    public OutrosCustosDoDestinatrioDeUmaCargaRodoviria getValorOutrosCustosDestinatario() {
        return valorOutrosCustosDestinatario;
    }

    public void setValorOutrosCustosDestinatario(OutrosCustosDoDestinatrioDeUmaCargaRodoviria valorOutrosCustosDestinatario) {
        this.valorOutrosCustosDestinatario = valorOutrosCustosDestinatario;
    }

    public DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao valorOutrosCustosDestinatario(OutrosCustosDoDestinatrioDeUmaCargaRodoviria valorOutrosCustosDestinatario) {
        this.valorOutrosCustosDestinatario = valorOutrosCustosDestinatario;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosEspecficosDeUmaCargaRodoviriaNoCCTImportao {\n" +
                "    tipoConhecimento: " + toIndentedString(tipoConhecimento) + "\n" +
                "    motivoDSIC: " + toIndentedString(motivoDSIC) + "\n" +
                "    quantidadeVolumes: " + toIndentedString(quantidadeVolumes) + "\n" +
                "    resumoRUC: " + toIndentedString(resumoRUC) + "\n" +
                "    valorOutrosCustosRemetente: " + toIndentedString(valorOutrosCustosRemetente) + "\n" +
                "    valorOutrosCustosDestinatario: " + toIndentedString(valorOutrosCustosDestinatario) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoConhecimentoEnum")
    @XmlEnum(String.class)
    public enum TipoConhecimentoEnum {

        @XmlEnumValue("CRT")
        @JsonProperty("CRT")
        CRT("CRT"),

        @XmlEnumValue("INVALIDO")
        @JsonProperty("INVALIDO")
        INVALIDO("INVALIDO");


        private final String value;

        TipoConhecimentoEnum(String v) {
            value = v;
        }

        public static TipoConhecimentoEnum fromValue(String v) {
            for (TipoConhecimentoEnum b : TipoConhecimentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoConhecimentoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
