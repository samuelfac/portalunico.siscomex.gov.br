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
@XmlType(name = "ChamadaObterTratamentosTributariosImportacaoDTO", propOrder =
        {"ncm", "codigoPais", "dataFatoGerador", "tipoOperacao", "fundamentosOpcionais"
        })

@XmlRootElement(name = "ChamadaObterTratamentosTributariosImportacaoDTO")
/**
 * DTO de chamada do serviço que obtem os dados de Tratamentos Tributários de Importação.
 **/
@ApiModel(description = "DTO de chamada do serviço que obtem os dados de Tratamentos Tributários de Importação.")
public class ChamadaObterTratamentosTributariosImportacaoDTO {

    @XmlElement(name = "ncm", required = true)
    @ApiModelProperty(example = "30031012", required = true, value = "Número da NCM (Nomenclatura Comum do Mercosul) com 8 dígitos.")
    /**
     * Número da NCM (Nomenclatura Comum do Mercosul) com 8 dígitos.
     **/
    private String ncm = null;

    @XmlElement(name = "codigoPais", required = true)
    @ApiModelProperty(example = "23", required = true, value = "Código numérico identificador do país.<br/>Origem: <a href=\"https://www35.receita.fazenda.gov.br/tabaduaneiras-web/private/pages/telaInicial.jsf\" target=\"blank\">Sistema de Tabelas Aduaneiras - País</a>")
    /**
     * Código numérico identificador do país.<br/>Origem: <a href=\"https://www35.receita.fazenda.gov.br/tabaduaneiras-web/private/pages/telaInicial.jsf\" target=\"blank\">Sistema de Tabelas Aduaneiras - País</a>
     **/
    private Long codigoPais = null;

    @XmlElement(name = "dataFatoGerador")
    @ApiModelProperty(example = "2020-12-20", value = "Data do fato gerador, no formato aaaa-mm-dd. É um campo opcional (quando não informado o sistema assume a data atual).")
    /**
     * Data do fato gerador, no formato aaaa-mm-dd. É um campo opcional (quando não informado o sistema assume a data atual).
     **/
    private String dataFatoGerador = null;

    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "I", required = true, value = "Para DUIMP, fixar 'I'. O serviço aceita I, E ou F para os tipos de operação IMPORTAÇÃO, EXPORTAÇÃO e FRETE, respectivamente.")
    /**
     * Para DUIMP, fixar 'I'. O serviço aceita I, E ou F para os tipos de operação IMPORTAÇÃO, EXPORTAÇÃO e FRETE, respectivamente.
     **/
    private String tipoOperacao = null;

    @XmlElement(name = "fundamentosOpcionais")
    @ApiModelProperty(value = "Opção de informar uma Lista de Tributo/Regime/Fundamento Legal de tipo de uso Opcional ou uma Lista de Tributo/Regime/Fundamento Legal de tipo de uso Opcional/Nomenclatura alternativa.")
    @Valid
    /**
     * Opção de informar uma Lista de Tributo/Regime/Fundamento Legal de tipo de uso Opcional ou uma Lista de Tributo/Regime/Fundamento Legal de tipo de uso Opcional/Nomenclatura alternativa.
     **/
    private List<FundamentoLegalOpcionalDTO> fundamentosOpcionais = null;

    /**
     * Número da NCM (Nomenclatura Comum do Mercosul) com 8 dígitos.
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

    public ChamadaObterTratamentosTributariosImportacaoDTO ncm(String ncm) {
        this.ncm = ncm;
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
     * Código numérico identificador do país.&lt;br/&gt;Origem: &lt;a href&#x3D;\&quot;https://www35.receita.fazenda.gov.br/tabaduaneiras-web/private/pages/telaInicial.jsf\&quot; target&#x3D;\&quot;blank\&quot;&gt;Sistema de Tabelas Aduaneiras - País&lt;/a&gt;
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

    /**
     * Data do fato gerador, no formato aaaa-mm-dd. É um campo opcional (quando não informado o sistema assume a data atual).
     *
     * @return dataFatoGerador
     **/
    @JsonProperty("dataFatoGerador")
    public String getDataFatoGerador() {
        return dataFatoGerador;
    }

    public void setDataFatoGerador(String dataFatoGerador) {
        this.dataFatoGerador = dataFatoGerador;
    }

    public ChamadaObterTratamentosTributariosImportacaoDTO dataFatoGerador(String dataFatoGerador) {
        this.dataFatoGerador = dataFatoGerador;
        return this;
    }

    /**
     * Para DUIMP, fixar &#39;I&#39;. O serviço aceita I, E ou F para os tipos de operação IMPORTAÇÃO, EXPORTAÇÃO e FRETE, respectivamente.
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

    public ChamadaObterTratamentosTributariosImportacaoDTO tipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    public ChamadaObterTratamentosTributariosImportacaoDTO codigoPais(Long codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    /**
     * Opção de informar uma Lista de Tributo/Regime/Fundamento Legal de tipo de uso Opcional ou uma Lista de Tributo/Regime/Fundamento Legal de tipo de uso Opcional/Nomenclatura alternativa.
     *
     * @return fundamentosOpcionais
     **/
    @JsonProperty("fundamentosOpcionais")
    public List<FundamentoLegalOpcionalDTO> getFundamentosOpcionais() {
        return fundamentosOpcionais;
    }

    public void setFundamentosOpcionais(List<FundamentoLegalOpcionalDTO> fundamentosOpcionais) {
        this.fundamentosOpcionais = fundamentosOpcionais;
    }

    public ChamadaObterTratamentosTributariosImportacaoDTO fundamentosOpcionais(List<FundamentoLegalOpcionalDTO> fundamentosOpcionais) {
        this.fundamentosOpcionais = fundamentosOpcionais;
        return this;
    }

    public ChamadaObterTratamentosTributariosImportacaoDTO addFundamentosOpcionaisItem(FundamentoLegalOpcionalDTO fundamentosOpcionaisItem) {
        this.fundamentosOpcionais.add(fundamentosOpcionaisItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ChamadaObterTratamentosTributariosImportacaoDTO {\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "    codigoPais: " + toIndentedString(codigoPais) + "\n" +
                "    dataFatoGerador: " + toIndentedString(dataFatoGerador) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    fundamentosOpcionais: " + toIndentedString(fundamentosOpcionais) + "\n" +
                "}";
        return sb;
    }
}
