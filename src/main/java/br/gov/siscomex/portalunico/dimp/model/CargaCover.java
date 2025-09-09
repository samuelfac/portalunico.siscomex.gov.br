package br.gov.siscomex.portalunico.dimp.model;

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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaCover", propOrder =
        {"tipoIdentificacaoCarga", "seguro", "identificacao", "frete", "unidadeDeclarada", "motivoSituacaoEspecial", "paisProcedencia"
        })

@XmlRootElement(name = "CargaCover")
/**
 * Dados da carga.
 **/
@ApiModel(description = "Dados da carga.")
public class CargaCover {


    @XmlElement(name = "tipoIdentificacaoCarga")
    @ApiModelProperty(example = "CE", value = "Descreve se a identificação da carga é do tipo CE ou RUC")
    /**
     * Descreve se a identificação da carga é do tipo CE ou RUC
     **/
    private TipoIdentificacaoCargaEnum tipoIdentificacaoCarga = null;
    @XmlElement(name = "seguro")
    @ApiModelProperty(value = "")
    @Valid
    private SeguroCover seguro = null;
    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11<br><br>Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/<br>Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo")
    /**
     * Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11<br><br>Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/<br>Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     **/
    private String identificacao = null;
    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private FreteCover frete = null;
    @XmlElement(name = "unidadeDeclarada", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private UnidadeDeclaradaCover unidadeDeclarada = null;
    @XmlElement(name = "motivoSituacaoEspecial")
    @ApiModelProperty(value = "Código do motivo da situação especial de despacho no sistema.<br>Tamanho: 5<br>Formato: 'NNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
    /**
     * Código do motivo da situação especial de despacho no sistema.<br>Tamanho: 5<br>Formato: 'NNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
     **/
    private String motivoSituacaoEspecial = null;
    @XmlElement(name = "paisProcedencia")
    @ApiModelProperty(value = "")
    @Valid
    private PaisProcedenciaCover paisProcedencia = null;

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

    public CargaCover tipoIdentificacaoCarga(TipoIdentificacaoCargaEnum tipoIdentificacaoCarga) {
        this.tipoIdentificacaoCarga = tipoIdentificacaoCarga;
        return this;
    }

    /**
     * Get seguro
     *
     * @return seguro
     **/
    @JsonProperty("seguro")
    public SeguroCover getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroCover seguro) {
        this.seguro = seguro;
    }

    public CargaCover seguro(SeguroCover seguro) {
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

    public CargaCover identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public FreteCover getFrete() {
        return frete;
    }

    public void setFrete(FreteCover frete) {
        this.frete = frete;
    }

    public CargaCover frete(FreteCover frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Get unidadeDeclarada
     *
     * @return unidadeDeclarada
     **/
    @JsonProperty("unidadeDeclarada")
    @NotNull
    public UnidadeDeclaradaCover getUnidadeDeclarada() {
        return unidadeDeclarada;
    }

    public void setUnidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
        this.unidadeDeclarada = unidadeDeclarada;
    }

    public CargaCover unidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
        this.unidadeDeclarada = unidadeDeclarada;
        return this;
    }

    /**
     * Código do motivo da situação especial de despacho no sistema.&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: &#39;NNNNN&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
     *
     * @return motivoSituacaoEspecial
     **/
    @JsonProperty("motivoSituacaoEspecial")
    public String getMotivoSituacaoEspecial() {
        return motivoSituacaoEspecial;
    }

    public void setMotivoSituacaoEspecial(String motivoSituacaoEspecial) {
        this.motivoSituacaoEspecial = motivoSituacaoEspecial;
    }

    public CargaCover motivoSituacaoEspecial(String motivoSituacaoEspecial) {
        this.motivoSituacaoEspecial = motivoSituacaoEspecial;
        return this;
    }

    /**
     * Get paisProcedencia
     *
     * @return paisProcedencia
     **/
    @JsonProperty("paisProcedencia")
    public PaisProcedenciaCover getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(PaisProcedenciaCover paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public CargaCover paisProcedencia(PaisProcedenciaCover paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CargaCover {\n" +
                "    tipoIdentificacaoCarga: " + toIndentedString(tipoIdentificacaoCarga) + "\n" +
                "    seguro: " + toIndentedString(seguro) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    unidadeDeclarada: " + toIndentedString(unidadeDeclarada) + "\n" +
                "    motivoSituacaoEspecial: " + toIndentedString(motivoSituacaoEspecial) + "\n" +
                "    paisProcedencia: " + toIndentedString(paisProcedencia) + "\n" +
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
