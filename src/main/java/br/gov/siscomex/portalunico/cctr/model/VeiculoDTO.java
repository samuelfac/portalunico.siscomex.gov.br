package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiculoDTO", propOrder =
        {"lacres", "tara", "placa"
        })

@XmlRootElement(name = "VeiculoDTO")
public class VeiculoDTO {

    @XmlElement(name = "lacres")
    @ApiModelProperty(value = "")
    private List<String> lacres = null;

    @XmlElement(name = "tara")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal tara = null;

    @XmlElement(name = "placa")
    @ApiModelProperty(value = "")
    private String placa = null;

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
     * Get lacres
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    public VeiculoDTO lacres(List<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    public VeiculoDTO addLacresItem(String lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }

    /**
     * Get tara
     *
     * @return tara
     **/
    @JsonProperty("tara")
    public BigDecimal getTara() {
        return tara;
    }

    public void setTara(BigDecimal tara) {
        this.tara = tara;
    }

    public VeiculoDTO tara(BigDecimal tara) {
        this.tara = tara;
        return this;
    }

    /**
     * Get placa
     *
     * @return placa
     **/
    @JsonProperty("placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public VeiculoDTO placa(String placa) {
        this.placa = placa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeiculoDTO {\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "}";
        return sb;
    }
}
