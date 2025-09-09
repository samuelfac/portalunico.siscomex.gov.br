package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroERetificaoDeManifesto", propOrder =
        {"cnpjDeclarante", "sequenciaManifesto", "numeroManifesto", "paisOrigem", "uaDespacho", "remessas", "modalidade"
        })

@XmlRootElement(name = "RegistroERetificaoDeManifesto")
public class RegistroERetificaoDeManifesto {

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "sequenciaManifesto")
    @ApiModelProperty(value = "Número sequencial de manifesto enviado pelo operador numa determinada UA de despacho para um determinado dia. Este número é importante pois ele será enviado junto com o número do manifesto, que é criado automaticamente pelo sistema. Valor sequencial, diário, com 5 dígitos numéricos.<br/>Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.")
    /**
     * Número sequencial de manifesto enviado pelo operador numa determinada UA de despacho para um determinado dia. Este número é importante pois ele será enviado junto com o número do manifesto, que é criado automaticamente pelo sistema. Valor sequencial, diário, com 5 dígitos numéricos.<br/>Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.
     **/
    private String sequenciaManifesto = null;

    @XmlElement(name = "numeroManifesto")
    @ApiModelProperty(value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.Atributo  obrigatório  caso  seja uma retificação.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.Atributo  obrigatório  caso  seja uma retificação.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "paisOrigem", required = true)
    @ApiModelProperty(required = true, value = "Código do país de origem da carga. Valores de acordo com a tabela de domínio.")
    /**
     * Código do país de origem da carga. Valores de acordo com a tabela de domínio.
     **/
    private String paisOrigem = null;

    @XmlElement(name = "uaDespacho", required = true)
    @ApiModelProperty(required = true, value = "Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.")
    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.
     **/
    private String uaDespacho = null;

    @XmlElement(name = "remessas")
    @ApiModelProperty(value = "Lista de remessas.")
    @Valid
    /**
     * Lista de remessas.
     **/
    private List<DadosDaRemessaParaRegistroERetificaoDeManifesto> remessas = null;

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

    public RegistroERetificaoDeManifesto cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
        return this;
    }

    /**
     * Número sequencial de manifesto enviado pelo operador numa determinada UA de despacho para um determinado dia. Este número é importante pois ele será enviado junto com o número do manifesto, que é criado automaticamente pelo sistema. Valor sequencial, diário, com 5 dígitos numéricos.&lt;br/&gt;Caso o documento enviado seja uma retificação, este campo deve ser enviado com valor nulo.
     *
     * @return sequenciaManifesto
     **/
    @JsonProperty("sequenciaManifesto")
    public String getSequenciaManifesto() {
        return sequenciaManifesto;
    }

    public void setSequenciaManifesto(String sequenciaManifesto) {
        this.sequenciaManifesto = sequenciaManifesto;
    }

    public RegistroERetificaoDeManifesto sequenciaManifesto(String sequenciaManifesto) {
        this.sequenciaManifesto = sequenciaManifesto;
        return this;
    }

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.Atributo  obrigatório  caso  seja uma retificação.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public RegistroERetificaoDeManifesto numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Código do país de origem da carga. Valores de acordo com a tabela de domínio.
     *
     * @return paisOrigem
     **/
    @JsonProperty("paisOrigem")
    @NotNull
    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public RegistroERetificaoDeManifesto paisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
        return this;
    }

    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.
     *
     * @return uaDespacho
     **/
    @JsonProperty("uaDespacho")
    @NotNull
    public String getUaDespacho() {
        return uaDespacho;
    }

    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    public RegistroERetificaoDeManifesto uaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
        return this;
    }

    /**
     * Lista de remessas.
     *
     * @return remessas
     **/
    @JsonProperty("remessas")
    public List<DadosDaRemessaParaRegistroERetificaoDeManifesto> getRemessas() {
        return remessas;
    }

    public void setRemessas(List<DadosDaRemessaParaRegistroERetificaoDeManifesto> remessas) {
        this.remessas = remessas;
    }

    public RegistroERetificaoDeManifesto remessas(List<DadosDaRemessaParaRegistroERetificaoDeManifesto> remessas) {
        this.remessas = remessas;
        return this;
    }

    public RegistroERetificaoDeManifesto addRemessasItem(DadosDaRemessaParaRegistroERetificaoDeManifesto remessasItem) {
        this.remessas.add(remessasItem);
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

    public RegistroERetificaoDeManifesto modalidade(String modalidade) {
        this.modalidade = modalidade;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RegistroERetificaoDeManifesto {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    sequenciaManifesto: " + toIndentedString(sequenciaManifesto) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    paisOrigem: " + toIndentedString(paisOrigem) + "\n" +
                "    uaDespacho: " + toIndentedString(uaDespacho) + "\n" +
                "    remessas: " + toIndentedString(remessas) + "\n" +
                "    modalidade: " + toIndentedString(modalidade) + "\n" +
                "}";
        return sb;
    }
}
