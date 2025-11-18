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
@XmlType(name = "EstrangeiroProprio", propOrder =
        {"idFiscal", "pais", "licencaOriginaria", "dataVencimentoLicencaOriginaria", "endereco", "nome", "licencaComplementarTETI"
        })

@XmlRootElement(name = "EstrangeiroProprio")
/**
 * Dados do transportador estrangeiro próprio
 **/
@ApiModel(description = "Dados do transportador estrangeiro próprio")
public class EstrangeiroProprio {

    @XmlElement(name = "idFiscal", required = true)
    @ApiModelProperty(example = "123422217", required = true, value = "Identificação Fiscal do Transportador<br>Tamanho: 14")
    /**
     * Identificação Fiscal do Transportador<br>Tamanho: 14
     **/
    private String idFiscal = null;

    @XmlElement(name = "pais")
    @ApiModelProperty(example = "AR", value = "País do Transportador<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país")
    /**
     * País do Transportador<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país
     **/
    private String pais = null;

    @XmlElement(name = "licencaOriginaria")
    @ApiModelProperty(example = "1234656517", value = "Número da licença originária<br>Tamanho: 20")
    /**
     * Número da licença originária<br>Tamanho: 20
     **/
    private String licencaOriginaria = null;

    @XmlElement(name = "dataVencimentoLicencaOriginaria")
    @ApiModelProperty(example = "2030-04-01", value = "Data de vencimento da licença originária<br>Formato: AAAA-MM-DD")
    /**
     * Data de vencimento da licença originária<br>Formato: AAAA-MM-DD
     **/
    private String dataVencimentoLicencaOriginaria = null;

    @XmlElement(name = "endereco", required = true)
    @ApiModelProperty(example = "Endereço do transportador", required = true, value = "Endereço do transportador<br>Tamanho: 120")
    /**
     * Endereço do transportador<br>Tamanho: 120
     **/
    private String endereco = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "Nome do transportador", required = true, value = "Nome do transportador<br>Tamanho: 60")
    /**
     * Nome do transportador<br>Tamanho: 60
     **/
    private String nome = null;

    @XmlElement(name = "licencaComplementarTETI")
    @ApiModelProperty(example = "1234/17", value = "Número da licença complementar TETI<br>Formato: NNNN/NN")
    /**
     * Número da licença complementar TETI<br>Formato: NNNN/NN
     **/
    private String licencaComplementarTETI = null;

    /**
     * Identificação Fiscal do Transportador&lt;br&gt;Tamanho: 14
     *
     * @return idFiscal
     **/
    @JsonProperty("idFiscal")
    @NotNull
    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
    }

    public EstrangeiroProprio idFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
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

    public EstrangeiroProprio pais(String pais) {
        this.pais = pais;
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

    /**
     * Data de vencimento da licença originária&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataVencimentoLicencaOriginaria
     **/
    @JsonProperty("dataVencimentoLicencaOriginaria")
    public String getDataVencimentoLicencaOriginaria() {
        return dataVencimentoLicencaOriginaria;
    }

    public void setDataVencimentoLicencaOriginaria(String dataVencimentoLicencaOriginaria) {
        this.dataVencimentoLicencaOriginaria = dataVencimentoLicencaOriginaria;
    }

    public EstrangeiroProprio dataVencimentoLicencaOriginaria(String dataVencimentoLicencaOriginaria) {
        this.dataVencimentoLicencaOriginaria = dataVencimentoLicencaOriginaria;
        return this;
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

    public EstrangeiroProprio endereco(String endereco) {
        this.endereco = endereco;
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

    public EstrangeiroProprio nome(String nome) {
        this.nome = nome;
        return this;
    }

    public EstrangeiroProprio licencaOriginaria(String licencaOriginaria) {
        this.licencaOriginaria = licencaOriginaria;
        return this;
    }

    /**
     * Número da licença complementar TETI&lt;br&gt;Formato: NNNN/NN
     *
     * @return licencaComplementarTETI
     **/
    @JsonProperty("licencaComplementarTETI")
    public String getLicencaComplementarTETI() {
        return licencaComplementarTETI;
    }

    public void setLicencaComplementarTETI(String licencaComplementarTETI) {
        this.licencaComplementarTETI = licencaComplementarTETI;
    }

    public EstrangeiroProprio licencaComplementarTETI(String licencaComplementarTETI) {
        this.licencaComplementarTETI = licencaComplementarTETI;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EstrangeiroProprio {\n" +
                "    idFiscal: " + toIndentedString(idFiscal) + "\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "    licencaOriginaria: " + toIndentedString(licencaOriginaria) + "\n" +
                "    dataVencimentoLicencaOriginaria: " + toIndentedString(dataVencimentoLicencaOriginaria) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    licencaComplementarTETI: " + toIndentedString(licencaComplementarTETI) + "\n" +
                "}";
        return sb;
    }
}
