package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncluirLpcoRequest", propOrder =
        {"dataReferencia", "codigoModelo", "numeroLI", "justificativaDispensaTaxa", "informacaoAdicional", "listaCamposFormulario", "listaNcm", "dispensaTaxa"
        })

@XmlRootElement(name = "IncluirLpcoRequest")
/**
 * Dados de um LPCO a ser cadastrado
 **/
@ApiModel(description = "Dados de um LPCO a ser cadastrado")
public class IncluirLpcoRequest {

    @XmlElement(name = "dataReferencia")
    @ApiModelProperty(example = "2019-08-27T13:28", value = "Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual<br>Formato: dd-MM-yyyy'T'HH:mmZ")
    /**
     * Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual<br>Formato: dd-MM-yyyy'T'HH:mmZ
     **/
    private String dataReferencia = null;

    @XmlElement(name = "codigoModelo", required = true)
    @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de LPCO utilizado para o pedido<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do modelo no ano")
    /**
     * Código do modelo de LPCO utilizado para o pedido<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do modelo no ano
     **/
    private String codigoModelo = null;

    @XmlElement(name = "numeroLI")
    @ApiModelProperty(example = "2200002094", value = "Número da LI. É obrigatório quando o campo \"exigeNumeroLI\" do modelo for true.")
    /**
     * Número da LI. É obrigatório quando o campo \"exigeNumeroLI\" do modelo for true.
     **/
    private Long numeroLI = null;

    @XmlElement(name = "justificativaDispensaTaxa")
    @ApiModelProperty(example = "Texto livre", value = "Justificativa da Dispensa de Taxa. É obrigatório quando o campo \"dispensaTaxa\" for true.")
    /**
     * Justificativa da Dispensa de Taxa. É obrigatório quando o campo \"dispensaTaxa\" for true.
     **/
    private String justificativaDispensaTaxa = null;

    @XmlElement(name = "informacaoAdicional")
    @ApiModelProperty(example = "Texto livre", value = "Informações adicionais prestadas pelo importador/exportador")
    /**
     * Informações adicionais prestadas pelo importador/exportador
     **/
    private String informacaoAdicional = null;

    @XmlElement(name = "listaCamposFormulario", required = true)
    @ApiModelProperty(required = true, value = "Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.")
    @Valid
    /**
     * Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.
     **/
    private List<CampoLpcoRequest> listaCamposFormulario = new ArrayList<>();

    @XmlElement(name = "listaNcm")
    @ApiModelProperty(value = "Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.")
    @Valid
    /**
     * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
     **/
    private List<ItemLpcoInserirRequest> listaNcm = null;

    @XmlElement(name = "dispensaTaxa")
    @ApiModelProperty(example = "true", value = "Dispensa de Taxa. Informa se o LPCO é dispensado de taxa.")
    /**
     * Dispensa de Taxa. Informa se o LPCO é dispensado de taxa.
     **/
    private Boolean dispensaTaxa = null;

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
     * Data de referência para emissão do pedido. Se não informada, utiliza-se o momento atual&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
     *
     * @return dataReferencia
     **/
    @JsonProperty("dataReferencia")
    public String getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(String dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public IncluirLpcoRequest dataReferencia(String dataReferencia) {
        this.dataReferencia = dataReferencia;
        return this;
    }

    /**
     * Código do modelo de LPCO utilizado para o pedido&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: ONNNNN&lt;br&gt;Lei de formação: O número do modelo de LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* NNNNN &#x3D; Número sequencial do modelo no ano
     *
     * @return codigoModelo
     **/
    @JsonProperty("codigoModelo")
    @NotNull
    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public IncluirLpcoRequest codigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
        return this;
    }

    /**
     * Número da LI. É obrigatório quando o campo \&quot;exigeNumeroLI\&quot; do modelo for true.
     *
     * @return numeroLI
     **/
    @JsonProperty("numeroLI")
    public Long getNumeroLI() {
        return numeroLI;
    }

    public void setNumeroLI(Long numeroLI) {
        this.numeroLI = numeroLI;
    }

    public IncluirLpcoRequest numeroLI(Long numeroLI) {
        this.numeroLI = numeroLI;
        return this;
    }

    /**
     * Justificativa da Dispensa de Taxa. É obrigatório quando o campo \&quot;dispensaTaxa\&quot; for true.
     *
     * @return justificativaDispensaTaxa
     **/
    @JsonProperty("justificativaDispensaTaxa")
    public String getJustificativaDispensaTaxa() {
        return justificativaDispensaTaxa;
    }

    public void setJustificativaDispensaTaxa(String justificativaDispensaTaxa) {
        this.justificativaDispensaTaxa = justificativaDispensaTaxa;
    }

    public IncluirLpcoRequest justificativaDispensaTaxa(String justificativaDispensaTaxa) {
        this.justificativaDispensaTaxa = justificativaDispensaTaxa;
        return this;
    }

    /**
     * Informações adicionais prestadas pelo importador/exportador
     *
     * @return informacaoAdicional
     **/
    @JsonProperty("informacaoAdicional")
    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public IncluirLpcoRequest informacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
        return this;
    }

    /**
     * Lista de campos do pedido que fazem parte dos \&quot;Dados Gerais\&quot; do LPCO, ou seja, aqueles que não são informados por item.
     *
     * @return listaCamposFormulario
     **/
    @JsonProperty("listaCamposFormulario")
    @NotNull
    public List<CampoLpcoRequest> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<CampoLpcoRequest> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
    }

    public IncluirLpcoRequest listaCamposFormulario(List<CampoLpcoRequest> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
        return this;
    }

    public IncluirLpcoRequest addListaCamposFormularioItem(CampoLpcoRequest listaCamposFormularioItem) {
        this.listaCamposFormulario.add(listaCamposFormularioItem);
        return this;
    }

    /**
     * Lista dos itens do LPCO. Contém campos como NCM e código do produto de cada item do LPCO, entre outros.
     *
     * @return listaNcm
     **/
    @JsonProperty("listaNcm")
    public List<ItemLpcoInserirRequest> getListaNcm() {
        return listaNcm;
    }

    public void setListaNcm(List<ItemLpcoInserirRequest> listaNcm) {
        this.listaNcm = listaNcm;
    }

    public IncluirLpcoRequest listaNcm(List<ItemLpcoInserirRequest> listaNcm) {
        this.listaNcm = listaNcm;
        return this;
    }

    public IncluirLpcoRequest addListaNcmItem(ItemLpcoInserirRequest listaNcmItem) {
        this.listaNcm.add(listaNcmItem);
        return this;
    }

    /**
     * Dispensa de Taxa. Informa se o LPCO é dispensado de taxa.
     *
     * @return dispensaTaxa
     **/
    @JsonProperty("dispensaTaxa")
    public Boolean isisDispensaTaxa() {
        return dispensaTaxa;
    }

    public void setDispensaTaxa(Boolean dispensaTaxa) {
        this.dispensaTaxa = dispensaTaxa;
    }

    public IncluirLpcoRequest dispensaTaxa(Boolean dispensaTaxa) {
        this.dispensaTaxa = dispensaTaxa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class IncluirLpcoRequest {\n" +
                "    dataReferencia: " + toIndentedString(dataReferencia) + "\n" +
                "    codigoModelo: " + toIndentedString(codigoModelo) + "\n" +
                "    numeroLI: " + toIndentedString(numeroLI) + "\n" +
                "    justificativaDispensaTaxa: " + toIndentedString(justificativaDispensaTaxa) + "\n" +
                "    informacaoAdicional: " + toIndentedString(informacaoAdicional) + "\n" +
                "    listaCamposFormulario: " + toIndentedString(listaCamposFormulario) + "\n" +
                "    listaNcm: " + toIndentedString(listaNcm) + "\n" +
                "    dispensaTaxa: " + toIndentedString(dispensaTaxa) + "\n" +
                "}";
        return sb;
    }
}
