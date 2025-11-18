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
@XmlType(name = "DadosDoManifestoParaRegistroERetificaoDeLoteDIR", propOrder =
        {"numeroManifesto", "paisOrigem", "presencaCargaAutomatica", "remessas", "uaDespacho"
        })

@XmlRootElement(name = "DadosDoManifestoParaRegistroERetificaoDeLoteDIR")
public class DadosDoManifestoParaRegistroERetificaoDeLoteDIR {

    @XmlElement(name = "numeroManifesto", required = true)
    @ApiModelProperty(required = true, value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "paisOrigem")
    @ApiModelProperty(value = "Código do país de origem da carga. Valores de acordo com a tabela de domínio.<br/>Obrigatório para modalidade Postal e não obrigatório para modalidade expressa.")
    /**
     * Código do país de origem da carga. Valores de acordo com a tabela de domínio.<br/>Obrigatório para modalidade Postal e não obrigatório para modalidade expressa.
     **/
    private String paisOrigem = null;

    @XmlElement(name = "presencaCargaAutomatica")
    @ApiModelProperty(value = "Indica que houve a presença de carga. Apenas para remessa postal. Sim – 's' e Não – 'n'<br/>Para modalidade expressa não deve ser informado.<br/>Caso o campo não seja informado, o sistema assume o valor 'n' como padrão")
    /**
     * Indica que houve a presença de carga. Apenas para remessa postal. Sim – 's' e Não – 'n'<br/>Para modalidade expressa não deve ser informado.<br/>Caso o campo não seja informado, o sistema assume o valor 'n' como padrão
     **/
    private String presencaCargaAutomatica = null;

    @XmlElement(name = "remessas")
    @ApiModelProperty(value = "Lista de remessas.")
    @Valid
    /**
     * Lista de remessas.
     **/
    private List<DadosDaRemessaParaRegistroERetificaoDeLoteDIR> remessas = null;

    @XmlElement(name = "uaDespacho")
    @ApiModelProperty(value = "Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.<br/>Obrigatório para modalidade Postal e não obrigatório para modalidade expressa.")
    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.<br/>Obrigatório para modalidade Postal e não obrigatório para modalidade expressa.
     **/
    private String uaDespacho = null;

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    @NotNull
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public DadosDoManifestoParaRegistroERetificaoDeLoteDIR numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Código do país de origem da carga. Valores de acordo com a tabela de domínio.&lt;br/&gt;Obrigatório para modalidade Postal e não obrigatório para modalidade expressa.
     *
     * @return paisOrigem
     **/
    @JsonProperty("paisOrigem")
    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public DadosDoManifestoParaRegistroERetificaoDeLoteDIR paisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
        return this;
    }

    /**
     * Indica que houve a presença de carga. Apenas para remessa postal. Sim – &#39;s&#39; e Não – &#39;n&#39;&lt;br/&gt;Para modalidade expressa não deve ser informado.&lt;br/&gt;Caso o campo não seja informado, o sistema assume o valor &#39;n&#39; como padrão
     *
     * @return presencaCargaAutomatica
     **/
    @JsonProperty("presencaCargaAutomatica")
    public String getPresencaCargaAutomatica() {
        return presencaCargaAutomatica;
    }

    public void setPresencaCargaAutomatica(String presencaCargaAutomatica) {
        this.presencaCargaAutomatica = presencaCargaAutomatica;
    }

    public DadosDoManifestoParaRegistroERetificaoDeLoteDIR presencaCargaAutomatica(String presencaCargaAutomatica) {
        this.presencaCargaAutomatica = presencaCargaAutomatica;
        return this;
    }

    /**
     * Lista de remessas.
     *
     * @return remessas
     **/
    @JsonProperty("remessas")
    public List<DadosDaRemessaParaRegistroERetificaoDeLoteDIR> getRemessas() {
        return remessas;
    }

    public void setRemessas(List<DadosDaRemessaParaRegistroERetificaoDeLoteDIR> remessas) {
        this.remessas = remessas;
    }

    public DadosDoManifestoParaRegistroERetificaoDeLoteDIR remessas(List<DadosDaRemessaParaRegistroERetificaoDeLoteDIR> remessas) {
        this.remessas = remessas;
        return this;
    }

    public DadosDoManifestoParaRegistroERetificaoDeLoteDIR addRemessasItem(DadosDaRemessaParaRegistroERetificaoDeLoteDIR remessasItem) {
        this.remessas.add(remessasItem);
        return this;
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

    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.&lt;br/&gt;Obrigatório para modalidade Postal e não obrigatório para modalidade expressa.
     *
     * @return uaDespacho
     **/
    @JsonProperty("uaDespacho")
    public String getUaDespacho() {
        return uaDespacho;
    }

    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    public DadosDoManifestoParaRegistroERetificaoDeLoteDIR uaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosDoManifestoParaRegistroERetificaoDeLoteDIR {\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    paisOrigem: " + toIndentedString(paisOrigem) + "\n" +
                "    presencaCargaAutomatica: " + toIndentedString(presencaCargaAutomatica) + "\n" +
                "    remessas: " + toIndentedString(remessas) + "\n" +
                "    uaDespacho: " + toIndentedString(uaDespacho) + "\n" +
                "}";
        return sb;
    }
}
