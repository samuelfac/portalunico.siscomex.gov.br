package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadoComplementarCargaCover", propOrder =
        {"tipoIdentificacaoCarga", "identificacao", "viaTransporte", "unidadeEntrada"
        })

@XmlRootElement(name = "DadoComplementarCargaCover")
/**
 * Dados complementares da carga.
 **/
@ApiModel(description = "Dados complementares da carga.")
public class DadoComplementarCargaCover {


    @XmlElement(name = "unidadeEntrada")
    @ApiModelProperty(example = "0717600", value = "")
    private String unidadeEntrada = null;

    @XmlElement(name = "tipoIdentificacaoCarga")
    @ApiModelProperty(example = "CE", value = "Descreve se a identificação da carga é do tipo CE ou RUC")
    /**
     * Descreve se a identificação da carga é do tipo CE ou RUC
     **/
    private TipoIdentificacaoCargaEnum tipoIdentificacaoCarga = null;

    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "132405005073923", value = "Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11<br><br>Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/<br>Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo")
    /**
     * Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11<br><br>Origem: Portal Único Siscomex - Sistema CCT Importação - https://portalunico.siscomex.gov.br/<br>Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     **/
    private String identificacao = null;

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

    @XmlElement(name = "viaTransporte")
    @ApiModelProperty(example = "AEREA", value = "")
    private ViaTransporteEnum viaTransporte = null;

    /**
     * Get unidadeEntrada
     *
     * @return unidadeEntrada
     **/
    @JsonProperty("unidadeEntrada")
    public String getUnidadeEntrada() {
        return unidadeEntrada;
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

    public DadoComplementarCargaCover tipoIdentificacaoCarga(TipoIdentificacaoCargaEnum tipoIdentificacaoCarga) {
        this.tipoIdentificacaoCarga = tipoIdentificacaoCarga;
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

    public DadoComplementarCargaCover identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Get viaTransporte
     *
     * @return viaTransporte
     **/
    @JsonProperty("viaTransporte")
    public String getViaTransporte() {
        if (viaTransporte == null) {
            return null;
        }
        return viaTransporte.value();
    }

    public void setViaTransporte(ViaTransporteEnum viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public DadoComplementarCargaCover viaTransporte(ViaTransporteEnum viaTransporte) {
        this.viaTransporte = viaTransporte;
        return this;
    }

    public void setUnidadeEntrada(String unidadeEntrada) {
        this.unidadeEntrada = unidadeEntrada;
    }

    public DadoComplementarCargaCover unidadeEntrada(String unidadeEntrada) {
        this.unidadeEntrada = unidadeEntrada;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadoComplementarCargaCover {\n" +
                "    tipoIdentificacaoCarga: " + toIndentedString(tipoIdentificacaoCarga) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    viaTransporte: " + toIndentedString(viaTransporte) + "\n" +
                "    unidadeEntrada: " + toIndentedString(unidadeEntrada) + "\n" +
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

    @XmlType(name = "ViaTransporteEnum")
    @XmlEnum(String.class)
    public enum ViaTransporteEnum {

        @XmlEnumValue("MARITMO")
        @JsonProperty("MARITMO")
        MARITMO("MARITMO"),

        @XmlEnumValue("AEREA")
        @JsonProperty("AEREA")
        AEREA("AEREA"),

        @XmlEnumValue("RODOVIARIO")
        @JsonProperty("RODOVIARIO")
        RODOVIARIO("RODOVIARIO");


        private final String value;

        ViaTransporteEnum(String v) {
            value = v;
        }

        public static ViaTransporteEnum fromValue(String v) {
            for (ViaTransporteEnum b : ViaTransporteEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to ViaTransporteEnum");
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
