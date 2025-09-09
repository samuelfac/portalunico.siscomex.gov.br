package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroERetificaoDeLoteDIR", propOrder =
        {"cnpjDeclarante", "numeroLote", "manifestos", "sequenciaLote", "identificadorLote", "modalidade"
        })

@XmlRootElement(name = "RegistroERetificaoDeLoteDIR")
public class RegistroERetificaoDeLoteDIR {

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(example = "63198378000161", required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(example = "ABC2024010100001", value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.<br/>Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.<br/>Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.
     **/
    private String numeroLote = null;

    @XmlElement(name = "manifestos")
    @ApiModelProperty(value = "Lista de manifestos.")
    @Valid
    /**
     * Lista de manifestos.
     **/
    private List<DadosDoManifestoParaRegistroERetificaoDeLoteDIR> manifestos = null;

    @XmlElement(name = "sequenciaLote")
    @ApiModelProperty(example = "00051", value = "Número sequencial de declaração enviado por um operador numa determinada UA de despacho para um determinado dia. Este número é importante pois ele será enviado junto com o número do lote, que é criado automaticamente pelo sistema. Valor sequencial, diário, com 5 dígitos numéricos.<br/>Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.")
    /**
     * Número sequencial de declaração enviado por um operador numa determinada UA de despacho para um determinado dia. Este número é importante pois ele será enviado junto com o número do lote, que é criado automaticamente pelo sistema. Valor sequencial, diário, com 5 dígitos numéricos.<br/>Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.
     **/
    private String sequenciaLote = null;

    @XmlElement(name = "identificadorLote")
    @ApiModelProperty(value = "Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String identificadorLote = null;

    @XmlElement(name = "modalidade", required = true)
    @ApiModelProperty(required = true, value = "Tipo da modalidade do manifesto.<br/>Valores pré-definidos:<br/>'E' para Remessa Expressa;<br/>'P' para Remessa Postal.")
    /**
     * Tipo da modalidade do manifesto.<br/>Valores pré-definidos:<br/>'E' para Remessa Expressa;<br/>'P' para Remessa Postal.
     **/
    private String modalidade = null;

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
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return cnpjDeclarante
     **/
    @JsonProperty("cnpjDeclarante")
    @NotNull
    public String getCnpjDeclarante() {
        return cnpjDeclarante;
    }

    public void setCnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
    }

    public RegistroERetificaoDeLoteDIR cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
        return this;
    }

    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.&lt;br/&gt;Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.
     *
     * @return numeroLote
     **/
    @JsonProperty("numeroLote")
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public RegistroERetificaoDeLoteDIR numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Lista de manifestos.
     *
     * @return manifestos
     **/
    @JsonProperty("manifestos")
    public List<DadosDoManifestoParaRegistroERetificaoDeLoteDIR> getManifestos() {
        return manifestos;
    }

    public void setManifestos(List<DadosDoManifestoParaRegistroERetificaoDeLoteDIR> manifestos) {
        this.manifestos = manifestos;
    }

    public RegistroERetificaoDeLoteDIR manifestos(List<DadosDoManifestoParaRegistroERetificaoDeLoteDIR> manifestos) {
        this.manifestos = manifestos;
        return this;
    }

    public RegistroERetificaoDeLoteDIR addManifestosItem(DadosDoManifestoParaRegistroERetificaoDeLoteDIR manifestosItem) {
        this.manifestos.add(manifestosItem);
        return this;
    }

    /**
     * Número sequencial de declaração enviado por um operador numa determinada UA de despacho para um determinado dia. Este número é importante pois ele será enviado junto com o número do lote, que é criado automaticamente pelo sistema. Valor sequencial, diário, com 5 dígitos numéricos.&lt;br/&gt;Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.
     *
     * @return sequenciaLote
     **/
    @JsonProperty("sequenciaLote")
    public String getSequenciaLote() {
        return sequenciaLote;
    }

    public void setSequenciaLote(String sequenciaLote) {
        this.sequenciaLote = sequenciaLote;
    }

    public RegistroERetificaoDeLoteDIR sequenciaLote(String sequenciaLote) {
        this.sequenciaLote = sequenciaLote;
        return this;
    }

    /**
     * Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return identificadorLote
     **/
    @JsonProperty("identificadorLote")
    @Size(min = 0, max = 255)
    public String getIdentificadorLote() {
        return identificadorLote;
    }

    public void setIdentificadorLote(String identificadorLote) {
        this.identificadorLote = identificadorLote;
    }

    public RegistroERetificaoDeLoteDIR identificadorLote(String identificadorLote) {
        this.identificadorLote = identificadorLote;
        return this;
    }

    /**
     * Tipo da modalidade do manifesto.&lt;br/&gt;Valores pré-definidos:&lt;br/&gt;&#39;E&#39; para Remessa Expressa;&lt;br/&gt;&#39;P&#39; para Remessa Postal.
     *
     * @return modalidade
     **/
    @JsonProperty("modalidade")
    @NotNull
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public RegistroERetificaoDeLoteDIR modalidade(String modalidade) {
        this.modalidade = modalidade;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RegistroERetificaoDeLoteDIR {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    manifestos: " + toIndentedString(manifestos) + "\n" +
                "    sequenciaLote: " + toIndentedString(sequenciaLote) + "\n" +
                "    identificadorLote: " + toIndentedString(identificadorLote) + "\n" +
                "    modalidade: " + toIndentedString(modalidade) + "\n" +
                "}";
        return sb;
    }
}
