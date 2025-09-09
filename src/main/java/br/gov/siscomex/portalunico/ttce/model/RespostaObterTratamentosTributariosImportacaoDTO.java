package br.gov.siscomex.portalunico.ttce.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaObterTratamentosTributariosImportacaoDTO", propOrder =
        {"tratamentosTributarios", "ncm", "fundamentosOpcionaisDisponiveis", "dataFatoGerador", "tipoOperacao", "codigoPais"
        })

@XmlRootElement(name = "RespostaObterTratamentosTributariosImportacaoDTO")
/**
 * DTO de resposta do serviço que obtem os dados de Tratamentos Tributários de Importação.
 **/
@ApiModel(description = "DTO de resposta do serviço que obtem os dados de Tratamentos Tributários de Importação.")
public class RespostaObterTratamentosTributariosImportacaoDTO {

    @XmlElement(name = "tratamentosTributarios")
    @ApiModelProperty(value = "Lista de Tratamentos Tributários de Importação.<br/>São apresentados todos os Tratamentos Tributários com Fundamento Legal do tipo de uso Normal e Teto, que possuem atributos adicionais que precisam ser informados para a Duimp. NÃO estão nesta lista os Tratamentos Tributários do tipo Normal que NÃO necessitam de informação de atributos.<br/>Quando, nos parâmetros de entrada, for indicado um Fundamento Legal Opcional, os atributos serão indicados neste DTO.")
    @Valid
    /**
     * Lista de Tratamentos Tributários de Importação.<br/>São apresentados todos os Tratamentos Tributários com Fundamento Legal do tipo de uso Normal e Teto, que possuem atributos adicionais que precisam ser informados para a Duimp. NÃO estão nesta lista os Tratamentos Tributários do tipo Normal que NÃO necessitam de informação de atributos.<br/>Quando, nos parâmetros de entrada, for indicado um Fundamento Legal Opcional, os atributos serão indicados neste DTO.
     **/
    private List<TratamentoTributarioDTO> tratamentosTributarios = null;

    @XmlElement(name = "ncm", required = true)
    @ApiModelProperty(example = "30031012", required = true, value = "Código NCM informado na chamada do serviço.")
    /**
     * Código NCM informado na chamada do serviço.
     **/
    private String ncm = null;

    @XmlElement(name = "fundamentosOpcionaisDisponiveis")
    @ApiModelProperty(value = "Lista de Fundamentos Opcionais disponíveis.")
    @Valid
    /**
     * Lista de Fundamentos Opcionais disponíveis.
     **/
    private List<FundamentoLegalOpcionalDisponivelDTO> fundamentosOpcionaisDisponiveis = null;

    @XmlElement(name = "dataFatoGerador", required = true)
    @ApiModelProperty(example = "2020-12-20", required = true, value = "Data do fato gerador informada na chamada do serviço.")
    /**
     * Data do fato gerador informada na chamada do serviço.
     **/
    private String dataFatoGerador = null;

    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "I", required = true, value = "Tipo de operação informado na chamada do serviço.")
    /**
     * Tipo de operação informado na chamada do serviço.
     **/
    private String tipoOperacao = null;

    @XmlElement(name = "codigoPais", required = true)
    @ApiModelProperty(example = "23", required = true, value = "Código do país informado na chamada do serviço.")
    /**
     * Código do país informado na chamada do serviço.
     **/
    private Long codigoPais = null;

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
     * Lista de Tratamentos Tributários de Importação.&lt;br/&gt;São apresentados todos os Tratamentos Tributários com Fundamento Legal do tipo de uso Normal e Teto, que possuem atributos adicionais que precisam ser informados para a Duimp. NÃO estão nesta lista os Tratamentos Tributários do tipo Normal que NÃO necessitam de informação de atributos.&lt;br/&gt;Quando, nos parâmetros de entrada, for indicado um Fundamento Legal Opcional, os atributos serão indicados neste DTO.
     *
     * @return tratamentosTributarios
     **/
    @JsonProperty("tratamentosTributarios")
    public List<TratamentoTributarioDTO> getTratamentosTributarios() {
        return tratamentosTributarios;
    }

    public void setTratamentosTributarios(List<TratamentoTributarioDTO> tratamentosTributarios) {
        this.tratamentosTributarios = tratamentosTributarios;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO tratamentosTributarios(List<TratamentoTributarioDTO> tratamentosTributarios) {
        this.tratamentosTributarios = tratamentosTributarios;
        return this;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO addTratamentosTributariosItem(TratamentoTributarioDTO tratamentosTributariosItem) {
        this.tratamentosTributarios.add(tratamentosTributariosItem);
        return this;
    }

    /**
     * Código NCM informado na chamada do serviço.
     *
     * @return ncm
     **/
    @JsonProperty("ncm")
    @NotNull
    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO ncm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    /**
     * Lista de Fundamentos Opcionais disponíveis.
     *
     * @return fundamentosOpcionaisDisponiveis
     **/
    @JsonProperty("fundamentosOpcionaisDisponiveis")
    public List<FundamentoLegalOpcionalDisponivelDTO> getFundamentosOpcionaisDisponiveis() {
        return fundamentosOpcionaisDisponiveis;
    }

    public void setFundamentosOpcionaisDisponiveis(List<FundamentoLegalOpcionalDisponivelDTO> fundamentosOpcionaisDisponiveis) {
        this.fundamentosOpcionaisDisponiveis = fundamentosOpcionaisDisponiveis;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO fundamentosOpcionaisDisponiveis(List<FundamentoLegalOpcionalDisponivelDTO> fundamentosOpcionaisDisponiveis) {
        this.fundamentosOpcionaisDisponiveis = fundamentosOpcionaisDisponiveis;
        return this;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO addFundamentosOpcionaisDisponiveisItem(FundamentoLegalOpcionalDisponivelDTO fundamentosOpcionaisDisponiveisItem) {
        this.fundamentosOpcionaisDisponiveis.add(fundamentosOpcionaisDisponiveisItem);
        return this;
    }

    /**
     * Data do fato gerador informada na chamada do serviço.
     *
     * @return dataFatoGerador
     **/
    @JsonProperty("dataFatoGerador")
    @NotNull
    public String getDataFatoGerador() {
        return dataFatoGerador;
    }

    public void setDataFatoGerador(String dataFatoGerador) {
        this.dataFatoGerador = dataFatoGerador;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO dataFatoGerador(String dataFatoGerador) {
        this.dataFatoGerador = dataFatoGerador;
        return this;
    }

    /**
     * Tipo de operação informado na chamada do serviço.
     *
     * @return tipoOperacao
     **/
    @JsonProperty("tipoOperacao")
    @NotNull
    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO tipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    /**
     * Código do país informado na chamada do serviço.
     *
     * @return codigoPais
     **/
    @JsonProperty("codigoPais")
    @NotNull
    public Long getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Long codigoPais) {
        this.codigoPais = codigoPais;
    }

    public RespostaObterTratamentosTributariosImportacaoDTO codigoPais(Long codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RespostaObterTratamentosTributariosImportacaoDTO {\n" +
                "    tratamentosTributarios: " + toIndentedString(tratamentosTributarios) + "\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "    fundamentosOpcionaisDisponiveis: " + toIndentedString(fundamentosOpcionaisDisponiveis) + "\n" +
                "    dataFatoGerador: " + toIndentedString(dataFatoGerador) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    codigoPais: " + toIndentedString(codigoPais) + "\n" +
                "}";
        return sb;
    }
}
