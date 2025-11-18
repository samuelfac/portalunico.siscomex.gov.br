package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaDocumentoAnexo", propOrder =
        {"descricao", "identificacao", "tipo"
        })

@XmlRootElement(name = "CargaRodoviariaDocumentoAnexo")
public class CargaRodoviariaDocumentoAnexo {

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição do documento que será apresentado na fronteira<br/> Tamanho Máximo: 50")
    /**
     * Descrição do documento que será apresentado na fronteira<br/> Tamanho Máximo: 50
     **/
    private String descricao = null;

    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "US123456-543B", value = "Número do identificador do documento<br/>Obrigatório quando o campo \"tipo\" do documento for 49 (fatura comercial)<br/> Tamanho Máximo: 20")
    /**
     * Número do identificador do documento<br/>Obrigatório quando o campo \"tipo\" do documento for 49 (fatura comercial)<br/> Tamanho Máximo: 20
     **/
    private String identificacao = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumentoApresentado tipo = null;

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
     * Descrição do documento que será apresentado na fronteira&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Número do identificador do documento&lt;br/&gt;Obrigatório quando o campo \&quot;tipo\&quot; do documento for 49 (fatura comercial)&lt;br/&gt; Tamanho Máximo: 20
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

    public CargaRodoviariaDocumentoAnexo identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    public CargaRodoviariaDocumentoAnexo descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoDocumentoApresentado getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumentoApresentado tipo) {
        this.tipo = tipo;
    }

    public CargaRodoviariaDocumentoAnexo tipo(TipoDocumentoApresentado tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDocumentoAnexo {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }
}
