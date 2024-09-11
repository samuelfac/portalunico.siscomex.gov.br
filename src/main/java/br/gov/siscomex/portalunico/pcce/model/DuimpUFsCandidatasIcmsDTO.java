package br.gov.siscomex.portalunico.pcce.model;

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
@XmlType(name = "DuimpUFsCandidatasIcmsDTO", propOrder =
        {"canditadasUFFavorecida", "numeroDuimp", "versaoDuimp"
        })

@XmlRootElement(name = "DuimpUFsCandidatasIcmsDTO")
/**
 * Informações das UFs candidatas à favorecida do ICMS da Duimp
 **/
@ApiModel(description = "Informações das UFs candidatas à favorecida do ICMS da Duimp")
public class DuimpUFsCandidatasIcmsDTO {

    @XmlElement(name = "canditadasUFFavorecida", required = true)
    @ApiModelProperty(required = true, value = "Lista de  UFs que podem ser favorecidas pelo ICMS da Duimp")
    @Valid
    /**
     * Lista de  UFs que podem ser favorecidas pelo ICMS da Duimp
     **/
    private List<UFCandidataIcmsDTO> canditadasUFFavorecida = new ArrayList<>();

    @XmlElement(name = "numeroDuimp", required = true)
    @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da Duimp<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
    /**
     * Número da Duimp<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
     **/
    private String numeroDuimp = null;

    @XmlElement(name = "versaoDuimp", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDuimp = null;

    /**
     * Lista de  UFs que podem ser favorecidas pelo ICMS da Duimp
     *
     * @return canditadasUFFavorecida
     **/
    @JsonProperty("canditadasUFFavorecida")
    @NotNull
    public List<UFCandidataIcmsDTO> getCanditadasUFFavorecida() {
        return canditadasUFFavorecida;
    }

    public void setCanditadasUFFavorecida(List<UFCandidataIcmsDTO> canditadasUFFavorecida) {
        this.canditadasUFFavorecida = canditadasUFFavorecida;
    }

    public DuimpUFsCandidatasIcmsDTO canditadasUFFavorecida(List<UFCandidataIcmsDTO> canditadasUFFavorecida) {
        this.canditadasUFFavorecida = canditadasUFFavorecida;
        return this;
    }

    public DuimpUFsCandidatasIcmsDTO addCanditadasUFFavorecidaItem(UFCandidataIcmsDTO canditadasUFFavorecidaItem) {
        this.canditadasUFFavorecida.add(canditadasUFFavorecidaItem);
        return this;
    }

    /**
     * Número da Duimp&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
     *
     * @return numeroDuimp
     **/
    @JsonProperty("numeroDuimp")
    @NotNull
    public String getNumeroDuimp() {
        return numeroDuimp;
    }

    public void setNumeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
    }

    public DuimpUFsCandidatasIcmsDTO numeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
        return this;
    }

    /**
     * Versão da Duimp&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
     *
     * @return versaoDuimp
     **/
    @JsonProperty("versaoDuimp")
    @NotNull
    public String getVersaoDuimp() {
        return versaoDuimp;
    }

    public void setVersaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
    }

    public DuimpUFsCandidatasIcmsDTO versaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DuimpUFsCandidatasIcmsDTO {\n" +
                "    canditadasUFFavorecida: " + toIndentedString(canditadasUFFavorecida) + "\n" +
                "    numeroDuimp: " + toIndentedString(numeroDuimp) + "\n" +
                "    versaoDuimp: " + toIndentedString(versaoDuimp) + "\n" +
                "}";
        return sb;
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
}

