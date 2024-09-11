package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDosComponentesDeFreteDeUmaCargaArea", propOrder =
        {"componentesFreteOrigem", "componentesFreteDestino"
        })

@XmlRootElement(name = "DadosDosComponentesDeFreteDeUmaCargaArea")
public class DadosDosComponentesDeFreteDeUmaCargaArea {

    @XmlElement(name = "componentesFreteOrigem")
    @ApiModelProperty(value = "Lista dos  componentes do frete na origem ")
    @Valid
    /**
     * Lista dos  componentes do frete na origem
     **/
    private List<DadosDeUmComponenteFreteEmUmaCargaArea> componentesFreteOrigem = null;

    @XmlElement(name = "componentesFreteDestino")
    @ApiModelProperty(value = "Lista dos componentes do frete no destino")
    @Valid
    /**
     * Lista dos componentes do frete no destino
     **/
    private List<DadosDeUmComponenteFreteEmUmaCargaArea> componentesFreteDestino = null;

    /**
     * Lista dos  componentes do frete na origem
     *
     * @return componentesFreteOrigem
     **/
    @JsonProperty("componentesFreteOrigem")
    public List<DadosDeUmComponenteFreteEmUmaCargaArea> getComponentesFreteOrigem() {
        return componentesFreteOrigem;
    }

    public void setComponentesFreteOrigem(List<DadosDeUmComponenteFreteEmUmaCargaArea> componentesFreteOrigem) {
        this.componentesFreteOrigem = componentesFreteOrigem;
    }

    public DadosDosComponentesDeFreteDeUmaCargaArea componentesFreteOrigem(List<DadosDeUmComponenteFreteEmUmaCargaArea> componentesFreteOrigem) {
        this.componentesFreteOrigem = componentesFreteOrigem;
        return this;
    }

    public DadosDosComponentesDeFreteDeUmaCargaArea addComponentesFreteOrigemItem(DadosDeUmComponenteFreteEmUmaCargaArea componentesFreteOrigemItem) {
        this.componentesFreteOrigem.add(componentesFreteOrigemItem);
        return this;
    }

    /**
     * Lista dos componentes do frete no destino
     *
     * @return componentesFreteDestino
     **/
    @JsonProperty("componentesFreteDestino")
    public List<DadosDeUmComponenteFreteEmUmaCargaArea> getComponentesFreteDestino() {
        return componentesFreteDestino;
    }

    public void setComponentesFreteDestino(List<DadosDeUmComponenteFreteEmUmaCargaArea> componentesFreteDestino) {
        this.componentesFreteDestino = componentesFreteDestino;
    }

    public DadosDosComponentesDeFreteDeUmaCargaArea componentesFreteDestino(List<DadosDeUmComponenteFreteEmUmaCargaArea> componentesFreteDestino) {
        this.componentesFreteDestino = componentesFreteDestino;
        return this;
    }

    public DadosDosComponentesDeFreteDeUmaCargaArea addComponentesFreteDestinoItem(DadosDeUmComponenteFreteEmUmaCargaArea componentesFreteDestinoItem) {
        this.componentesFreteDestino.add(componentesFreteDestinoItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDosComponentesDeFreteDeUmaCargaArea {\n" +
                "    componentesFreteOrigem: " + toIndentedString(componentesFreteOrigem) + "\n" +
                "    componentesFreteDestino: " + toIndentedString(componentesFreteDestino) + "\n" +
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

