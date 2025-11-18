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
@XmlType(name = "EstrangeiroRegular", propOrder =
        {"idFiscal", "pais", "licencaOriginaria", "dataVencimentoLicencaOriginaria", "endereco", "licencaComplementarTETI"
        })

@XmlRootElement(name = "EstrangeiroRegular")
/**
 * Dados do transportador estrangeiro regular
 **/
@ApiModel(description = "Dados do transportador estrangeiro regular")
public class EstrangeiroRegular {

    @XmlElement(name = "idFiscal", required = true)
    @ApiModelProperty(example = "12342217", required = true, value = "Identificação Fiscal do Transportador<br>Tamanho: 14")
    /**
     * Identificação Fiscal do Transportador<br>Tamanho: 14
     **/
    private String idFiscal = null;

    @XmlElement(name = "pais", required = true)
    @ApiModelProperty(example = "AR", required = true, value = "País do Transportador<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país")
    /**
     * País do Transportador<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país
     **/
    private String pais = null;

    @XmlElement(name = "licencaOriginaria")
    @ApiModelProperty(example = "123445617", value = "Número da licença originária")
    /**
     * Número da licença originária
     **/
    private String licencaOriginaria = null;

    @XmlElement(name = "dataVencimentoLicencaOriginaria")
    @ApiModelProperty(example = "2030-04-01", value = "Data de vencimento da licença originária<br>Formato: AAAA-MM-DD")
    /**
     * Data de vencimento da licença originária<br>Formato: AAAA-MM-DD
     **/
    private String dataVencimentoLicencaOriginaria = null;

    @XmlElement(name = "endereco")
    @ApiModelProperty(example = "Endereço do transportador", value = "Endereço do transportador<br>Tamanho: 120")
    /**
     * Endereço do transportador<br>Tamanho: 120
     **/
    private String endereco = null;

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

    public EstrangeiroRegular idFiscal(String idFiscal) {
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
    @NotNull
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public EstrangeiroRegular pais(String pais) {
        this.pais = pais;
        return this;
    }

    /**
     * Número da licença originária
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

    public EstrangeiroRegular dataVencimentoLicencaOriginaria(String dataVencimentoLicencaOriginaria) {
        this.dataVencimentoLicencaOriginaria = dataVencimentoLicencaOriginaria;
        return this;
    }

    /**
     * Endereço do transportador&lt;br&gt;Tamanho: 120
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EstrangeiroRegular endereco(String endereco) {
        this.endereco = endereco;
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

    public EstrangeiroRegular licencaComplementarTETI(String licencaComplementarTETI) {
        this.licencaComplementarTETI = licencaComplementarTETI;
        return this;
    }

    public EstrangeiroRegular licencaOriginaria(String licencaOriginaria) {
        this.licencaOriginaria = licencaOriginaria;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EstrangeiroRegular {\n" +
                "    idFiscal: " + toIndentedString(idFiscal) + "\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "    licencaOriginaria: " + toIndentedString(licencaOriginaria) + "\n" +
                "    dataVencimentoLicencaOriginaria: " + toIndentedString(dataVencimentoLicencaOriginaria) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    licencaComplementarTETI: " + toIndentedString(licencaComplementarTETI) + "\n" +
                "}";
        return sb;
    }
}
