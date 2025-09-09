package br.gov.siscomex.portalunico.catp.model;

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
@XmlType(name = "OperadorEstrangeiroRequestIntegracaoDTO", propOrder =
        {"codigoSubdivisaoPais", "codigoInterno", "logradouro", "nomeCidade", "tin", "nome", "identificacoesAdicionais", "email", "cep"
        })

@XmlRootElement(name = "OperadorEstrangeiroRequestIntegracaoDTO")
/**
 * Dados do operador estrangeiro.
 **/
@ApiModel(description = "Dados do operador estrangeiro.")
public class OperadorEstrangeiroRequestIntegracaoDTO {

    @XmlElement(name = "codigoSubdivisaoPais")
    @ApiModelProperty(example = "AR-B", value = "Código da subdivisao do país. Usar tabela ISO 3166<br>Tamanho máximo: 6<br>Formato: 'AA-AAA'")
    /**
     * Código da subdivisao do país. Usar tabela ISO 3166<br>Tamanho máximo: 6<br>Formato: 'AA-AAA'
     **/
    private String codigoSubdivisaoPais = null;

    @XmlElement(name = "codigoInterno")
    @ApiModelProperty(example = "12345", value = "Código interno para uso em outros sitemas<br>Tamanho: 35")
    /**
     * Código interno para uso em outros sitemas<br>Tamanho: 35
     **/
    private String codigoInterno = null;

    @XmlElement(name = "logradouro", required = true)
    @ApiModelProperty(example = "Rua teste, 155, Bairro teste", required = true, value = "Logradouro do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 70")
    /**
     * Logradouro do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 70
     **/
    private String logradouro = null;

    @XmlElement(name = "nomeCidade", required = true)
    @ApiModelProperty(example = "Buenos Aires", required = true, value = "Nome da Cidade<br>Tamanho mínimo: 1<br>Tamanho máximo: 35")
    /**
     * Nome da Cidade<br>Tamanho mínimo: 1<br>Tamanho máximo: 35
     **/
    private String nomeCidade = null;

    @XmlElement(name = "tin")
    @ApiModelProperty(example = "123", value = "TIN - Trade Identification Number (Número de Identificação do Operador)<br>Tamanho: 35")
    /**
     * TIN - Trade Identification Number (Número de Identificação do Operador)<br>Tamanho: 35
     **/
    private String tin = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "Fornecedor 123", required = true, value = "Nome/Razão Social do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
    /**
     * Nome/Razão Social do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 150
     **/
    private String nome = null;

    @XmlElement(name = "identificacoesAdicionais")
    @ApiModelProperty(value = "Lista de identificações adicionais do operador estrangeiro em agências internacionais.")
    @Valid
    /**
     * Lista de identificações adicionais do operador estrangeiro em agências internacionais.
     **/
    private List<IdentificacaoAdicionalIntegracaoDTO> identificacoesAdicionais = null;

    @XmlElement(name = "email")
    @ApiModelProperty(example = "email@email.com", value = "E-mail do Operador Estrangeiro<br>Tamanho: 70")
    /**
     * E-mail do Operador Estrangeiro<br>Tamanho: 70
     **/
    private String email = null;

    @XmlElement(name = "cep")
    @ApiModelProperty(example = "12345", value = "Código postal<br>Tamanho: 9")
    /**
     * Código postal<br>Tamanho: 9
     **/
    private String cep = null;

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
     * Código da subdivisao do país. Usar tabela ISO 3166&lt;br&gt;Tamanho máximo: 6&lt;br&gt;Formato: &#39;AA-AAA&#39;
     *
     * @return codigoSubdivisaoPais
     **/
    @JsonProperty("codigoSubdivisaoPais")
    public String getCodigoSubdivisaoPais() {
        return codigoSubdivisaoPais;
    }

    public void setCodigoSubdivisaoPais(String codigoSubdivisaoPais) {
        this.codigoSubdivisaoPais = codigoSubdivisaoPais;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO codigoSubdivisaoPais(String codigoSubdivisaoPais) {
        this.codigoSubdivisaoPais = codigoSubdivisaoPais;
        return this;
    }

    /**
     * Código interno para uso em outros sitemas&lt;br&gt;Tamanho: 35
     *
     * @return codigoInterno
     **/
    @JsonProperty("codigoInterno")
    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO codigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
        return this;
    }

    /**
     * Logradouro do Operador Estrangeiro&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 70
     *
     * @return logradouro
     **/
    @JsonProperty("logradouro")
    @NotNull
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO logradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    /**
     * Nome da Cidade&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35
     *
     * @return nomeCidade
     **/
    @JsonProperty("nomeCidade")
    @NotNull
    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO nomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
        return this;
    }

    /**
     * TIN - Trade Identification Number (Número de Identificação do Operador)&lt;br&gt;Tamanho: 35
     *
     * @return tin
     **/
    @JsonProperty("tin")
    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO tin(String tin) {
        this.tin = tin;
        return this;
    }

    /**
     * Nome/Razão Social do Operador Estrangeiro&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150
     *
     * @return nome
     **/
    @JsonProperty("nome")
    @NotNull
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Lista de identificações adicionais do operador estrangeiro em agências internacionais.
     *
     * @return identificacoesAdicionais
     **/
    @JsonProperty("identificacoesAdicionais")
    public List<IdentificacaoAdicionalIntegracaoDTO> getIdentificacoesAdicionais() {
        return identificacoesAdicionais;
    }

    public void setIdentificacoesAdicionais(List<IdentificacaoAdicionalIntegracaoDTO> identificacoesAdicionais) {
        this.identificacoesAdicionais = identificacoesAdicionais;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO identificacoesAdicionais(List<IdentificacaoAdicionalIntegracaoDTO> identificacoesAdicionais) {
        this.identificacoesAdicionais = identificacoesAdicionais;
        return this;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO addIdentificacoesAdicionaisItem(IdentificacaoAdicionalIntegracaoDTO identificacoesAdicionaisItem) {
        this.identificacoesAdicionais.add(identificacoesAdicionaisItem);
        return this;
    }

    /**
     * E-mail do Operador Estrangeiro&lt;br&gt;Tamanho: 70
     *
     * @return email
     **/
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Código postal&lt;br&gt;Tamanho: 9
     *
     * @return cep
     **/
    @JsonProperty("cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public OperadorEstrangeiroRequestIntegracaoDTO cep(String cep) {
        this.cep = cep;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class OperadorEstrangeiroRequestIntegracaoDTO {\n" +
                "    codigoSubdivisaoPais: " + toIndentedString(codigoSubdivisaoPais) + "\n" +
                "    codigoInterno: " + toIndentedString(codigoInterno) + "\n" +
                "    logradouro: " + toIndentedString(logradouro) + "\n" +
                "    nomeCidade: " + toIndentedString(nomeCidade) + "\n" +
                "    tin: " + toIndentedString(tin) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    identificacoesAdicionais: " + toIndentedString(identificacoesAdicionais) + "\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    cep: " + toIndentedString(cep) + "\n" +
                "}";
        return sb;
    }
}
