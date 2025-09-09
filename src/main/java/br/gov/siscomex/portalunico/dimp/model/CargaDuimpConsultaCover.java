package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
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
@XmlType(name = "CargaDuimpConsultaCover", propOrder =
        {"tipoIdentificacaoCarga", "seguro", "identificacao", "frete", "unidadeDeclarada", "paisProcedencia", "motivoSituacaoEspecial"
        })

@XmlRootElement(name = "CargaDuimpConsultaCover")
/**
 * Dados da carga.
 **/
@ApiModel(description = "Dados da carga.")
public class CargaDuimpConsultaCover {


    @XmlElement(name = "tipoIdentificacaoCarga")
    @ApiModelProperty(example = "CE", value = "Descreve se a identificação da carga é do tipo CE ou RUC")
    /**
     * Descreve se a identificação da carga é do tipo CE ou RUC
     **/
    private TipoIdentificacaoCargaEnum tipoIdentificacaoCarga = null;
    @XmlElement(name = "seguro")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDuimpSeguroConsultaCover seguro = null;
    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11<br><br>Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/<br>Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo")
    /**
     * Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11<br><br>Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/<br>Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     **/
    private String identificacao = null;
    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDuimpFreteConsultaCover frete = null;
    @XmlElement(name = "unidadeDeclarada")
    @ApiModelProperty(value = "")
    @Valid
    private UnidadeDeclaradaCover unidadeDeclarada = null;
    @XmlElement(name = "paisProcedencia")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDuimpPaisProcedenciaCover paisProcedencia = null;
    @XmlElement(name = "motivoSituacaoEspecial")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDuimpMotivoSituacaoEspecialCover motivoSituacaoEspecial = null;

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
     * Descreve se a identificação da carga é do tipo CE ou RUC
     *
     * @return tipoIdentificacaoCarga
     **/
    @JsonProperty("tipoIdentificacaoCarga")
    public String getTipoIdentificacaoCarga() {
        if (tipoIdentificacaoCarga == null) {
            return null;
        }
        return tipoIdentificacaoCarga.value();
    }

    public void setTipoIdentificacaoCarga(TipoIdentificacaoCargaEnum tipoIdentificacaoCarga) {
        this.tipoIdentificacaoCarga = tipoIdentificacaoCarga;
    }

    public CargaDuimpConsultaCover tipoIdentificacaoCarga(TipoIdentificacaoCargaEnum tipoIdentificacaoCarga) {
        this.tipoIdentificacaoCarga = tipoIdentificacaoCarga;
        return this;
    }

    /**
     * Get seguro
     *
     * @return seguro
     **/
    @JsonProperty("seguro")
    public CargaDuimpSeguroConsultaCover getSeguro() {
        return seguro;
    }

    public void setSeguro(CargaDuimpSeguroConsultaCover seguro) {
        this.seguro = seguro;
    }

    public CargaDuimpConsultaCover seguro(CargaDuimpSeguroConsultaCover seguro) {
        this.seguro = seguro;
        return this;
    }

    /**
     * Número de Identificação da Carga.&lt;br&gt;Quando tipo de identificação da carga for CE: &lt;br&gt; - Tamanho: 15 &lt;br&gt; - Formato: NNNNNNNNNNNNNNN&lt;br&gt;Quando tipo de identificação da carga for RUC: &lt;br&gt; - Tamanho mínimo: 1&lt;br&gt; - Tamanho máximo: 32&lt;br&gt;Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind&#x3D;11&lt;br&gt;&lt;br&gt;Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/&lt;br&gt;Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public CargaDuimpConsultaCover identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public CargaDuimpFreteConsultaCover getFrete() {
        return frete;
    }

    public void setFrete(CargaDuimpFreteConsultaCover frete) {
        this.frete = frete;
    }

    public CargaDuimpConsultaCover frete(CargaDuimpFreteConsultaCover frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Get unidadeDeclarada
     *
     * @return unidadeDeclarada
     **/
    @JsonProperty("unidadeDeclarada")
    public UnidadeDeclaradaCover getUnidadeDeclarada() {
        return unidadeDeclarada;
    }

    public void setUnidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
        this.unidadeDeclarada = unidadeDeclarada;
    }

    public CargaDuimpConsultaCover unidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
        this.unidadeDeclarada = unidadeDeclarada;
        return this;
    }

    /**
     * Get paisProcedencia
     *
     * @return paisProcedencia
     **/
    @JsonProperty("paisProcedencia")
    public CargaDuimpPaisProcedenciaCover getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(CargaDuimpPaisProcedenciaCover paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public CargaDuimpConsultaCover paisProcedencia(CargaDuimpPaisProcedenciaCover paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
        return this;
    }

    /**
     * Get motivoSituacaoEspecial
     *
     * @return motivoSituacaoEspecial
     **/
    @JsonProperty("motivoSituacaoEspecial")
    public CargaDuimpMotivoSituacaoEspecialCover getMotivoSituacaoEspecial() {
        return motivoSituacaoEspecial;
    }

    public void setMotivoSituacaoEspecial(CargaDuimpMotivoSituacaoEspecialCover motivoSituacaoEspecial) {
        this.motivoSituacaoEspecial = motivoSituacaoEspecial;
    }

    public CargaDuimpConsultaCover motivoSituacaoEspecial(CargaDuimpMotivoSituacaoEspecialCover motivoSituacaoEspecial) {
        this.motivoSituacaoEspecial = motivoSituacaoEspecial;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CargaDuimpConsultaCover {\n" +
                "    tipoIdentificacaoCarga: " + toIndentedString(tipoIdentificacaoCarga) + "\n" +
                "    seguro: " + toIndentedString(seguro) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    unidadeDeclarada: " + toIndentedString(unidadeDeclarada) + "\n" +
                "    paisProcedencia: " + toIndentedString(paisProcedencia) + "\n" +
                "    motivoSituacaoEspecial: " + toIndentedString(motivoSituacaoEspecial) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoIdentificacaoCargaEnum")
    @XmlEnum(String.class)
    public enum TipoIdentificacaoCargaEnum {

        @XmlEnumValue("CE")
        @JsonProperty("CE")
        CE("CE"),

        @XmlEnumValue("RUC")
        @JsonProperty("RUC")
        RUC("RUC");


        private final String value;

        TipoIdentificacaoCargaEnum(String v) {
            value = v;
        }

        public static TipoIdentificacaoCargaEnum fromValue(String v) {
            for (TipoIdentificacaoCargaEnum b : TipoIdentificacaoCargaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoIdentificacaoCargaEnum");
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
