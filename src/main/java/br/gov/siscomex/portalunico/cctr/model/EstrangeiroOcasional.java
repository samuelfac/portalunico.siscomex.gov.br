package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstrangeiroOcasional", propOrder =
        {"endereco", "licencaOriginaria", "nome", "dataVencimentoAutorizacao", "pais"
        })

@XmlRootElement(name = "EstrangeiroOcasional")
/**
 * Dados do transportador estrangeiro ocasional
 **/
@ApiModel(description = "Dados do transportador estrangeiro ocasional")
public class EstrangeiroOcasional {

    @XmlElement(name = "endereco", required = true)
    @ApiModelProperty(example = "Endereço do transportador", required = true, value = "Endereço do transportador<br>Tamanho: 120")
    /**
     * Endereço do transportador<br>Tamanho: 120
     **/
    private String endereco = null;

    @XmlElement(name = "licencaOriginaria")
    @ApiModelProperty(example = "1234656517", value = "Número da licença originária<br>Tamanho: 20")
    /**
     * Número da licença originária<br>Tamanho: 20
     **/
    private String licencaOriginaria = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "Nome do transportador", required = true, value = "Nome do transportador<br>Tamanho: 60")
    /**
     * Nome do transportador<br>Tamanho: 60
     **/
    private String nome = null;

    @XmlElement(name = "dataVencimentoAutorizacao")
    @ApiModelProperty(example = "2030-04-01", value = "Data de vencimento da autorização ocasional<br>Formato: AAAA-MM-DD")
    /**
     * Data de vencimento da autorização ocasional<br>Formato: AAAA-MM-DD
     **/
    private String dataVencimentoAutorizacao = null;

    @XmlElement(name = "pais")
    @ApiModelProperty(example = "AR", value = "País do Transportador<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país")
    /**
     * País do Transportador<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país
     **/
    private String pais = null;

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
     * Endereço do transportador&lt;br&gt;Tamanho: 120
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    @NotNull
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EstrangeiroOcasional endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
     * Número da licença originária&lt;br&gt;Tamanho: 20
     *
     * @return licencaOriginaria
     **/
    @JsonProperty("licencaOriginaria")
    public String getLicencaOriginaria() {
        return licencaOriginaria;
    }

    public void setLicencaOriginaria(String licencaOriginaria) {
        this.licencaOriginaria = licencaOriginaria;
    }

    public EstrangeiroOcasional licencaOriginaria(String licencaOriginaria) {
        this.licencaOriginaria = licencaOriginaria;
        return this;
    }

    /**
     * Nome do transportador&lt;br&gt;Tamanho: 60
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

    public EstrangeiroOcasional nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Data de vencimento da autorização ocasional&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataVencimentoAutorizacao
     **/
    @JsonProperty("dataVencimentoAutorizacao")
    public String getDataVencimentoAutorizacao() {
        return dataVencimentoAutorizacao;
    }

    public void setDataVencimentoAutorizacao(String dataVencimentoAutorizacao) {
        this.dataVencimentoAutorizacao = dataVencimentoAutorizacao;
    }

    public EstrangeiroOcasional dataVencimentoAutorizacao(String dataVencimentoAutorizacao) {
        this.dataVencimentoAutorizacao = dataVencimentoAutorizacao;
        return this;
    }

    /**
     * País do Transportador&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA&lt;br&gt;Sigla ISO/Alfa 2 do país
     *
     * @return pais
     **/
    @JsonProperty("pais")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public EstrangeiroOcasional pais(String pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EstrangeiroOcasional {\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    licencaOriginaria: " + toIndentedString(licencaOriginaria) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    dataVencimentoAutorizacao: " + toIndentedString(dataVencimentoAutorizacao) + "\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "}";
        return sb;
    }
}
